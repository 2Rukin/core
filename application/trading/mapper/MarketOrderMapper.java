package ru.application.trading.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.google.type.Decimal;

import grpc.tradeapi.v1.Side;
import grpc.tradeapi.v1.orders.Order;
import grpc.tradeapi.v1.orders.OrderType;
import grpc.tradeapi.v1.orders.TimeInForce;
import ru.trade.api.dto.MarketOrderRequest;

import java.util.Objects;

/**
 * MapStruct-маппер, преобразующий доменный {@link MarketOrderRequest} в gRPC-сообщение
 * {@link Order} для выставления рыночных заявок.
 */
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        imports = {OrderType.class, TimeInForce.class}
)
public interface MarketOrderMapper {

    /**
     * Преобразует доменный запрос в gRPC-заявку на выставление рыночного ордера.
     *
     * @param request исходный запрос; не {@code null}
     * @param side    направление сделки; не {@code null}
     * @return сконфигурированное gRPC-сообщение {@link Order}; не {@code null}
     */
    @Mapping(target = "accountId", source = "request.accountIdentifier")
    @Mapping(target = "symbol", source = "request.financialInstrumentGlobalIdentifierOrTicker")
    @Mapping(target = "quantity", expression = "java(toDecimal(request.getQuantityLots()))")
    @Mapping(target = "side", source = "side")
    @Mapping(target = "type", expression = "java(OrderType.ORDER_TYPE_MARKET)")
    @Mapping(target = "timeInForce", expression = "java(TimeInForce.TIME_IN_FORCE_DAY)")
    @Mapping(target = "limitPrice", ignore = true)
    @Mapping(target = "stopPrice", ignore = true)
    @Mapping(target = "stopCondition", ignore = true)
    @Mapping(target = "legsList", ignore = true)
    @Mapping(target = "clientOrderId", ignore = true)
    Order toMarketOrder(MarketOrderRequest request, Side side);

    /**
     * Utility-преобразование количества лотов к decimal-значению, ожидаемому API.
     *
     * @param lots количество лотов; должно быть неотрицательным
     * @return значение {@link Decimal}; не {@code null}
     */
    default Decimal toDecimal(final long lots) {
        if (lots < 0) {
            throw new IllegalArgumentException("Количество лотов не может быть отрицательным");
        }
        return Decimal.newBuilder().setValue(Long.toString(lots)).build();
    }

    /**
     * Дополняет собранный ордер клиентским идентификатором, если он указан.
     *
     * @param request      исходный запрос; не {@code null}
     * @param orderBuilder билдер ордера, формируемый MapStruct; не {@code null}
     */
    @AfterMapping
    default void setClientOrderId(final MarketOrderRequest request, @MappingTarget final Order.Builder orderBuilder) {
        Objects.requireNonNull(request, "request");
        Objects.requireNonNull(orderBuilder, "orderBuilder");
        final String clientOrderId = request.getClientOrderIdentifier();
        if (clientOrderId != null && !clientOrderId.isBlank()) {
            orderBuilder.setClientOrderId(clientOrderId);
        }
    }
}
