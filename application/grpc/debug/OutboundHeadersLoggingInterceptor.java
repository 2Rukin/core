package ru.application.grpc.debug;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * Перехватчик, логирующий наличие и значение заголовка <code>authorization</code> для исходящих вызовов.
 * Подключается только в отладочном режиме через настройку {@code finam.grpc.debug-headers=true}.
 */
@Slf4j
public final class OutboundHeadersLoggingInterceptor implements ClientInterceptor {


    /**
     * Логирует наличие заголовка авторизации перед выполнением gRPC-вызова.
     *
     * @param method      описание вызываемого метода; не {@code null}
     * @param callOptions опции вызова; не {@code null}
     * @param next        следующий канал в цепочке интерцепторов; не {@code null}
     * @param <ReqT>      тип запроса
     * @param <RespT>     тип ответа
     * @return перехваченный вызов; не {@code null}
     */
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(final MethodDescriptor<ReqT, RespT> method,
                                                               final CallOptions callOptions,
                                                               final Channel next) {
        final MethodDescriptor<ReqT, RespT> safeMethod = Objects.requireNonNull(method, "method");
        final CallOptions safeOptions = Objects.requireNonNull(callOptions, "callOptions");
        final Channel safeNext = Objects.requireNonNull(next, "next");
        return new ForwardingClientCall.SimpleForwardingClientCall<>(safeNext.newCall(safeMethod, safeOptions)) {
            /** {@inheritDoc} */
            @Override
            public void start(final Listener<RespT> responseListener, final Metadata headers) {
                final Listener<RespT> safeListener = Objects.requireNonNull(responseListener, "responseListener");
                final Metadata safeHeaders = Objects.requireNonNull(headers, "headers");
                final boolean hasAuth = safeHeaders.containsKey(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER));
                log.debug("gRPC → {}/{} auth header present: {}", safeMethod.getServiceName(), safeMethod.getBareMethodName(), hasAuth);
                super.start(safeListener, safeHeaders);
            }
        };
    }
}