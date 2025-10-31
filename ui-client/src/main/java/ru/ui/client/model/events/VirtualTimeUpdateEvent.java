package ru.ui.client.model.events;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

/**
 * Event published whenever the virtual clock advances.
 */
public record VirtualTimeUpdateEvent(Instant virtualTime, Duration drift) {

  public VirtualTimeUpdateEvent {
    Objects.requireNonNull(virtualTime, "virtualTime");
    Objects.requireNonNull(drift, "drift");
  }
}
