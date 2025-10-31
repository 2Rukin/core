package ru.ui.client.util;

import java.util.Objects;
import java.util.Optional;

/**
 * Parser utilities for Finam Kafka keys that follow the {@code tenant#board#code} convention.
 */
public final class Keys {

  private Keys() {
  }

  /**
   * Parses a Kafka record key into its components.
   *
   * @param key raw Kafka key
   * @return parsed key or {@link Optional#empty()} when the key is invalid
   */
  public static Optional<SymbolKey> parse(String key) {
    if (key == null || key.isBlank()) {
      return Optional.empty();
    }
    String[] tokens = key.split("#");
    if (tokens.length != 3) {
      return Optional.empty();
    }
    return Optional.of(new SymbolKey(tokens[0], tokens[1], tokens[2]));
  }

  /**
   * Formats a key back into {@code tenant#board#code} representation.
   *
   * @param key symbol key
   * @return formatted string
   */
  public static String format(SymbolKey key) {
    Objects.requireNonNull(key, "key");
    return key.tenant() + "#" + key.board() + "#" + key.code();
  }

  /**
   * Structured representation of the Kafka key.
   *
   * @param tenant tenant identifier
   * @param board trading board
   * @param code instrument code
   */
  public record SymbolKey(String tenant, String board, String code) {
  }
}
