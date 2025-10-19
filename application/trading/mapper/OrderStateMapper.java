package ru.application.trading.mapper;

import java.time.Instant;
import java.util.Objects;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.google.protobuf.Timestamp;

import grpc.tradeapi.v1.orders.OrderState;
import grpc.tradeapi.v1.orders.OrderStatus;
import ru.trade.api.dto.OrderExecutionStatus;
import ru.trade.api.dto.OrderId;

/**
 * Преобразование gRPC-модели {@link OrderState} в доменную модель {@link ru.trade.api.dto.OrderStatus}.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderStateMapper {

    @Mapping(target = "orderId", expression = "java(resolveOrderId(state, fallbackAccountId))")
    @Mapping(target = "status", expression = "java(mapStatus(state.getStatus()))")
    @Mapping(target = "statusText", expression = "java(state.getStatus().name())")
    @Mapping(target = "executionIdentifier", source = "execId")
    @Mapping(target = "placedAt", expression = "java(toInstant(state.hasTransactAt() ? state.getTransactAt() : null))")
    @Mapping(target = "acceptedAt", expression = "java(toInstant(state.hasAcceptAt() ? state.getAcceptAt() : null))")
    @Mapping(target = "withdrawnAt", expression = "java(toInstant(state.hasWithdrawAt() ? state.getWithdrawAt() : null))")
    /**
     * Конвертирует gRPC-состояние заявки в доменную модель.
     *
     * @param state              состояние заявки из Finam Trade API; не {@code null}
     * @param fallbackAccountId  идентификатор счёта, используемый если его нет в ответе; может быть {@code null}
     * @return доменное представление состояния заявки; не {@code null}
     */
    ru.trade.api.dto.OrderStatus toDomain(OrderState state, @Context String fallbackAccountId);

    /**
     * Формирует идентификатор заявки на основе gRPC-ответа.
     *
     * @param state             состояние заявки; не {@code null}
     * @param fallbackAccountId запасной идентификатор счёта; может быть {@code null}
     * @return идентификатор заявки; не {@code null}
     */
    default OrderId resolveOrderId(final OrderState state, final String fallbackAccountId) {
        Objects.requireNonNull(state, "state");
        final String accountId;
        if (state.hasOrder() && !state.getOrder().getAccountId().isBlank()) {
            accountId = state.getOrder().getAccountId();
        } else if (fallbackAccountId != null && !fallbackAccountId.isBlank()) {
            accountId = fallbackAccountId;
        } else {
            throw new IllegalArgumentException("account_id не найден в ответе и не передан явно");
        }
        return OrderId.builder()
                .accountIdentifier(accountId)
                .orderIdentifier(state.getOrderId())
                .build();
    }

    /**
     * Отображает gRPC-статус заявки в доменный {@link OrderExecutionStatus}.
     *
     * @param status статус из Finam Trade API; не {@code null}
     * @return доменное представление статуса; не {@code null}
     */
    default OrderExecutionStatus mapStatus(final OrderStatus status) {
        Objects.requireNonNull(status, "status");
        return switch (status) {
            case ORDER_STATUS_NEW -> OrderExecutionStatus.NEW;
            case ORDER_STATUS_PARTIALLY_FILLED -> OrderExecutionStatus.PARTIALLY_FILLED;
            case ORDER_STATUS_FILLED -> OrderExecutionStatus.FILLED;
            case ORDER_STATUS_DONE_FOR_DAY -> OrderExecutionStatus.DONE_FOR_DAY;
            case ORDER_STATUS_CANCELED -> OrderExecutionStatus.CANCELED;
            case ORDER_STATUS_REPLACED -> OrderExecutionStatus.REPLACED;
            case ORDER_STATUS_PENDING_CANCEL -> OrderExecutionStatus.PENDING_CANCEL;
            case ORDER_STATUS_REJECTED -> OrderExecutionStatus.REJECTED;
            case ORDER_STATUS_SUSPENDED -> OrderExecutionStatus.SUSPENDED;
            case ORDER_STATUS_PENDING_NEW -> OrderExecutionStatus.PENDING_NEW;
            case ORDER_STATUS_EXPIRED -> OrderExecutionStatus.EXPIRED;
            case ORDER_STATUS_FAILED -> OrderExecutionStatus.FAILED;
            case ORDER_STATUS_FORWARDING -> OrderExecutionStatus.FORWARDING;
            case ORDER_STATUS_WAIT -> OrderExecutionStatus.WAIT;
            case ORDER_STATUS_DENIED_BY_BROKER -> OrderExecutionStatus.DENIED_BY_BROKER;
            case ORDER_STATUS_REJECTED_BY_EXCHANGE -> OrderExecutionStatus.REJECTED_BY_EXCHANGE;
            case ORDER_STATUS_WATCHING -> OrderExecutionStatus.WATCHING;
            case ORDER_STATUS_EXECUTED -> OrderExecutionStatus.EXECUTED;
            case ORDER_STATUS_DISABLED -> OrderExecutionStatus.DISABLED;
            case ORDER_STATUS_LINK_WAIT -> OrderExecutionStatus.LINK_WAIT;
            case ORDER_STATUS_SL_GUARD_TIME -> OrderExecutionStatus.SL_GUARD_TIME;
            case ORDER_STATUS_SL_EXECUTED -> OrderExecutionStatus.SL_EXECUTED;
            case ORDER_STATUS_SL_FORWARDING -> OrderExecutionStatus.SL_FORWARDING;
            case ORDER_STATUS_TP_GUARD_TIME -> OrderExecutionStatus.TP_GUARD_TIME;
            case ORDER_STATUS_TP_EXECUTED -> OrderExecutionStatus.TP_EXECUTED;
            case ORDER_STATUS_TP_CORRECTION -> OrderExecutionStatus.TP_CORRECTION;
            case ORDER_STATUS_TP_FORWARDING -> OrderExecutionStatus.TP_FORWARDING;
            case ORDER_STATUS_TP_CORR_GUARD_TIME -> OrderExecutionStatus.TP_CORR_GUARD_TIME;
            case ORDER_STATUS_UNSPECIFIED, UNRECOGNIZED -> OrderExecutionStatus.UNSPECIFIED;
        };
    }

    /**
     * Конвертирует protobuf {@link Timestamp} в {@link Instant}.
     *
     * @param timestamp исходное значение; может быть {@code null}
     * @return {@link Instant} или {@code null}, если исходное значение отсутствует
     */
    default Instant toInstant(final Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
    }
}
