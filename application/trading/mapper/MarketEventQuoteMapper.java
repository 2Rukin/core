package ru.application.trading.mapper;

import grpc.tradeapi.v1.marketdata.Bar;
import grpc.tradeapi.v1.marketdata.Quote;
import grpc.tradeapi.v1.marketdata.Trade;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * MapStruct-маппер: котировки, сделки и бары Finam → доменные события.
 */
@Mapper(config = BaseMapperConfig.class, uses = CommonProtoConverters.class, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MarketEventQuoteMapper {

    /**
     * Преобразует котировку Finam в {@link ru.domain.market.proto.QuoteEvent} без потери точности Decimal.
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "bid", source = "bid")
    @Mapping(target = "ask", source = "ask")
    @Mapping(target = "bidSize", source = "bidSize")
    @Mapping(target = "askSize", source = "askSize")
    @Mapping(target = "lastPrice", source = "last")
    @Mapping(target = "lastSize", source = "lastSize")
    ru.domain.market.proto.QuoteEvent toEvent(Quote src);

    /**
     * Преобразует сделку Finam в {@link ru.domain.market.proto.TradeEvent}.
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "price", source = "price")
    @Mapping(target = "quantity", source = "size")
    ru.domain.market.proto.TradeEvent toEvent(Trade src);

    /**
     * Преобразует бар Finam в {@link ru.domain.market.proto.BarEvent}.
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "open", source = "open")
    @Mapping(target = "high", source = "high")
    @Mapping(target = "low", source = "low")
    @Mapping(target = "close", source = "close")
    @Mapping(target = "volume", source = "volume")
    ru.domain.market.proto.BarEvent toEvent(Bar src);
}
