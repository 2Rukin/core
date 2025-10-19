package ru.application.grpc.auth;

import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.application.auth.AuthTokenProvider;

import java.util.Objects;
import java.util.concurrent.Executor;


/**
 * {@link CallCredentials} для добавления заголовка {@code authorization} с актуальным JWT.
 * Источник токена инкапсулирован в {@link AuthTokenProvider}.
 */
@Slf4j
@RequiredArgsConstructor
public class JwtCallCredentials extends CallCredentials {

    // grpc metadata keys for ASCII must be lowercase
    private static final Metadata.Key<String> AUTH_KEY =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    private final AuthTokenProvider tokenProvider;

    /**
     * Добавляет заголовок {@code authorization} с актуальным JWT-токеном к исходящему gRPC-вызову.
     *
     * @param requestInfo информация о запросе, предоставленная gRPC; не {@code null}
     * @param appExecutor исполнитель, на котором выполняется получение токена; не {@code null}
     * @param applier     callback для применения/отклонения метаданных; не {@code null}
     */
    @Override
    public void applyRequestMetadata(final RequestInfo requestInfo,
                                     final Executor appExecutor,
                                     final MetadataApplier applier) {
        Objects.requireNonNull(requestInfo, "requestInfo");
        final Executor safeExecutor = Objects.requireNonNull(appExecutor, "appExecutor");
        final MetadataApplier safeApplier = Objects.requireNonNull(applier, "applier");
        try {
// Безопаснее запрашивать токен на рабочем потоке приложения
            safeExecutor.execute(() -> {
                try {
                    final String token = Objects.requireNonNull(tokenProvider.getCurrentJwtToken(), "token");
                    final Metadata headers = new Metadata();
                    headers.put(AUTH_KEY, token); // если нужен префикс — добавь его в провайдере
                    safeApplier.apply(headers);
                } catch (Throwable e) {
                    log.warn("Не удалось получить JWT: {}", e.toString());
                    safeApplier.fail(Status.UNAUTHENTICATED.withDescription("JWT not available").withCause(e));
                }
            });
        } catch (Throwable t) {
            safeApplier.fail(Status.UNAUTHENTICATED.withCause(t));
        }
    }

    /**
     * Отмечает использование нестабильного API gRPC.
     */
    @Override
    public void thisUsesUnstableApi() {
    }
}
