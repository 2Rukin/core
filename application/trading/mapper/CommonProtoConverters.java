package ru.application.trading.mapper;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import com.google.type.Decimal;
import org.mapstruct.Named;

import java.math.BigDecimal;

/**
 * Набор статических конвертеров для безопасного преобразования protobuf-типов в Java-значения и обратно.
 */
public final class CommonProtoConverters {
    private CommonProtoConverters() {}

    /**
     * Переводит protobuf {@link Decimal} в {@link BigDecimal}, сохраняя строковое представление значения.
     *
     * @param value десятичное значение из protobuf Finam.
     * @return {@link BigDecimal}, либо {@link BigDecimal#ZERO}, если значение отсутствует или пустое.
     */
    @Named("decimalToBig")
    public static BigDecimal decimalToBig(Decimal value) {
        if (value == null) {
            return BigDecimal.ZERO;
        }
        String raw = value.getValue();
        if (raw == null || raw.isBlank()) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(raw);
    }

    /**
     * Преобразует {@link BigDecimal} в protobuf {@link Decimal} без потери точности.
     *
     * @param value десятичное значение бизнес-логики.
     * @return protobuf Decimal, никогда не равный {@code null}.
     */
    @Named("bigToDecimal")
    public static Decimal bigToDecimal(BigDecimal value) {
        BigDecimal safe = value == null ? BigDecimal.ZERO : value;
        return Decimal.newBuilder()
                .setValue(safe.toPlainString())
                .build();
    }

    /**
     * Возвращает количество миллисекунд эпохи UNIX, закодированных в {@link Timestamp}.
     *
     * @param ts protobuf-временная метка.
     * @return миллисекунды от эпохи или {@code 0L}, если значение отсутствует.
     */
    @Named("tsToMillis")
    public static long tsToMillis(Timestamp ts) {
        return ts == null ? 0L : Timestamps.toMillis(ts);
    }

    /**
     * Конвертирует миллисекунды эпохи в protobuf {@link Timestamp}.
     *
     * @param millis количество миллисекунд от 01-01-1970T00:00:00Z.
     * @return {@link Timestamp} либо {@link Timestamp#getDefaultInstance()}, если вход некорректен.
     */
    @Named("millisToTs")
    public static Timestamp millisToTs(long millis) {
        if (millis <= 0L) {
            return Timestamp.getDefaultInstance();
        }
        return Timestamps.fromMillis(millis);
    }
}
