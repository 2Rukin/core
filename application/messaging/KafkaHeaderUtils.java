package ru.application.messaging;

import com.google.protobuf.Message;
import lombok.experimental.UtilityClass;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

/**
 * Утилиты для безопасной работы с Kafka-заголовками.
 * <p>
 * Контракты:
 * <ul>
 *   <li>Публичные методы с аннотацией {@link NonNull} не принимают/не возвращают {@code null}.</li>
 *   <li>Стандартные заголовки перезаписываются (upsert), пользовательские — добавляются только если ключ и значение валидны.</li>
 *   <li>Кодировка строковых значений заголовков — {@value #UTF8_NAME}.</li>
 * </ul>
 */
@UtilityClass
public class KafkaHeaderUtils {

    /** Кодировка заголовков. */
    public static final Charset UTF8 = StandardCharsets.UTF_8;
    /** Имя кодировки (для документации/логов). */
    public static final String UTF8_NAME = "UTF-8";
    /** Формат времени для {@code x-sent-at}. */
    public static final DateTimeFormatter ISO_INSTANT = DateTimeFormatter.ISO_INSTANT;

    /**
     * Создаёт новый набор заголовков и заполняет стандартные поля приложения.
     *
     * @param payload    protobuf-полезная нагрузка
     * @param properties конфигурация обмена сообщениями
     * @param clock      источник времени
     * @return новый {@link RecordHeaders} со стандартными заголовками
     */
    @NonNull
    public static RecordHeaders standardHeaders(
            @NonNull final Message payload,
            @NonNull final MessagingProperties properties,
            @NonNull final Clock clock
    ) {
        final RecordHeaders headers = new RecordHeaders();
        addStandardHeaders(headers, payload, properties, clock);
        return headers;
    }

    /**
     * Добавляет/обновляет стандартные заголовки в переданный набор.
     * <ul>
     *   <li>{@code x-message-schema-version}</li>
     *   <li>{@code x-payload-type}</li>
     *   <li>{@code x-sent-at} (UTC, ISO-8601)</li>
     * </ul>
     *
     * @param headers    целевой набор заголовков
     * @param payload    protobuf-полезная нагрузка
     * @param properties конфигурация обмена сообщениями
     * @param clock      источник времени
     */
    public static void addStandardHeaders(
            @NonNull final Headers headers,
            @NonNull final Message payload,
            @NonNull final MessagingProperties properties,
            @NonNull final Clock clock
    ) {
        Objects.requireNonNull(headers, "headers");
        Objects.requireNonNull(payload, "payload");
        Objects.requireNonNull(properties, "properties");
        Objects.requireNonNull(clock, "clock");

        putHeader(headers, KafkaMessageHeaders.SCHEMA_VERSION, properties.getMessageVersion());
        putHeader(headers, KafkaMessageHeaders.PAYLOAD_TYPE, payload.getDescriptorForType().getFullName());
        putHeader(headers, KafkaMessageHeaders.SENT_AT, ISO_INSTANT.format(clock.instant()));

        // +++ добавить:
        enrichWithMarketEventHeaders(headers, payload);
    }

    /**
     * Добавляет произвольные заголовки.
     * <p>Пары с пустым ключом или {@code null}-значением игнорируются.</p>
     *
     * @param headers       целевой набор заголовков
     * @param customHeaders произвольные заголовки (может быть {@code null}/пусто)
     */
    public static void addCustomHeaders(
            @NonNull final Headers headers,
            @Nullable final Map<String, String> customHeaders
    ) {
        Objects.requireNonNull(headers, "headers");
        if (customHeaders == null || customHeaders.isEmpty()) {
            return;
        }
        customHeaders.forEach((k, v) -> {
            if (hasText(k) && v != null) {
                putHeader(headers, k, v);
            }
        });
    }

    /**
     * Ставит/обновляет одиночный заголовок (upsert).
     *
     * @param headers набор заголовков
     * @param name    имя заголовка (не blank)
     * @param value   строковое значение (не {@code null})
     * @throws IllegalArgumentException если {@code name} пустой
     */
    public static void putHeader(
            @NonNull final Headers headers,
            @NonNull final String name,
            @NonNull final String value
    ) {
        Objects.requireNonNull(headers, "headers");
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(value, "value");
        if (!hasText(name)) {
            throw new IllegalArgumentException("header name must not be blank");
        }
        // remove → add обеспечивает одно значение на ключ
        headers.remove(name);
        headers.add(name, value.getBytes(UTF8));
    }

    /**
     * Копирует заголовки в новый экземпляр {@link RecordHeaders}.
     *
     * @param source исходный набор
     * @return новый набор с теми же значениями
     */
    @NonNull
    public static RecordHeaders copyOf(@NonNull final Headers source) {
        Objects.requireNonNull(source, "source");
        final RecordHeaders copy = new RecordHeaders();
        for (Header h : source) {
            // дублируем в точности (имя + байтовое значение)
            copy.add(h.key(), h.value());
        }
        return copy;
    }

    private static boolean hasText(@Nullable final String s) {
        return s != null && !s.trim().isEmpty();
    }

    // +++ ДОБАВИТЬ в KafkaHeaderUtils
    public static void enrichWithMarketEventHeaders(@NonNull Headers headers, @NonNull Message payload) {
        if (!(payload instanceof ru.domain.market.proto.MarketEvent me)) {
            return;
        }
        final var env = me.getEnv();
        putHeader(headers, KafkaMessageHeaders.PAYLOAD_CASE, me.getPayloadCase().name());

        if (env != null) {
            putHeader(headers, KafkaMessageHeaders.TENANT, env.getTenant());
            putHeader(headers, KafkaMessageHeaders.ENVIRONMENT, env.getEnvironment());
            putHeader(headers, KafkaMessageHeaders.BOARD, env.getBoard());
            putHeader(headers, KafkaMessageHeaders.CODE, env.getCode());
            putHeader(headers, KafkaMessageHeaders.SYMBOL, env.getSymbol());
            putHeader(headers, KafkaMessageHeaders.INSTRUMENT_ID, env.getInstrumentId());
            putHeader(headers, KafkaMessageHeaders.EVENT_TS, String.valueOf(env.getEventTs()));
            putHeader(headers, KafkaMessageHeaders.INGEST_TS, String.valueOf(env.getIngestTs()));
            putHeader(headers, KafkaMessageHeaders.MESSAGE_ID, env.getMessageId());
            putHeader(headers, KafkaMessageHeaders.MESSAGE_VERSION, String.valueOf(env.getMessageVersion()));
            putHeader(headers, KafkaMessageHeaders.SOURCE, env.getSource());
            putHeader(headers, KafkaMessageHeaders.PRODUCER_ID, env.getProducerId());
            putHeader(headers, KafkaMessageHeaders.CORRELATION_ID, env.getCorrelationId());
            putHeader(headers, KafkaMessageHeaders.TRACE_ID, env.getTraceId());
        }
    }

}
