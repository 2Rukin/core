package ru.application.messaging.producer;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.google.protobuf.Timestamp;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import ru.application.messaging.KafkaHeaderUtils;
import ru.application.messaging.KafkaMessageHeaders;
import ru.application.messaging.MessagingProperties;
import ru.application.messaging.MessagingProperties.Topic;
import ru.domain.messaging.proto.DlqMessage;

/**
 * Публикатор сообщений в DLQ-топик.
 * <p>
 * Контракты:
 * <ul>
 *     <li>Метод {@link #publish(DlqPublishRequest, Throwable)} не принимает {@code null} аргументы.</li>
 *     <li>DLQ-топик берётся из {@link MessagingProperties} по ключу {@link Topic#DLQ}; если не настроен — бросается {@link IllegalStateException}.</li>
 *     <li>Заголовки в DLQ-записи содержат стандартные поля и DLQ-метаданные (исходная тема, класс ошибки).</li>
 * </ul>
 */
@Slf4j
@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DlqProducer {

    // === Логи/сообщения ===
    private static final String LOG_ROUTE_TO_DLQ = "Routing message key='{}' from topic='{}' to DLQ='{}' due to: {}";
    private static final String ERR_DLQ_NOT_CONFIGURED = "DLQ topic is not configured under 'app.messaging.topics.dlq'";

    @NonNull KafkaTemplate<String, Message> kafkaTemplate;
    @NonNull MessagingProperties properties;
    @NonNull Clock clock;

    /**
     * Публикует сообщение об ошибке в DLQ.
     *
     * @param request контекст исходного сообщения
     * @param error   исключение, вызвавшее перенос в DLQ
     * @return future результата отправки в DLQ-топик
     * @throws IllegalStateException если DLQ-топик не сконфигурирован
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NonNull final DlqPublishRequest request,
            @NonNull final Throwable error
    ) {
        final String dlqTopic = resolveDlqTopic();

        final DlqMessage message = buildMessage(request, error, dlqTopic);

        // Стандартные заголовки + DLQ-метаданные
        final RecordHeaders headers = KafkaHeaderUtils.standardHeaders(message, properties, clock);
        KafkaHeaderUtils.putHeader(headers, KafkaMessageHeaders.DLQ_ORIGINAL_TOPIC, request.originalTopic());
        KafkaHeaderUtils.putHeader(headers, KafkaMessageHeaders.DLQ_ERROR_CLASS, error.getClass().getName());

        final ProducerRecord<String, Message> record = new ProducerRecord<>(
                dlqTopic,
                null,
                clock.millis(),
                request.key(),
                message,
                headers
        );

        log.warn(LOG_ROUTE_TO_DLQ, request.key(), request.originalTopic(), dlqTopic, error.getMessage());
        return kafkaTemplate.send(record);
    }

    /**
     * Определяет имя DLQ-топика из конфигурации.
     *
     * @return имя DLQ-топика
     * @throws IllegalStateException если не сконфигурирован
     */
    @NonNull
    private String resolveDlqTopic() {
        final String topic = properties.topic(Topic.DLQ);
        if (topic == null || topic.isBlank()) {
            throw new IllegalStateException(ERR_DLQ_NOT_CONFIGURED);
        }
        return topic;
    }

    /**
     * Конструирует protobuf-сообщение {@link DlqMessage} с максимумом диагностик.
     *
     * @param request  исходный контекст
     * @param error    ошибка публикации
     * @param dlqTopic целевой DLQ-топик (для трассировки)
     * @return собранный {@link DlqMessage}
     */
    @NonNull
    private DlqMessage buildMessage(
            @NonNull final DlqPublishRequest request,
            @NonNull final Throwable error,
            @NonNull final String dlqTopic
    ) {
        final DlqMessage.Builder b = DlqMessage.newBuilder()
                .setDlqTopic(dlqTopic)
                .setOriginalTopic(request.originalTopic())
                .setKey(nullToEmpty(request.key()))
                .setErrorMessage(nullToEmpty(error.getMessage(), error.getClass().getSimpleName()))
                .setErrorClass(error.getClass().getName())
                .setProducerId(nullToEmpty(properties.getProducerId()));

        final Instant now = clock.instant();
        b.setErrorTimestamp(Timestamp.newBuilder()
                .setSeconds(now.getEpochSecond())
                .setNanos(now.getNano())
                .build());

        // Полезная нагрузка (заворачиваем в Any)
        final Message payload = request.payload();
        if (payload != null) {
            b.setPayload(Any.pack(payload));
        }

        // Заголовки → Map<String,String>
        b.putAllHeaders(extractHeaders(request.headers()));

        return b.build();
    }

    /**
     * Преобразует заголовки Kafka в map строковых значений (UTF-8).
     *
     * @param headers исходные заголовки (может быть {@code null})
     * @return LinkedHashMap в порядке итерации заголовков
     */
    @NonNull
    private Map<String, String> extractHeaders(@Nullable final Headers headers) {
        if (headers == null) {
            return Map.of();
        }
        final Map<String, String> result = new LinkedHashMap<>();
        for (Header h : headers) {
            final byte[] value = h.value();
            result.put(h.key(), value == null ? "" : new String(value, KafkaHeaderUtils.UTF8));
        }
        return result;
    }

    @NonNull
    private static String nullToEmpty(@Nullable final String s) {
        return s == null ? "" : s;
    }

    @NonNull
    private static String nullToEmpty(@Nullable final String s, @NonNull final String fallback) {
        return (s == null || s.isBlank()) ? fallback : s;
    }
}
