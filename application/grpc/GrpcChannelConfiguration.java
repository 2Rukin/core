package ru.application.grpc;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import jakarta.annotation.PreDestroy;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.application.config.FinamGrpcProperties;

import javax.net.ssl.SSLException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.Objects;

/**
 * Конфигурация gRPC-клиента: создание и настройка канала с TLS, keep-alive, ограничениями размера сообщений
 * и политикой повторов (retry) на уровне канала. К каналу применяется клиентский интерцептор авторизации.
 */
@Slf4j
@Configuration
@EnableConfigurationProperties({FinamGrpcProperties.class})
public class GrpcChannelConfiguration {

    /**
     * Преобразует миллисекунды в строку формата "<seconds>s" с максимум 9 знаками после запятой.
     * Примеры: 200 -> "0.2s", 10000 -> "10s", 1501 -> "1.501s".
     *
     * @param millis длительность в миллисекундах; неотрицательное значение
     * @return строковое представление в секундах; не {@code null}
     */
    private static String toSecondsDuration(final long millis) {
        if (millis < 0) {
            throw new IllegalArgumentException("Duration must be non-negative");
        }
        if (millis % 1000 == 0) {
            return (millis / 1000) + "s";
        }
        BigDecimal seconds = BigDecimal.valueOf(millis)
                .divide(BigDecimal.valueOf(1000), 9, RoundingMode.HALF_UP)
                .stripTrailingZeros();
        return seconds.toPlainString() + "s";
    }

    /**
     * Создаёт и настраивает низкоуровневый {@link ManagedChannel} для взаимодействия с Finam Trade API.
     *
     * @param properties объект со значениями настроек; не {@code null}
     * @return настроенный {@link ManagedChannel}; не {@code null}
     * @throws SSLException если не удалось инициализировать TLS-контекст
     */
    @Bean(destroyMethod = "shutdownNow")
    @ConditionalOnMissingBean(ManagedChannel.class)
    public ManagedChannel finamManagedChannel(@NonNull final FinamGrpcProperties properties) throws SSLException {
        Objects.requireNonNull(properties, "properties");
        final NettyChannelBuilder builder = NettyChannelBuilder
                .forAddress(properties.getHost(), properties.getPort())
                .maxInboundMessageSize(properties.getMaxInboundMessageSize())
                .keepAliveTime(properties.getKeepaliveTimeMs(), TimeUnit.MILLISECONDS)
                .enableRetry()
                // Запрещаем загрузку Service Config из DNS, чтобы к нам не прилетели чужие (и потенциально некорректные) значения.
                .disableServiceConfigLookUp();

        if (properties.isTls()) {
            builder.sslContext(GrpcSslContexts.forClient().build());
        } else {
            builder.usePlaintext();
        }

        if (properties.getRetry().isEnabled()) {
            final Map<String, Object> serviceConfig = buildRetryServiceConfig(properties);
            if (log.isDebugEnabled()) {
                log.debug("gRPC ServiceConfig (applied): {}", serviceConfig);
            }
            builder.defaultServiceConfig(serviceConfig);
        }

        log.info("gRPC-канал создан: {}:{} tls={}, retries={}",
                properties.getHost(), properties.getPort(), properties.isTls(), properties.getRetry().isEnabled());
        return builder.build();
    }

    /**
     * Оборачивает {@link ManagedChannel} отладочными интерцепторами (без авторизации!).
     *
     * @param managedChannel gRPC-канал, полученный из контекста Spring; не {@code null}
     * @return канал с подключёнными интерцепторами; не {@code null}
     */
    @Bean
    public Channel finamClientChannel(@NonNull final ManagedChannel managedChannel) {
        Objects.requireNonNull(managedChannel, "managedChannel");
        // Добавляй/убирай отладочные интерцепторы по необходимости:
        final List<ClientInterceptor> interceptors = List.of(
                new ru.application.grpc.debug.OutboundHeadersLoggingInterceptor()
        );
        return ClientInterceptors.intercept(managedChannel, interceptors);
    }


    /**
     * Формирует карту конфигурации retry-политики для gRPC Service Config.
     * gRPC Java ожидает длительности в секундах с суффиксом "s" (возможна дробная часть), без "ms"/"m".
     *
     * @param properties настройки gRPC-подключения; не {@code null}
     * @return карта настроек Service Config; не {@code null}
     */
    @SuppressWarnings("unchecked")
    private Map<String, Object> buildRetryServiceConfig(@NonNull final FinamGrpcProperties properties) {
        Objects.requireNonNull(properties, "properties");
        final long initialMs = Math.max(1L, properties.getRetry().getInitialBackoffMs());
        final long maxMs = Math.max(initialMs, properties.getRetry().getMaxBackoffMs());
        final int attempts = Math.max(2, properties.getRetry().getMaxAttempts());

        final Map<String, Object> retryPolicy = new HashMap<>();
        retryPolicy.put("maxAttempts", (double) attempts);
        retryPolicy.put("initialBackoff", toSecondsDuration(initialMs)); // только "s"
        retryPolicy.put("maxBackoff", toSecondsDuration(maxMs));         // только "s"
        retryPolicy.put("backoffMultiplier", 2.0d);
        retryPolicy.put("retryableStatusCodes", List.of("UNAVAILABLE"));

        // По желанию можно добавить троттлинг (значения — консервативные)
        final Map<String, Object> retryThrottling = new HashMap<>();
        retryThrottling.put("maxTokens", 10.0d);
        retryThrottling.put("tokenRatio", 0.1d);

        final Map<String, Object> methodConfig = new HashMap<>();
        // Пустое имя означает — применить ко всем методам всех сервисов
        methodConfig.put("name", List.of(new HashMap<String, Object>()));
        methodConfig.put("retryPolicy", retryPolicy);

        final Map<String, Object> serviceConfig = new HashMap<>();
        serviceConfig.put("methodConfig", List.of(methodConfig));
        serviceConfig.put("retryThrottling", retryThrottling);
        return serviceConfig;
    }

    /**
     * Корректно завершаем работу при остановке контекста Spring.
     */
    @PreDestroy
    public void onShutdown() {
        log.info("Инициирована остановка приложения, gRPC-канал будет закрыт Spring через destroyMethod.");
    }
}
