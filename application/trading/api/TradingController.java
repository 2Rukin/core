package ru.application.trading.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.application.trading.mapper.TradingRestMapper;
import ru.trade.api.TradingService;
import ru.trade.api.dto.OrderId;
import ru.trade.api.dto.OrderStatus;

import java.util.Objects;

/**
 * REST-контроллер, открывающий простейший HTTP-интерфейс поверх доменного {@link TradingService}.
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class TradingController {

    private final TradingService tradingService;
    private final TradingRestMapper tradingRestMapper;

    /**
     * Размещает рыночную заявку, делегируя выполнение доменному сервису.
     *
     * @param request тело REST-запроса; не {@code null}
     * @return HTTP-ответ с идентификатором созданной заявки; не {@code null}
     */
    @PostMapping("/market")
    public ResponseEntity<OrderIdResponse> placeMarketOrder(@Valid @RequestBody final MarketOrderRestRequest request) {
        Objects.requireNonNull(request, "request");
        final var domainRequest = tradingRestMapper.toDomain(request);
        final OrderId orderId = switch (request.getSide()) {
            case BUY -> tradingService.placeMarketBuy(domainRequest);
            case SELL -> tradingService.placeMarketSell(domainRequest);
        };
        log.info("REST: размещена {} заявка {}, orderId={}", request.getSide(), request.getSymbol(), orderId.getOrderIdentifier());
        return ResponseEntity.ok(tradingRestMapper.toResponse(orderId));
    }

    /**
     * Возвращает состояние заявки по идентификаторам счёта и заявки.
     *
     * @param accountId идентификатор счёта; не {@code null}
     * @param orderId   идентификатор заявки; не {@code null}
     * @return HTTP-ответ со статусом заявки; не {@code null}
     */
    @GetMapping("/{accountId}/{orderId}")
    public ResponseEntity<OrderStatusResponse> getOrderStatus(@PathVariable final String accountId,
                                                              @PathVariable final String orderId) {
        Objects.requireNonNull(accountId, "accountId");
        Objects.requireNonNull(orderId, "orderId");
        final OrderId domainOrderId = tradingRestMapper.toDomain(accountId, orderId);
        final OrderStatus status = tradingService.getOrderStatus(domainOrderId);
        return ResponseEntity.ok(tradingRestMapper.toResponse(status));
    }
}
