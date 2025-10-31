package ru.ui.client.model.events;

import java.time.Instant;
import java.util.Objects;

/**
 * Signals connectivity changes in the background consumer.
 */
public record ConnectionStateEvent(State state, String message, Instant occurredAt) {

  /**
   * Connection states tracked by the UI.
   */
  public enum State {
    CONNECTING,
    CONNECTED,
    DISCONNECTED
  }

  public ConnectionStateEvent {
    Objects.requireNonNull(state, "state");
    Objects.requireNonNull(message, "message");
    Objects.requireNonNull(occurredAt, "occurredAt");
  }
}
