package ru.application.trading.mapper;

import org.springframework.stereotype.Component;
import ru.application.trading.config.OrderBookMappingProperties;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Вспомогательные операции для нормализации и сортировки уровней стакана.
 */
@Component
public class OrderBookMappingSupport {

    private final OrderBookMappingProperties properties;

    public OrderBookMappingSupport(OrderBookMappingProperties properties) {
        this.properties = properties;
    }

    public int maxLevels() {
        return properties.getMaxLevels();
    }

    public boolean coalesceByPrice() {
        return properties.isCoalesceByPrice();
    }

    public Comparator<BigDecimal> asksComparator() {
        return Comparator.naturalOrder();
    }

    public Comparator<BigDecimal> bidsComparator() {
        return Comparator.reverseOrder();
    }

    public BigDecimal normalizePrice(BigDecimal price) {
        return properties.normalizePrice(price);
    }

    public BigDecimal normalizeSize(BigDecimal size) {
        return properties.normalizeSize(size);
    }
}
