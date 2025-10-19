# Сервис аутентификации

`grpc.tradeapi.v1.auth.AuthService` управляет выдачей сессионных токенов и информацией о правах доступа к рыночным данным.

## Методы

| RPC | Тип | REST | Назначение |
| --- | --- | ---- | ---------- |
| `Auth` | unary | `POST /v1/sessions:*` | Выпуск токена по секрету клиента. |
| `TokenDetails` | unary | `POST /v1/sessions/details:*` | Получить метаданные выданного токена. |

## Запросы и ответы

### `AuthRequest`
- `secret` — строковый секрет/ключ клиента.

### `AuthResponse`
- `token` — выданный токен авторизации.

### `TokenDetailsRequest`
- `token` — проверяемый токен.

### `TokenDetailsResponse`
- `created_at`, `expires_at` — время выпуска и истечения (`google.protobuf.Timestamp`).
- `md_permissions` — список прав на рыночные данные [`MDPermission`](#mdpermission).
- `account_ids` — список аккаунтов, доступных токену.

## `MDPermission`
- `quote_level` — уровень котировок (`QUOTE_LEVEL_*`).
- `delay_minutes` — задержка распространения данных.
- `mic`, `country`, `continent` — область действия (используются с oneof `condition`).
- `worldwide` — флаг глобальных прав.

### Уровни котировок
`QUOTE_LEVEL_UNSPECIFIED`, `QUOTE_LEVEL_LAST_PRICE`, `QUOTE_LEVEL_BEST_BID_OFFER`, `QUOTE_LEVEL_DEPTH_OF_MARKET`, `QUOTE_LEVEL_DEPTH_OF_BOOK`, `QUOTE_LEVEL_ACCESS_FORBIDDEN`.
