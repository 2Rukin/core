package ru.ui.client.model.events;

import java.util.Objects;
import java.util.Optional;

/**
 * Event fired when the user selects a different symbol in the Topic Explorer.
 */
public record SymbolFilterChangedEvent(Optional<String> symbol) {

  public SymbolFilterChangedEvent {
    Objects.requireNonNull(symbol, "symbol");
  }
}
