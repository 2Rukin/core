package ru.domrf.elka.cdrd.contract_service.gen.api.disposition;

import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionPrintResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ErrorResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetDispositionByContractResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.PageFindDispositionsByNumberResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.PageGetAllDispositionsResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.SearchDispositionByContractRequest;
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
 * A delegate to be called by the {@link DispositionsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface DispositionsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/dispositions/find
     *
     * @param searchKey Имя клиента или инн (required)
     * @param size Размер страницы с элементами (optional, default to 20)
     * @param page Номер страницы (optional, default to 0)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     * @see DispositionsApi#findDispositionByNumber
     */
    default ResponseEntity<PageFindDispositionsByNumberResponse> findDispositionByNumber(String searchKey,
        Integer size,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"limit\" : 20, \"currentPage\" : 0, \"content\" : [ { \"number\" : \"number\", \"id\" : 0, \"type\" : \"type\", \"status\" : \"status\" }, { \"number\" : \"number\", \"id\" : 0, \"type\" : \"type\", \"status\" : \"status\" } ], \"totalElements\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/v1/dispositions : Метод получения списка распоряжений
     * Метод позволяет получить все распоряжения, получение осуществляется постранично.
     *
     * @param getAllDispositionsRqDTO  (required)
     * @return Операция успешно выполнена. (status code 200)
     *         or Bad request. Ошибка валидации. Входные параметры не соответствуют требованиям/условиям. (status code 400)
     *         or Доступ запрещен. (status code 401)
     *         or Доступ запрещен. Недостаточно прав. (status code 403)
     *         or Произошла непредвиденная ошибка. (status code 500)
     * @see DispositionsApi#getAllDispositions
     */
    default ResponseEntity<PageGetAllDispositionsResponse> getAllDispositions(GetAllDispositionsRequest getAllDispositionsRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"sorting\" : { \"sortType\" : \"DESC\", \"sortBy\" : \"id\" }, \"limit\" : 20, \"currentPage\" : 0, \"filtering\" : { \"date\" : 1557057600, \"number\" : \"26-ЮЛ\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"type\" : \"NEW_CREDIT\", \"contractVersion\" : 0, \"status\" : \"DRAFT\" }, \"content\" : [ { \"date\" : 1557057600, \"operationDate\" : 1557057600, \"lastUpdatedTimestamp\" : 1557057600, \"lastUpdatedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractClientName\" : \"contractClientName\", \"createdTimestamp\" : 1557057600, \"contractClientInn\" : \"contractClientInn\", \"authorizedTitle\" : \"authorizedTitle\", \"type\" : \"type\", \"contractVersion\" : 0, \"authorizedId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"number\", \"executorTitle\" : \"executorTitle\", \"createdBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"status\" }, { \"date\" : 1557057600, \"operationDate\" : 1557057600, \"lastUpdatedTimestamp\" : 1557057600, \"lastUpdatedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractClientName\" : \"contractClientName\", \"createdTimestamp\" : 1557057600, \"contractClientInn\" : \"contractClientInn\", \"authorizedTitle\" : \"authorizedTitle\", \"type\" : \"type\", \"contractVersion\" : 0, \"authorizedId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"number\", \"executorTitle\" : \"executorTitle\", \"createdBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contractId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"status\" } ], \"totalElements\" : 20 }";
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
     * GET /api/v1/print/{id} : Метод печати распоряжения
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return Операция успешно выполнена. (status code 200)
     *         or Bad request. Ошибка валидации. Входные параметры не соответствуют требованиям/условиям. (status code 400)
     *         or Доступ запрещен. (status code 401)
     *         or Доступ запрещен. Недостаточно прав. (status code 403)
     *         or Произошла непредвиденная ошибка. (status code 500)
     * @see DispositionsApi#printDisposition
     */
    default ResponseEntity<DispositionPrintResponse> printDisposition(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"file\" : \"file\", \"id\" : \"3422b448-2460-4fd2-9183-8000de6f8343\" }";
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
     * PUT /api/v1/dispositions/{id}/rollback-status : Метод изменения статуса распоряжения (Утверждено-&gt;Черновик)
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsApi#rollbackStatus
     */
    default ResponseEntity<Void> rollbackStatus(UUID id) {
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
     * POST /api/v1/dispositions/search-by-contract
     *
     * @param searchDispositionByContractRqDTO  (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     * @see DispositionsApi#searchDispositionByContractVersion
     */
    default ResponseEntity<GetDispositionByContractResponse> searchDispositionByContractVersion(SearchDispositionByContractRequest searchDispositionByContractRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dispositionId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"code\" : 400, \"description\" : \"Internal Server Error\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
