package ru.application.service;

import static java.util.Objects.requireNonNull;

import com.google.protobuf.Message;
import grpc.tradeapi.v1.assets.Asset;
import grpc.tradeapi.v1.assets.AssetsRequest;
import grpc.tradeapi.v1.assets.AssetsResponse;
import grpc.tradeapi.v1.assets.AssetsServiceGrpc;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.application.config.RefSecuritiesSnapshotsProperties;
import ru.application.messaging.producer.RefSecuritiesSnapshotsPublisher;

/**
 * Периодически запрашивает справочник инструментов в Finam Trade API и публикует
 * снапшоты в Kafka-топик {@code REF_SECURITIES_SNAPSHOTS}.
 * <p>
 * Контракты/гарантии:
 * <ul>
 *   <li>Расписание управляется через {@link RefSecuritiesSnapshotsProperties}
 *       (SpEL-ссылки на millis для {@link Scheduled}).</li>
 *   <li>При отключении фича-флагом {@code enabled=false} задача пропускается.</li>
 *   <li>Ошибки gRPC не прерывают работу приложения; при ошибках публикации
 *       маршрут в DLQ выполняется внутри {@code KafkaMessagePublisher}.</li>
 * </ul>
 */
@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RefSecuritiesSnapshotsService {

    /** Полное имя RPC-метода для удобного логирования/поиска. */
    private static final String ASSETS_METHOD = AssetsServiceGrpc.getAssetsMethod().getFullMethodName();

    @NonNull AssetsServiceGrpc.AssetsServiceBlockingStub assetsStub;
    @NonNull RefSecuritiesSnapshotsPublisher publisher;
    @NonNull RefSecuritiesSnapshotsProperties properties;

    /**
     * Плановая задача публикации снапшотов.
     * Тайминги берутся из {@link RefSecuritiesSnapshotsProperties}.
     */
    @Scheduled(
            initialDelayString = "${app.scheduler.ref-securities.initial-delay}",
            fixedDelayString   = "${app.scheduler.ref-securities.fixed-delay}"
    )
    public void refreshSnapshots() {
        if (!properties.getEnabled()) {
            if (log.isDebugEnabled()) {
                log.debug("REF_SECURITIES_SNAPSHOTS scheduler disabled — skipping run");
            }
            return;
        }

        final AssetsResponse response;
        try {
            if (log.isInfoEnabled()) {
                log.info("Fetching reference securities via {}", ASSETS_METHOD);
            }
            response = assetsStub.assets(AssetsRequest.getDefaultInstance());
        } catch (StatusRuntimeException e) {
            log.error("Failed to fetch assets via {}: status={}", ASSETS_METHOD, e.getStatus(), e);
            return;
        } catch (RuntimeException e) {
            log.error("Unexpected error during {} invocation", ASSETS_METHOD, e);
            return;
        }

        final List<Asset> assets = response.getAssetsList();
        if (assets.isEmpty()) {
            log.info("Finam assets(): received 0 instruments");
            return;
        }

        final List<CompletableFuture<SendResult<String, Message>>> futures = new ArrayList<>(assets.size());
        int skipped = 0;

        for (Asset asset : assets) {
            final SnapshotKey key = snapshotKeyOf(asset);
            if (key == null) {
                skipped++;
                if (log.isDebugEnabled()) {
                    log.debug("Skipping asset without board/ticker: id='{}', symbol='{}', mic='{}', ticker='{}'",
                            asset.getId(), asset.getSymbol(), asset.getMic(), asset.getTicker());
                }
                continue;
            }
            futures.add(publisher.publish(key.board(), key.code(), asset));
        }

        try {
            if (!futures.isEmpty()) {
                CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new)).join();
            }
            log.info("REF_SECURITIES_SNAPSHOTS: published={}, skipped={}, total={}",
                    futures.size(), skipped, assets.size());
        } catch (RuntimeException e) {
            // Частичные ошибки уже будут задокументированы продюсером; агрегируем итог.
            log.error("REF_SECURITIES_SNAPSHOTS: batch publish encountered errors (partial failure)", e);
        }
    }

    /**
     * Формирует составляющие ключа Kafka-записи из protobuf-описания инструмента.
     * Приоритет: {@code symbol (CODE@BOARD)} → {@code (ticker, mic)} → {@code (id, mic)}.
     *
     * @param asset protobuf-описание инструмента; не {@code null}
     * @return {@code SnapshotKey(board, code)} либо {@code null}, если данных недостаточно
     */
    @Contract(pure = true)
    static SnapshotKey snapshotKeyOf(@NonNull final Asset asset) {
        requireNonNull(asset, "asset");

        String board = trimToNull(asset.getMic());
        String code  = trimToNull(asset.getTicker());

        final String symbol = trimToNull(asset.getSymbol());
        if (symbol != null && symbol.contains("@")) {
            final String[] parts = symbol.split("@", 2);
            final String left  = trimToNull(parts[0]); // CODE
            final String right = trimToNull(parts[1]); // BOARD
            if (left != null)  code  = left;
            if (right != null) board = right;
        }

        if (code == null) {
            code = trimToNull(asset.getId()); // последний шанс
        }
        if (board == null || code == null) {
            return null;
        }

        return new SnapshotKey(board, code);
    }

    @Contract(pure = true)
    private static String trimToNull(final String s) {
        if (s == null) return null;
        final String t = s.trim();
        return t.isEmpty() ? null : t;
    }

    /** Компоненты ключа Kafka-записи. */
    record SnapshotKey(String board, String code) { }
}
