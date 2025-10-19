package ru.application.trading.api;

import lombok.Value;

/**
 * REST-ответ с идентификатором заявки.
 */
@Value
public class OrderIdResponse {
    String accountId;
    String orderId;
}
