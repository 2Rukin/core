package ru.application.auth;

import grpc.tradeapi.v1.auth.AuthRequest;
import grpc.tradeapi.v1.auth.AuthResponse;
import grpc.tradeapi.v1.auth.AuthServiceGrpc;
import grpc.tradeapi.v1.auth.TokenDetailsRequest;
import grpc.tradeapi.v1.auth.TokenDetailsResponse;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import ru.application.grpc.FinamChannelFactory;

import java.time.Instant;
import java.util.Objects;

/**
 * Мини-клиент Auth-сервиса: меняет secret -> JWT и пытается получить expiresAt
 * через RPC TokenDetails; если недоступно — парсит exp из JWT payload.
 */
@RequiredArgsConstructor
public class FinamAuthGrpcClient {

    private final FinamChannelFactory channelFactory;

    /**
     * Выполняет обмен секрета на JWT и пытается определить срок его действия.
     *
     * @param secret секрет, выдаваемый Finam Trade API; не {@code null}
     * @return токен и время истечения; не {@code null}
     */
    public JwtWithExpiry exchangeSecretForJwt(final String secret) {
        Objects.requireNonNull(secret, "secret");
        final ManagedChannel ch = channelFactory.getOrCreate();
        final var stub = AuthServiceGrpc.newBlockingStub(ch);

        // 1) secret -> token
        final AuthResponse authResp = stub.auth(AuthRequest.newBuilder()
                .setSecret(secret)
                .build());
        final String jwt = authResp.getToken();

        // 2А) предпочтительно: узнать срок через TokenDetails
        final Instant expiresAt = tryGetExpiryViaTokenDetails(stub, jwt);
        if (expiresAt != null) {
            return new JwtWithExpiry(jwt, expiresAt);
        }

        // 2Б) fallback: взять exp из payload JWT
        final Instant expFromJwt = JwtExpDecoder.tryDecodeExp(jwt);
        if (expFromJwt != null) {
            return new JwtWithExpiry(jwt, expFromJwt);
        }

        // 3) запасной вариант (10 минут)
        return new JwtWithExpiry(jwt, Instant.now().plusSeconds(600));
    }

    /**
     * Пытается определить срок действия токена через RPC {@code TokenDetails}.
     *
     * @param stub gRPC-stub Auth-сервиса; не {@code null}
     * @param jwt  JWT-токен; не {@code null}
     * @return момент истечения или {@code null}, если определить не удалось
     */
    private Instant tryGetExpiryViaTokenDetails(final AuthServiceGrpc.AuthServiceBlockingStub stub, final String jwt) {
        Objects.requireNonNull(stub, "stub");
        Objects.requireNonNull(jwt, "jwt");
        try {
            TokenDetailsResponse td = stub.tokenDetails(TokenDetailsRequest.newBuilder()
                    .setToken(jwt)
                    .build());

            // В разных версиях proto поле может называться по-разному.
            // Попробуем сначала Timestamp getExpireTime():
            try {
                var method = td.getClass().getMethod("getExpireTime");
                var ts = (com.google.protobuf.Timestamp) method.invoke(td);
                if (ts != null && (ts.getSeconds() > 0 || ts.getNanos() > 0)) {
                    return Instant.ofEpochSecond(ts.getSeconds(), ts.getNanos());
                }
            } catch (ReflectiveOperationException ignored) { /* нет метода — идём дальше */ }

            // Затем простой long getExpiresAt():
            try {
                var method = td.getClass().getMethod("getExpiresAt");
                long epoch = (long) method.invoke(td);
                if (epoch > 0) return Instant.ofEpochSecond(epoch);
            } catch (ReflectiveOperationException ignored) { }

            // Затем вложенный details.getExpireTime():
            try {
                var detailsM = td.getClass().getMethod("getDetails");
                Object details = detailsM.invoke(td);
                if (details != null) {
                    try {
                        var ts = (com.google.protobuf.Timestamp)
                                details.getClass().getMethod("getExpireTime").invoke(details);
                        if (ts != null && (ts.getSeconds() > 0 || ts.getNanos() > 0)) {
                            return Instant.ofEpochSecond(ts.getSeconds(), ts.getNanos());
                        }
                    } catch (ReflectiveOperationException ignored) { }
                    try {
                        long epoch = (long) details.getClass().getMethod("getExpiresAt").invoke(details);
                        if (epoch > 0) return Instant.ofEpochSecond(epoch);
                    } catch (ReflectiveOperationException ignored) { }
                }
            } catch (ReflectiveOperationException ignored) { }

            return null;
        } catch (Throwable ignored) {
            return null;
        }
    }

    /**
     * Результат обмена секрета на JWT.
     *
     * @param jwt       полученный JWT
     * @param expiresAt момент истечения
     */
    public record JwtWithExpiry(String jwt, Instant expiresAt) {
    }
}
