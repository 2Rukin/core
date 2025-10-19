# Сервис ордеров

`grpc.tradeapi.v1.orders.OrdersService` покрывает размещение, отмену и получение статусов ордеров, а также подписку на потоковое обновление ордеров/сделок.

## Методы

| RPC | Тип | REST | Назначение |
| --- | --- | ---- | ---------- |
| `PlaceOrder` | unary | `POST /v1/accounts/{account_id}/orders` | Создать ордер и получить начальный статус. |
| `CancelOrder` | unary | `DELETE /v1/accounts/{account_id}/orders/{order_id}` | Отменить ордер. |
| `GetOrders` | unary | `GET /v1/accounts/{account_id}/orders` | Получить активные и недавние ордера. |
| `GetOrder` | unary | `GET /v1/accounts/{account_id}/orders/{order_id}` | Получить состояние конкретного ордера. |
| `SubscribeOrderTrade` | bidi stream | gRPC-стрим | Подписка/отписка на обновления ордеров и сделок для аккаунта. |

## Структуры запросов

### `Order`
- `account_id` — аккаунт размещения (повторяется в REST пути).
- `symbol` — тикер инструмента.
- `quantity` — количество (`google.type.Decimal`).
- `side` — направление [`Side`](types.md#side).
- `type` — тип [`OrderType`](#ordertype).
- `time_in_force` — режим действия [`TimeInForce`](#timeinforce).
- `limit_price` — лимитная цена (`google.type.Decimal`).
- `stop_price` — стоп-цена (`google.type.Decimal`).
- `stop_condition` — условие срабатывания [`StopCondition`](#stopcondition).
- `legs` — массив [`Leg`](#leg) для сложных стратегий.
- `client_order_id` — внешний идентификатор клиента.

### `CancelOrderRequest`
- `account_id` — идентификатор аккаунта.
- `order_id` — идентификатор ордера.

### `OrdersRequest`
- `account_id` — идентификатор аккаунта.

### `GetOrderRequest`
- `account_id` — идентификатор аккаунта.
- `order_id` — идентификатор ордера.

### `OrderTradeRequest`
- `action` — `ACTION_SUBSCRIBE` или `ACTION_UNSUBSCRIBE`.
- `data_type` — `DATA_TYPE_ALL`, `DATA_TYPE_ORDERS`, `DATA_TYPE_TRADES`.
- `account_id` — идентификатор аккаунта, поток относится к одному аккаунту.

## Ответы и состояния

### `OrderState`
- `order_id` — идентификатор ордера.
- `exec_id` — идентификатор исполнения (для частичных сделок).
- `status` — статус [`OrderStatus`](#orderstatus).
- `order` — вложенный исходный [`Order`](#order).
- `transact_at`, `accept_at`, `withdraw_at` — ключевые отметки времени (`google.protobuf.Timestamp`).

### `OrdersResponse`
- `orders` — массив `OrderState`.

### `OrderTradeResponse`
- `orders` — текущие состояния ордеров.
- `trades` — связанные сделки [`grpc.tradeapi.v1.AccountTrade`](types.md#accounttrade).

## Перечисления

### `OrderType`
`ORDER_TYPE_UNSPECIFIED`, `ORDER_TYPE_MARKET`, `ORDER_TYPE_LIMIT`, `ORDER_TYPE_STOP`, `ORDER_TYPE_STOP_LIMIT`, `ORDER_TYPE_MULTI_LEG`.

### `TimeInForce`
`TIME_IN_FORCE_UNSPECIFIED`, `TIME_IN_FORCE_DAY`, `TIME_IN_FORCE_GOOD_TILL_CANCEL`, `TIME_IN_FORCE_GOOD_TILL_CROSSING`, `TIME_IN_FORCE_EXT`, `TIME_IN_FORCE_ON_OPEN`, `TIME_IN_FORCE_ON_CLOSE`, `TIME_IN_FORCE_IOC`, `TIME_IN_FORCE_FOK`.

### `StopCondition`
`STOP_CONDITION_UNSPECIFIED`, `STOP_CONDITION_LAST_UP`, `STOP_CONDITION_LAST_DOWN`.

### `OrderStatus`
Статусы жизненного цикла ордера: `ORDER_STATUS_NEW`, `PARTIALLY_FILLED`, `FILLED`, `DONE_FOR_DAY`, `CANCELED`, `REPLACED`, `PENDING_CANCEL`, `REJECTED`, `SUSPENDED`, `PENDING_NEW`, `EXPIRED`, `FAILED`, `FORWARDING`, `WAIT`, `DENIED_BY_BROKER`, `REJECTED_BY_EXCHANGE`, `WATCHING`, `EXECUTED`, `DISABLED`, `LINK_WAIT`, `SL_GUARD_TIME`, `SL_EXECUTED`, `SL_FORWARDING`, `TP_GUARD_TIME`, `TP_EXECUTED`, `TP_CORRECTION`, `TP_FORWARDING`, `TP_CORR_GUARD_TIME`, а также значения `_UNSPECIFIED` и промежуточные коды.

## Дополнительные типы

### `Leg`
- `symbol` — тикер инструмента.
- `quantity` — количество (`google.type.Decimal`).
- `side` — направление [`Side`](types.md#side).

## Потоковые подписки
- Клиент отправляет `OrderTradeRequest` со значением `ACTION_SUBSCRIBE`, чтобы начать получать `OrderTradeResponse` с обновлениями.
- Для остановки подписки необходимо отправить `OrderTradeRequest` с `ACTION_UNSUBSCRIBE`.
