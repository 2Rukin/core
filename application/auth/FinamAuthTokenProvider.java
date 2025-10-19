package ru.application.auth;

import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.application.config.AuthProperties;
import ru.application.grpc.FinamChannelFactory;

/**
 * Реальный провайдер: кэширует JWT, упреждающе обновляет, умеет forceRefresh().
 */
@Slf4j
@Component
public class FinamAuthTokenProvider implements AuthTokenProvider {

    private final AtomicReference<TokenState> tokenStateReference = new AtomicReference<>();
    private final AuthProperties authProperties;
    private final FinamAuthGrpcClient authClient;

    /**
     * Создаёт провайдер с указанными настройками и фабрикой каналов.
     *
     * @param authProperties   свойства авторизации; не {@code null}
     * @param channelFactory   фабрика gRPC-каналов; не {@code null}
     */
    public FinamAuthTokenProvider(@NonNull final AuthProperties authProperties,
                                  @NonNull final FinamChannelFactory channelFactory) {
        this.authProperties = Objects.requireNonNull(authProperties, "authProperties");
        this.authClient = new FinamAuthGrpcClient(Objects.requireNonNull(channelFactory, "channelFactory"));
    }

    /** {@inheritDoc} */
    @Override
    public synchronized @NonNull String getCurrentJwtToken() {
        final TokenState current = tokenStateReference.get();
        if (current == null || isExpiringSoon(current)) {
            refreshInternal();
        }
        final TokenState ready = tokenStateReference.get();
        if (ready == null) {
            throw new IllegalStateException("Не удалось получить JWT-токен авторизации.");
        }
        return ready.jwtToken;
    }

    /** {@inheritDoc} */
    @Override
    public synchronized void forceRefresh() {
        refreshInternal();
    }

    /**
     * Проверяет, истекает ли срок действия токена с учётом запасного интервала.
     *
     * @param state состояние токена; не {@code null}
     * @return {@code true}, если токен скоро истечёт
     */
    private boolean isExpiringSoon(@NonNull final TokenState state) {
        Objects.requireNonNull(state, "state");
        final Instant now = Instant.now();
        final Instant refreshThreshold = state.expiresAt.minusSeconds(authProperties.getRefreshSkewSeconds());
        return now.isAfter(refreshThreshold);
    }

    /**
     * Выполняет обмен секрета на новый JWT через gRPC Auth-сервис и обновляет кэш.
     */
    private void refreshInternal() {
        try {
            final var res = authClient.exchangeSecretForJwt(authProperties.getSecret());
            tokenStateReference.set(new TokenState(res.jwt(), res.expiresAt()));
            log.info("JWT обновлён. Действителен до {}", res.expiresAt());
        } catch (final Exception e) {
            log.error("Ошибка обновления JWT: {}", e.getMessage(), e);
            throw (e instanceof RuntimeException re) ? re : new IllegalStateException("Auth error", e);
        }
    }

    /** Небольшая неизменяемая структура состояния токена. */
    private static final class TokenState {
        private final String jwtToken;
        private final Instant expiresAt;

        private TokenState(final String jwtToken, final Instant expiresAt) {
            this.jwtToken = Objects.requireNonNull(jwtToken, "jwtToken");
            this.expiresAt = Objects.requireNonNull(expiresAt, "expiresAt");
        }
    }
}
