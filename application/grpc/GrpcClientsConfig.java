package ru.application.grpc;

import grpc.tradeapi.v1.accounts.AccountsServiceGrpc;
import grpc.tradeapi.v1.assets.AssetsServiceGrpc;
import grpc.tradeapi.v1.auth.AuthServiceGrpc;
import grpc.tradeapi.v1.marketdata.MarketDataServiceGrpc;
import grpc.tradeapi.v1.orders.OrdersServiceGrpc;
import io.grpc.ManagedChannel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.application.auth.AuthTokenProvider;
import ru.application.grpc.auth.JwtCallCredentials;

import java.util.Objects;

/** Бины gRPC-стабов с автоматической подстановкой Bearer. */
@Configuration
public class GrpcClientsConfig {

    /**
     * Создаёт {@link JwtCallCredentials}, обеспечивающий добавление JWT к исходящим вызовам.
     *
     * @param tokenProvider провайдер авторизационных токенов; не {@code null}
     * @return инстанс {@link JwtCallCredentials}; не {@code null}
     */
    @Bean
    public JwtCallCredentials jwtCallCredentials(final AuthTokenProvider tokenProvider) {
        return new JwtCallCredentials(Objects.requireNonNull(tokenProvider, "tokenProvider"));
    }


    /**
     * Создаёт блокирующий stub {@link AssetsServiceGrpc} с автоматическим добавлением JWT.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return готовый к использованию stub; не {@code null}
     */
    @Bean
    public AssetsServiceGrpc.AssetsServiceBlockingStub assetsStub(final ManagedChannel ch, final JwtCallCredentials creds) {
        return AssetsServiceGrpc.newBlockingStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }


    /**
     * Создаёт блокирующий stub {@link AccountsServiceGrpc}.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return gRPC-stub со встроенной авторизацией; не {@code null}
     */
    @Bean
    public AccountsServiceGrpc.AccountsServiceBlockingStub accountsStub(final ManagedChannel ch, final JwtCallCredentials creds) {
        return AccountsServiceGrpc.newBlockingStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }


    /**
     * Создаёт блокирующий stub {@link OrdersServiceGrpc}.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return gRPC-stub со встроенной авторизацией; не {@code null}
     */
    @Bean
    public OrdersServiceGrpc.OrdersServiceBlockingStub ordersStub(final ManagedChannel ch, final JwtCallCredentials creds) {
        return OrdersServiceGrpc.newBlockingStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }


    /**
     * Создаёт блокирующий stub {@link MarketDataServiceGrpc} для unary-вызовов.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return блокирующий stub с авторизацией; не {@code null}
     */
    @Bean
    public MarketDataServiceGrpc.MarketDataServiceBlockingStub marketDataBlockingStub(final ManagedChannel ch,
                                                                                      final JwtCallCredentials creds) {
        return MarketDataServiceGrpc.newBlockingStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }


    /**
     * Создаёт неблокирующий stub {@link MarketDataServiceGrpc} для потоковых подписок.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return асинхронный stub с авторизацией; не {@code null}
     */
    @Bean
    public MarketDataServiceGrpc.MarketDataServiceStub marketDataAsyncStub(final ManagedChannel ch,
                                                                           final JwtCallCredentials creds) {
        return MarketDataServiceGrpc.newStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }


    /**
     * Создаёт блокирующий stub {@link AuthServiceGrpc} для прямого обращения к Auth-сервису.
     *
     * @param ch    общий {@link ManagedChannel}; не {@code null}
     * @param creds учётные данные вызова; не {@code null}
     * @return gRPC-stub со встроенной авторизацией; не {@code null}
     */
    @Bean
    public AuthServiceGrpc.AuthServiceBlockingStub authStub(final ManagedChannel ch, final JwtCallCredentials creds) {
        return AuthServiceGrpc.newBlockingStub(Objects.requireNonNull(ch, "ch"))
                .withCallCredentials(Objects.requireNonNull(creds, "creds"));
    }
}
