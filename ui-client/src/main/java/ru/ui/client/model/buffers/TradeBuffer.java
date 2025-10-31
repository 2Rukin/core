package ru.ui.client.model.buffers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import ru.ui.client.model.events.TradeUpdateEvent;

/**
 * Per-symbol ring buffers storing the latest trade events.
 */
public final class TradeBuffer {

  private final Map<String, Deque<TradeUpdateEvent>> trades = new ConcurrentHashMap<>();
  private final int capacity;

  /**
   * Creates a new instance with the provided capacity per symbol.
   *
   * @param capacity maximum number of trades stored per symbol
   */
  public TradeBuffer(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("capacity must be positive");
    }
    this.capacity = Math.max(32, capacity);
  }

  /**
   * Adds the specified trade.
   *
   * @param event trade event
   */
  public void add(TradeUpdateEvent event) {
    Objects.requireNonNull(event, "event");
    Deque<TradeUpdateEvent> deque = trades.computeIfAbsent(event.symbol(), key -> new ArrayDeque<>(capacity));
    synchronized (deque) {
      deque.addFirst(event);
      while (deque.size() > capacity) {
        deque.removeLast();
      }
    }
  }

  /**
   * Returns snapshot of trades for symbol.
   *
   * @param symbol instrument code
   * @return newest-first trade list
   */
  public List<TradeUpdateEvent> snapshot(String symbol) {
    Deque<TradeUpdateEvent> deque = trades.get(symbol);
    if (deque == null) {
      return List.of();
    }
    synchronized (deque) {
      return List.copyOf(deque);
    }
  }

  /**
   * Returns configured capacity per symbol.
   *
   * @return capacity value
   */
  public int getCapacity() {
    return capacity;
  }

  /**
   * Returns all symbols currently tracked by the buffer.
   *
   * @return tracked symbols
   */
  public List<String> symbols() {
    return new ArrayList<>(trades.keySet());
  }
}
