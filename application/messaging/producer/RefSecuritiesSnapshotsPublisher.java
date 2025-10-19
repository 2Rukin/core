package ru.application.messaging.producer;

import com.google.protobuf.Message;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import ru.application.messaging.MessagingProperties;
import ru.application.messaging.MessagingProperties.Topic;

/**
 * Публикатор снапшотов справочника инструментов в Kafka-топик {@code REF_SECURITIES_SNAPSHOTS}.
 * <p>
 * Ключ записи формируется как {@code &lt;BOARD&gt;#&lt;CODE&gt;} (оба компонента нормализуются к {@code UPPER_CASE}).
 * В заголовки добавляются служебные атрибуты {@value #HEADER_REF_BOARD} и {@value #HEADER_REF_CODE}.
 * <p>
 * Контракты:
 * <ul>
 *   <li>{@code board} и {@code code} — non-blank, иначе {@link IllegalArgumentException}.</li>
 *   <li>{@code snapshot} — non-null.</li>
 *   <li>Тема берётся из {@link MessagingProperties#topic(Topic)} по ключу {@link Topic#REF_SECURITIES_SNAPSHOTS}.</li>
 * </ul>
 */
@Slf4j
@Component
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RefSecuritiesSnapshotsPublisher {

    /** Имя заголовка с кратким кодом площадки/борда. */
    public static final String HEADER_REF_BOARD = "ref.board";
    /** Имя заголовка с кодом инструмента. */
    public static final String HEADER_REF_CODE = "ref.code";
    /** Разделитель компонентов ключа. */
    public static final String KEY_DELIMITER = "#";

    @NonNull KafkaMessagePublisher publisher;
    @NonNull MessagingProperties properties;

    /**
     * Публикует Protobuf-снапшот инструмента в тему справочника.
     *
     * @param board    код площадки (например, {@code TQBR}); не blank
     * @param code     код инструмента (например, {@code SBER}); не blank
     * @param snapshot Protobuf-представление снапшота; не {@code null}
     * @return future результата отправки в Kafka
     * @throws IllegalArgumentException если {@code board} или {@code code} пустые
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NonNull final String board,
            @NonNull final String code,
            @NonNull final Message snapshot
    ) {
        return publish(board, code, snapshot, Map.of());
    }

    /**
     * Публикует Protobuf-снапшот инструмента в тему справочника с дополнительными заголовками.
     * Пользовательские заголовки добавляются поверх служебных ({@value #HEADER_REF_BOARD}, {@value #HEADER_REF_CODE}).
     *
     * @param board        код площадки; не blank
     * @param code         код инструмента; не blank
     * @param snapshot     полезная нагрузка; не {@code null}
     * @param extraHeaders дополнительные заголовки (может быть пустой)
     * @return future результата отправки в Kafka
     * @throws IllegalArgumentException если {@code board} или {@code code} пустые
     */
    @NonNull
    public CompletableFuture<SendResult<String, Message>> publish(
            @NonNull final String board,
            @NonNull final String code,
            @NonNull final Message snapshot,
            @NonNull final Map<String, String> extraHeaders
    ) {
        final String normalizedBoard = requireToken(board, "board");
        final String normalizedCode  = requireToken(code, "code");

        final String topic = properties.topic(Topic.REF_SECURITIES_SNAPSHOTS);
        final String key   = buildCompositeKey(normalizedBoard, normalizedCode);

        final Map<String, String> headers = composeHeaders(normalizedBoard, normalizedCode, extraHeaders);

        if (log.isDebugEnabled()) {
            log.debug("Publishing REF_SECURITIES_SNAPSHOTS: board='{}', code='{}', topic='{}', key='{}'",
                    normalizedBoard, normalizedCode, topic, key);
        }

        return publisher.publish(topic, key, snapshot, headers);
    }

    // ===== Вспомогательные методы =========================================================

    /**
     * Формирует композитный ключ записи Kafka {@code &lt;BOARD&gt;#&lt;CODE&gt;}.
     *
     * @param board код площадки; non-blank
     * @param code  код инструмента; non-blank
     * @return нормализованный ключ (не {@code null})
     */
    @NonNull
    @Contract(pure = true)
    public static String buildCompositeKey(@NonNull final String board, @NonNull final String code) {
        return normalizeToken(board) + KEY_DELIMITER + normalizeToken(code);
    }

    /**
     * Нормализация компонента ключа/заголовка: {@code trim + toUpperCase(Locale.ROOT)}.
     *
     * @param token исходное значение; non-blank
     * @return нормализованное значение
     */
    @NonNull
    @Contract(pure = true)
    public static String normalizeToken(@NonNull final String token) {
        return token.trim().toUpperCase(Locale.ROOT);
    }

    @NonNull
    @Contract("_, _ -> param1")
    private static String requireToken(@NonNull final String token, @NonNull final String name) {
        final String normalized = normalizeToken(token);
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException(name + " must not be blank");
        }
        return normalized;
    }

    @NonNull
    @Contract("_,_,_ -> new")
    private static Map<String, String> composeHeaders(
            @NonNull final String board,
            @NonNull final String code,
            @NonNull final Map<String, String> extraHeaders
    ) {
        // Служебные + пользовательские (пользовательские могут перекрывать служебные — это осознанно).
        final Map<String, String> base = Map.of(
                HEADER_REF_BOARD, board,
                HEADER_REF_CODE,  code
        );
        if (extraHeaders.isEmpty()) {
            return base;
        }
        // Небольшая копия для защиты от мутабельности входной мапы
        return Map.<String, String>of(
                HEADER_REF_BOARD, board,
                HEADER_REF_CODE,  code
        ).entrySet().stream().collect(
                java.util.stream.Collectors.collectingAndThen(
                        java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue),
                        m -> { m.putAll(Map.copyOf(extraHeaders)); return Map.copyOf(m); }
                )
        );
    }
}
