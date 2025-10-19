package ru.application.config;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;

/**
 * Настройки периодической публикации снапшотов справочника инструментов.
 * <p>
 * YAML-префикс: app.ref-securities-snapshots
 * <p>
 * Примеры:
 * app:
 * ref-securities-snapshots:
 * enabled: true
 * initial-delay: PT10S
 * fixed-delay: PT30M
 */
@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "app.scheduler.ref-securities")
public class RefSecuritiesSnapshotsProperties {

    /**
     * Флаг включения задачи.
     */
    private Boolean enabled;

    /**
     * Задержка перед первым запуском.
     */
    private Duration initialDelay;

    /**
     * Интервал между запусками.
     */
    private Duration fixedDelay;

    /**
     * Для @Scheduled SpEL.
     */
    public long initialDelayMillis() {
        return initialDelay.toMillis();
    }

    /**
     * Для @Scheduled SpEL.
     */
    public long fixedDelayMillis() {
        return fixedDelay.toMillis();
    }
}
