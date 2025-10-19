package ru.application.auth;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Objects;

/**
 * Простой декодер exp из JWT без верификации подписи (fallback).
 */
final class JwtExpDecoder {

    private JwtExpDecoder() {
    }

    /**
     * Пытается извлечь поле {@code exp} из JWT-токена.
     *
     * @param jwt JWT-строка; не {@code null}
     * @return истекающий момент времени или {@code null}, если парсинг не удался
     */
    static Instant tryDecodeExp(final String jwt) {
        try {
            Objects.requireNonNull(jwt, "jwt");
            String[] parts = jwt.split("\\.");
            if (parts.length < 2) return null;
            String payloadJson = new String(Base64.getUrlDecoder().decode(parts[1]), StandardCharsets.UTF_8);

            // Ищем "exp": <number> (без JSON-парсера — чтобы не тянуть зависимости)
            int idx = payloadJson.indexOf("\"exp\"");
            if (idx < 0) return null;
            int colon = payloadJson.indexOf(':', idx);
            if (colon < 0) return null;
            int pos = colon + 1;
            while (pos < payloadJson.length() && Character.isWhitespace(payloadJson.charAt(pos))) pos++;
            int end = pos;
            while (end < payloadJson.length() && Character.isDigit(payloadJson.charAt(end))) end++;
            long exp = Long.parseLong(payloadJson.substring(pos, end));
            return Instant.ofEpochSecond(exp);
        } catch (Throwable ignore) {
            return null;
        }
    }
}
