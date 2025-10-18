# Trade API v1 Documentation

Этот каталог содержит документацию по gRPC/REST API, определённому в protobuf-файлах репозитория `trade_api/v1`. Каждый раздел описывает отдельный сервис или набор типов, включая доступные методы, REST-маршруты, используемые сообщения и ключевые поля.

- [Аккаунты](accounts.md)
- [Активы](assets.md)
- [Аутентификация](auth.md)
- [Рыночные данные](marketdata.md)
- [Ордеры](orders.md)
- [Общие типы](types.md)

Все сообщения используют типы `google.protobuf.Timestamp`, `google.type.Decimal`, `google.type.Interval`, `google.type.Money` и другие стандартные прото-типы, упомянутые в соответствующих разделах.
