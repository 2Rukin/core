package ru.application.trading.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import ru.application.trading.api.MarketOrderRestRequest;
import ru.application.trading.api.OrderIdResponse;
import ru.application.trading.api.OrderStatusResponse;
import ru.trade.api.dto.MarketOrderRequest;
import ru.trade.api.dto.OrderId;
import ru.trade.api.dto.OrderStatus;

/**
 * MapStruct-маппер между REST-моделями и доменными DTO.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TradingRestMapper {

    /**
     * Преобразует REST-запрос в доменную модель рыночной заявки.
     *
     * @param request REST-модель; не {@code null}
     * @return доменный {@link MarketOrderRequest}; не {@code null}
     */
    @Mapping(target = "accountIdentifier", source = "request.accountId")
    @Mapping(target = "financialInstrumentGlobalIdentifierOrTicker", source = "request.symbol")
    @Mapping(target = "quantityLots", source = "request.quantityLots")
    @Mapping(target = "clientOrderIdentifier", source = "request.clientOrderId")
    MarketOrderRequest toDomain(MarketOrderRestRequest request);

    /**
     * Формирует доменный идентификатор заявки из REST-параметров пути.
     *
     * @param accountId идентификатор счёта; не {@code null}
     * @param orderId   идентификатор заявки; не {@code null}
     * @return доменный идентификатор заявки; не {@code null}
     */
    @Mapping(target = "accountIdentifier", source = "accountId")
    @Mapping(target = "orderIdentifier", source = "orderId")
    OrderId toDomain(String accountId, String orderId);

    /**
     * Конвертирует доменный идентификатор заявки в REST-ответ.
     *
     * @param orderId доменная модель идентификатора; не {@code null}
     * @return DTO REST-ответа; не {@code null}
     */
    @Mapping(target = "accountId", source = "orderId.accountIdentifier")
    @Mapping(target = "orderId", source = "orderId.orderIdentifier")
    OrderIdResponse toResponse(OrderId orderId);

    /**
     * Конвертирует доменный статус заявки в REST-ответ.
     *
     * @param status доменный статус; не {@code null}
     * @return DTO REST-ответа; не {@code null}
     */
    @Mapping(target = "accountId", source = "orderId.accountIdentifier")
    @Mapping(target = "orderId", source = "orderId.orderIdentifier")
    @Mapping(target = "executionId", source = "executionIdentifier")
    OrderStatusResponse toResponse(OrderStatus status);
}
