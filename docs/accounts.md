# Сервис аккаунтов

Сервис `grpc.tradeapi.v1.accounts.AccountsService` предоставляет операции для получения информации об аккаунтах, торговой истории и финансовых транзакциях. gRPC-методы имеют REST-отражения (Google API HTTP annotations).

## Методы

| RPC | Тип | REST | Назначение |
| --- | --- | ---- | ---------- |
| `GetAccount` | unary | `GET /v1/accounts/{account_id}` | Получить агрегированную информацию по конкретному аккаунту. |
| `Trades` | unary | `GET /v1/accounts/{account_id}/trades` | Возвращает сделки аккаунта за указанный интервал. |
| `Transactions` | unary | `GET /v1/accounts/{account_id}/transactions` | Возвращает финансовые транзакции аккаунта. |

## Сообщения запросов

### `GetAccountRequest`
- `account_id` — идентификатор аккаунта.

### `TradesRequest`
- `account_id` — идентификатор аккаунта.
- `limit` — максимальное число записей в ответе.
- `interval` — временной интервал (`google.type.Interval`).

### `TransactionsRequest`
- `account_id` — идентификатор аккаунта.
- `limit` — ограничение на количество транзакций.
- `interval` — временной интервал (`google.type.Interval`).

## Сообщения ответов

### `GetAccountResponse`
- `account_id` — идентификатор аккаунта.
- `type` — строковый тип аккаунта.
- `status` — текущий статус аккаунта.
- `equity` — оценка капитала (`google.type.Decimal`).
- `unrealized_profit` — нереализованная прибыль (`google.type.Decimal`).
- `positions` — массив позиций [`Position`](#position).
- `cash` — список валютных остатков (`google.type.Money`).
- `portfolio_mc` — показатели портфеля для гарантийного обеспечения Московской биржи [`MC`](#mc).
- `portfolio_mct` — показатели портфеля для срочного рынка [`MCT`](#mct).
- `portfolio_forts` — показатели для срочного рынка FORTS [`FORTS`](#forts).

### `TradesResponse`
- `trades` — список сделок [`grpc.tradeapi.v1.AccountTrade`](types.md#accounttrade).

### `TransactionsResponse`
- `transactions` — массив [`Transaction`](#transaction).

## Структуры данных

### `Position`
- `symbol` — тикер инструмента.
- `quantity` — позиция (`google.type.Decimal`).
- `average_price` — средняя цена входа (`google.type.Decimal`).
- `current_price` — текущая рыночная цена (`google.type.Decimal`).
- `maintenance_margin` — требуемое гарантийное обеспечение (`google.type.Decimal`).
- `daily_pnl` — дневной P&L (`google.type.Decimal`).
- `unrealized_pnl` — нереализованный P&L (`google.type.Decimal`).

### `MC`
- `available_cash` — доступный денежный остаток (`google.type.Decimal`).
- `initial_margin` — требуемое начальное ГО (`google.type.Decimal`).
- `maintenance_margin` — требуемое поддерживающее ГО (`google.type.Decimal`).

### `MCT`
Тип-заглушка для кастомных расчётов по срочному рынку (поля отсутствуют в текущей версии протокола).

### `FORTS`
- `available_cash` — доступные средства (`google.type.Decimal`).
- `money_reserved` — зарезервированные средства (`google.type.Decimal`).

### `Transaction`
- `id` — идентификатор транзакции.
- `category` — строковая категория.
- `timestamp` — время события (`google.protobuf.Timestamp`).
- `symbol` — тикер.
- `change` — денежное изменение (`google.type.Money`).
- `trade` — вложенная структура [`Transaction.Trade`](#transactiontrade).
- `transaction_category` — перечисление [`TransactionCategory`](#transactioncategory).
- `transaction_name` — описание операции.

#### `Transaction.Trade`
- `size` — объём (`google.type.Decimal`).
- `price` — цена (`google.type.Decimal`).
- `accrued_interest` — начисленные проценты (`google.type.Decimal`).

#### `TransactionCategory`
`OTHERS`, `DEPOSIT`, `WITHDRAW`, `INCOME`, `COMMISSION`, `TAX`, `INHERITANCE`, `TRANSFER`, `CONTRACT_TERMINATION`, `OUTCOMES`, `FINE`, `LOAN`.

## Используемые типы
- Денежные поля используют `google.type.Decimal` или `google.type.Money`.
- Временные метки представлены через `google.protobuf.Timestamp`.
- Торговые записи используют перечисление [`Side`](types.md#side) для направления сделки.
