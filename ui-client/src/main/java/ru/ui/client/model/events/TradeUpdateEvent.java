package ru.ui.client.model.events;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import ru.domain.market.proto.AggressorSide;

/**
 * Trade update used by the Time &amp; Sales module.
 */
public record TradeUpdateEvent(
    String topic,
    String key,
    String symbol,
    Instant eventTime,
    BigDecimal price,
    BigDecimal quantity,
    BigDecimal notional,
    AggressorSide side
) {

  public TradeUpdateEvent {
    Objects.requireNonNull(topic, "topic");
    Objects.requireNonNull(key, "key");
    Objects.requireNonNull(symbol, "symbol");
    Objects.requireNonNull(eventTime, "eventTime");
    Objects.requireNonNull(price, "price");
    Objects.requireNonNull(quantity, "quantity");
    Objects.requireNonNull(notional, "notional");
    Objects.requireNonNull(side, "side");
  }
}
