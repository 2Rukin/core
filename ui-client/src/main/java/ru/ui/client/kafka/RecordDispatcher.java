package ru.ui.client.kafka;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.domain.market.proto.MarketEvent;
import ru.domain.market.proto.TradeEvent;
import ru.ui.client.config.UiClientProperties;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.buffers.TimeSeriesBuffer;
import ru.ui.client.model.buffers.TradeBuffer;
import ru.ui.client.model.clock.VirtualClockLite;
import ru.ui.client.model.events.BarUpdateEvent;
import ru.ui.client.model.events.SymbolFilterChangedEvent;
import ru.ui.client.model.events.TopicRecordEvent;
import ru.ui.client.model.events.TradeUpdateEvent;
import ru.ui.client.model.events.VirtualTimeUpdateEvent;
import ru.ui.client.util.DecimalUtils;
import ru.ui.client.util.Keys;
import ru.ui.client.util.Keys.SymbolKey;

/**
 * Translates Kafka {@link MarketEvent} records into UI specific events.
 */
public final class RecordDispatcher {

  private static final Logger LOGGER = LoggerFactory.getLogger(RecordDispatcher.class);

  private final UiClientProperties properties;
  private final EventBus eventBus;
  private final TimeSeriesBuffer timeSeriesBuffer;
  private final TradeBuffer tradeBuffer;
  private final VirtualClockLite clock;
  private final AtomicReference<Optional<String>> activeSymbol = new AtomicReference<>(Optional.empty());

  /**
   * Creates a new dispatcher instance.
   *
   * @param properties configuration to evaluate symbol filters
   * @param eventBus event bus used to publish UI events
   * @param timeSeriesBuffer buffer storing bar series
   * @param tradeBuffer buffer storing trades
   * @param clock virtual clock instance
   */
  public RecordDispatcher(
      UiClientProperties properties,
      EventBus eventBus,
      TimeSeriesBuffer timeSeriesBuffer,
      TradeBuffer tradeBuffer,
      VirtualClockLite clock
  ) {
    this.properties = Objects.requireNonNull(properties, "properties");
    this.eventBus = Objects.requireNonNull(eventBus, "eventBus");
    this.timeSeriesBuffer = Objects.requireNonNull(timeSeriesBuffer, "timeSeriesBuffer");
    this.tradeBuffer = Objects.requireNonNull(tradeBuffer, "tradeBuffer");
    this.clock = Objects.requireNonNull(clock, "clock");
    eventBus.subscribe(SymbolFilterChangedEvent.class, event ->
        activeSymbol.set(event.symbol().map(symbol -> symbol.toUpperCase(Locale.ROOT)))
    );
  }

  /**
   * Dispatches the record to interested UI modules.
   *
   * @param record Kafka record
   */
  public void dispatch(ConsumerRecord<String, MarketEvent> record) {
    try {
      MarketEvent event = record.value();
      if (event == null) {
        return;
      }
      String symbol = resolveSymbol(record.key(), event);
      if (!isIncluded(symbol)) {
        return;
      }
      eventBus.publish(new TopicRecordEvent(record.topic(), record.key(), event, Instant.now()));

      Instant eventInstant = resolveEventInstant(event);
      if (eventInstant != null) {
        clock.update(eventInstant);
        eventBus.publish(new VirtualTimeUpdateEvent(clock.now(), clock.drift()));
      }

      boolean symbolMatchesFilter = activeSymbol.get()
          .map(active -> active.equalsIgnoreCase(symbol))
          .orElse(true);

      if (event.hasBar()) {
        BarUpdateEvent updateEvent = new BarUpdateEvent(
            record.topic(),
            record.key(),
            symbol,
            eventInstant != null ? eventInstant : Instant.now(),
            DecimalUtils.fromDecimal(event.getBar().getOpen()),
            DecimalUtils.fromDecimal(event.getBar().getHigh()),
            DecimalUtils.fromDecimal(event.getBar().getLow()),
            DecimalUtils.fromDecimal(event.getBar().getClose()),
            DecimalUtils.fromDecimal(event.getBar().getVolume())
        );
        timeSeriesBuffer.add(updateEvent);
        if (symbolMatchesFilter) {
          eventBus.publish(updateEvent);
        }
      }

      if (event.hasTrade()) {
        TradeUpdateEvent tradeEvent = toTradeUpdate(record, symbol, eventInstant, event.getTrade());
        tradeBuffer.add(tradeEvent);
        if (symbolMatchesFilter) {
          eventBus.publish(tradeEvent);
        }
      }
    } catch (Exception ex) {
      LOGGER.warn("Failed to dispatch record", ex);
    }
  }

  private TradeUpdateEvent toTradeUpdate(
      ConsumerRecord<String, MarketEvent> record,
      String symbol,
      Instant eventInstant,
      TradeEvent trade
  ) {
    BigDecimal price = DecimalUtils.fromDecimal(trade.getPrice());
    BigDecimal quantity = DecimalUtils.fromDecimal(trade.getQuantity());
    BigDecimal notional = trade.hasNotional()
        ? DecimalUtils.fromDecimal(trade.getNotional())
        : price.multiply(quantity);
    return new TradeUpdateEvent(
        record.topic(),
        record.key(),
        symbol,
        eventInstant != null ? eventInstant : Instant.now(),
        price,
        quantity,
        notional,
        trade.getSide()
    );
  }

  private boolean isIncluded(String symbol) {
    List<String> include = properties.getSymbols().getInclude();
    return include.isEmpty() || include.contains(symbol);
  }

  private String resolveSymbol(String key, MarketEvent event) {
    Optional<SymbolKey> parsed = Keys.parse(key);
    if (parsed.isPresent()) {
      return parsed.get().code().toUpperCase(Locale.ROOT);
    }
    String code = event.getEnv().getCode();
    if (!code.isBlank()) {
      return code.toUpperCase(Locale.ROOT);
    }
    String fallback = event.getEnv().getSymbol();
    return fallback.isBlank() ? "UNKNOWN" : fallback.toUpperCase(Locale.ROOT);
  }

  private Instant resolveEventInstant(MarketEvent event) {
    if (event.getEnv().hasEventTs()) {
      return Instant.ofEpochSecond(
          event.getEnv().getEventTs().getSeconds(),
          event.getEnv().getEventTs().getNanos()
      );
    }
    return null;
  }
}
