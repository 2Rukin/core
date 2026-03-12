package ru.domrf.elka.cdrd.contract_service.gen.api.disposition;

import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.CreateDispositionChangeCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditDispositionChangeCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditStatusDispositionChangeCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ErrorResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetDispositionChangeCreditByIdResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ShortDispositionInfo;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link ChangeCreditApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface ChangeCreditApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/dispositions/change-credit : Метод создания распоряжения (тип - \&quot;Изменение статей Кредитного договора\&quot;)
     * Метод позволяет создать новое распоряжение в системе
     *
     * @param createDispositionChangeCreditRqDTO  (required)
     * @return Created Успешное выполнение операции. Сущность (распоряжение) создана (status code 201)
     *         or Bad request Ошибка валидации Входные параметры не соответствуют требованиям/условиям Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized Не передан токен авторизации (status code 401)
     *         or Forbidden Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error Недоступность сервера Иные неучтенные ошибки (status code 500)
     * @see ChangeCreditApi#createDispositionChangeCredit
     */
    default ResponseEntity<ShortDispositionInfo> createDispositionChangeCredit(CreateDispositionChangeCreditRequest createDispositionChangeCreditRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1651057600, \"number\" : \"117ЮЛ-06/2023\", \"id\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"type\" : \"NEW_CREDIT\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/v1/dispositions/change-credit/{id} : Метод удаления распоряжению типа Изменение статей Кредитного договора
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return ОК  Распоряжение ИСКД удалено. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ChangeCreditApi#deleteDispositionChangeCreditDetailsById
     */
    default ResponseEntity<Void> deleteDispositionChangeCreditDetailsById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/dispositions/change-credit/{id} : Метод получения изменения распоряжения типа ИСКД
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @param editDispositionChangeCreditRqDTO  (optional)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ChangeCreditApi#editDispositionChangeCredit
     */
    default ResponseEntity<Void> editDispositionChangeCredit(UUID id,
        EditDispositionChangeCreditRequest editDispositionChangeCreditRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/dispositions/change-credit/{id}/status : Метод изменения статуса Версии Договора распоряжения типа ИСКД
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @param editStatusDispositionChangeCreditRqDTO  (optional)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ChangeCreditApi#editStatusDispositionChangeCredit
     */
    default ResponseEntity<Void> editStatusDispositionChangeCredit(UUID id,
        EditStatusDispositionChangeCreditRequest editStatusDispositionChangeCreditRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/dispositions/change-credit/{id} : Метод получения детальной информации по распоряжению типа Изменение статей Кредитного договора
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ChangeCreditApi#getDispositionChangeCreditDetailsById
     */
    default ResponseEntity<GetDispositionChangeCreditByIdResponse> getDispositionChangeCreditDetailsById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"operationDate\" : 1557057600, \"contractDate\" : 1557057600, \"contractClientName\" : \"contractClientName\", \"contractType\" : \"contractType\", \"type\" : \"NEW_CREDIT\", \"verificationPassed\" : false, \"contractVersion\" : 0, \"content\" : \"content\", \"number\" : \"number\", \"executorTitle\" : \"executorTitle\", \"purposeAfina\" : \"purposeAfina\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastUpdatedTimestamp\" : 1557057600, \"lastUpdatedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdTimestamp\" : 1557057600, \"contractClientInn\" : \"contractClientInn\", \"authorizedTitle\" : \"authorizedTitle\", \"contractNumber\" : \"contractNumber\", \"operationBase\" : \"operationBase\", \"authorizedId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractUID\" : \"contractUID\", \"kodRequest\" : \"kodRequest\", \"createdBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\", \"operationType\" : \"operationType\", \"comment\" : \"comment\", \"eventOperationDate\" : 1557057600, \"additionalComment\" : \"Требуется пересчитать начисленные проценты по договору\", \"status\" : \"DRAFT\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
