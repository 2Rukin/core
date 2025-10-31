package ru.ui.client.model.buffers;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ui.client.model.events.BarUpdateEvent;

/**
 * In-memory ring buffer that stores bar events per symbol.
 */
public final class TimeSeriesBuffer {

  private static final int DEFAULT_CAPACITY = 2048;

  private final Map<String, Deque<BarSample>> series = new ConcurrentHashMap<>();
  private final int capacity;

  /**
   * Creates a buffer with default capacity.
   */
  public TimeSeriesBuffer() {
    this(DEFAULT_CAPACITY);
  }

  /**
   * Creates a buffer with the provided capacity.
   *
   * @param capacity number of samples per symbol
   */
  public TimeSeriesBuffer(int capacity) {
    this.capacity = Math.max(16, capacity);
  }

  /**
   * Appends a new bar update.
   *
   * @param event bar event
   */
  public void add(BarUpdateEvent event) {
    Objects.requireNonNull(event, "event");
    Deque<BarSample> deque = series.computeIfAbsent(event.symbol(), key -> new ArrayDeque<>(capacity));
    synchronized (deque) {
      deque.addLast(new BarSample(
          event.eventTime(),
          event.open(),
          event.high(),
          event.low(),
          event.close(),
          event.volume()
      ));
      while (deque.size() > capacity) {
        deque.removeFirst();
      }
    }
  }

  /**
   * Returns a snapshot of the series for the provided symbol.
   *
   * @param symbol instrument code
   * @return immutable list of samples
   */
  public List<BarSample> snapshot(String symbol) {
    Deque<BarSample> deque = series.get(symbol);
    if (deque == null) {
      return List.of();
    }
    synchronized (deque) {
      return List.copyOf(deque);
    }
  }

  /**
   * Returns all symbols known to the buffer.
   *
   * @return symbols list
   */
  public List<String> symbols() {
    return new ArrayList<>(series.keySet());
  }

  /**
   * Stored bar sample representation.
   *
   * @param eventTime event timestamp
   * @param open open price
   * @param high high price
   * @param low low price
   * @param close close price
   * @param volume volume
   */
  public record BarSample(
      Instant eventTime,
      BigDecimal open,
      BigDecimal high,
      BigDecimal low,
      BigDecimal close,
      BigDecimal volume
  ) {
  }
}
