package ru.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.scheduling.annotation.EnableScheduling;
import ru.application.config.AuthProperties;
import ru.application.config.FinamGrpcProperties;
import ru.application.config.RefSecuritiesSnapshotsProperties;
import ru.application.messaging.MessagingProperties;
import ru.application.trading.config.MarketEventProperties;
import ru.application.trading.config.OrderBookMappingProperties;

/**
 * Точка входа Spring Boot-приложения Finam Trade API Gateway.
 */
@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties({
        AuthProperties.class,
        FinamGrpcProperties.class,
        MessagingProperties.class,
        RefSecuritiesSnapshotsProperties.class,
        MarketEventProperties.class,
        OrderBookMappingProperties.class
})
public class Application {

    /**
     * Запускает Spring Boot-контекст приложения.
     *
     * @param args аргументы командной строки; допустимо {@code null}
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
