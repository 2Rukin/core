package ru.application.trading.config;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Конфигурация преобразования стакана заявок Finam в доменную модель.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Validated
@ConfigurationProperties(prefix = OrderBookMappingProperties.PREFIX)
public class OrderBookMappingProperties {

    /** Префикс конфигурации в application.yml. */
    public static final String PREFIX = "app.market.data.orderbook";

    /** Значение глубины стакана по умолчанию. */
    public static final int DEFAULT_MAX_LEVELS = 20;

    /**
     * Максимальное число уровней по каждой стороне.
     */
    @Min(1)
    private int maxLevels = DEFAULT_MAX_LEVELS;

    /**
     * Признак коалессации уровней с одинаковой ценой.
     */
    private boolean coalesceByPrice = true;

    /**
     * Параметры округления цены и объёма.
     */
    @NotNull
    private Rounding rounding = new Rounding();

    /**
     * Применяет настройки округления к значению цены.
     *
     * @param price исходная цена
     * @return нормализованная цена или {@link BigDecimal#ZERO}, если вход {@code null}
     */
    public BigDecimal normalizePrice(BigDecimal price) {
        return rounding.normalize(price, rounding.getScalePrice());
    }

    /**
     * Применяет настройки округления к значению объёма.
     *
     * @param size исходный объём
     * @return нормализованный объём или {@link BigDecimal#ZERO}, если вход {@code null}
     */
    public BigDecimal normalizeSize(BigDecimal size) {
        return rounding.normalize(size, rounding.getScaleSize());
    }

    /**
     * Настройки округления.
     */
    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class Rounding {
        /** Масштаб (scale) для цены. */
        private int scalePrice = 5;
        /** Масштаб (scale) для объёма. */
        private int scaleSize = 5;
        /** Алгоритм округления. */
        @NotNull
        private RoundingMode mode = RoundingMode.HALF_UP;

        private BigDecimal normalize(BigDecimal value, int scale) {
            if (value == null) {
                return BigDecimal.ZERO;
            }
            if (scale < 0) {
                return value;
            }
            return value.setScale(scale, mode);
        }
    }
}
