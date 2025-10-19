package ru.application.grpc;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.application.config.AuthProperties;

import javax.net.ssl.SSLException;
import java.util.concurrent.TimeUnit;

/**
 * Фабрика TLS-канала к Finam Trade API.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class FinamChannelFactory {

    private final AuthProperties props;
    private volatile ManagedChannel channel;

    /**
     * Возвращает ранее созданный или инициализирует новый {@link ManagedChannel}.
     *
     * @return актуальный gRPC-канал; не {@code null}
     */
    public ManagedChannel getOrCreate() {
        ManagedChannel ch = channel;
        if (ch == null || ch.isShutdown() || ch.isTerminated()) {
            synchronized (this) {
                ch = channel;
                if (ch == null || ch.isShutdown() || ch.isTerminated()) {
                    try {
                        channel = ch = NettyChannelBuilder
                                .forAddress(props.getHost(), props.getPort())
                                .sslContext(GrpcSslContexts.forClient().build())
                                .keepAliveTime(30, TimeUnit.SECONDS)
                                .keepAliveTimeout(10, TimeUnit.SECONDS)
                                .build();
                        log.info("gRPC канал создан: {}:{}", props.getHost(), props.getPort());
                    } catch (SSLException e) {
                        throw new IllegalStateException("Не удалось создать TLS-контекст для gRPC", e);
                    }
                }
            }
        }
        return ch;
    }

    /**
     * Закрывает созданный канал при остановке приложения.
     */
    @PreDestroy
    public void shutdown() {
        ManagedChannel ch = channel;
        if (ch != null) {
            ch.shutdownNow();
        }
    }
}
