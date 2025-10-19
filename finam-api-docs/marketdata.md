# Сервис рыночных данных

`grpc.tradeapi.v1.marketdata.MarketDataService` объединяет запросы исторических и текущих данных, а также потоковые подписки.

## Методы

| RPC | Тип | REST/описание |
| --- | --- | -------------- |
| `Bars` | unary | `GET /v1/instruments/{symbol}/bars` — исторические свечи по символу и таймфрейму. |
| `LastQuote` | unary | `GET /v1/instruments/{symbol}/quotes/latest` — последняя котировка. |
| `OrderBook` | unary | `GET /v1/instruments/{symbol}/orderbook` — текущий стакан. |
| `LatestTrades` | unary | `GET /v1/instruments/{symbol}/trades/latest` — последние сделки. |
| `SubscribeQuote` | server stream | Подписка на поток котировок по списку символов. |
| `SubscribeOrderBook` | server stream | Подписка на поток стаканов по символу. |
| `SubscribeLatestTrades` | server stream | Подписка на последние сделки. |
| `SubscribeBars` | server stream | Подписка на формирование свечей. |

## Запросы

### `BarsRequest`
- `symbol` — тикер инструмента.
- `timeframe` — [`TimeFrame`](#timeframe).
- `interval` — временной диапазон (`google.type.Interval`).

### `QuoteRequest`
- `symbol` — тикер.

### `OrderBookRequest`
- `symbol` — тикер.

### `LatestTradesRequest`
- `symbol` — тикер.

### `SubscribeQuoteRequest`
- `symbols` — список тикеров.

### `SubscribeOrderBookRequest`
- `symbol` — тикер.

### `SubscribeBarsRequest`
- `symbol` — тикер.
- `timeframe` — [`TimeFrame`](#timeframe).

### `SubscribeLatestTradesRequest`
- `symbol` — тикер.

## Ответы

### `BarsResponse`
- `symbol` — тикер.
- `bars` — массив [`Bar`](#bar).

### `QuoteResponse`
- `symbol` — тикер.
- `quote` — объект [`Quote`](#quote).

### `OrderBookResponse`
- `symbol` — тикер.
- `orderbook` — [`OrderBook`](#orderbook).

### `LatestTradesResponse`
- `symbol` — тикер.
- `trades` — массив [`Trade`](#trade).

### `SubscribeQuoteResponse`
- `quote` — поток котировок.
- `error` — [`StreamError`](#streamerror) при проблемах подписки.

### `SubscribeOrderBookResponse`
- `order_book` — поток [`StreamOrderBook`](#streamorderbook).

### `SubscribeBarsResponse`
- `symbol` — тикер.
- `bars` — обновляемые [`Bar`](#bar).

### `SubscribeLatestTradesResponse`
- `symbol` — тикер.
- `trades` — поток сделок [`Trade`](#trade).

## Структуры данных

### `Bar`
- `timestamp` — время свечи (`google.protobuf.Timestamp`).
- `open`, `high`, `low`, `close`, `volume` — значения `google.type.Decimal`.

### `Quote`
- `symbol` — тикер.
- `timestamp` — время котировки.
- `ask`, `ask_size`, `bid`, `bid_size`, `last`, `last_size`, `volume`, `turnover`, `open`, `high`, `low`, `close`, `change` — поля `google.type.Decimal`.
- `option` — дополнительный блок [`Quote.Option`](#quoteoption) для опционов.

#### `Quote.Option`
- `open_interest`, `implied_volatility`, `theoretical_price`, `delta`, `gamma`, `theta`, `vega`, `rho` — опционные греки (`google.type.Decimal`).

### `OrderBook`
- `rows` — массив [`OrderBook.Row`](#orderbookrow).

#### `OrderBook.Row`
- `price`, `sell_size`, `buy_size` — значения `google.type.Decimal`.
- `action` — `ACTION_UNSPECIFIED`, `ACTION_REMOVE`, `ACTION_ADD`, `ACTION_UPDATE`.
- `mpid` — код участника.
- `timestamp` — отметка времени (`google.protobuf.Timestamp`).
- `side` — `SIDE_BUY` или `SIDE_SELL`.

### `Trade`
- `trade_id` — идентификатор сделки.
- `mpid` — участник (опционально).
- `timestamp` — время сделки.
- `price`, `size` — `google.type.Decimal`.
- `side` — [`Side`](types.md#side).

### `StreamOrderBook`
- `symbol` — тикер.
- `rows` — массив [`StreamOrderBook.Row`](#streamorderbookrow) с теми же полями, что и `OrderBook.Row`.

### `StreamError`
- `code` — код ошибки.
- `description` — текстовое описание.

## Перечисления

### `TimeFrame`
`TIME_FRAME_M1`, `M5`, `M15`, `M30`, `H1`, `H2`, `H4`, `H8`, `D`, `W`, `MN`, `QR` и соответствующие `_UNSPECIFIED` значения для отсутствия выбора.
