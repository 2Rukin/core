package ru.application.auth;

import jakarta.validation.constraints.NotNull;


/**
 * Контракт для компонента, предоставляющего валидный JWT-токен авторизации.
 * <p>
 * Реализация отвечает за обмен секрета на токен и его ротацию при истечении срока действия
 * либо при получении ошибки аутентификации от сервера.
 */
public interface AuthTokenProvider {

    /**
     * Возвращает текущий валидный JWT-токен.
     *
     * @return строка вида {@code eyJhbGciOi...}; не {@code null}
     */
    @NotNull
    String getCurrentJwtToken();

    /**
     * Явно инициирует обновление токена (например, после получения ответа {@code UNAUTHENTICATED}).
     * <p>
     * Метод блокирующий; после завершения вызова новый токен должен быть доступен через {@link #getCurrentJwtToken()}.
     */
    void forceRefresh();
}
