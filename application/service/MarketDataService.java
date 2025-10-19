package ru.application.service;

import java.time.Instant;

import grpc.tradeapi.v1.assets.ClockRequest;
import grpc.tradeapi.v1.assets.ClockResponse;
import org.springframework.stereotype.Service;

import grpc.tradeapi.v1.assets.AssetsServiceGrpc;

import java.util.Objects;

/**
 * Сервис доступа к рыночным данным Finam Trade API.
 */
@Service
public class MarketDataService {

    private final AssetsServiceGrpc.AssetsServiceBlockingStub assets;

    /**
     * Создаёт сервис с внедрённым gRPC-stub.
     *
     * @param assets блокирующий stub {@code AssetsService}; не {@code null}
     */
    public MarketDataService(final AssetsServiceGrpc.AssetsServiceBlockingStub assets) {
        this.assets = Objects.requireNonNull(assets, "assets");
    }

    /**
     * Возвращает серверное время Finam Trade API.
     *
     * @return момент времени на сервере; не {@code null}
     */
    public Instant serverTime() {
        final ClockRequest req = ClockRequest.newBuilder().build();
        final ClockResponse resp = assets.clock(req);

        final var ts = resp.getTimestamp(); // google.protobuf.Timestamp
        return Instant.ofEpochSecond(ts.getSeconds(), ts.getNanos());
    }
}
