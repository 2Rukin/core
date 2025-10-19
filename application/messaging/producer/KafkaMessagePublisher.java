package ru.application.messaging.producer;

import com.google.protobuf.Message;
import jakarta.validation.constraints.NotBlank;
import java.time.Clock;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.jetbrains.annotations.Contract;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import ru.application.messaging.KafkaHeaderUtils;
import ru.application.messaging.MessagingProperties;
import ru.application.messaging.MessagingProperties.Topic;

/**
 * Унифицированный продюсер Protobuf-сообщений в Kafka.
 * <p>
 * Гарантии/контракты:
 * <ul>
 *   <li>Не публикует в пустую тему ({@code topic} не может быть blank).</li>
 *   <li>{@code payload} не может быть {@code null}.</li>
 *   <li>Возвращает {@link CompletableFuture}, завершающийся успешно при отправке в Kafka.</li>
 *   <li>При ошибке публикации автоматически маршрутизирует сообщение в DLQ через {@link DlqProducer} (best-effort).</li>
 * </ul>
 * Потокобезопасность: бин является stateless-обёрткой над потокобезопасным {@link KafkaTemplate}.
 */
@Slf4j
@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KafkaMessagePublisher {

    // === Сообщения логов/ошибок ===
    static final String LOG_PUBLISHING = "Publishing type='{}' to topic='{}' key='{}'";
    static final String LOG_FAIL_SEND  = "Failed to send message to topic='{}', routing to DLQ";
    static final String LOG_FAIL_DLQ   = "Failed to publish message to DLQ";

    @NonNull KafkaTemplate<String, Message> kafkaTemplate;
    @NonNull MessagingProperties properties;
    @NonNull DlqProducer dlqProducer;
    @NonNull Clock clock;

    /**
     * Публикует сообщение в тему, полученную из конфигурации по ключу перечисления.
     *
     * @param topicKey ключ темы из {@link Topic} (не {@code null})
     * @param key      ключ Kafka (может быть {@code null})
     * @param payload  protobuf-полезная нагрузка (не {@code null})
     * @return future результата отправки
     * @throws IllegalArgumentException если имя темы пустое в конфигурации
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NonNull final Topic topicKey,
            @Nullable final String key,
            @NonNull final Message payload
    ) {
        final String topic = resolveTopic(topicKey);
        return publish(topic, key, payload, Collections.emptyMap());
    }

    /**
     * Публикует сообщение в тему, полученную из конфигурации по ключу перечисления, с дополнительными заголовками.
     *
     * @param topicKey ключ темы из {@link Topic} (не {@code null})
     * @param key      ключ Kafka (может быть {@code null})
     * @param payload  protobuf-полезная нагрузка (не {@code null})
     * @param headers  дополнительные заголовки (может быть пустой, ключ/значение — non-blank)
     * @return future результата отправки
     * @throws IllegalArgumentException если имя темы пустое в конфигурации
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NonNull final Topic topicKey,
            @Nullable final String key,
            @NonNull final Message payload,
            @NonNull final Map<String, String> headers
    ) {
        final String topic = resolveTopic(topicKey);
        return publish(topic, key, payload, headers);
    }

    /**
     * Публикует сообщение в указанную тему без дополнительных заголовков.
     *
     * @param topic   имя темы (не blank)
     * @param key     ключ Kafka (может быть {@code null})
     * @param payload protobuf-полезная нагрузка (не {@code null})
     * @return future результата отправки
     * @throws IllegalArgumentException если {@code topic} blank
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NotBlank final String topic,
            @Nullable final String key,
            @NonNull final Message payload
    ) {
        return publish(topic, key, payload, Collections.emptyMap());
    }

    /**
     * Публикует сообщение в указанную тему с дополнительными заголовками.
     *
     * @param topic   имя темы (не blank)
     * @param key     ключ Kafka (может быть {@code null})
     * @param payload protobuf-полезная нагрузка (не {@code null})
     * @param headers дополнительные заголовки (может быть пустой, ключ/значение — non-blank)
     * @return future результата отправки
     * @throws IllegalArgumentException если {@code topic} blank
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NotBlank final String topic,
            @Nullable final String key,
            @NonNull final Message payload,
            @NonNull final Map<String, String> headers
    ) {
        if (isBlank(topic)) {
            throw new IllegalArgumentException("topic must not be blank");
        }
        Objects.requireNonNull(payload, "payload");

        final Map<String, String> safeHeaders = headers.isEmpty() ? Collections.emptyMap() : Map.copyOf(headers);

        // Общие служебные заголовки + пользовательские
        final RecordHeaders recordHeaders = buildHeaders(payload, safeHeaders);
        // Копия заголовков для DLQ (DLQ добавит свои сверху)
        final RecordHeaders dlqHeadersCopy = new RecordHeaders(recordHeaders);

        final ProducerRecord<String, Message> record = buildRecord(topic, key, payload, recordHeaders);

        if (log.isDebugEnabled()) {
            log.debug(LOG_PUBLISHING, payload.getDescriptorForType().getFullName(), topic, key);
        }

        final CompletableFuture<SendResult<String, Message>> future = kafkaTemplate.send(record);
        attachResultHandlers(future, topic, key, payload, dlqHeadersCopy);
        return future;
    }

    // ==== Вспомогательные методы ==========================================================

    /**
     * Собирает {@link ProducerRecord} с единообразной установкой timestamp и заголовков.
     */
    @NonNull
    @Contract("_,_,_,_ -> new")
    private ProducerRecord<String, Message> buildRecord(
            @NonNull final String topic,
            @Nullable final String key,
            @NonNull final Message payload,
            @NonNull final Headers headers
    ) {
        return new ProducerRecord<>(
                topic,
                null,
                clock.millis(),
                key,
                payload,
                headers
        );
    }

    /**
     * Формирует набор заголовков: стандартные + пользовательские.
     */
    @NonNull
    @Contract("_,_ -> new")
    private RecordHeaders buildHeaders(
            @NonNull final Message payload,
            @NonNull final Map<String, String> headers
    ) {
        final RecordHeaders recordHeaders = KafkaHeaderUtils.standardHeaders(payload, properties, clock);
        KafkaHeaderUtils.addCustomHeaders(recordHeaders, headers);
        return recordHeaders;
    }

    /**
     * Подписывает обработчики результата отправки: логирование и best-effort DLQ.
     */
    private void attachResultHandlers(
            @NonNull final CompletableFuture<SendResult<String, Message>> future,
            @NonNull final String topic,
            @Nullable final String key,
            @NonNull final Message payload,
            @NonNull final RecordHeaders dlqHeadersCopy
    ) {
        future.whenComplete((result, error) -> {
            if (error != null) {
                log.error(LOG_FAIL_SEND, topic, error);
                dlqProducer.publish(new DlqPublishRequest(topic, key, payload, dlqHeadersCopy), error)
                        .exceptionally(dlqErr -> {
                            log.error(LOG_FAIL_DLQ, dlqErr);
                            return null;
                        });
                return;
            }
            if (result != null && log.isTraceEnabled()) {
                log.trace("Delivered: topic='{}' partition={} offset={}",
                        topic,
                        result.getRecordMetadata().partition(),
                        result.getRecordMetadata().offset());
            }
        });
    }

    /**
     * Разрешает имя темы по ключу перечисления.
     */
    @NonNull
    @Contract(pure = true)
    private String resolveTopic(@NonNull final Topic topicKey) {
        return properties.topic(Objects.requireNonNull(topicKey, "topicKey"));
    }

    @Contract(pure = true)
    private static boolean isBlank(@Nullable final String s) {
        return s == null || s.trim().isEmpty();
    }
}
