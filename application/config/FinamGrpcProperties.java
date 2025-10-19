package ru.application.config;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * Настройки канала gRPC для подключения к Finam Trade API.
 * Свойства считываются из application.yml/properties и переменных окружения.
 */
@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "app.finam")
public class FinamGrpcProperties {

    /**
     * Встроенная политика повторов (retry) на уровне канала.
     */
    @Valid
    @NonNull
    private final RetryProperties retry = new RetryProperties();
    /**
     * Хост Finam Trade API. По умолчанию {@code api.finam.ru}.
     */
    @NonNull
    private String host = "api.finam.ru";
    /**
     * Порт Finam Trade API. По умолчанию {@code 443}.
     */
    @Min(1)
    @Max(65535)
    private int port = 443;
    /**
     * Признак использования TLS. По умолчанию включён.
     */
    private boolean tls = true;
    /**
     * Таймаут запроса по умолчанию (deadline) в миллисекундах.
     */
    @Positive
    private long deadlineMs = 10_000L;
    /**
     * Интервал keep-alive в миллисекундах.
     */
    @Positive
    private long keepaliveTimeMs = 60_000L;
    /**
     * Таймаут keep-alive в миллисекундах.
     */
    @Positive
    private long keepaliveTimeoutMs = 20_000L;
    /**
     * Максимальный размер входящего gRPC-сообщения в байтах.
     */
    @Positive
    private int maxInboundMessageSize = 8 * 1024 * 1024;
    /**
     * Включить подробное логирование исходящих заголовков (ТОЛЬКО для отладки!).
     */
    private boolean debugHeaders = false;

    /**
     * Группа свойств, описывающих параметры retry-политики.
     */
    @Getter
    @Setter
    @Validated
    public static class RetryProperties {

        /**
         * Включение повторов на уровне канала.
         */
        private boolean enabled = true;

        /**
         * Начальная задержка (backoff) в миллисекундах.
         */
        @Positive
        private long initialBackoffMs = 200L;

        /**
         * Максимальная задержка (backoff) в миллисекундах.
         */
        @Positive
        private long maxBackoffMs = 5_000L;

        /**
         * Максимальное количество попыток (включая исходную).
         */
        @Min(2)
        private int maxAttempts = 5;

        /**
         * Признак включения джиттера (случайного разброса задержек).
         * gRPC добавляет небольшой джиттер по умолчанию; флаг — для явного контроля.
         */
        private boolean jitter = true;

        /**
         * Валидация взаимного ограничения: maxBackoffMs ≥ initialBackoffMs.
         */
        @AssertTrue(message = "app.finam.retry.max-backoff-ms must be >= app.finam.retry.initial-backoff-ms")
        public boolean isBackoffRangeValid() {
            return maxBackoffMs >= initialBackoffMs;
        }
    }
}
