package ru.application.trading.mapper;

import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import ru.application.trading.config.MarketEventProperties;

import java.time.Clock;

import static ru.application.service.PartitionKeyService.BOARD_UNKNOWN;
import static ru.application.service.PartitionKeyService.CODE_UNKNOWN;
import static ru.application.service.PartitionKeyService.normalizeBoard;
import static ru.application.service.PartitionKeyService.normalizeCode;
import static ru.application.service.PartitionKeyService.normalizeTenant;
import static ru.application.service.PartitionKeyService.replaceIllegal;
import static ru.application.trading.mapper.CommonProtoConverters.millisToTs;

/**
 * Фабрика конвертов {@code MarketEvent.Envelope} с нормализацией строк и временных полей.
 */
@Component
@RequiredArgsConstructor
public class EnvelopeFactory {

    private static final String DEFAULT_INSTRUMENT_ID = "n/a";

    private final MarketEventProperties properties;
    private final MessageIdGenerator idGenerator;
    private final Clock clock;

    /**
     * Собирает конверт с гарантированно заполненными ключами, идентификаторами и временными метками.
     *
     * @param ctx          контекст окружения
     * @param eventTs      время события в миллисекундах от эпохи UNIX
     * @param ingestTsOpt  опциональное время приёма (если {@code null} или ≤ 0 — используется текущее время)
     * @return построенный {@link ru.domain.market.proto.Envelope}
     */
    public ru.domain.market.proto.Envelope build(EnvContext ctx, long eventTs, Long ingestTsOpt) {
        long now = clock.millis();
        long ingestTs = (ingestTsOpt == null || ingestTsOpt <= 0L) ? now : ingestTsOpt;
        long resolvedEventTs = eventTs > 0L ? eventTs : ingestTs;
        if (resolvedEventTs > ingestTs) {
            ingestTs = resolvedEventTs;
        }

        String tenant = normalizeTenant(ctx != null ? ctx.getTenant() : null);
        String board = normalizeBoard(ctx != null ? ctx.getBoard() : null);
        String code = normalizeCode(ctx != null ? ctx.getCode() : null);
        String instrumentId = normalizeInstrumentId(ctx != null ? ctx.getInstrumentId() : null);
        String environment = normalizeEnvironment(ctx != null ? ctx.getEnvironment() : null);
        String source = sanitizeWithFallback(ctx != null ? ctx.getSource() : null, properties.getDefaultSource());
        String producerId = sanitizeWithFallback(ctx != null ? ctx.getProducerId() : null, properties.getProducerId());
        String correlationId = resolveCorrelationId(ctx);
        String traceId = resolveTraceId(ctx);

        String symbol = buildSymbol(code, board);
        int messageVersion = Math.toIntExact(properties.messageVersionAsLong());
        String messageId = idGenerator.next();

        return ru.domain.market.proto.Envelope.newBuilder()
                .setTenant(tenant)
                .setEnvironment(environment)
                .setBoard(board)
                .setCode(code)
                .setSymbol(symbol)
                .setInstrumentId(instrumentId)
                .setEventTs(millisToTs(resolvedEventTs))
                .setIngestTs(millisToTs(ingestTs))
                .setMessageId(messageId)
                .setMessageVersion(messageVersion)
                .setSource(source)
                .setProducerId(producerId)
                .setCorrelationId(correlationId)
                .setTraceId(traceId)
                .build();
    }

    private String resolveCorrelationId(EnvContext ctx) {
        String candidate = ctx != null ? ctx.getCorrelationId() : null;
        if (!isBlank(candidate)) {
            return candidate.trim();
        }
        candidate = fromMdc(properties.getCorrelationMdcKey());
        if (!isBlank(candidate)) {
            return candidate;
        }
        return idGenerator.next();
    }

    private String resolveTraceId(EnvContext ctx) {
        String candidate = ctx != null ? ctx.getTraceId() : null;
        if (!isBlank(candidate)) {
            return candidate.trim();
        }
        candidate = fromMdc(properties.getTraceMdcKey());
        if (!isBlank(candidate)) {
            return candidate;
        }
        return idGenerator.next();
    }

    private static String fromMdc(String key) {
        if (isBlank(key)) {
            return null;
        }
        String value = MDC.get(key);
        return isBlank(value) ? null : value.trim();
    }

    private static String buildSymbol(String code, String board) {
        String safeCode = isBlank(code) ? CODE_UNKNOWN : code;
        String safeBoard = isBlank(board) ? BOARD_UNKNOWN : board;
        return safeCode + "@" + safeBoard;
    }

    private String normalizeEnvironment(String value) {
        String fallback = properties.getDefaultEnvironment();
        String sanitized = sanitizeWithFallback(value, fallback);
        String normalized = replaceIllegal(sanitized);
        return normalized.isEmpty() ? fallback : normalized;
    }

    private static String normalizeInstrumentId(String value) {
        if (isBlank(value)) {
            return DEFAULT_INSTRUMENT_ID;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? DEFAULT_INSTRUMENT_ID : trimmed;
    }

    private static String sanitizeWithFallback(String value, String fallback) {
        if (!isBlank(value)) {
            String trimmed = value.trim();
            if (!trimmed.isEmpty()) {
                return trimmed;
            }
        }
        return fallback == null ? "" : fallback.trim();
    }

    private static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
