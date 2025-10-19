package ru.application.health;

import grpc.tradeapi.v1.assets.AssetsServiceGrpc;
import grpc.tradeapi.v1.assets.AssetsServiceGrpc.AssetsServiceBlockingStub;
import grpc.tradeapi.v1.assets.ClockRequest;
import io.grpc.StatusRuntimeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


/**
 * HealthIndicator, выполняющий lightweight-пинг Finam Trade API через вызов {@code AssetsService.Clock}.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class FinamGrpcHealthIndicator implements HealthIndicator {

    private final AssetsServiceBlockingStub assetsServiceBlockingStub;

    /**
     * Выполняет lightweight-проверку доступности Finam Trade API.
     *
     * @return объект {@link Health} с результатом проверки; не {@code null}
     */
    @Override
    public Health health() {
        try {
            assetsServiceBlockingStub.clock(ClockRequest.getDefaultInstance());
            return Health.up()
                    .withDetail("endpoint", AssetsServiceGrpc.getClockMethod().getFullMethodName())
                    .build();
        } catch (final StatusRuntimeException exception) {
            log.warn("Health-check Finam API завершился ошибкой: {}", exception.getStatus());
            return Health.down(exception)
                    .withDetail("status", exception.getStatus().getCode().name())
                    .withDetail("endpoint", AssetsServiceGrpc.getClockMethod().getFullMethodName())
                    .build();
        }
    }
}
