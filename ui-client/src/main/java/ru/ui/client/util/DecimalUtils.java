package ru.ui.client.util;

import com.google.type.Decimal;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Utilities for converting between {@link Decimal} and {@link BigDecimal}.
 */
public final class DecimalUtils {

  private DecimalUtils() {
  }

  /**
   * Converts a protobuf decimal to {@link BigDecimal}. Null-safe and tolerant to missing values.
   *
   * @param decimal protobuf decimal
   * @return converted {@link BigDecimal} or {@code BigDecimal.ZERO} if value is absent
   */
  public static BigDecimal fromDecimal(Decimal decimal) {
    if (decimal == null || decimal.getValue().isBlank()) {
      return BigDecimal.ZERO;
    }
    return new BigDecimal(decimal.getValue());
  }

  /**
   * Converts a {@link BigDecimal} to protobuf {@link Decimal}.
   *
   * @param value decimal value
   * @return protobuf decimal
   */
  public static Decimal toDecimal(BigDecimal value) {
    Objects.requireNonNull(value, "value");
    return Decimal.newBuilder().setValue(value.toPlainString()).build();
  }
}
