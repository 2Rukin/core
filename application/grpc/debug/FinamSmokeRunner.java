package ru.application.grpc.debug;

import grpc.tradeapi.v1.assets.AssetsServiceGrpc;
import grpc.tradeapi.v1.assets.ClockRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Простой smoke‑раннер, который по флагу {@code finam.smoke.enabled=true}
 * выполняет пару вызовов и логирует результат в консоль.
 */
@Slf4j
@Component
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app.finam", name = "smokeEnabled", havingValue = "true")
public class FinamSmokeRunner implements ApplicationRunner {


    /**
     * Блокирующий gRPC-stub сервиса {@code AssetsService}.
     */
    private final AssetsServiceGrpc.AssetsServiceBlockingStub assets;


    /**
     * Выполняет smoke-вызов {@code assets.clock} и логирует результат.
     *
     * @param args аргументы запуска приложения; не {@code null}
     */
    @Override
    public void run(final ApplicationArguments args) {
        Objects.requireNonNull(args, "args");
        try {
            var resp = assets.clock(ClockRequest.getDefaultInstance());
            log.info("Smoke: assets.clock OK, serverTimeNanos={} ", resp.getTimestamp().getNanos());
        } catch (Exception e) {
            log.error("Smoke: assets.clock FAILED: {}", e.toString());
        }
    }
}
