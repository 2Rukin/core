package grpc.tradeapi.v1.marketdata;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис рыночных данных
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: marketdata/marketdata_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MarketDataServiceGrpc {

  private MarketDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.tradeapi.v1.marketdata.MarketDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.BarsRequest,
      grpc.tradeapi.v1.marketdata.BarsResponse> getBarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bars",
      requestType = grpc.tradeapi.v1.marketdata.BarsRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.BarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.BarsRequest,
      grpc.tradeapi.v1.marketdata.BarsResponse> getBarsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.BarsRequest, grpc.tradeapi.v1.marketdata.BarsResponse> getBarsMethod;
    if ((getBarsMethod = MarketDataServiceGrpc.getBarsMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getBarsMethod = MarketDataServiceGrpc.getBarsMethod) == null) {
          MarketDataServiceGrpc.getBarsMethod = getBarsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.BarsRequest, grpc.tradeapi.v1.marketdata.BarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.BarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.BarsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("Bars"))
              .build();
        }
      }
    }
    return getBarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.QuoteRequest,
      grpc.tradeapi.v1.marketdata.QuoteResponse> getLastQuoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastQuote",
      requestType = grpc.tradeapi.v1.marketdata.QuoteRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.QuoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.QuoteRequest,
      grpc.tradeapi.v1.marketdata.QuoteResponse> getLastQuoteMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.QuoteRequest, grpc.tradeapi.v1.marketdata.QuoteResponse> getLastQuoteMethod;
    if ((getLastQuoteMethod = MarketDataServiceGrpc.getLastQuoteMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getLastQuoteMethod = MarketDataServiceGrpc.getLastQuoteMethod) == null) {
          MarketDataServiceGrpc.getLastQuoteMethod = getLastQuoteMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.QuoteRequest, grpc.tradeapi.v1.marketdata.QuoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastQuote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.QuoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.QuoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("LastQuote"))
              .build();
        }
      }
    }
    return getLastQuoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.OrderBookRequest,
      grpc.tradeapi.v1.marketdata.OrderBookResponse> getOrderBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrderBook",
      requestType = grpc.tradeapi.v1.marketdata.OrderBookRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.OrderBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.OrderBookRequest,
      grpc.tradeapi.v1.marketdata.OrderBookResponse> getOrderBookMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.OrderBookRequest, grpc.tradeapi.v1.marketdata.OrderBookResponse> getOrderBookMethod;
    if ((getOrderBookMethod = MarketDataServiceGrpc.getOrderBookMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getOrderBookMethod = MarketDataServiceGrpc.getOrderBookMethod) == null) {
          MarketDataServiceGrpc.getOrderBookMethod = getOrderBookMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.OrderBookRequest, grpc.tradeapi.v1.marketdata.OrderBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrderBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.OrderBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.OrderBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("OrderBook"))
              .build();
        }
      }
    }
    return getOrderBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.LatestTradesRequest,
      grpc.tradeapi.v1.marketdata.LatestTradesResponse> getLatestTradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestTrades",
      requestType = grpc.tradeapi.v1.marketdata.LatestTradesRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.LatestTradesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.LatestTradesRequest,
      grpc.tradeapi.v1.marketdata.LatestTradesResponse> getLatestTradesMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.LatestTradesRequest, grpc.tradeapi.v1.marketdata.LatestTradesResponse> getLatestTradesMethod;
    if ((getLatestTradesMethod = MarketDataServiceGrpc.getLatestTradesMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getLatestTradesMethod = MarketDataServiceGrpc.getLatestTradesMethod) == null) {
          MarketDataServiceGrpc.getLatestTradesMethod = getLatestTradesMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.LatestTradesRequest, grpc.tradeapi.v1.marketdata.LatestTradesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestTrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.LatestTradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.LatestTradesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("LatestTrades"))
              .build();
        }
      }
    }
    return getLatestTradesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest,
      grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> getSubscribeQuoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeQuote",
      requestType = grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest,
      grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> getSubscribeQuoteMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest, grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> getSubscribeQuoteMethod;
    if ((getSubscribeQuoteMethod = MarketDataServiceGrpc.getSubscribeQuoteMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getSubscribeQuoteMethod = MarketDataServiceGrpc.getSubscribeQuoteMethod) == null) {
          MarketDataServiceGrpc.getSubscribeQuoteMethod = getSubscribeQuoteMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest, grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeQuote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("SubscribeQuote"))
              .build();
        }
      }
    }
    return getSubscribeQuoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest,
      grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> getSubscribeOrderBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeOrderBook",
      requestType = grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest,
      grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> getSubscribeOrderBookMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest, grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> getSubscribeOrderBookMethod;
    if ((getSubscribeOrderBookMethod = MarketDataServiceGrpc.getSubscribeOrderBookMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getSubscribeOrderBookMethod = MarketDataServiceGrpc.getSubscribeOrderBookMethod) == null) {
          MarketDataServiceGrpc.getSubscribeOrderBookMethod = getSubscribeOrderBookMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest, grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeOrderBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("SubscribeOrderBook"))
              .build();
        }
      }
    }
    return getSubscribeOrderBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest,
      grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> getSubscribeLatestTradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLatestTrades",
      requestType = grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest,
      grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> getSubscribeLatestTradesMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest, grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> getSubscribeLatestTradesMethod;
    if ((getSubscribeLatestTradesMethod = MarketDataServiceGrpc.getSubscribeLatestTradesMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getSubscribeLatestTradesMethod = MarketDataServiceGrpc.getSubscribeLatestTradesMethod) == null) {
          MarketDataServiceGrpc.getSubscribeLatestTradesMethod = getSubscribeLatestTradesMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest, grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLatestTrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("SubscribeLatestTrades"))
              .build();
        }
      }
    }
    return getSubscribeLatestTradesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeBarsRequest,
      grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> getSubscribeBarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBars",
      requestType = grpc.tradeapi.v1.marketdata.SubscribeBarsRequest.class,
      responseType = grpc.tradeapi.v1.marketdata.SubscribeBarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeBarsRequest,
      grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> getSubscribeBarsMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.marketdata.SubscribeBarsRequest, grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> getSubscribeBarsMethod;
    if ((getSubscribeBarsMethod = MarketDataServiceGrpc.getSubscribeBarsMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getSubscribeBarsMethod = MarketDataServiceGrpc.getSubscribeBarsMethod) == null) {
          MarketDataServiceGrpc.getSubscribeBarsMethod = getSubscribeBarsMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.marketdata.SubscribeBarsRequest, grpc.tradeapi.v1.marketdata.SubscribeBarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeBars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeBarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.marketdata.SubscribeBarsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("SubscribeBars"))
              .build();
        }
      }
    }
    return getSubscribeBarsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MarketDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceStub>() {
        @java.lang.Override
        public MarketDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceStub(channel, callOptions);
        }
      };
    return MarketDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MarketDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceBlockingStub>() {
        @java.lang.Override
        public MarketDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceBlockingStub(channel, callOptions);
        }
      };
    return MarketDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MarketDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceFutureStub>() {
        @java.lang.Override
        public MarketDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceFutureStub(channel, callOptions);
        }
      };
    return MarketDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис рыночных данных
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Получение исторических данных по инструменту (агрегированные свечи)
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/bars?timeframe=TIME_FRAME_D&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - timeframe и interval - передаются как query-параметры
     * </pre>
     */
    default void bars(grpc.tradeapi.v1.marketdata.BarsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.BarsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBarsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение последней котировки по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/quotes/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void lastQuote(grpc.tradeapi.v1.marketdata.QuoteRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.QuoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastQuoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение текущего стакана по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/orderbook
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void orderBook(grpc.tradeapi.v1.marketdata.OrderBookRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.OrderBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение списка последних сделок по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/trades/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void latestTrades(grpc.tradeapi.v1.marketdata.LatestTradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.LatestTradesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestTradesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Подписка на котировки по инструменту. Стрим метод
     * </pre>
     */
    default void subscribeQuote(grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeQuoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Подписка на стакан по инструменту. Стрим метод
     * </pre>
     */
    default void subscribeOrderBook(grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeOrderBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Подписка на сделки по инструменту. Стрим метод
     * </pre>
     */
    default void subscribeLatestTrades(grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLatestTradesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Подписка на агрегированные свечи. Стрим метод
     * </pre>
     */
    default void subscribeBars(grpc.tradeapi.v1.marketdata.SubscribeBarsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeBarsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MarketDataService.
   * <pre>
   * Сервис рыночных данных
   * </pre>
   */
  public static abstract class MarketDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MarketDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MarketDataService.
   * <pre>
   * Сервис рыночных данных
   * </pre>
   */
  public static final class MarketDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MarketDataServiceStub> {
    private MarketDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение исторических данных по инструменту (агрегированные свечи)
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/bars?timeframe=TIME_FRAME_D&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - timeframe и interval - передаются как query-параметры
     * </pre>
     */
    public void bars(grpc.tradeapi.v1.marketdata.BarsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.BarsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение последней котировки по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/quotes/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void lastQuote(grpc.tradeapi.v1.marketdata.QuoteRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.QuoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastQuoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение текущего стакана по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/orderbook
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void orderBook(grpc.tradeapi.v1.marketdata.OrderBookRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.OrderBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение списка последних сделок по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/trades/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void latestTrades(grpc.tradeapi.v1.marketdata.LatestTradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.LatestTradesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestTradesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Подписка на котировки по инструменту. Стрим метод
     * </pre>
     */
    public void subscribeQuote(grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeQuoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Подписка на стакан по инструменту. Стрим метод
     * </pre>
     */
    public void subscribeOrderBook(grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeOrderBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Подписка на сделки по инструменту. Стрим метод
     * </pre>
     */
    public void subscribeLatestTrades(grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLatestTradesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Подписка на агрегированные свечи. Стрим метод
     * </pre>
     */
    public void subscribeBars(grpc.tradeapi.v1.marketdata.SubscribeBarsRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBarsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MarketDataService.
   * <pre>
   * Сервис рыночных данных
   * </pre>
   */
  public static final class MarketDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MarketDataServiceBlockingStub> {
    private MarketDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение исторических данных по инструменту (агрегированные свечи)
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/bars?timeframe=TIME_FRAME_D&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - timeframe и interval - передаются как query-параметры
     * </pre>
     */
    public grpc.tradeapi.v1.marketdata.BarsResponse bars(grpc.tradeapi.v1.marketdata.BarsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBarsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение последней котировки по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/quotes/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.marketdata.QuoteResponse lastQuote(grpc.tradeapi.v1.marketdata.QuoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastQuoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение текущего стакана по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/orderbook
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.marketdata.OrderBookResponse orderBook(grpc.tradeapi.v1.marketdata.OrderBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение списка последних сделок по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/trades/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.marketdata.LatestTradesResponse latestTrades(grpc.tradeapi.v1.marketdata.LatestTradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestTradesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Подписка на котировки по инструменту. Стрим метод
     * </pre>
     */
    public java.util.Iterator<grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse> subscribeQuote(
        grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeQuoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Подписка на стакан по инструменту. Стрим метод
     * </pre>
     */
    public java.util.Iterator<grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse> subscribeOrderBook(
        grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeOrderBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Подписка на сделки по инструменту. Стрим метод
     * </pre>
     */
    public java.util.Iterator<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse> subscribeLatestTrades(
        grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLatestTradesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Подписка на агрегированные свечи. Стрим метод
     * </pre>
     */
    public java.util.Iterator<grpc.tradeapi.v1.marketdata.SubscribeBarsResponse> subscribeBars(
        grpc.tradeapi.v1.marketdata.SubscribeBarsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeBarsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MarketDataService.
   * <pre>
   * Сервис рыночных данных
   * </pre>
   */
  public static final class MarketDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MarketDataServiceFutureStub> {
    private MarketDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Получение исторических данных по инструменту (агрегированные свечи)
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/bars?timeframe=TIME_FRAME_D&amp;interval.start_time=2023-01-01T00:00:00Z&amp;interval.end_time=2023-01-31T23:59:59Z
     * Authorization: &lt;token&gt;
     * Параметры:
     * - symbol - передается в URL пути
     * - timeframe и interval - передаются как query-параметры
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.marketdata.BarsResponse> bars(
        grpc.tradeapi.v1.marketdata.BarsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBarsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение последней котировки по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/quotes/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.marketdata.QuoteResponse> lastQuote(
        grpc.tradeapi.v1.marketdata.QuoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastQuoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение текущего стакана по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/orderbook
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.marketdata.OrderBookResponse> orderBook(
        grpc.tradeapi.v1.marketdata.OrderBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение списка последних сделок по инструменту
     * Пример HTTP запроса:
     * GET /v1/instruments/SBER&#64;MISX/trades/latest
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.marketdata.LatestTradesResponse> latestTrades(
        grpc.tradeapi.v1.marketdata.LatestTradesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestTradesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BARS = 0;
  private static final int METHODID_LAST_QUOTE = 1;
  private static final int METHODID_ORDER_BOOK = 2;
  private static final int METHODID_LATEST_TRADES = 3;
  private static final int METHODID_SUBSCRIBE_QUOTE = 4;
  private static final int METHODID_SUBSCRIBE_ORDER_BOOK = 5;
  private static final int METHODID_SUBSCRIBE_LATEST_TRADES = 6;
  private static final int METHODID_SUBSCRIBE_BARS = 7;

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
        case METHODID_BARS:
          serviceImpl.bars((grpc.tradeapi.v1.marketdata.BarsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.BarsResponse>) responseObserver);
          break;
        case METHODID_LAST_QUOTE:
          serviceImpl.lastQuote((grpc.tradeapi.v1.marketdata.QuoteRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.QuoteResponse>) responseObserver);
          break;
        case METHODID_ORDER_BOOK:
          serviceImpl.orderBook((grpc.tradeapi.v1.marketdata.OrderBookRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.OrderBookResponse>) responseObserver);
          break;
        case METHODID_LATEST_TRADES:
          serviceImpl.latestTrades((grpc.tradeapi.v1.marketdata.LatestTradesRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.LatestTradesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_QUOTE:
          serviceImpl.subscribeQuote((grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ORDER_BOOK:
          serviceImpl.subscribeOrderBook((grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_LATEST_TRADES:
          serviceImpl.subscribeLatestTrades((grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BARS:
          serviceImpl.subscribeBars((grpc.tradeapi.v1.marketdata.SubscribeBarsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.marketdata.SubscribeBarsResponse>) responseObserver);
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
          getBarsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.BarsRequest,
              grpc.tradeapi.v1.marketdata.BarsResponse>(
                service, METHODID_BARS)))
        .addMethod(
          getLastQuoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.QuoteRequest,
              grpc.tradeapi.v1.marketdata.QuoteResponse>(
                service, METHODID_LAST_QUOTE)))
        .addMethod(
          getOrderBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.OrderBookRequest,
              grpc.tradeapi.v1.marketdata.OrderBookResponse>(
                service, METHODID_ORDER_BOOK)))
        .addMethod(
          getLatestTradesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.LatestTradesRequest,
              grpc.tradeapi.v1.marketdata.LatestTradesResponse>(
                service, METHODID_LATEST_TRADES)))
        .addMethod(
          getSubscribeQuoteMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.SubscribeQuoteRequest,
              grpc.tradeapi.v1.marketdata.SubscribeQuoteResponse>(
                service, METHODID_SUBSCRIBE_QUOTE)))
        .addMethod(
          getSubscribeOrderBookMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.SubscribeOrderBookRequest,
              grpc.tradeapi.v1.marketdata.SubscribeOrderBookResponse>(
                service, METHODID_SUBSCRIBE_ORDER_BOOK)))
        .addMethod(
          getSubscribeLatestTradesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.SubscribeLatestTradesRequest,
              grpc.tradeapi.v1.marketdata.SubscribeLatestTradesResponse>(
                service, METHODID_SUBSCRIBE_LATEST_TRADES)))
        .addMethod(
          getSubscribeBarsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.tradeapi.v1.marketdata.SubscribeBarsRequest,
              grpc.tradeapi.v1.marketdata.SubscribeBarsResponse>(
                service, METHODID_SUBSCRIBE_BARS)))
        .build();
  }

  private static abstract class MarketDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MarketDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.tradeapi.v1.marketdata.MarketdataService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MarketDataService");
    }
  }

  private static final class MarketDataServiceFileDescriptorSupplier
      extends MarketDataServiceBaseDescriptorSupplier {
    MarketDataServiceFileDescriptorSupplier() {}
  }

  private static final class MarketDataServiceMethodDescriptorSupplier
      extends MarketDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MarketDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MarketDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MarketDataServiceFileDescriptorSupplier())
              .addMethod(getBarsMethod())
              .addMethod(getLastQuoteMethod())
              .addMethod(getOrderBookMethod())
              .addMethod(getLatestTradesMethod())
              .addMethod(getSubscribeQuoteMethod())
              .addMethod(getSubscribeOrderBookMethod())
              .addMethod(getSubscribeLatestTradesMethod())
              .addMethod(getSubscribeBarsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
