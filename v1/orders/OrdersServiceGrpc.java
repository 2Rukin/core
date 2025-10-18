package grpc.tradeapi.v1.orders;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис ордеров
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: orders/orders_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrdersServiceGrpc {

  private OrdersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.tradeapi.v1.orders.OrdersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.Order,
      grpc.tradeapi.v1.orders.OrderState> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrder",
      requestType = grpc.tradeapi.v1.orders.Order.class,
      responseType = grpc.tradeapi.v1.orders.OrderState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.Order,
      grpc.tradeapi.v1.orders.OrderState> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.Order, grpc.tradeapi.v1.orders.OrderState> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = OrdersServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (OrdersServiceGrpc.class) {
        if ((getPlaceOrderMethod = OrdersServiceGrpc.getPlaceOrderMethod) == null) {
          OrdersServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.orders.Order, grpc.tradeapi.v1.orders.OrderState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrderState.getDefaultInstance()))
              .setSchemaDescriptor(new OrdersServiceMethodDescriptorSupplier("PlaceOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.CancelOrderRequest,
      grpc.tradeapi.v1.orders.OrderState> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = grpc.tradeapi.v1.orders.CancelOrderRequest.class,
      responseType = grpc.tradeapi.v1.orders.OrderState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.CancelOrderRequest,
      grpc.tradeapi.v1.orders.OrderState> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.CancelOrderRequest, grpc.tradeapi.v1.orders.OrderState> getCancelOrderMethod;
    if ((getCancelOrderMethod = OrdersServiceGrpc.getCancelOrderMethod) == null) {
      synchronized (OrdersServiceGrpc.class) {
        if ((getCancelOrderMethod = OrdersServiceGrpc.getCancelOrderMethod) == null) {
          OrdersServiceGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.orders.CancelOrderRequest, grpc.tradeapi.v1.orders.OrderState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.CancelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrderState.getDefaultInstance()))
              .setSchemaDescriptor(new OrdersServiceMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrdersRequest,
      grpc.tradeapi.v1.orders.OrdersResponse> getGetOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrders",
      requestType = grpc.tradeapi.v1.orders.OrdersRequest.class,
      responseType = grpc.tradeapi.v1.orders.OrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrdersRequest,
      grpc.tradeapi.v1.orders.OrdersResponse> getGetOrdersMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrdersRequest, grpc.tradeapi.v1.orders.OrdersResponse> getGetOrdersMethod;
    if ((getGetOrdersMethod = OrdersServiceGrpc.getGetOrdersMethod) == null) {
      synchronized (OrdersServiceGrpc.class) {
        if ((getGetOrdersMethod = OrdersServiceGrpc.getGetOrdersMethod) == null) {
          OrdersServiceGrpc.getGetOrdersMethod = getGetOrdersMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.orders.OrdersRequest, grpc.tradeapi.v1.orders.OrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrdersServiceMethodDescriptorSupplier("GetOrders"))
              .build();
        }
      }
    }
    return getGetOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.GetOrderRequest,
      grpc.tradeapi.v1.orders.OrderState> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = grpc.tradeapi.v1.orders.GetOrderRequest.class,
      responseType = grpc.tradeapi.v1.orders.OrderState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.GetOrderRequest,
      grpc.tradeapi.v1.orders.OrderState> getGetOrderMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.GetOrderRequest, grpc.tradeapi.v1.orders.OrderState> getGetOrderMethod;
    if ((getGetOrderMethod = OrdersServiceGrpc.getGetOrderMethod) == null) {
      synchronized (OrdersServiceGrpc.class) {
        if ((getGetOrderMethod = OrdersServiceGrpc.getGetOrderMethod) == null) {
          OrdersServiceGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.orders.GetOrderRequest, grpc.tradeapi.v1.orders.OrderState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrderState.getDefaultInstance()))
              .setSchemaDescriptor(new OrdersServiceMethodDescriptorSupplier("GetOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrderTradeRequest,
      grpc.tradeapi.v1.orders.OrderTradeResponse> getSubscribeOrderTradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeOrderTrade",
      requestType = grpc.tradeapi.v1.orders.OrderTradeRequest.class,
      responseType = grpc.tradeapi.v1.orders.OrderTradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrderTradeRequest,
      grpc.tradeapi.v1.orders.OrderTradeResponse> getSubscribeOrderTradeMethod() {
    io.grpc.MethodDescriptor<grpc.tradeapi.v1.orders.OrderTradeRequest, grpc.tradeapi.v1.orders.OrderTradeResponse> getSubscribeOrderTradeMethod;
    if ((getSubscribeOrderTradeMethod = OrdersServiceGrpc.getSubscribeOrderTradeMethod) == null) {
      synchronized (OrdersServiceGrpc.class) {
        if ((getSubscribeOrderTradeMethod = OrdersServiceGrpc.getSubscribeOrderTradeMethod) == null) {
          OrdersServiceGrpc.getSubscribeOrderTradeMethod = getSubscribeOrderTradeMethod =
              io.grpc.MethodDescriptor.<grpc.tradeapi.v1.orders.OrderTradeRequest, grpc.tradeapi.v1.orders.OrderTradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeOrderTrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrderTradeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.tradeapi.v1.orders.OrderTradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrdersServiceMethodDescriptorSupplier("SubscribeOrderTrade"))
              .build();
        }
      }
    }
    return getSubscribeOrderTradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrdersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrdersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrdersServiceStub>() {
        @java.lang.Override
        public OrdersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrdersServiceStub(channel, callOptions);
        }
      };
    return OrdersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrdersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrdersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrdersServiceBlockingStub>() {
        @java.lang.Override
        public OrdersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrdersServiceBlockingStub(channel, callOptions);
        }
      };
    return OrdersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrdersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrdersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrdersServiceFutureStub>() {
        @java.lang.Override
        public OrdersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrdersServiceFutureStub(channel, callOptions);
        }
      };
    return OrdersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис ордеров
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Выставление биржевой заявки
     * Пример HTTP запроса:
     * POST /v1/accounts/A12345/orders
     * Content-Type: application/json
     * Authorization: &lt;token&gt;
     * {
     *   "symbol": "SBER&#64;MISX",
     *   "quantity": {
     *			 "value": "10"
     *		 },
     *   "side": "SIDE_BUY",
     *   "type": "ORDER_TYPE_LIMIT",
     *   "time_in_force": "TIME_IN_FORCE_DAY",
     *   "limit_price": {
     *			 "value": "150.50"
     *		 }
     * }
     * Поле account_id берется из URL-пути, остальные поля передаются в теле запроса
     * </pre>
     */
    default void placeOrder(grpc.tradeapi.v1.orders.Order request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Отмена биржевой заявки
     * Пример HTTP запроса:
     * DELETE /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void cancelOrder(grpc.tradeapi.v1.orders.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение списка заявок для аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void getOrders(grpc.tradeapi.v1.orders.OrdersRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Получение информации о конкретном ордере
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    default void getOrder(grpc.tradeapi.v1.orders.GetOrderRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Подписка на собственные заявки и сделки. Стрим метод
     * </pre>
     */
    default io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderTradeRequest> subscribeOrderTrade(
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderTradeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeOrderTradeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrdersService.
   * <pre>
   * Сервис ордеров
   * </pre>
   */
  public static abstract class OrdersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrdersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrdersService.
   * <pre>
   * Сервис ордеров
   * </pre>
   */
  public static final class OrdersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrdersServiceStub> {
    private OrdersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrdersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrdersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Выставление биржевой заявки
     * Пример HTTP запроса:
     * POST /v1/accounts/A12345/orders
     * Content-Type: application/json
     * Authorization: &lt;token&gt;
     * {
     *   "symbol": "SBER&#64;MISX",
     *   "quantity": {
     *			 "value": "10"
     *		 },
     *   "side": "SIDE_BUY",
     *   "type": "ORDER_TYPE_LIMIT",
     *   "time_in_force": "TIME_IN_FORCE_DAY",
     *   "limit_price": {
     *			 "value": "150.50"
     *		 }
     * }
     * Поле account_id берется из URL-пути, остальные поля передаются в теле запроса
     * </pre>
     */
    public void placeOrder(grpc.tradeapi.v1.orders.Order request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Отмена биржевой заявки
     * Пример HTTP запроса:
     * DELETE /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void cancelOrder(grpc.tradeapi.v1.orders.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение списка заявок для аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void getOrders(grpc.tradeapi.v1.orders.OrdersRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Получение информации о конкретном ордере
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public void getOrder(grpc.tradeapi.v1.orders.GetOrderRequest request,
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Подписка на собственные заявки и сделки. Стрим метод
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderTradeRequest> subscribeOrderTrade(
        io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderTradeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeOrderTradeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrdersService.
   * <pre>
   * Сервис ордеров
   * </pre>
   */
  public static final class OrdersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrdersServiceBlockingStub> {
    private OrdersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrdersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrdersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Выставление биржевой заявки
     * Пример HTTP запроса:
     * POST /v1/accounts/A12345/orders
     * Content-Type: application/json
     * Authorization: &lt;token&gt;
     * {
     *   "symbol": "SBER&#64;MISX",
     *   "quantity": {
     *			 "value": "10"
     *		 },
     *   "side": "SIDE_BUY",
     *   "type": "ORDER_TYPE_LIMIT",
     *   "time_in_force": "TIME_IN_FORCE_DAY",
     *   "limit_price": {
     *			 "value": "150.50"
     *		 }
     * }
     * Поле account_id берется из URL-пути, остальные поля передаются в теле запроса
     * </pre>
     */
    public grpc.tradeapi.v1.orders.OrderState placeOrder(grpc.tradeapi.v1.orders.Order request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Отмена биржевой заявки
     * Пример HTTP запроса:
     * DELETE /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.orders.OrderState cancelOrder(grpc.tradeapi.v1.orders.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение списка заявок для аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.orders.OrdersResponse getOrders(grpc.tradeapi.v1.orders.OrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Получение информации о конкретном ордере
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public grpc.tradeapi.v1.orders.OrderState getOrder(grpc.tradeapi.v1.orders.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrdersService.
   * <pre>
   * Сервис ордеров
   * </pre>
   */
  public static final class OrdersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrdersServiceFutureStub> {
    private OrdersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrdersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrdersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Выставление биржевой заявки
     * Пример HTTP запроса:
     * POST /v1/accounts/A12345/orders
     * Content-Type: application/json
     * Authorization: &lt;token&gt;
     * {
     *   "symbol": "SBER&#64;MISX",
     *   "quantity": {
     *			 "value": "10"
     *		 },
     *   "side": "SIDE_BUY",
     *   "type": "ORDER_TYPE_LIMIT",
     *   "time_in_force": "TIME_IN_FORCE_DAY",
     *   "limit_price": {
     *			 "value": "150.50"
     *		 }
     * }
     * Поле account_id берется из URL-пути, остальные поля передаются в теле запроса
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.orders.OrderState> placeOrder(
        grpc.tradeapi.v1.orders.Order request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Отмена биржевой заявки
     * Пример HTTP запроса:
     * DELETE /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.orders.OrderState> cancelOrder(
        grpc.tradeapi.v1.orders.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение списка заявок для аккаунта
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.orders.OrdersResponse> getOrders(
        grpc.tradeapi.v1.orders.OrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Получение информации о конкретном ордере
     * Пример HTTP запроса:
     * GET /v1/accounts/A12345/orders/ORD789012
     * Authorization: &lt;token&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.tradeapi.v1.orders.OrderState> getOrder(
        grpc.tradeapi.v1.orders.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;
  private static final int METHODID_CANCEL_ORDER = 1;
  private static final int METHODID_GET_ORDERS = 2;
  private static final int METHODID_GET_ORDER = 3;
  private static final int METHODID_SUBSCRIBE_ORDER_TRADE = 4;

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
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((grpc.tradeapi.v1.orders.Order) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((grpc.tradeapi.v1.orders.CancelOrderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState>) responseObserver);
          break;
        case METHODID_GET_ORDERS:
          serviceImpl.getOrders((grpc.tradeapi.v1.orders.OrdersRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrdersResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((grpc.tradeapi.v1.orders.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderState>) responseObserver);
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
        case METHODID_SUBSCRIBE_ORDER_TRADE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeOrderTrade(
              (io.grpc.stub.StreamObserver<grpc.tradeapi.v1.orders.OrderTradeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPlaceOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.orders.Order,
              grpc.tradeapi.v1.orders.OrderState>(
                service, METHODID_PLACE_ORDER)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.orders.CancelOrderRequest,
              grpc.tradeapi.v1.orders.OrderState>(
                service, METHODID_CANCEL_ORDER)))
        .addMethod(
          getGetOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.orders.OrdersRequest,
              grpc.tradeapi.v1.orders.OrdersResponse>(
                service, METHODID_GET_ORDERS)))
        .addMethod(
          getGetOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.tradeapi.v1.orders.GetOrderRequest,
              grpc.tradeapi.v1.orders.OrderState>(
                service, METHODID_GET_ORDER)))
        .addMethod(
          getSubscribeOrderTradeMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              grpc.tradeapi.v1.orders.OrderTradeRequest,
              grpc.tradeapi.v1.orders.OrderTradeResponse>(
                service, METHODID_SUBSCRIBE_ORDER_TRADE)))
        .build();
  }

  private static abstract class OrdersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrdersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.tradeapi.v1.orders.OrdersServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrdersService");
    }
  }

  private static final class OrdersServiceFileDescriptorSupplier
      extends OrdersServiceBaseDescriptorSupplier {
    OrdersServiceFileDescriptorSupplier() {}
  }

  private static final class OrdersServiceMethodDescriptorSupplier
      extends OrdersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrdersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrdersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrdersServiceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getCancelOrderMethod())
              .addMethod(getGetOrdersMethod())
              .addMethod(getGetOrderMethod())
              .addMethod(getSubscribeOrderTradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
