package ru.application.messaging;

/**
 * Стандартные заголовки, используемые при публикации сообщений в Kafka.
 */
public final class KafkaMessageHeaders {

    public static final String SCHEMA_VERSION = "x-message-schema-version";
    public static final String PAYLOAD_TYPE = "x-payload-type";
    public static final String SENT_AT = "x-sent-at";
    public static final String DLQ_ORIGINAL_TOPIC = "x-dlq-original-topic";
    public static final String DLQ_ERROR_CLASS = "x-dlq-error";
    // +++ ДОБАВИТЬ
    public static final String PAYLOAD_CASE      = "x-payload-case";

    public static final String TENANT            = "x-tenant";
    public static final String ENVIRONMENT       = "x-environment";
    public static final String BOARD             = "x-board";
    public static final String CODE              = "x-code";
    public static final String SYMBOL            = "x-symbol";
    public static final String INSTRUMENT_ID     = "x-instrument-id";
    public static final String EVENT_TS          = "x-event-ts";
    public static final String INGEST_TS         = "x-ingest-ts";

    public static final String MESSAGE_ID        = "x-message-id";
    public static final String MESSAGE_VERSION   = "x-message-version";
    public static final String SOURCE            = "x-source";
    public static final String PRODUCER_ID       = "x-producer-id";
    public static final String CORRELATION_ID    = "x-correlation-id";
    public static final String TRACE_ID          = "x-trace-id";

    private KafkaMessageHeaders() {
    }
}
