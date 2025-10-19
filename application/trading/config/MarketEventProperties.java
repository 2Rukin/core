package ru.application.trading.config;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import ru.application.messaging.MessagingProperties;

/**
 * Настройки, определяющие метаданные для конверта {@code MarketEvent.Envelope}.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Validated
@ConfigurationProperties(prefix = MarketEventProperties.PREFIX)
public class MarketEventProperties {

    /** Префикс конфигурации в application.yml. */
    public static final String PREFIX = "app.market.event";

    /** Значение окружения по умолчанию. */
    public static final String DEFAULT_ENVIRONMENT = "dev";

    /** Значение источника по умолчанию. */
    public static final String DEFAULT_SOURCE = "finam.market-data";

    /** Ключ MDC для корреляции. */
    public static final String DEFAULT_CORRELATION_MDC_KEY = "correlationId";

    /** Ключ MDC для трассировки. */
    public static final String DEFAULT_TRACE_MDC_KEY = "traceId";

    /**
     * Версия схемы сообщения, которая будет выставлена в Envelope.
     * Используем {@code uint32} в proto, поэтому ограничиваемся положительными значениями.
     */
    @Min(1)
    private int messageVersion = 1;

    /**
     * Идентификатор продьюсера, попадает в Envelope и Kafka-заголовки.
     */
    @NotBlank
    private String producerId = MessagingProperties.DEFAULT_PRODUCER_ID;

    /**
     * Значение поля {@code env.environment}, если контекст его не передал.
     */
    @NotBlank
    private String defaultEnvironment = DEFAULT_ENVIRONMENT;

    /**
     * Значение поля {@code env.source} по умолчанию.
     */
    @NotBlank
    private String defaultSource = DEFAULT_SOURCE;

    /**
     * Ключ MDC для поиска коррелятора.
     */
    @NotBlank
    private String correlationMdcKey = DEFAULT_CORRELATION_MDC_KEY;

    /**
     * Ключ MDC для поиска идентификатора трейса.
     */
    @NotBlank
    private String traceMdcKey = DEFAULT_TRACE_MDC_KEY;

    /**
     * Возвращает версию сообщения в виде {@code long} для удобной работы с proto {@code uint32}.
     *
     * @return положительная версия схемы
     */
    @NonNull
    public long messageVersionAsLong() {
        return messageVersion;
    }
}
