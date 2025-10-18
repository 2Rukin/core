package grpc.tradeapi.v1.accounts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис аккаунтов
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: accounts/accounts_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountsServiceGrpc {

  private AccountsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.tradeapi.v1.accounts.AccountsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.GetAccountRequest,
      grpc.tradeapi.v1.accounts.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = grpc.tradeapi.v1.accounts.GetAccountRequest.class,
      responseType = grpc.tradeapi.v1.accounts.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.GetAccountRequest,
      grpc.tradeapi.v1.accounts.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.GetAccountRequest, grpc.tradeapi.v1.accounts.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = AccountsServiceGrpc.getGetAccountMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getGetAccountMethod = AccountsServiceGrpc.getGetAccountMethod) == null) {
          AccountsServiceGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.accounts.GetAccountRequest, grpc.tradeapi.v1.accounts.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.GetAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TradesRequest,
      grpc.tradeapi.v1.accounts.TradesResponse> getTradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Trades",
      requestType = grpc.tradeapi.v1.accounts.TradesRequest.class,
      responseType = grpc.tradeapi.v1.accounts.TradesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TradesRequest,
      grpc.tradeapi.v1.accounts.TradesResponse> getTradesMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TradesRequest, grpc.tradeapi.v1.accounts.TradesResponse> getTradesMethod;
    if ((getTradesMethod = AccountsServiceGrpc.getTradesMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getTradesMethod = AccountsServiceGrpc.getTradesMethod) == null) {
          AccountsServiceGrpc.getTradesMethod = getTradesMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.accounts.TradesRequest, grpc.tradeapi.v1.accounts.TradesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Trades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.TradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.TradesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("Trades"))
              .build();
        }
      }
    }
    return getTradesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TransactionsRequest,
      grpc.tradeapi.v1.accounts.TransactionsResponse> getTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transactions",
      requestType = grpc.tradeapi.v1.accounts.TransactionsRequest.class,
      responseType = grpc.tradeapi.v1.accounts.TransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TransactionsRequest,
      grpc.tradeapi.v1.accounts.TransactionsResponse> getTransactionsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.accounts.TransactionsRequest, grpc.tradeapi.v1.accounts.TransactionsResponse> getTransactionsMethod;
    if ((getTransactionsMethod = AccountsServiceGrpc.getTransactionsMethod) == null) {
      synchronized (AccountsServiceGrpc.class) {
        if ((getTransactionsMethod = AccountsServiceGrpc.getTransactionsMethod) == null) {
          AccountsServiceGrpc.getTransactionsMethod = getTransactionsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.accounts.TransactionsRequest, grpc.tradeapi.v1.accounts.TransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.TransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.accounts.TransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsServiceMethodDescriptorSupplier("Transactions"))
              .build();
        }
      }
    }
    return getTransactionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceStub>() {
        @java.lang.Override
        public AccountsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceStub(channel, callOptions);
        }
      };
    return AccountsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceBlockingStub>() {
        @java.lang.Override
        public AccountsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsServiceFutureStub>() {
        @java.lang.Override
        public AccountsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsServiceFutureStub(channel, callOptions);
        }
      };
    return AccountsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис аккаунтов
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Получение информации по конкретному аккаунту
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void getAccount(grpc.tradeapi.v1.accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.GetAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение истории по сделкам аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/trades?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    default void trades(grpc.tradeapi.v1.accounts.TradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TradesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение списка транзакций аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/transactions?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    default void transactions(grpc.tradeapi.v1.accounts.TransactionsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountsService.
   * <pre>
   * Сервис аккаунтов
   * </pre>
   */
  public static abstract class AccountsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountsService.
   * <pre>
   * Сервис аккаунтов
   * </pre>
   */
  public static final class AccountsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountsServiceStub> {
    private AccountsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение информации по конкретному аккаунту
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void getAccount(grpc.tradeapi.v1.accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.GetAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение истории по сделкам аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/trades?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public void trades(grpc.tradeapi.v1.accounts.TradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TradesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение списка транзакций аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/transactions?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public void transactions(grpc.tradeapi.v1.accounts.TransactionsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountsService.
   * <pre>
   * Сервис аккаунтов
   * </pre>
   */
  public static final class AccountsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountsServiceBlockingStub> {
    private AccountsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение информации по конкретному аккаунту
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.accounts.GetAccountResponse getAccount(grpc.tradeapi.v1.accounts.GetAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение истории по сделкам аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/trades?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public grpc.tradeapi.v1.accounts.TradesResponse trades(grpc.tradeapi.v1.accounts.TradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение списка транзакций аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/transactions?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public grpc.tradeapi.v1.accounts.TransactionsResponse transactions(grpc.tradeapi.v1.accounts.TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountsService.
   * <pre>
   * Сервис аккаунтов
   * </pre>
   */
  public static final class AccountsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountsServiceFutureStub> {
    private AccountsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение информации по конкретному аккаунту
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.accounts.GetAccountResponse> getAccount(
        grpc.tradeapi.v1.accounts.GetAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение истории по сделкам аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/trades?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.accounts.TradesResponse> trades(
        grpc.tradeapi.v1.accounts.TradesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение списка транзакций аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/transactions?limit=50&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - account_id - передается в URL пути
     * - limit и interval - передаются как query-параметры
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.accounts.TransactionsResponse> transactions(
        grpc.tradeapi.v1.accounts.TransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_TRADES = 1;
  private static final int METHODID_TRANSACTIONS = 2;

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
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((grpc.tradeapi.v1.accounts.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.GetAccountResponse>) responseObserver);
          break;
        case METHODID_TRADES:
          serviceImpl.trades((grpc.tradeapi.v1.accounts.TradesRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TradesResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS:
          serviceImpl.transactions((grpc.tradeapi.v1.accounts.TransactionsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.accounts.TransactionsResponse>) responseObserver);
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
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.accounts.GetAccountRequest,
              grpc.tradeapi.v1.accounts.GetAccountResponse>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getTradesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.accounts.TradesRequest,
              grpc.tradeapi.v1.accounts.TradesResponse>(
                service, METHODID_TRADES)))
        .addMethod(
          getTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.accounts.TransactionsRequest,
              grpc.tradeapi.v1.accounts.TransactionsResponse>(
                service, METHODID_TRANSACTIONS)))
        .build();
  }

  private static abstract class AccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.tradeapi.v1.accounts.AccountsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsService");
    }
  }

  private static final class AccountsServiceFileDescriptorSupplier
      extends AccountsServiceBaseDescriptorSupplier {
    AccountsServiceFileDescriptorSupplier() {}
  }

  private static final class AccountsServiceMethodDescriptorSupplier
      extends AccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AccountsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AccountsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsServiceFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getTradesMethod())
              .addMethod(getTransactionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
