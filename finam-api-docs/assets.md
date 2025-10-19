# Сервис активов

`grpc.tradeapi.v1.assets.AssetsService` предоставляет доступ к справочной информации по инструментам, расписаниям торгов и параметрам маржинальности.

## Методы

| RPC | Тип | REST | Назначение |
| --- | --- | ---- | ---------- |
| `Exchanges` | unary | `GET /v1/exchanges` | Получить список бирж (MIC и название). |
| `Assets` | unary | `GET /v1/assets` | Получить каталог инструментов. |
| `GetAsset` | unary | `GET /v1/assets/{symbol}` | Получить подробности по инструменту. |
| `GetAssetParams` | unary | `GET /v1/assets/{symbol}/params` | Получить параметры допуска к маржинальной торговле. |
| `OptionsChain` | unary | `GET /v1/assets/{underlying_symbol}/options` | Получить опционную доску для базового актива. |
| `Schedule` | unary | `GET /v1/assets/{symbol}/schedule` | Получить расписание торговых сессий. |
| `Clock` | unary | `GET /v1/assets/clock` | Получить текущее время торговой системы. |

## Запросы

### `AssetsRequest`
Запрос без параметров, возвращающий полный список активов.

### `GetAssetRequest`
- `symbol` — тикер инструмента.
- `account_id` — опциональный идентификатор аккаунта.

### `GetAssetParamsRequest`
- `symbol` — тикер.
- `account_id` — идентификатор аккаунта.

### `OptionsChainRequest`
- `underlying_symbol` — тикер базового актива.

### `ScheduleRequest`
- `symbol` — тикер инструмента.

### `ClockRequest`
Запрос без параметров для получения времени.

## Ответы

### `ExchangesResponse`
- `exchanges` — массив [`Exchange`](#exchange).

### `AssetsResponse`
- `assets` — массив [`Asset`](#asset).

### `GetAssetResponse`
- `board`, `id`, `ticker`, `mic`, `isin`, `type`, `name` — идентификационные атрибуты.
- `lot_size` — размер лота (`google.type.Decimal`).
- `decimals` — количество знаков после запятой для цены.
- `min_step` — минимальный шаг цены (целое число).
- `expiration_date` — дата экспирации (для деривативов, `google.type.Date`).

### `GetAssetParamsResponse`
- `symbol`, `account_id`, `tradeable` — общая информация.
- `longable` — объект [`Longable`](#longable).
- `shortable` — объект [`Shortable`](#shortable).
- `long_risk_rate`, `short_risk_rate` — коэффициенты риска (`google.type.Decimal`).
- `long_collateral`, `short_collateral` — требуемое обеспечение (`google.type.Money`).

### `OptionsChainResponse`
- `symbol` — тикер базового актива.
- `options` — массив [`Option`](#option).

### `ScheduleResponse`
- `symbol` — тикер.
- `sessions` — массив `Sessions`:
  - `type` — тип сессии (строка).
  - `interval` — временной интервал (`google.type.Interval`).

### `ClockResponse`
- `timestamp` — текущее время торговой системы (`google.protobuf.Timestamp`).

## Справочные типы

### `Exchange`
- `mic` — идентификатор биржи.
- `name` — название.

### `Asset`
- `symbol`, `id`, `ticker`, `mic`, `isin`, `type`, `name` — идентификаторы.

### `Option`
- `symbol` — тикер опциона.
- `type` — перечисление `TYPE_CALL`, `TYPE_PUT`.
- `contract_size`, `strike`, `multiplier` — параметры контракта (`google.type.Decimal`).
- `trade_first_day`, `trade_last_day`, `expiration_first_day`, `expiration_last_day` — ключевые даты (`google.type.Date`).

### `Longable`
- `value` — статус (`NOT_AVAILABLE`, `AVAILABLE`, `ACCOUNT_NOT_APPROVED`).
- `halted_days` — дни приостановки.

### `Shortable`
- `value` — статус (`NOT_AVAILABLE`, `AVAILABLE`, `HTB`, `ACCOUNT_NOT_APPROVED`, `AVAILABLE_STRATEGY`).
- `halted_days` — дни приостановки.

## Используемые типы
- Денежные значения представлены через `google.type.Decimal` и `google.type.Money`.
- Даты — `google.type.Date`.
- Интервалы — `google.type.Interval`.
- Временные метки — `google.protobuf.Timestamp`.
