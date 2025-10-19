package ru.application.trading.mapper;

import grpc.tradeapi.v1.marketdata.Bar;
import grpc.tradeapi.v1.marketdata.OrderBook;
import grpc.tradeapi.v1.marketdata.Quote;
import grpc.tradeapi.v1.marketdata.StreamOrderBook;
import grpc.tradeapi.v1.marketdata.Trade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.domain.market.proto.MarketEvent;

/**
 * Сервисный слой, собирающий {@link MarketEvent} из конкретных payload’ов Finam.
 */
@Component
@RequiredArgsConstructor
public class MarketEventAssembler {

    private final EnvelopeFactory envelopeFactory;
    private final MarketEventQuoteMapper quoteMapper;
    private final MarketEventOrderBookMapper orderBookMapper;

    /**
     * Собирает событие котировки.
     */
    public MarketEvent fromQuote(EnvContext ctx, Quote quote, long eventTs, Long ingestTs) {
        var envelope = envelopeFactory.build(ctx, eventTs, ingestTs);
        return MarketEvent.newBuilder()
                .setEnv(envelope)
                .setQuote(quoteMapper.toEvent(quote))
                .build();
    }

    /**
     * Собирает событие сделки.
     */
    public MarketEvent fromTrade(EnvContext ctx, Trade trade, long eventTs, Long ingestTs) {
        var envelope = envelopeFactory.build(ctx, eventTs, ingestTs);
        return MarketEvent.newBuilder()
                .setEnv(envelope)
                .setTrade(quoteMapper.toEvent(trade))
                .build();
    }

    /**
     * Собирает событие бара.
     */
    public MarketEvent fromBar(EnvContext ctx, Bar bar, long eventTs, Long ingestTs) {
        var envelope = envelopeFactory.build(ctx, eventTs, ingestTs);
        return MarketEvent.newBuilder()
                .setEnv(envelope)
                .setBar(quoteMapper.toEvent(bar))
                .build();
    }

    /**
     * Собирает событие snapshot стакана.
     */
    public MarketEvent fromOrderBookSnapshot(EnvContext ctx, OrderBook orderBook, long eventTs, Long ingestTs) {
        var envelope = envelopeFactory.build(ctx, eventTs, ingestTs);
        return orderBookMapper.toSnapshotMarketEvent(envelope, orderBook);
    }

    /**
     * Собирает событие delta стакана.
     */
    public MarketEvent fromOrderBookDelta(EnvContext ctx, StreamOrderBook delta, long eventTs, Long ingestTs) {
        var envelope = envelopeFactory.build(ctx, eventTs, ingestTs);
        return orderBookMapper.toDeltaMarketEvent(envelope, delta);
    }
}
