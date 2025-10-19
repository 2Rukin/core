package ru.application.trading.service;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import grpc.tradeapi.v1.Side;
import grpc.tradeapi.v1.orders.GetOrderRequest;
import grpc.tradeapi.v1.orders.Order;
import grpc.tradeapi.v1.orders.OrderState;
import grpc.tradeapi.v1.orders.OrdersServiceGrpc;
import grpc.tradeapi.v1.orders.OrdersServiceGrpc.OrdersServiceBlockingStub;
import ru.application.trading.mapper.MarketOrderMapper;
import ru.application.trading.mapper.OrderStateMapper;
import ru.trade.api.TradingService;
import ru.trade.api.dto.MarketOrderRequest;
import ru.trade.api.dto.OrderId;
import ru.trade.api.dto.OrderStatus;

/**
 * Реализация доменного {@link TradingService}, основанная на gRPC-вызовах Finam Trade API.
 */
@Slf4j
@Service
@Validated
@RequiredArgsConstructor
public class GrpcTradingService implements TradingService {

    private static final String PLACE_ORDER_METHOD = OrdersServiceGrpc.getPlaceOrderMethod().getFullMethodName();
    private static final String GET_ORDER_METHOD = OrdersServiceGrpc.getGetOrderMethod().getFullMethodName();

    private final OrdersServiceBlockingStub ordersServiceBlockingStub;
    private final MarketOrderMapper marketOrderMapper;
    private final OrderStateMapper orderStateMapper;

    /**
     * Размещает рыночную заявку на покупку.
     *
     * @param marketOrderRequest параметры заявки; не {@code null}
     * @return идентификатор созданной заявки; не {@code null}
     */
    @Override
    public @NotNull OrderId placeMarketBuy(final MarketOrderRequest marketOrderRequest) {
        return executeMarketOrder(marketOrderRequest, Side.SIDE_BUY);
    }

    /**
     * Размещает рыночную заявку на продажу.
     *
     * @param marketOrderRequest параметры заявки; не {@code null}
     * @return идентификатор созданной заявки; не {@code null}
     */
    @Override
    public @NotNull OrderId placeMarketSell(final MarketOrderRequest marketOrderRequest) {
        return executeMarketOrder(marketOrderRequest, Side.SIDE_SELL);
    }

    /**
     * Получает состояние ранее созданной заявки.
     *
     * @param orderId идентификатор заявки; не {@code null}
     * @return актуальный статус заявки; не {@code null}
     */
    @Override
    public @NotNull OrderStatus getOrderStatus(final OrderId orderId) {
        Objects.requireNonNull(orderId, "orderId");
        final GetOrderRequest request = GetOrderRequest.newBuilder()
                .setAccountId(orderId.getAccountIdentifier())
                .setOrderId(orderId.getOrderIdentifier())
                .build();
        log.debug("Выполняется запрос статуса заявки {} через {}", orderId.getOrderIdentifier(), GET_ORDER_METHOD);
        final OrderState orderState = ordersServiceBlockingStub.getOrder(request);
        return orderStateMapper.toDomain(orderState, orderId.getAccountIdentifier());
    }

    /**
     * Выполняет выставление рыночной заявки указанного направления.
     *
     * @param marketOrderRequest параметры заявки; не {@code null}
     * @param side               направление сделки; не {@code null}
     * @return идентификатор созданной заявки; не {@code null}
     */
    private OrderId executeMarketOrder(final MarketOrderRequest marketOrderRequest, final Side side) {
        validateRequest(marketOrderRequest);
        final Side safeSide = Objects.requireNonNull(side, "side");
        final Order order = marketOrderMapper.toMarketOrder(marketOrderRequest, safeSide);
        log.info("Отправка рыночной заявки через {}: accountId={}, instrument={}, side={}",
                PLACE_ORDER_METHOD,
                marketOrderRequest.getAccountIdentifier(),
                marketOrderRequest.getFinancialInstrumentGlobalIdentifierOrTicker(),
                safeSide);
        final OrderState response = ordersServiceBlockingStub.placeOrder(order);
        log.info("Получен ответ на выставление заявки: orderId={}, status={}, sourceMethod={}",
                response.getOrderId(), response.getStatus(), PLACE_ORDER_METHOD);
        return orderStateMapper.toDomain(response, marketOrderRequest.getAccountIdentifier()).getOrderId();
    }

    /**
     * Проводит минимальную валидацию параметров заявки.
     *
     * @param marketOrderRequest параметры заявки; не {@code null}
     */
    private void validateRequest(final MarketOrderRequest marketOrderRequest) {
        Objects.requireNonNull(marketOrderRequest, "marketOrderRequest");
        if (marketOrderRequest.getQuantityLots() <= 0) {
            throw new IllegalArgumentException("Количество лотов должно быть положительным");
        }
    }
}
