package ru.ui.client.model.events;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

/**
 * UI event that represents a processed bar.
 */
public record BarUpdateEvent(
    String topic,
    String key,
    String symbol,
    Instant eventTime,
    BigDecimal open,
    BigDecimal high,
    BigDecimal low,
    BigDecimal close,
    BigDecimal volume
) {

  /**
   * Creates a new event instance.
   */
  public BarUpdateEvent {
    Objects.requireNonNull(topic, "topic");
    Objects.requireNonNull(key, "key");
    Objects.requireNonNull(symbol, "symbol");
    Objects.requireNonNull(eventTime, "eventTime");
    Objects.requireNonNull(open, "open");
    Objects.requireNonNull(high, "high");
    Objects.requireNonNull(low, "low");
    Objects.requireNonNull(close, "close");
    Objects.requireNonNull(volume, "volume");
  }
}
