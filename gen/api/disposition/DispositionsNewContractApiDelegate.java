package ru.domrf.elka.cdrd.contract_service.gen.api.disposition;

import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.CreateDispositionNewContractRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.CreateDispositionNewContractResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditDispositionNewCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditStatusDispositionNewCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ErrorResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetDispositionNewContractByIdResponse;
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
 * A delegate to be called by the {@link DispositionsNewContractApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface DispositionsNewContractApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/dispositions/new-credit : Метод создания распоряжения
     *
     * @param createDispositionNewContractRqDTO  (required)
     * @return Операция успешно выполнена. Сущность создана. (status code 201)
     *         or Bad request. Ошибка валидации. Входные параметры не соответствуют требованиям/условиям. (status code 400)
     *         or Доступ запрещен. (status code 401)
     *         or Доступ запрещен. Недостаточно прав. (status code 403)
     *         or Произошла непредвиденная ошибка. (status code 500)
     * @see DispositionsNewContractApi#createDispositionNewContract
     */
    default ResponseEntity<CreateDispositionNewContractResponse> createDispositionNewContract(CreateDispositionNewContractRequest createDispositionNewContractRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"number\" : \"number\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"type\" : \"type\" }";
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
     * DELETE /api/v1/dispositions/new-credit/{id} : Метод удаления распоряжению типа Постановка на Учет КД
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return ОК  Распоряжение ПнУКД удалено. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsNewContractApi#deleteDispositionNewCreditDetailsById
     */
    default ResponseEntity<Void> deleteDispositionNewCreditDetailsById(UUID id) {
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
     * PUT /api/v1/dispositions/new-credit/{id} : Метод изменения распоряжения типа постановка на учет кредитного договора
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @param editDispositionNewCreditRqDTO  (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Conflict  Некорректный статус распоряжения (status code 409)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsNewContractApi#editDispositionNewCredit
     */
    default ResponseEntity<Void> editDispositionNewCredit(UUID id,
        EditDispositionNewCreditRequest editDispositionNewCreditRqDTO) {
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
     * PUT /api/v1/dispositions/new-credit/{id}/status : Метод изменения статуса ДОГОВОРА(Контейнера) распоряжения типа ПнУКД
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @param editStatusDispositionNewCreditRqDTO  (optional)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsNewContractApi#editStatusDispositionNewCredit
     */
    default ResponseEntity<Void> editStatusDispositionNewCredit(UUID id,
        EditStatusDispositionNewCreditRequest editStatusDispositionNewCreditRqDTO) {
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
     * GET /api/v1/dispositions/new-credit/{id} : Метод получения детальной информации о распоряжении по идентификатору (by businessId)
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return Операция успешно выполнена. (status code 200)
     *         or Bad request. Ошибка валидации. Входные параметры не соответствуют требованиям/условиям. (status code 400)
     *         or Доступ запрещен. (status code 401)
     *         or Доступ запрещен. Недостаточно прав. (status code 403)
     *         or Распоряжение не найдено. (status code 404)
     *         or Произошла непредвиденная ошибка. (status code 500)
     * @see DispositionsNewContractApi#getDispositionNewContractById
     */
    default ResponseEntity<GetDispositionNewContractByIdResponse> getDispositionNewContractById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"reason\" : \"Заключение нового кредитного договора\", \"operationDate\" : 1557057600, \"contractDate\" : 1557057600, \"contractClientName\" : \"contractClientName\", \"type\" : \"type\", \"verificationPassed\" : false, \"contractVersion\" : 0, \"content\" : \"content\", \"number\" : \"number\", \"executorTitle\" : \"executorTitle\", \"purposeAfina\" : \"purposeAfina\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastUpdatedTimestamp\" : 1557057600, \"lastUpdatedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdTimestamp\" : 1557057600, \"contractClientInn\" : \"contractClientInn\", \"authorizedTitle\" : \"authorizedTitle\", \"contractNumber\" : \"contractNumber\", \"operationBase\" : \"operationBase\", \"operationKind\" : \"operationKind\", \"authorizedId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractUID\" : \"contractUID\", \"kodRequest\" : \"kodRequest\", \"createdBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\", \"comment\" : \"comment\", \"status\" : \"status\" }";
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
