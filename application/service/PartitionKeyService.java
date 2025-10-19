package ru.application.service;


import org.springframework.stereotype.Component;
import ru.application.trading.mapper.EnvContext;

import java.util.Locale;

/**
 * Сервис формирования детерминистичных ключей сообщений (Kafka key).
 *
 * Инварианты:
 * - Разделитель всегда '#'.
 * - Для market data ключ = tenant#board#code.
 * - Для trading events ключ = tenant#account#orderId.
 * - Для portfolio ключ = tenant#account.
 *
 * Нормализация:
 * - tenant -> lower-case, trim, пробелы/служебные заменяются на '_' ; пустые -> "unknown".
 * - board  -> upper-case, trim, все, кроме [A-Za-z0-9_.-] -> '_' ; пустые -> "UNKNOWN".
 * - code   -> upper-case, trim, все, кроме [A-Za-z0-9_.-] -> '_' ; пустые -> "UNKNOWN".
 * - account/orderId -> trim, '#' заменяется на '_', пустые -> "UNKNOWN".
 *
 * Зачем нормализация:
 * - единообразие ключей между конвейерами,
 * - отсутствие пустых компонентов,
 * - защита от "разъезда" из-за регистра/пробелов/служебных символов.
 */
@Component
public class PartitionKeyService {

    /** Разделитель компонентов ключа. */
    public static final String SEP = "#";

    /** Значения по умолчанию для пустых входов. */
    public static final String TENANT_UNKNOWN = "unknown";
    public static final String BOARD_UNKNOWN  = "UNKNOWN";
    public static final String CODE_UNKNOWN   = "UNKNOWN";
    public static final String ACCOUNT_UNKNOWN = "UNKNOWN";
    public static final String ORDER_ID_UNKNOWN = "UNKNOWN";

    /**
     * Market data ключ: tenant#board#code
     */
    public String marketDataKey(String tenant, String board, String code) {
        final String t = normalizeTenant(tenant);
        final String b = normalizeBoard(board);
        final String c = normalizeCode(code);
        return t + SEP + b + SEP + c;
    }

    /**
     * Market data ключ из контекста окружения (если используете EnvContext).
     */
    public String marketDataKey(EnvContext ctx) {
        if (ctx == null) {
            return marketDataKey(null, null, null);
        }
        return marketDataKey(ctx.getTenant(), ctx.getBoard(), ctx.getCode());
    }

    /**
     * Совместимость со старым именем метода.
     */
    public String mdKey(EnvContext ctx) {
        return marketDataKey(ctx);
    }

    /**
     * Trading events ключ: tenant#account#orderId
     */
    public String tradingKey(String tenant, String account, String orderId) {
        final String t = normalizeTenant(tenant);
        final String a = normalizeAccount(account);
        final String o = normalizeOrderId(orderId);
        return t + SEP + a + SEP + o;
    }

    /**
     * Portfolio ключ: tenant#account
     */
    public String portfolioKey(String tenant, String account) {
        final String t = normalizeTenant(tenant);
        final String a = normalizeAccount(account);
        return t + SEP + a;
    }

    // ---------- НОРМАЛИЗАТОРЫ ----------

    /** tenant: lower-case, trim, небезопасные символы -> '_' */
    public static String normalizeTenant(String src) {
        String s = safeTrim(src);
        if (s.isEmpty()) return TENANT_UNKNOWN;
        s = s.toLowerCase(Locale.ROOT);
        s = replaceIllegal(s);
        return s;
    }

    /** board (MIC/board): UPPER_CASE, trim, небезопасные символы -> '_' */
    public static String normalizeBoard(String src) {
        String s = safeTrim(src);
        if (s.isEmpty()) return BOARD_UNKNOWN;
        s = s.toUpperCase(Locale.ROOT);
        s = replaceIllegal(s);
        return s;
    }

    /** code (тикер): UPPER_CASE, trim, небезопасные символы -> '_' */
    public static String normalizeCode(String src) {
        String s = safeTrim(src);
        if (s.isEmpty()) return CODE_UNKNOWN;
        s = s.toUpperCase(Locale.ROOT);
        s = replaceIllegal(s);
        return s;
    }

    /** account: trim, заменяем '#'->'_' и небезопасные -> '_' */
    public static String normalizeAccount(String src) {
        String s = safeTrim(src);
        if (s.isEmpty()) return ACCOUNT_UNKNOWN;
        s = s.replace('#', '_');
        s = replaceIllegal(s);
        return s;
    }

    /** orderId: trim, заменяем '#'->'_' и небезопасные -> '_' */
    public static String normalizeOrderId(String src) {
        String s = safeTrim(src);
        if (s.isEmpty()) return ORDER_ID_UNKNOWN;
        s = s.replace('#', '_');
        s = replaceIllegal(s);
        return s;
    }

    // ---------- ВСПОМОГАТЕЛЬНОЕ ----------

    /** trim + null -> "" */
    private static String safeTrim(String s) {
        return s == null ? "" : s.trim();
    }

    /**
     * Разрешаем: буквы, цифры, точку, дефис, подчёркивание.
     * Всё остальное -> '_'.
     */
    public static String replaceIllegal(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        // Быстрая проверка: если всё ок — ничего не делаем.
        if (s.matches("[A-Za-z0-9_.-]+")) return s;
        // Иначе заменяем пачкой.
        StringBuilder out = new StringBuilder(s.length());
        for (char ch : s.toCharArray()) {
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9') ||
                    ch == '.' || ch == '-' || ch == '_') {
                out.append(ch);
            } else {
                out.append('_');
            }
        }
        // Сжимаем подряд идущие '_'
        String compact = out.toString().replaceAll("_+", "_");
        // Убираем ведущие/замыкающие '_'
        compact = compact.replaceAll("^_+", "").replaceAll("_+$", "");
        return compact.isEmpty() ? "X" : compact; // крайний случай
    }


}
