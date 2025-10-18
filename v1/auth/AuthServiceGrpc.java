package grpc.tradeapi.v1.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис аутентификации
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: auth/auth_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.tradeapi.v1.auth.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.AuthRequest,
      grpc.tradeapi.v1.auth.AuthResponse> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = grpc.tradeapi.v1.auth.AuthRequest.class,
      responseType = grpc.tradeapi.v1.auth.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.AuthRequest,
      grpc.tradeapi.v1.auth.AuthResponse> getAuthMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.AuthRequest, grpc.tradeapi.v1.auth.AuthResponse> getAuthMethod;
    if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
          AuthServiceGrpc.getAuthMethod = getAuthMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.auth.AuthRequest, grpc.tradeapi.v1.auth.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.auth.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.auth.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Auth"))
              .build();
        }
      }
    }
    return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.TokenDetailsRequest,
      grpc.tradeapi.v1.auth.TokenDetailsResponse> getTokenDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenDetails",
      requestType = grpc.tradeapi.v1.auth.TokenDetailsRequest.class,
      responseType = grpc.tradeapi.v1.auth.TokenDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.TokenDetailsRequest,
      grpc.tradeapi.v1.auth.TokenDetailsResponse> getTokenDetailsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.auth.TokenDetailsRequest, grpc.tradeapi.v1.auth.TokenDetailsResponse> getTokenDetailsMethod;
    if ((getTokenDetailsMethod = AuthServiceGrpc.getTokenDetailsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getTokenDetailsMethod = AuthServiceGrpc.getTokenDetailsMethod) == null) {
          AuthServiceGrpc.getTokenDetailsMethod = getTokenDetailsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.auth.TokenDetailsRequest, grpc.tradeapi.v1.auth.TokenDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.auth.TokenDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.auth.TokenDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("TokenDetails"))
              .build();
        }
      }
    }
    return getTokenDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис аутентификации
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Получение JWT токена из API токена
     * Пример HTTP запроса:
     * POST /v1/sessions
     * Content-Type: application/json
     * {
     *   "secret": "your-api-secret-key"
     * }
     * Все поля передаются в теле запроса
     * </pre>
     */
    default void auth(grpc.tradeapi.v1.auth.AuthRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение информации о токене сессии
     * Пример HTTP запроса:
     * POST /v1/sessions/details
     * Content-Type: application/json
     * {
     *   "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     * }
     * Токен передается в теле запроса для безопасности
     * Получение информации о токене. Также включает список доступных счетов.
     * </pre>
     */
    default void tokenDetails(grpc.tradeapi.v1.auth.TokenDetailsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.TokenDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   * <pre>
   * Сервис аутентификации
   * </pre>
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   * <pre>
   * Сервис аутентификации
   * </pre>
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение JWT токена из API токена
     * Пример HTTP запроса:
     * POST /v1/sessions
     * Content-Type: application/json
     * {
     *   "secret": "your-api-secret-key"
     * }
     * Все поля передаются в теле запроса
     * </pre>
     */
    public void auth(grpc.tradeapi.v1.auth.AuthRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение информации о токене сессии
     * Пример HTTP запроса:
     * POST /v1/sessions/details
     * Content-Type: application/json
     * {
     *   "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     * }
     * Токен передается в теле запроса для безопасности
     * Получение информации о токене. Также включает список доступных счетов.
     * </pre>
     */
    public void tokenDetails(grpc.tradeapi.v1.auth.TokenDetailsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.TokenDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   * <pre>
   * Сервис аутентификации
   * </pre>
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение JWT токена из API токена
     * Пример HTTP запроса:
     * POST /v1/sessions
     * Content-Type: application/json
     * {
     *   "secret": "your-api-secret-key"
     * }
     * Все поля передаются в теле запроса
     * </pre>
     */
    public grpc.tradeapi.v1.auth.AuthResponse auth(grpc.tradeapi.v1.auth.AuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение информации о токене сессии
     * Пример HTTP запроса:
     * POST /v1/sessions/details
     * Content-Type: application/json
     * {
     *   "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     * }
     * Токен передается в теле запроса для безопасности
     * Получение информации о токене. Также включает список доступных счетов.
     * </pre>
     */
    public grpc.tradeapi.v1.auth.TokenDetailsResponse tokenDetails(grpc.tradeapi.v1.auth.TokenDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   * <pre>
   * Сервис аутентификации
   * </pre>
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение JWT токена из API токена
     * Пример HTTP запроса:
     * POST /v1/sessions
     * Content-Type: application/json
     * {
     *   "secret": "your-api-secret-key"
     * }
     * Все поля передаются в теле запроса
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.auth.AuthResponse> auth(
        grpc.tradeapi.v1.auth.AuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение информации о токене сессии
     * Пример HTTP запроса:
     * POST /v1/sessions/details
     * Content-Type: application/json
     * {
     *   "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     * }
     * Токен передается в теле запроса для безопасности
     * Получение информации о токене. Также включает список доступных счетов.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.auth.TokenDetailsResponse> tokenDetails(
        grpc.tradeapi.v1.auth.TokenDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH = 0;
  private static final int METHODID_TOKEN_DETAILS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH:
          serviceImpl.auth((grpc.tradeapi.v1.auth.AuthRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.AuthResponse>) responseObserver);
          break;
        case METHODID_TOKEN_DETAILS:
          serviceImpl.tokenDetails((grpc.tradeapi.v1.auth.TokenDetailsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.auth.TokenDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.auth.AuthRequest,
              grpc.tradeapi.v1.auth.AuthResponse>(
                service, METHODID_AUTH)))
        .addMethod(
          getTokenDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.auth.TokenDetailsRequest,
              grpc.tradeapi.v1.auth.TokenDetailsResponse>(
                service, METHODID_TOKEN_DETAILS)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.tradeapi.v1.auth.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getAuthMethod())
              .addMethod(getTokenDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
