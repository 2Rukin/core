package ru.application.messaging.producer;

import com.google.protobuf.Message;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

import ru.application.messaging.KafkaHeaderUtils;

/**
 * Контекст сообщения, которое требуется перенести в DLQ.
 * <p>
 * Контракты:
 * <ul>
 *   <li>{@code originalTopic} — непустое имя исходной темы;</li>
 *   <li>{@code payload} — не {@code null};</li>
 *   <li>{@code headers} — не {@code null}, в конструкторе создаётся защитная копия;</li>
 *   <li>{@code key} — может быть {@code null}.</li>
 * </ul>
 * Экземпляр иммутабелен (record). Для удобства предусмотрены фабрики и метод копирования с добавлением заголовка.
 */
@Builder(toBuilder = true)
public record DlqPublishRequest(
        @NotBlank @NonNull String originalTopic,
        @Nullable String key,
        @NonNull Message payload,
        @NonNull Headers headers
) {
    /** Текст ошибки: пустая тема. */
    public static final String ERR_TOPIC_BLANK = "originalTopic must not be blank";
    /** Текст ошибки: payload == null. */
    public static final String ERR_PAYLOAD_NULL = "payload must not be null";
    /** Текст ошибки: headers == null. */
    public static final String ERR_HEADERS_NULL = "headers must not be null";

    /**
     * Канонический конструктор с валидацией и защитным копированием заголовков.
     *
     * @param originalTopic имя исходной темы (не blank)
     * @param key           ключ сообщения (может быть {@code null})
     * @param payload       protobuf-полезная нагрузка (не {@code null})
     * @param headers       заголовки (не {@code null}); будет создана защитная копия
     */
    public DlqPublishRequest {
        if (originalTopic == null || originalTopic.isBlank()) {
            throw new IllegalArgumentException(ERR_TOPIC_BLANK);
        }
        payload = Objects.requireNonNull(payload, ERR_PAYLOAD_NULL);
        headers = KafkaHeaderUtils.copyOf(Objects.requireNonNull(headers, ERR_HEADERS_NULL));
    }

    /**
     * Фабрика: создать запрос с пустым набором заголовков.
     *
     * @param originalTopic имя исходной темы (не blank)
     * @param key           ключ сообщения (может быть {@code null})
     * @param payload       protobuf-полезная нагрузка (не {@code null})
     * @return новый {@link DlqPublishRequest}
     */
    @NonNull
    public static DlqPublishRequest of(
            @NotBlank @NonNull final String originalTopic,
            @Nullable final String key,
            @NonNull final Message payload
    ) {
        return new DlqPublishRequest(originalTopic, key, payload, new RecordHeaders());
    }

    /**
     * Возвращает копию запроса с добавленным/обновлённым заголовком.
     *
     * @param name  имя заголовка (не blank)
     * @param value значение (не {@code null})
     * @return новый {@link DlqPublishRequest} с обновлёнными заголовками
     */
    @NonNull
    public DlqPublishRequest withHeader(@NonNull final String name, @NonNull final String value) {
        final RecordHeaders copy = KafkaHeaderUtils.copyOf(headers);
        KafkaHeaderUtils.putHeader(copy, name, value);
        return new DlqPublishRequest(originalTopic, key, payload, copy);
    }
}
