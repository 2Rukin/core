# Общие типы

Этот раздел описывает типы, используемые несколькими сервисами.

## `grpc.tradeapi.v1.AccountTrade`
Определяется в `grpc/tradeapi/v1/trade.proto` и используется в сервисах аккаунтов и ордеров.

Поля:
- `trade_id` — идентификатор сделки.
- `symbol` — тикер инструмента.
- `price` — цена (`google.type.Decimal`).
- `size` — объём (`google.type.Decimal`).
- `side` — направление [`Side`](#side).
- `timestamp` — время сделки (`google.protobuf.Timestamp`).
- `order_id` — связанный ордер.
- `account_id` — идентификатор аккаунта.

## `grpc.tradeapi.v1.Side`
Перечисление направлений сделок и ордеров.
- `SIDE_UNSPECIFIED` — значение по умолчанию.
- `SIDE_BUY` — покупка.
- `SIDE_SELL` — продажа.
