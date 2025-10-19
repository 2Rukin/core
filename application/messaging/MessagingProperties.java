package ru.application.messaging;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Конфигурация слоя обмена сообщениями приложения (Kafka/Redpanda).
 * <p>
 * Бин привязывается к префиксу {@value #PREFIX} и хранит параметры интеграции:
 * <ul>
 *   <li>адрес Schema Registry ({@code schemaRegistryUrl});</li>
 *   <li>метаданные продюсера ({@code producerId}, {@code messageVersion});</li>
 *   <li>имена Kafka-тем в виде словаря по ключам перечисления {@link Topic} (поле {@code topics}).</li>
 * </ul>
 * В коде обращайтесь к темам через {@link #topic(Topic)} для типобезопасности.
 */
@Validated
@ConfigurationProperties(prefix = MessagingProperties.PREFIX)
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class MessagingProperties {

    /** Префикс конфигурации в application.yml. */
    public static final String PREFIX = "app.messaging";
    /** Значение по умолчанию для идентификатора продюсера. */
    public static final String DEFAULT_PRODUCER_ID = "finam-trade-api";
    /** Значение по умолчанию для версии формата сообщений. */
    public static final String DEFAULT_MESSAGE_VERSION = "v1";
    /** Общее сообщение валидации для отсутствующих тем. */
    public static final String ERR_MISSING_TOPIC = "All topics must be configured under 'app.messaging.topics.<key>'";

    @NotBlank
    private String schemaRegistryUrl;

    @NotBlank
    private String producerId = DEFAULT_PRODUCER_ID;

    @NotBlank
    private String messageVersion = DEFAULT_MESSAGE_VERSION;

    /**
     * Словарь "ключ перечисления {@link Topic} → имя Kafka-темы".
     * <p>
     * В YAML ключи задаются в <b>kebab-case</b>, например:
     * <pre>
     * app:
     *   messaging:
     *     topics:
     *       private-orders-events: finam.private.orders.events.v1
     * </pre>
     */
    @Valid
    @NotNull
    @NotEmpty
    private Map<@NotNull Topic, @NotBlank String> topics = new LinkedHashMap<>();

    /**
     * URL Schema Registry (http/https).
     *
     * @return непустой URL
     */
    @NonNull
    public String getSchemaRegistryUrl() {
        return schemaRegistryUrl;
    }

    /**
     * Устанавливает URL Schema Registry.
     *
     * @param schemaRegistryUrl непустой URL
     */
    public void setSchemaRegistryUrl(@NonNull @NotBlank final String schemaRegistryUrl) {
        this.schemaRegistryUrl = schemaRegistryUrl;
    }

    /**
     * Идентификатор продюсера (используется в логах/заголовках).
     *
     * @return непустая строка
     */
    @NonNull
    public String getProducerId() {
        return producerId;
    }

    /**
     * Устанавливает идентификатор продюсера.
     *
     * @param producerId непустая строка
     */
    public void setProducerId(@NonNull @NotBlank final String producerId) {
        this.producerId = producerId;
    }

    /**
     * Версия формата/схемы сообщений (например, {@code v1}).
     *
     * @return непустая строка
     */
    @NonNull
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Устанавливает версию формата/схемы сообщений.
     *
     * @param messageVersion непустая строка
     */
    public void setMessageVersion(@NonNull @NotBlank final String messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * Возвращает неизменяемую карту настроенных тем.
     *
     * @return словарь Topic → имя темы
     */
    @NonNull
    public Map<Topic, String> getTopics() {
        return Map.copyOf(topics);
    }

    /**
     * Устанавливает карту имён тем.
     *
     * @param topics словарь Topic → имя темы
     */
    public void setTopics(@NonNull @Valid final Map<@NotNull Topic, @NotBlank String> topics) {
        this.topics = new LinkedHashMap<>(Objects.requireNonNull(topics, "topics"));
    }

    /**
     * Возвращает имя Kafka-темы по ключу перечисления.
     *
     * @param key ключ темы
     * @return непустое имя Kafka-темы
     * @throws IllegalStateException если тема не сконфигурирована
     */
    @NonNull
    public String topic(@NonNull final Topic key) {
        final String value = topics.get(Objects.requireNonNull(key, "key"));
        if (isBlank(value)) {
            throw new IllegalStateException(ERR_MISSING_TOPIC + " (missing: " + key.propertyKey() + ")");
        }
        return value;
    }

    /**
     * Проверяет, что все обязательные темы присутствуют в конфигурации.
     *
     * @return {@code true}, если темы заданы; иначе {@code false}
     */
    public boolean isAllTopicsConfigured() {
        for (Topic t : Topic.values()) {
            final String v = topics.get(t);
            if (isBlank(v)) return false;
        }
        return true;
    }

    private static boolean isBlank(final String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Перечисление ключей тем Kafka, используемых приложением.
     * <p>
     * Каждая константа содержит стабильный "ключ свойства" в kebab-case для удобства документации/YAML.
     */
    public enum Topic {
        /** События по заявкам (GetEvents orders). */
        PRIVATE_ORDERS_EVENTS("private-orders-events"),
        /** События по сделкам (GetEvents trades). */
        PRIVATE_TRADES_EVENTS("private-trades-events"),
        /** Обновления биржевого стакана (legacy events-поток). */
        MD_ORDERBOOK_EVENTS("md-orderbook-events"),
        /** Справочник инструментов (GetSecurities). */
        REF_SECURITIES_SNAPSHOTS("ref-securities-snapshots"),
        /** Состояния портфелей (GetPortfolios). */
        REF_PORTFOLIOS_SNAPSHOTS("ref-portfolios-snapshots"),
        /** Аудит исходящих команд (NewOrder/CancelOrder). */
        PRIVATE_ORDERS_COMMANDS("private-orders-commands"),
        /** Аудит исходящих стоп-команд (NewStop/CancelStop). */
        PRIVATE_STOPS_COMMANDS("private-stops-commands"),
        /** Keep-Alive (используем один ключ для обоих случаев). */
        TECH_KEEPALIVE("tech-keepalive"),
        /** Учёт подписок (Subscribe/Unsubscribe). */
        TECH_SUBSCRIPTIONS_STATUS("tech-subscriptions-status"),
        /** Dead Letter Queue (DLQ). */
        DLQ("dlq"),

        // === split-by-payload (typed) ===
        /** Котировки (Quote). */
        MD_QUOTES("md-quotes"),
        /** Сделки (Trades). */
        MD_TRADES("md-trades"),
        /** Свечи (Bars). */
        MD_BARS("md-bars"),
        /** Стакан (OrderBook), typed-поток. */
        MD_ORDERBOOK("md-orderbook"),
        /** Тех. ошибки стримов. */
        TECH_ERRORS("tech-errors"),
        /** Торговые события: статусы/исполнения. */
        TRADING_EVENTS("trading-events"),
        /** Состояние портфеля аккаунта. */
        ACCOUNTS_PORTFOLIO("accounts-portfolio");


        private final String propertyKey;

        Topic(final String propertyKey) {
            this.propertyKey = propertyKey;
        }

        /**
         * Возвращает ключ свойства в YAML (kebab-case), например {@code private-orders-events}.
         *
         * @return стабильный ключ свойства
         */
        @NonNull
        public String propertyKey() {
            return propertyKey;
        }

        @Override
        public String toString() {
            return name() + "(" + propertyKey + ")";
        }

        /**
         * Возвращает множество всех обязательных тем для удобства валидации/документации.
         *
         * @return EnumSet со всеми значениями перечисления
         */
        @NonNull
        public static EnumSet<Topic> required() {
            return EnumSet.allOf(Topic.class);
        }
    }
}
