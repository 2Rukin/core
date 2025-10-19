package ru.application.trading.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

/**
 * Транспортная модель REST API для размещения рыночной заявки.
 */
@Data
public class MarketOrderRestRequest {

    @NotBlank
    private String accountId;

    @NotBlank
    private String symbol;

    @Positive
    private long quantityLots;

    private String clientOrderId;

    @NotNull
    private Side side;

    /**
     * Допустимые направления заявки.
     */
    public enum Side {
        /** Покупка. */
        BUY,
        /** Продажа. */
        SELL
    }
}
