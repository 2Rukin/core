package grpc.tradeapi.v1.assets;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис счетов
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: assets/assets_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetsServiceGrpc {

  private AssetsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.tradeapi.v1.assets.AssetsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ExchangesRequest,
      grpc.tradeapi.v1.assets.ExchangesResponse> getExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exchanges",
      requestType = grpc.tradeapi.v1.assets.ExchangesRequest.class,
      responseType = grpc.tradeapi.v1.assets.ExchangesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ExchangesRequest,
      grpc.tradeapi.v1.assets.ExchangesResponse> getExchangesMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ExchangesRequest, grpc.tradeapi.v1.assets.ExchangesResponse> getExchangesMethod;
    if ((getExchangesMethod = AssetsServiceGrpc.getExchangesMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getExchangesMethod = AssetsServiceGrpc.getExchangesMethod) == null) {
          AssetsServiceGrpc.getExchangesMethod = getExchangesMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.ExchangesRequest, grpc.tradeapi.v1.assets.ExchangesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ExchangesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ExchangesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("Exchanges"))
              .build();
        }
      }
    }
    return getExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.AssetsRequest,
      grpc.tradeapi.v1.assets.AssetsResponse> getAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Assets",
      requestType = grpc.tradeapi.v1.assets.AssetsRequest.class,
      responseType = grpc.tradeapi.v1.assets.AssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.AssetsRequest,
      grpc.tradeapi.v1.assets.AssetsResponse> getAssetsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.AssetsRequest, grpc.tradeapi.v1.assets.AssetsResponse> getAssetsMethod;
    if ((getAssetsMethod = AssetsServiceGrpc.getAssetsMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getAssetsMethod = AssetsServiceGrpc.getAssetsMethod) == null) {
          AssetsServiceGrpc.getAssetsMethod = getAssetsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.AssetsRequest, grpc.tradeapi.v1.assets.AssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Assets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.AssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.AssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("Assets"))
              .build();
        }
      }
    }
    return getAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetRequest,
      grpc.tradeapi.v1.assets.GetAssetResponse> getGetAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAsset",
      requestType = grpc.tradeapi.v1.assets.GetAssetRequest.class,
      responseType = grpc.tradeapi.v1.assets.GetAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetRequest,
      grpc.tradeapi.v1.assets.GetAssetResponse> getGetAssetMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetRequest, grpc.tradeapi.v1.assets.GetAssetResponse> getGetAssetMethod;
    if ((getGetAssetMethod = AssetsServiceGrpc.getGetAssetMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getGetAssetMethod = AssetsServiceGrpc.getGetAssetMethod) == null) {
          AssetsServiceGrpc.getGetAssetMethod = getGetAssetMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.GetAssetRequest, grpc.tradeapi.v1.assets.GetAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.GetAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.GetAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("GetAsset"))
              .build();
        }
      }
    }
    return getGetAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetParamsRequest,
      grpc.tradeapi.v1.assets.GetAssetParamsResponse> getGetAssetParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetParams",
      requestType = grpc.tradeapi.v1.assets.GetAssetParamsRequest.class,
      responseType = grpc.tradeapi.v1.assets.GetAssetParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetParamsRequest,
      grpc.tradeapi.v1.assets.GetAssetParamsResponse> getGetAssetParamsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.GetAssetParamsRequest, grpc.tradeapi.v1.assets.GetAssetParamsResponse> getGetAssetParamsMethod;
    if ((getGetAssetParamsMethod = AssetsServiceGrpc.getGetAssetParamsMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getGetAssetParamsMethod = AssetsServiceGrpc.getGetAssetParamsMethod) == null) {
          AssetsServiceGrpc.getGetAssetParamsMethod = getGetAssetParamsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.GetAssetParamsRequest, grpc.tradeapi.v1.assets.GetAssetParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.GetAssetParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.GetAssetParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("GetAssetParams"))
              .build();
        }
      }
    }
    return getGetAssetParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.OptionsChainRequest,
      grpc.tradeapi.v1.assets.OptionsChainResponse> getOptionsChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptionsChain",
      requestType = grpc.tradeapi.v1.assets.OptionsChainRequest.class,
      responseType = grpc.tradeapi.v1.assets.OptionsChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.OptionsChainRequest,
      grpc.tradeapi.v1.assets.OptionsChainResponse> getOptionsChainMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.OptionsChainRequest, grpc.tradeapi.v1.assets.OptionsChainResponse> getOptionsChainMethod;
    if ((getOptionsChainMethod = AssetsServiceGrpc.getOptionsChainMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getOptionsChainMethod = AssetsServiceGrpc.getOptionsChainMethod) == null) {
          AssetsServiceGrpc.getOptionsChainMethod = getOptionsChainMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.OptionsChainRequest, grpc.tradeapi.v1.assets.OptionsChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptionsChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.OptionsChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.OptionsChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("OptionsChain"))
              .build();
        }
      }
    }
    return getOptionsChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ScheduleRequest,
      grpc.tradeapi.v1.assets.ScheduleResponse> getScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedule",
      requestType = grpc.tradeapi.v1.assets.ScheduleRequest.class,
      responseType = grpc.tradeapi.v1.assets.ScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ScheduleRequest,
      grpc.tradeapi.v1.assets.ScheduleResponse> getScheduleMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ScheduleRequest, grpc.tradeapi.v1.assets.ScheduleResponse> getScheduleMethod;
    if ((getScheduleMethod = AssetsServiceGrpc.getScheduleMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getScheduleMethod = AssetsServiceGrpc.getScheduleMethod) == null) {
          AssetsServiceGrpc.getScheduleMethod = getScheduleMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.ScheduleRequest, grpc.tradeapi.v1.assets.ScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("Schedule"))
              .build();
        }
      }
    }
    return getScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ClockRequest,
      grpc.tradeapi.v1.assets.ClockResponse> getClockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clock",
      requestType = grpc.tradeapi.v1.assets.ClockRequest.class,
      responseType = grpc.tradeapi.v1.assets.ClockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ClockRequest,
      grpc.tradeapi.v1.assets.ClockResponse> getClockMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.assets.ClockRequest, grpc.tradeapi.v1.assets.ClockResponse> getClockMethod;
    if ((getClockMethod = AssetsServiceGrpc.getClockMethod) == null) {
      synchronized (AssetsServiceGrpc.class) {
        if ((getClockMethod = AssetsServiceGrpc.getClockMethod) == null) {
          AssetsServiceGrpc.getClockMethod = getClockMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.assets.ClockRequest, grpc.tradeapi.v1.assets.ClockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ClockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.assets.ClockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetsServiceMethodDescriptorSupplier("Clock"))
              .build();
        }
      }
    }
    return getClockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetsServiceStub>() {
        @java.lang.Override
        public AssetsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetsServiceStub(channel, callOptions);
        }
      };
    return AssetsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetsServiceBlockingStub>() {
        @java.lang.Override
        public AssetsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetsServiceBlockingStub(channel, callOptions);
        }
      };
    return AssetsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetsServiceFutureStub>() {
        @java.lang.Override
        public AssetsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetsServiceFutureStub(channel, callOptions);
        }
      };
    return AssetsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис счетов
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Получение списка доступных бирж, названия и mic коды
     * Пример HTTP запроса:
     * GET /v1/exchanges
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void exchanges(grpc.tradeapi.v1.assets.ExchangesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ExchangesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение списка доступных инструментов, их описание
     * Пример HTTP запроса:
     * GET /v1/assets
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void assets(grpc.tradeapi.v1.assets.AssetsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.AssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение информации по конкретному инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    default void getAsset(grpc.tradeapi.v1.assets.GetAssetRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение торговых параметров по инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/params?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    default void getAssetParams(grpc.tradeapi.v1.assets.GetAssetParamsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение цепочки опционов для базового актива
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/options
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void optionsChain(grpc.tradeapi.v1.assets.OptionsChainRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.OptionsChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptionsChainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение расписания торгов для инструмента
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/schedule
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void schedule(grpc.tradeapi.v1.assets.ScheduleRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение времени на сервере
     * Пример HTTP запроса:
     * GET /v1/assets/clock
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void clock(grpc.tradeapi.v1.assets.ClockRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ClockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AssetsService.
   * <pre>
   * Сервис счетов
   * </pre>
   */
  public static abstract class AssetsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AssetsService.
   * <pre>
   * Сервис счетов
   * </pre>
   */
  public static final class AssetsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AssetsServiceStub> {
    private AssetsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение списка доступных бирж, названия и mic коды
     * Пример HTTP запроса:
     * GET /v1/exchanges
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void exchanges(grpc.tradeapi.v1.assets.ExchangesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ExchangesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение списка доступных инструментов, их описание
     * Пример HTTP запроса:
     * GET /v1/assets
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void assets(grpc.tradeapi.v1.assets.AssetsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.AssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение информации по конкретному инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public void getAsset(grpc.tradeapi.v1.assets.GetAssetRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение торговых параметров по инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/params?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public void getAssetParams(grpc.tradeapi.v1.assets.GetAssetParamsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение цепочки опционов для базового актива
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/options
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void optionsChain(grpc.tradeapi.v1.assets.OptionsChainRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.OptionsChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptionsChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение расписания торгов для инструмента
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/schedule
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void schedule(grpc.tradeapi.v1.assets.ScheduleRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение времени на сервере
     * Пример HTTP запроса:
     * GET /v1/assets/clock
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void clock(grpc.tradeapi.v1.assets.ClockRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ClockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AssetsService.
   * <pre>
   * Сервис счетов
   * </pre>
   */
  public static final class AssetsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetsServiceBlockingStub> {
    private AssetsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение списка доступных бирж, названия и mic коды
     * Пример HTTP запроса:
     * GET /v1/exchanges
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.assets.ExchangesResponse exchanges(grpc.tradeapi.v1.assets.ExchangesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение списка доступных инструментов, их описание
     * Пример HTTP запроса:
     * GET /v1/assets
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.assets.AssetsResponse assets(grpc.tradeapi.v1.assets.AssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение информации по конкретному инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public grpc.tradeapi.v1.assets.GetAssetResponse getAsset(grpc.tradeapi.v1.assets.GetAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение торговых параметров по инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/params?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public grpc.tradeapi.v1.assets.GetAssetParamsResponse getAssetParams(grpc.tradeapi.v1.assets.GetAssetParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение цепочки опционов для базового актива
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/options
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.assets.OptionsChainResponse optionsChain(grpc.tradeapi.v1.assets.OptionsChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptionsChainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение расписания торгов для инструмента
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/schedule
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.assets.ScheduleResponse schedule(grpc.tradeapi.v1.assets.ScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение времени на сервере
     * Пример HTTP запроса:
     * GET /v1/assets/clock
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.assets.ClockResponse clock(grpc.tradeapi.v1.assets.ClockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AssetsService.
   * <pre>
   * Сервис счетов
   * </pre>
   */
  public static final class AssetsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetsServiceFutureStub> {
    private AssetsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение списка доступных бирж, названия и mic коды
     * Пример HTTP запроса:
     * GET /v1/exchanges
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.ExchangesResponse> exchanges(
        grpc.tradeapi.v1.assets.ExchangesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение списка доступных инструментов, их описание
     * Пример HTTP запроса:
     * GET /v1/assets
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.AssetsResponse> assets(
        grpc.tradeapi.v1.assets.AssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение информации по конкретному инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.GetAssetResponse> getAsset(
        grpc.tradeapi.v1.assets.GetAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение торговых параметров по инструменту
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/params?account_id=1440399
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - account_id - передаётся как query-параметр
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.GetAssetParamsResponse> getAssetParams(
        grpc.tradeapi.v1.assets.GetAssetParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение цепочки опционов для базового актива
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/options
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.OptionsChainResponse> optionsChain(
        grpc.tradeapi.v1.assets.OptionsChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptionsChainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение расписания торгов для инструмента
     * Пример HTTP запроса:
     * GET /v1/assets/SBER&#64;MISX/schedule
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.ScheduleResponse> schedule(
        grpc.tradeapi.v1.assets.ScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение времени на сервере
     * Пример HTTP запроса:
     * GET /v1/assets/clock
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.assets.ClockResponse> clock(
        grpc.tradeapi.v1.assets.ClockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGES = 0;
  private static final int METHODID_ASSETS = 1;
  private static final int METHODID_GET_ASSET = 2;
  private static final int METHODID_GET_ASSET_PARAMS = 3;
  private static final int METHODID_OPTIONS_CHAIN = 4;
  private static final int METHODID_SCHEDULE = 5;
  private static final int METHODID_CLOCK = 6;

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
        case METHODID_EXCHANGES:
          serviceImpl.exchanges((grpc.tradeapi.v1.assets.ExchangesRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ExchangesResponse>) responseObserver);
          break;
        case METHODID_ASSETS:
          serviceImpl.assets((grpc.tradeapi.v1.assets.AssetsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.AssetsResponse>) responseObserver);
          break;
        case METHODID_GET_ASSET:
          serviceImpl.getAsset((grpc.tradeapi.v1.assets.GetAssetRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetResponse>) responseObserver);
          break;
        case METHODID_GET_ASSET_PARAMS:
          serviceImpl.getAssetParams((grpc.tradeapi.v1.assets.GetAssetParamsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.GetAssetParamsResponse>) responseObserver);
          break;
        case METHODID_OPTIONS_CHAIN:
          serviceImpl.optionsChain((grpc.tradeapi.v1.assets.OptionsChainRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.OptionsChainResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE:
          serviceImpl.schedule((grpc.tradeapi.v1.assets.ScheduleRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ScheduleResponse>) responseObserver);
          break;
        case METHODID_CLOCK:
          serviceImpl.clock((grpc.tradeapi.v1.assets.ClockRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.assets.ClockResponse>) responseObserver);
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
          getExchangesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.ExchangesRequest,
              grpc.tradeapi.v1.assets.ExchangesResponse>(
                service, METHODID_EXCHANGES)))
        .addMethod(
          getAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.AssetsRequest,
              grpc.tradeapi.v1.assets.AssetsResponse>(
                service, METHODID_ASSETS)))
        .addMethod(
          getGetAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.GetAssetRequest,
              grpc.tradeapi.v1.assets.GetAssetResponse>(
                service, METHODID_GET_ASSET)))
        .addMethod(
          getGetAssetParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.GetAssetParamsRequest,
              grpc.tradeapi.v1.assets.GetAssetParamsResponse>(
                service, METHODID_GET_ASSET_PARAMS)))
        .addMethod(
          getOptionsChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.OptionsChainRequest,
              grpc.tradeapi.v1.assets.OptionsChainResponse>(
                service, METHODID_OPTIONS_CHAIN)))
        .addMethod(
          getScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.ScheduleRequest,
              grpc.tradeapi.v1.assets.ScheduleResponse>(
                service, METHODID_SCHEDULE)))
        .addMethod(
          getClockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.assets.ClockRequest,
              grpc.tradeapi.v1.assets.ClockResponse>(
                service, METHODID_CLOCK)))
        .build();
  }

  private static abstract class AssetsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.tradeapi.v1.assets.AssetsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetsService");
    }
  }

  private static final class AssetsServiceFileDescriptorSupplier
      extends AssetsServiceBaseDescriptorSupplier {
    AssetsServiceFileDescriptorSupplier() {}
  }

  private static final class AssetsServiceMethodDescriptorSupplier
      extends AssetsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetsServiceFileDescriptorSupplier())
              .addMethod(getExchangesMethod())
              .addMethod(getAssetsMethod())
              .addMethod(getGetAssetMethod())
              .addMethod(getGetAssetParamsMethod())
              .addMethod(getOptionsChainMethod())
              .addMethod(getScheduleMethod())
              .addMethod(getClockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
