package ru.ui.client.model.clock;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

/**
 * Lightweight virtual clock that tracks the latest event timestamp and exposes drift information.
 */
public final class VirtualClockLite {

  private volatile Instant virtualNow = Instant.now();

  /**
   * Updates the virtual time.
   *
   * @param instant latest market instant
   */
  public synchronized void update(Instant instant) {
    Objects.requireNonNull(instant, "instant");
    if (instant.isAfter(virtualNow)) {
      virtualNow = instant;
    }
  }

  /**
   * Returns the current virtual time.
   *
   * @return last observed instant
   */
  public Instant now() {
    return virtualNow;
  }

  /**
   * Calculates the drift between virtual and system clock.
   *
   * @return absolute drift duration
   */
  public Duration drift() {
    Instant systemNow = Instant.now();
    return virtualNow.isAfter(systemNow)
        ? Duration.between(systemNow, virtualNow)
        : Duration.between(virtualNow, systemNow);
  }
}
