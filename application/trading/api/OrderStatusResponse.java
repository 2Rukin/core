package ru.application.trading.api;

import java.time.Instant;

import lombok.Builder;
import lombok.Value;
import ru.trade.api.dto.OrderExecutionStatus;

/**
 * REST-ответ с состоянием заявки.
 */
@Value
@Builder
public class OrderStatusResponse {
    String accountId;
    String orderId;
    OrderExecutionStatus status;
    String statusText;
    String executionId;
    Instant placedAt;
    Instant acceptedAt;
    Instant withdrawnAt;
}
