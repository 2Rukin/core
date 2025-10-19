package ru.application.trading.mapper;

import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import grpc.tradeapi.v1.marketdata.OrderBook;
import grpc.tradeapi.v1.marketdata.StreamOrderBook;
import ru.domain.market.proto.Envelope;
import ru.domain.market.proto.MarketEvent;
import ru.domain.market.proto.OrderBookEvent;
import ru.domain.market.proto.OrderBookLvl;

import static ru.application.trading.mapper.CommonProtoConverters.bigToDecimal;
import static ru.application.trading.mapper.CommonProtoConverters.decimalToBig;

/**
 * MapStruct-маппер для преобразования стакана Finam в доменный {@code MarketEvent}.
 */
@Mapper(config = BaseMapperConfig.class, uses = CommonProtoConverters.class)
public abstract class MarketEventOrderBookMapper {

    @Autowired
    protected OrderBookMappingSupport support;

    /**
     * Формирует MarketEvent для полного снимка стакана.
     *
     * @param env    Envelope, собранный фабрикой
     * @param source исходный snapshot Finam
     * @return MarketEvent с признаком snapshot
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "env", source = "env")
    @Mapping(target = "orderBook", expression = "java(initialOrderBook(true))")
    public abstract MarketEvent toSnapshotMarketEvent(Envelope env, OrderBook source);

    /**
     * Формирует MarketEvent для дельты стакана.
     *
     * @param env    Envelope, собранный фабрикой
     * @param source потоковая дельта Finam
     * @return MarketEvent с признаком delta
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "env", source = "env")
    @Mapping(target = "orderBook", expression = "java(initialOrderBook(false))")
    public abstract MarketEvent toDeltaMarketEvent(Envelope env, StreamOrderBook source);

    @AfterMapping
    protected void fillSnapshotLevels(OrderBook src, @MappingTarget MarketEvent.Builder target) {
        OrderBookEvent.Builder ob = target.getOrderBookBuilder();
        fillLevelsFromRows(
                src.getRowsList().stream()
                        .map(r -> new FinamRow(r, support))
                        .toList(),
                ob
        );
    }

    @AfterMapping
    protected void fillDeltaLevels(StreamOrderBook src, @MappingTarget MarketEvent.Builder target) {
        OrderBookEvent.Builder ob = target.getOrderBookBuilder();
        fillLevelsFromRows(
                src.getRowsList().stream()
                        .map(r -> new FinamRow(r, support))
                        .toList(),
                ob
        );
    }

    private void fillLevelsFromRows(List<FinamRow> rows, OrderBookEvent.Builder target) {
        Map<BigDecimal, BigDecimal> bids = new LinkedHashMap<>();
        Map<BigDecimal, BigDecimal> asks = new LinkedHashMap<>();

        for (FinamRow row : rows) {
            if (row.price.signum() <= 0) {
                continue;
            }

            applySide(bids, row.price, row.buySize, row.action);
            applySide(asks, row.price, row.sellSize, row.action);
        }

        List<OrderBookLvl> bidLevels = bids.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(support.bidsComparator()))
                .limit(support.maxLevels())
                .map(e -> OrderBookLvl.newBuilder()
                        .setPrice(bigToDecimal(e.getKey()))
                        .setSize(bigToDecimal(e.getValue()))
                        .build())
                .collect(Collectors.toList());

        List<OrderBookLvl> askLevels = asks.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(support.asksComparator()))
                .limit(support.maxLevels())
                .map(e -> OrderBookLvl.newBuilder()
                        .setPrice(bigToDecimal(e.getKey()))
                        .setSize(bigToDecimal(e.getValue()))
                        .build())
                .collect(Collectors.toList());

        target.clearBids();
        target.clearAsks();
        target.addAllBids(bidLevels);
        target.addAllAsks(askLevels);
    }

    private void applySide(Map<BigDecimal, BigDecimal> side,
                           BigDecimal price,
                           BigDecimal size,
                           RowAction action) {
        if (action == RowAction.REMOVE) {
            side.remove(price);
            return;
        }
        if (size == null || size.signum() <= 0) {
            return;
        }
        if (support.coalesceByPrice()) {
            side.merge(price, size, BigDecimal::add);
        } else {
            side.put(price, size);
        }
    }

    protected OrderBookEvent initialOrderBook(boolean isSnapshot) {
        return OrderBookEvent.newBuilder()
                .setSequence(0L)
                .setIsSnapshot(isSnapshot)
                .build();
    }

    private enum RowAction {
        ADD,
        UPDATE,
        REMOVE
    }

    private static RowAction mapAction(OrderBook.Row.Action action) {
        return switch (action) {
            case ACTION_REMOVE -> RowAction.REMOVE;
            case ACTION_ADD -> RowAction.ADD;
            case ACTION_UPDATE, ACTION_UNSPECIFIED, UNRECOGNIZED -> RowAction.UPDATE;
        };
    }

    private static RowAction mapAction(StreamOrderBook.Row.Action action) {
        return switch (action) {
            case ACTION_REMOVE -> RowAction.REMOVE;
            case ACTION_ADD -> RowAction.ADD;
            case ACTION_UPDATE, ACTION_UNSPECIFIED, UNRECOGNIZED -> RowAction.UPDATE;
        };
    }

    private record FinamRow(BigDecimal price, BigDecimal buySize, BigDecimal sellSize, RowAction action) {
        private FinamRow(OrderBook.Row row, OrderBookMappingSupport support) {
            this(
                    support.normalizePrice(decimalToBig(row.getPrice())),
                    support.normalizeSize(decimalToBig(row.getBuySize())),
                    support.normalizeSize(decimalToBig(row.getSellSize())),
                    mapAction(row.getAction())
            );
        }

        private FinamRow(StreamOrderBook.Row row, OrderBookMappingSupport support) {
            this(
                    support.normalizePrice(decimalToBig(row.getPrice())),
                    support.normalizeSize(decimalToBig(row.getBuySize())),
                    support.normalizeSize(decimalToBig(row.getSellSize())),
                    mapAction(row.getAction())
            );
        }
    }
}
