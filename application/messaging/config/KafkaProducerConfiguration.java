package ru.application.messaging.config;

import com.google.protobuf.Message;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.lang.NonNull;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import ru.application.messaging.MessagingProperties;

/**
 * Конфигурация Kafka-продюсеров на основе Spring for Apache Kafka.
 * <p>
 * Правила (production-ready):
 * <ul>
 *   <li>идемпотентность включена ({@code acks=all}, {@code enable.idempotence=true});</li>
 *   <li>ограничение {@code max.in.flight.requests.per.connection} ≤ 5 для корректности при ретраях;</li>
 *   <li>разумные таймауты доставки (request/delivery), компрессия {@value #DEFAULT_COMPRESSION_TYPE};</li>
 *   <li>префикс транзакций (если задан в {@link KafkaProperties#getProducer()}) применяется к фабрике;</li>
 *   <li>значения по умолчанию ставятся только если не переопределены через {@code application.yml}.</li>
 * </ul>
 */
@Configuration(proxyBeanMethods = false)
public class KafkaProducerConfiguration {

    /** Значение по умолчанию для acks. */
    public static final String DEFAULT_ACKS = "all";
    /** Идемпотентность продюсера по умолчанию. */
    public static final boolean DEFAULT_IDEMPOTENCE = true;
    /** Максимум in-flight запросов на соединение (для идемпотентности ≤ 5). */
    public static final int DEFAULT_MAX_IN_FLIGHT = 5;
    /** Задержка накопления батча (мс). */
    public static final int DEFAULT_LINGER_MS = 10;
    /** Размер батча (байт). */
    public static final int DEFAULT_BATCH_SIZE = 32 * 1024; // 32 KiB
    /** Тип компрессии. */
    public static final String DEFAULT_COMPRESSION_TYPE = "zstd";
    /** Таймаут доставки (мс). */
    public static final int DEFAULT_DELIVERY_TIMEOUT_MS = 300_000; // 5 мин
    /** Таймаут запроса брокеру (мс). */
    public static final int DEFAULT_REQUEST_TIMEOUT_MS = 30_000; // 30 сек

    /**
     * Фабрика продюсеров с безопасными значениями по умолчанию.
     *
     * @param properties          Spring {@link KafkaProperties} (bootstrap, serializers и т.п.)
     * @param messagingProperties доменные настройки (используем producerId как client.id)
     * @return настроенная {@link ProducerFactory}
     */
    @Bean
    @NonNull
    public ProducerFactory<String, Message> producerFactory(
            @NonNull final KafkaProperties properties,
            @NonNull final MessagingProperties messagingProperties
    ) {
        final Map<String, Object> base = properties.buildProducerProperties();
        final Map<String, Object> config = new HashMap<>(base);

        // Серилизации по умолчанию (если не заданы в application.yml)
        putIfAbsent(config, ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        putIfAbsent(config, ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);

        // Идемпотентность/надежность
        putIfAbsent(config, ProducerConfig.ACKS_CONFIG, DEFAULT_ACKS);
        putIfAbsent(config, ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, DEFAULT_IDEMPOTENCE);
        putIfAbsent(config, ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, DEFAULT_MAX_IN_FLIGHT);

        // Производительность/таймауты
        putIfAbsent(config, ProducerConfig.LINGER_MS_CONFIG, DEFAULT_LINGER_MS);
        putIfAbsent(config, ProducerConfig.BATCH_SIZE_CONFIG, DEFAULT_BATCH_SIZE);
        putIfAbsent(config, ProducerConfig.COMPRESSION_TYPE_CONFIG, DEFAULT_COMPRESSION_TYPE);
        putIfAbsent(config, ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, DEFAULT_DELIVERY_TIMEOUT_MS);
        putIfAbsent(config, ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, DEFAULT_REQUEST_TIMEOUT_MS);

        // Идентификация клиента
        putIfAbsent(config, ProducerConfig.CLIENT_ID_CONFIG, messagingProperties.getProducerId());

        final DefaultKafkaProducerFactory<String, Message> factory = new DefaultKafkaProducerFactory<>(config);

        // Если задан префикс транзакций в spring.kafka.producer.transaction-id-prefix — применим его к фабрике
        final String txPrefix = properties.getProducer() != null ? properties.getProducer().getTransactionIdPrefix() : null;
        if (txPrefix != null && !txPrefix.isBlank()) {
            factory.setTransactionIdPrefix(txPrefix);
        }

        return factory;
    }

    /**
     * Общий KafkaTemplate c Micrometer Observation.
     *
     * @param producerFactory фабрика продюсеров
     * @return {@link KafkaTemplate} с включёнными наблюдаемостями
     */
    @Bean
    @NonNull
    public KafkaTemplate<String, Message> kafkaTemplate(@NonNull final ProducerFactory<String, Message> producerFactory) {
        final KafkaTemplate<String, Message> template = new KafkaTemplate<>(producerFactory);
        template.setObservationEnabled(true);
        return template;
    }

    /**
     * Системные часы (UTC) для меток времени в сообщениях/логах.
     *
     * @return {@link Clock} в часовом поясе UTC
     */
    @Bean
    @NonNull
    public Clock systemClock() {
        return Clock.systemUTC();
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    static final class Defaults {
        static boolean isBlank(final String s) { return s == null || s.trim().isEmpty(); }
    }

    private static void putIfAbsent(@NotNull final Map<String, Object> cfg,
                                    @NotNull final String key,
                                    @NotNull final Object value) {
        cfg.computeIfAbsent(key, k -> value);
    }
}
