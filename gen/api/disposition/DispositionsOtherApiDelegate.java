package ru.domrf.elka.cdrd.contract_service.gen.api.disposition;

import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.CreateDispositionOtherRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditDispositionOtherRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ErrorResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetDispositionOtherByUUIdResponse;
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
 * A delegate to be called by the {@link DispositionsOtherApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface DispositionsOtherApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/dispositions/other : Метод создания распоряжения (тип - \&quot;Универсальное\&quot;)
     * Метод позволяет создать новое распоряжение в системе
     *
     * @param createDispositionOtherRequest  (required)
     * @return Created Успешное выполнение операции. Сущность (распоряжение) создана (status code 201)
     *         or Bad request Ошибка валидации Входные параметры не соответствуют требованиям/условиям Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized Не передан токен авторизации (status code 401)
     *         or Forbidden Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error Недоступность сервера Иные неучтенные ошибки (status code 500)
     * @see DispositionsOtherApi#createDispositionOther
     */
    default ResponseEntity<ShortDispositionInfo> createDispositionOther(CreateDispositionOtherRequest createDispositionOtherRequest) {
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
     * PUT /api/v1/dispositions/other/{id} : Метод изменения распоряжения типа \&quot;Универсальное\&quot;
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @param editDispositionOtherRqDTO  (optional)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Conflict  Некорректный статус распоряжения (status code 409)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsOtherApi#editDispositionOther
     */
    default ResponseEntity<Void> editDispositionOther(UUID id,
        EditDispositionOtherRequest editDispositionOtherRqDTO) {
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
     * GET /api/v1/dispositions/other/{id} : Метод получения детальной информации по распоряжению типа \&quot;Универсальное\&quot;
     *
     * @param id Идентификатор распоряжения businessId (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Распоряжение не найдено (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see DispositionsOtherApi#getDispositionOtherDetailsById
     */
    default ResponseEntity<GetDispositionOtherByUUIdResponse> getDispositionOtherDetailsById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"reason\" : \"Заключение нового кредитного договора\", \"executorId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"authorizedTitle\" : \"authorizedTitle\", \"kindOther\" : \"Что-то, что ввел пользователь\", \"type\" : \"NEW_CREDIT\", \"operationKind\" : \"OP_KIND_CDS\", \"content\" : \"Осуществить списание денежных средств с расчетного счета Заемщика № 40702810600010008971 в размере 100 000, 00 (Сто тысяч 00/100) рублей за каждый день просрочки исполнения обязательства, а именно за 16.03.2021 марта 2021г. по Кредитному договор № 90-024/КЛ-20 от 27.02.2020 г., в связи с наступлением события, указанного в статье 18.4, за нарушение условий п. (e) Cтатьи 17.37 Кредитного договора № 90-024/КЛ-20 от 27.02.2020 г.\", \"contractVersion\" : 0, \"authorizedId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"117ЮЛ-06/2023\", \"executorTitle\" : \"executorTitle\", \"contractId\" : \"566122ae-8862-46e2-b554-e0db518f6dd4\", \"id\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"status\" : \"DRAFT\" }";
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
