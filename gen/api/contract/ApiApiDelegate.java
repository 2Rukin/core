package ru.domrf.elka.cdrd.contract_service.gen.api.contract;

import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditVersionRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditContractStatusCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditDispositionTypeCreditByIdAndVersionRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditEventAndAdditional;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditVersionStatusCreditRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.Error;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.FindClientsPostRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAllContractsRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditByIdResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetDictionaryPurposeCreditInner;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.PageFindClients;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.PageGetContractVersions;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.PageGetContracts;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ShortContractInfo;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ShortContractInfoWithClient;
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
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface ApiApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/contracts/credit : Метод создания нового кредитного договора
     * Метод позволяет создать новый кредитный договор в системе
     *
     * @param createCreditRequest  (required)
     * @return Created  Успешное выполнение операции. Сущность (кредитный договор) создана (status code 201)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#createCredit
     */
    default ResponseEntity<ShortContractInfo> createCredit(CreateCreditRequest createCreditRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"contractStatus\" : \"DRAFT\", \"isDifferentVersion\" : true, \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/v1/contracts/credit/new-version : Метод создания новой версии (N&gt;0) кредитного договора
     * Метод позволяет создать новую версию (с номером больше 0) кредитного договора от последней версии в статусе \&quot;Утверждено\&quot;
     *
     * @param createCreditVersionRequest  (required)
     * @return Created  Успешное выполнение операции. Новая версия кредитного договора создана (status code 201)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#createCreditVersion
     */
    default ResponseEntity<ShortContractInfo> createCreditVersion(CreateCreditVersionRequest createCreditVersionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"contractStatus\" : \"DRAFT\", \"isDifferentVersion\" : true, \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/v1/contracts/credit/{id}/{versionNumber} : Метод удаления версии кредитного договора
     * Метод позволяет удалить версию только в статусе DRAFT - по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @return OK  Успешное выполнение операции. Версия КД удалена. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#deleteCreditByIdAndVersion
     */
    default ResponseEntity<Void> deleteCreditByIdAndVersion(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber}/status : Метод обновления СТАТУСА КОНТЕЙНЕРА (версия&#x3D;0) кредитного договора
     * Метод позволяет обновить СТАТУС контейнера (версия&#x3D;0) и произвести сопровождающие действия над КД по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @param editContractStatusCreditRequest  (required)
     * @return OK  Успешное выполнение операции. Статус Контейнера КД обновлен. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#editContractStatusCreditByIdAndVersion
     */
    default ResponseEntity<Void> editContractStatusCreditByIdAndVersion(UUID id,
        Integer versionNumber,
        EditContractStatusCreditRequest editContractStatusCreditRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber} : Метод обновления версии кредитного договора
     * Метод позволяет отредактировать кредитный договор по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @param editCreditRequest  (required)
     * @return OK  Успешное выполнение операции. Кредитный договор обновлен. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#editCreditByIdAndVersion
     */
    default ResponseEntity<Void> editCreditByIdAndVersion(UUID id,
        Integer versionNumber,
        EditCreditRequest editCreditRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber}/disposition-type-changer : Метод смены типа распоряжения на форме кредитного договора ВЕРСИИ (версия&gt;0) кредитного договора
     * Метод позволяет обновить тип распоряжения на форме кредитного договора ВЕРСИИ (версия&gt;0) кредитного договора
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @param editDispositionTypeCreditByIdAndVersionRequest  (optional)
     * @return OK  Успешное выполнение операции. Тип распоряжения КД (версия больше 0) обновлен. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#editDispositionTypeCreditByIdAndVersion
     */
    default ResponseEntity<Void> editDispositionTypeCreditByIdAndVersion(UUID id,
        Integer versionNumber,
        EditDispositionTypeCreditByIdAndVersionRequest editDispositionTypeCreditByIdAndVersionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber}/newFields : Метод обновления полей \&quot;Дата проведение операции\&quot; и \&quot;Справочно\&quot; кредитного договора
     * Метод позволяет обновить поля \&quot;Дата проведение операции\&quot; и \&quot;Справочно\&quot; по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @param editEventAndAdditional  (required)
     * @return OK  Успешное выполнение операции. Поля \&quot;Дата проведение операции\&quot; и \&quot;Справочно\&quot; успешно обновлены. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#editEventAndAdditionalByIdAndVersion
     */
    default ResponseEntity<Void> editEventAndAdditionalByIdAndVersion(UUID id,
        Integer versionNumber,
        EditEventAndAdditional editEventAndAdditional) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber}/version-status : Метод обновления СТАТУСА ВЕРСИИ (версия&gt;0) кредитного договора
     * Метод позволяет обновить СТАТУС версии (версия&gt;0) и произвести сопровождающие действия над КД по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @param editVersionStatusCreditRequest  (required)
     * @return OK  Успешное выполнение операции. Статус Версии КД (версия больше 0) обновлен. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#editVersionStatusCreditByIdAndVersion
     */
    default ResponseEntity<Void> editVersionStatusCreditByIdAndVersion(UUID id,
        Integer versionNumber,
        EditVersionStatusCreditRequest editVersionStatusCreditRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/v1/find-client : Метод получения списка клиентов
     * Метод позволяет получить список уникальных записей клиентов по паре Клиент-ИНН
     *
     * @param findClientsPostRequest  (required)
     * @return OK  Успешное выполнение операции (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#findClient
     */
    default ResponseEntity<PageFindClients> findClient(FindClientsPostRequest findClientsPostRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"limit\" : 6, \"searchKey\" : \"searchKey\", \"currentPage\" : 0, \"content\" : [ { \"inn\" : \"7707123456\", \"client\" : \"ОАО Апельсин\" }, { \"inn\" : \"7707123456\", \"client\" : \"ОАО Апельсин\" } ], \"totalElements\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/v1/contracts/filter : Метод получения списка договоров
     * Метод позволяет получить все договора, получение осуществляется постранично.
     *
     * @param getAllContractsRequest  (required)
     * @return OK  Успешное выполнение операции (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getAllContracts
     */
    default ResponseEntity<PageGetContracts> getAllContracts(GetAllContractsRequest getAllContractsRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"sorting\" : { \"sortType\" : \"DESC\", \"sortBy\" : \"id\" }, \"limit\" : 6, \"currentPage\" : 0, \"filtering\" : { \"date\" : 1557057600, \"number\" : \"90-0\", \"contractStatus\" : \"DRAFT\", \"inn\" : \"7708\", \"client\" : \"Ромаш\", \"type\" : \"UNIVERSAL\", \"versionStatus\" : \"DRAFT\", \"versionNumber\" : 0 }, \"content\" : [ { \"date\" : 1557057600, \"lastUpdatedBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"contractStatus\" : \"DRAFT\", \"lastUpdatedAt\" : 1557057600, \"inn\" : \"7708071234\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"createdAt\" : 1557057600, \"isDifferentVersion\" : true, \"createdBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"client\" : \"ОАО Апельсин\", \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : 1557057600, \"lastUpdatedBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"contractStatus\" : \"DRAFT\", \"lastUpdatedAt\" : 1557057600, \"inn\" : \"7708071234\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"createdAt\" : 1557057600, \"isDifferentVersion\" : true, \"createdBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"client\" : \"ОАО Апельсин\", \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"totalElements\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/credit/{id}/versions/list : Метод получения списка ВЕРСИЙ договора
     * Метод позволяет получить все версии договора.
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @return OK  Успешное выполнение операции (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getContractAllVersions
     */
    default ResponseEntity<PageGetContractVersions> getContractAllVersions(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : [ { \"date\" : 1557057600, \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"contractStatus\" : \"DRAFT\", \"isDifferentVersion\" : true, \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\" }, { \"date\" : 1557057600, \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"contractStatus\" : \"DRAFT\", \"isDifferentVersion\" : true, \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/short/{id}/{versionNumber} : Метод получения короткой информации по любому договору
     * Метод позволяет получить короткую информацию по договору по его id (тип, номер, дата, id клиента)
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Клиент не найден (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getContractShortByIdAndVersion
     */
    default ResponseEntity<ShortContractInfoWithClient> getContractShortByIdAndVersion(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"contractStatus\" : \"DRAFT\", \"inn\" : \"7708071234\", \"unfulfilledObligationsAbsent\" : true, \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"isDifferentVersion\" : true, \"client\" : \"ОАО Апельсин\", \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/short/{id} : Метод получения короткой информации по последней утвержденной версии договора
     * Метод позволяет получить короткую информацию по последней утвержденной версии договора по его id (тип, номер, дата, id клиента)
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Клиент не найден (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getContractShortLastVersionById
     */
    default ResponseEntity<ShortContractInfoWithClient> getContractShortLastVersionById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"contractStatus\" : \"DRAFT\", \"inn\" : \"7708071234\", \"unfulfilledObligationsAbsent\" : true, \"type\" : \"UNIVERSAL\", \"versionNumber\" : 0, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"number\" : \"90-023/КЛ-03S\", \"isDifferentVersion\" : true, \"client\" : \"ОАО Апельсин\", \"baseSmall\" : \"ДС №13\", \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/credit/{id}/{versionNumber} : Метод получения детальной информации по Кредитному договору
     * Метод позволяет получить детальную информацию по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор не найден (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getCreditDetailsByIdAndVersion
     */
    default ResponseEntity<GetCreditByIdResponse> getCreditDetailsByIdAndVersion(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"dispositionType\" : \"ISKD\", \"endDate\" : 1697057600, \"lastUpdatedAt\" : 1557057600, \"unfulfilledObligationsAbsent\" : true, \"type\" : \"UNIVERSAL\", \"creditType\" : \"CREDIT_LINE_WITHDRAWAL_LIMIT\", \"number\" : \"90-05/15-S07\", \"earlyReturns\" : [ { \"amount\" : \"85% от остатков, размещенных на счетах эскроу\", \"another\" : \"Обязательный возврат задолженности\", \"term\" : \"В дату раскрытия счетов эскроу\", \"commission\" : \"Не взимается\", \"id\" : 2191, \"moratorium\" : \"Действует до 20.10.2016\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"85% от остатков, размещенных на счетах эскроу\", \"another\" : \"Обязательный возврат задолженности\", \"term\" : \"В дату раскрытия счетов эскроу\", \"commission\" : \"Не взимается\", \"id\" : 2191, \"moratorium\" : \"Действует до 20.10.2016\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"createdAt\" : 1557057600, \"clientDetails\" : { \"ogrn\" : \"01515480445145\", \"mspType\" : \"MICRO\", \"groupCompanyComposition\" : \"ООО Мандарин (ИНН 7707123456), ЗАО Яблоко (ИНН 7707123789), ООО Банан (ИНН 7707123321)\", \"name\" : \"ОАО Апельсин\", \"inn\" : \"7707121314\", \"additionalInfo\" : \"Дополнительная информация по клиенту отсутствует\", \"kpp\" : \"1236547\", \"groupCompanyName\" : \"ГК Фруктовый сад\", \"id\" : 115, \"registrationAddress\" : \"Москва, Замоскворечная ул, д.1, к.1\", \"type\" : \"LEGAL_ENTITY\" }, \"generalReserves\" : [ { \"financialPosition\" : \"AVERAGE\", \"reserveRate\" : 0.21, \"debtService\" : \"GOOD\", \"qualityCategory\" : \"II\", \"is214\" : true, \"creditEqual\" : \"0.2\", \"id\" : 2191, \"reserveUokh\" : \"Категория качества УОКХ\", \"worthinessLevel\" : \"ENOUGH\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"financialPosition\" : \"AVERAGE\", \"reserveRate\" : 0.21, \"debtService\" : \"GOOD\", \"qualityCategory\" : \"II\", \"is214\" : true, \"creditEqual\" : \"0.2\", \"id\" : 2191, \"reserveUokh\" : \"Категория качества УОКХ\", \"worthinessLevel\" : \"ENOUGH\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"additionalInfo\" : \"Дополнительная информация отсутствует\", \"generalF303s\" : [ { \"periodInterestPayment\" : [ \"5\" ], \"anotherClassification590p\" : \"Обязательный возврат задолженности\", \"changingComponentType\" : [ \"1\", \"99\" ], \"specialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"creditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"periodMainPayment\" : [ \"1\", \"7\" ], \"paymentSource\" : [ \"11\", \"99\" ], \"insuranceType\" : [ \"2\", \"3\" ], \"interestRateType\" : [ \"M\" ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"creditType\" : [ \"1.1\", \"1.2\" ], \"classification590P\" : [ \"2\", \"6.1\" ], \"id\" : 2191, \"interestPeriodPrevious\" : \"-\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"periodInterestPayment\" : [ \"5\" ], \"anotherClassification590p\" : \"Обязательный возврат задолженности\", \"changingComponentType\" : [ \"1\", \"99\" ], \"specialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"creditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"periodMainPayment\" : [ \"1\", \"7\" ], \"paymentSource\" : [ \"11\", \"99\" ], \"insuranceType\" : [ \"2\", \"3\" ], \"interestRateType\" : [ \"M\" ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"creditType\" : [ \"1.1\", \"1.2\" ], \"classification590P\" : [ \"2\", \"6.1\" ], \"id\" : 2191, \"interestPeriodPrevious\" : \"-\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"programOfSubsidy\" : \"629\", \"lastUpdatedBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"subsidyRate\" : \"4,65%\", \"entryDate\" : 1558057600, \"sppiTest\" : \"Y\", \"operationBase\" : \"Дополнительное соглашение № 1 от 31.01.2024 к Кредитному договору № 90-123/КЛ-23 от 15.02.2023\", \"generalPurposes\" : [ { \"purposeStructurers\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"purposeStructurers\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"bkiDate\" : 1558057600, \"creditConveyor\" : false, \"redemptions\" : [ { \"types\" : [ null, null ], \"another\" : \"Обязательный возврат задолженности\", \"description\" : \"Формулировка очередности погашения\", \"id\" : 1991, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"types\" : [ null, null ], \"another\" : \"Обязательный возврат задолженности\", \"description\" : \"Формулировка очередности погашения\", \"id\" : 1991, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"generalPenaltys\" : [ { \"id\" : 2191, \"penaltyPayments\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"id\" : 2191, \"penaltyPayments\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"baseSmall\" : \"ДС №13\", \"versionStatusLastUpdated\" : 1557057600, \"generalPercents\" : [ { \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"interestPeriod\" : \"Процентный период Сублимита 1 до конца года\" }, { \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"interestPeriod\" : \"Процентный период Сублимита 1 до конца года\" } ], \"businessModel\" : \"TO_GET\", \"sublimits\" : true, \"sum\" : 4650000000, \"generalRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"base\" : \"CURRENT\" } ], \"verificationPassed\" : false, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"isDifferentVersion\" : true, \"generalEscrows\" : [ { \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"another\" : \"Формат расчета(иное)\", \"sublimitNumber\" : \"Номер сублимита\", \"id\" : 2191, \"revolverValue\" : 10.15, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"revolverBase\" : \"LIMIT\" }, { \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"another\" : \"Формат расчета(иное)\", \"sublimitNumber\" : \"Номер сублимита\", \"id\" : 2191, \"revolverValue\" : 10.15, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"revolverBase\" : \"LIMIT\" } ], \"generalCommissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 2191, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 2191, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"currency\" : \"RUB\", \"formatRepayment\" : true, \"limits\" : [ { \"interestRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" } ], \"qualityCategory\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9874, \"dateFrom\" : 1557057600, \"value\" : \"II\" }, \"sublimitNumber\" : \"Номер сублимита\", \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"1.1\", \"financialPosition\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9547, \"dateFrom\" : 1557057600, \"value\" : \"AVERAGE\" }, \"f303Classification590P\" : { \"classifications\" : [ \"2\", \"6.1\" ], \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"another\" : \"Обязательный возврат задолженности\", \"dateTo\" : 1567057600, \"id\" : 8456, \"dateFrom\" : 1557057600 }, \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"commissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"is214\" : true, \"additionalInfo\" : \"Комментарий пользователя\", \"id\" : 1023, \"penaltys\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualConditionsReserve\" : true, \"debtService\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6478, \"dateFrom\" : 1557057600, \"value\" : \"GOOD\" }, \"f303InsuranceType\" : [ \"2\", \"3\" ], \"reserveUokh\" : \"Категория качества УОКХ\", \"scheduleAvailability\" : [ { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"individualConditionsInterestOrder\" : true, \"f303PeriodInterestPayment\" : [ \"5\" ], \"individualConditionsInterestRatesCapitalized\" : true, \"isScheduleAvailabilityFinancing\" : false, \"purposes\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"f303InterestPeriodPrevious\" : \"-\", \"status\" : \"DRAFT\", \"termEndDate\" : \"30.06.2026\", \"f303CreditType\" : [ \"1.1\", \"1.2\" ], \"individualConditionsEscrowObjects\" : true, \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"creditEqual\" : \"0.2\", \"another\" : \"Формат расчета(иное)\", \"sum\" : 1250000000.33, \"availability\" : { \"amount\" : 500000000, \"entryDate\" : 1557057600, \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"available\" : \"Y\", \"id\" : 2223 }, \"reserve\" : [ { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"term\" : \"С даты заключения договора по 30.06.2024 или дата окончания инвестиционной фазы\", \"individualConditionsPenaltys\" : true, \"individualConditionsInterestRatesCurrent\" : true, \"f303SpecialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"f303CreditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"f303PeriodMainPayment\" : [ \"1\", \"7\" ], \"f303PaymentSource\" : [ \"11\", \"99\" ], \"individualConditionsPurposes\" : true, \"sumForAccounting\" : 950000000, \"revolverValue\" : 10.15, \"revolverBase\" : \"LIMIT\", \"f303ChangingComponentType\" : [ \"1\", \"99\" ], \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualSchedule\" : true, \"worthinessLevel\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9314, \"dateFrom\" : 1557057600, \"value\" : \"ENOUGH\" }, \"interestPeriod\" : \"Процентный период означает каледарный месяц, при этом (а) Первый процентный период...\", \"f303InterestRateType\" : [ \"M\" ], \"individualConditionsF303\" : true }, { \"interestRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" } ], \"qualityCategory\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9874, \"dateFrom\" : 1557057600, \"value\" : \"II\" }, \"sublimitNumber\" : \"Номер сублимита\", \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"1.1\", \"financialPosition\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9547, \"dateFrom\" : 1557057600, \"value\" : \"AVERAGE\" }, \"f303Classification590P\" : { \"classifications\" : [ \"2\", \"6.1\" ], \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"another\" : \"Обязательный возврат задолженности\", \"dateTo\" : 1567057600, \"id\" : 8456, \"dateFrom\" : 1557057600 }, \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"commissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"is214\" : true, \"additionalInfo\" : \"Комментарий пользователя\", \"id\" : 1023, \"penaltys\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualConditionsReserve\" : true, \"debtService\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6478, \"dateFrom\" : 1557057600, \"value\" : \"GOOD\" }, \"f303InsuranceType\" : [ \"2\", \"3\" ], \"reserveUokh\" : \"Категория качества УОКХ\", \"scheduleAvailability\" : [ { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"individualConditionsInterestOrder\" : true, \"f303PeriodInterestPayment\" : [ \"5\" ], \"individualConditionsInterestRatesCapitalized\" : true, \"isScheduleAvailabilityFinancing\" : false, \"purposes\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"f303InterestPeriodPrevious\" : \"-\", \"status\" : \"DRAFT\", \"termEndDate\" : \"30.06.2026\", \"f303CreditType\" : [ \"1.1\", \"1.2\" ], \"individualConditionsEscrowObjects\" : true, \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"creditEqual\" : \"0.2\", \"another\" : \"Формат расчета(иное)\", \"sum\" : 1250000000.33, \"availability\" : { \"amount\" : 500000000, \"entryDate\" : 1557057600, \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"available\" : \"Y\", \"id\" : 2223 }, \"reserve\" : [ { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"term\" : \"С даты заключения договора по 30.06.2024 или дата окончания инвестиционной фазы\", \"individualConditionsPenaltys\" : true, \"individualConditionsInterestRatesCurrent\" : true, \"f303SpecialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"f303CreditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"f303PeriodMainPayment\" : [ \"1\", \"7\" ], \"f303PaymentSource\" : [ \"11\", \"99\" ], \"individualConditionsPurposes\" : true, \"sumForAccounting\" : 950000000, \"revolverValue\" : 10.15, \"revolverBase\" : \"LIMIT\", \"f303ChangingComponentType\" : [ \"1\", \"99\" ], \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualSchedule\" : true, \"worthinessLevel\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9314, \"dateFrom\" : 1557057600, \"value\" : \"ENOUGH\" }, \"interestPeriod\" : \"Процентный период означает каледарный месяц, при этом (а) Первый процентный период...\", \"f303InterestRateType\" : [ \"M\" ], \"individualConditionsF303\" : true } ], \"contractStatus\" : \"DRAFT\", \"generalSchedules\" : [ { \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"pointOfDirectPayment\" : \"б/н от 10.01.2023\", \"versionNumber\" : 0, \"isLastVersion\" : true, \"agentOfSubsidy\" : \"DOMRF\", \"createdBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"marketTest\" : \"PASSED\", \"eventOperationDate\" : 1557057600, \"accounts\" : [ { \"requisitesOfDirectPayment\" : \"б/н от 10.01.2023\", \"codeOfSubdivision\" : \"0000\", \"id\" : 1991, \"accountNumber\" : \"40702810100000012345\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"requisitesOfDirectPayment\" : \"б/н от 10.01.2023\", \"codeOfSubdivision\" : \"0000\", \"id\" : 1991, \"accountNumber\" : \"40702810100000012345\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"additionalComment\" : \"Требуется пересчитать начисленные проценты по договору\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contract/credit/difference/{id}/{versionNumber} : Метод получения JSON-объекта, содержащего разницу между последней и предпоследней версиями кредитного договора
     * Метод позволяет получить полный перечень всех полей объекта \&quot;Кредитный договор\&quot;, которые были изменены в  последней версии по сравнению с предпоследней (структура, идентичная полной информации по договору) 
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии договора (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор не найден (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getCreditVersionDifference
     */
    default ResponseEntity<String> getCreditVersionDifference(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contract/credit/difference-printer/{id}/{versionNumber} : Метод получения JSON-объекта, содержащего разницу между последней и предпоследней версиями кредитного договора
     * Метод позволяет получить полный перечень всех полей объекта \&quot;Кредитный договор\&quot;, которые были изменены в  последней версии по сравнению с предпоследней (структура, идентичная полной информации по договору) для печати 
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии договора (required)
     * @return ОК  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор не найден (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getCreditVersionDifferenceForPrinter
     */
    default ResponseEntity<GetCreditByIdResponse> getCreditVersionDifferenceForPrinter(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1557057600, \"dispositionType\" : \"ISKD\", \"endDate\" : 1697057600, \"lastUpdatedAt\" : 1557057600, \"unfulfilledObligationsAbsent\" : true, \"type\" : \"UNIVERSAL\", \"creditType\" : \"CREDIT_LINE_WITHDRAWAL_LIMIT\", \"number\" : \"90-05/15-S07\", \"earlyReturns\" : [ { \"amount\" : \"85% от остатков, размещенных на счетах эскроу\", \"another\" : \"Обязательный возврат задолженности\", \"term\" : \"В дату раскрытия счетов эскроу\", \"commission\" : \"Не взимается\", \"id\" : 2191, \"moratorium\" : \"Действует до 20.10.2016\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"85% от остатков, размещенных на счетах эскроу\", \"another\" : \"Обязательный возврат задолженности\", \"term\" : \"В дату раскрытия счетов эскроу\", \"commission\" : \"Не взимается\", \"id\" : 2191, \"moratorium\" : \"Действует до 20.10.2016\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"createdAt\" : 1557057600, \"clientDetails\" : { \"ogrn\" : \"01515480445145\", \"mspType\" : \"MICRO\", \"groupCompanyComposition\" : \"ООО Мандарин (ИНН 7707123456), ЗАО Яблоко (ИНН 7707123789), ООО Банан (ИНН 7707123321)\", \"name\" : \"ОАО Апельсин\", \"inn\" : \"7707121314\", \"additionalInfo\" : \"Дополнительная информация по клиенту отсутствует\", \"kpp\" : \"1236547\", \"groupCompanyName\" : \"ГК Фруктовый сад\", \"id\" : 115, \"registrationAddress\" : \"Москва, Замоскворечная ул, д.1, к.1\", \"type\" : \"LEGAL_ENTITY\" }, \"generalReserves\" : [ { \"financialPosition\" : \"AVERAGE\", \"reserveRate\" : 0.21, \"debtService\" : \"GOOD\", \"qualityCategory\" : \"II\", \"is214\" : true, \"creditEqual\" : \"0.2\", \"id\" : 2191, \"reserveUokh\" : \"Категория качества УОКХ\", \"worthinessLevel\" : \"ENOUGH\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"financialPosition\" : \"AVERAGE\", \"reserveRate\" : 0.21, \"debtService\" : \"GOOD\", \"qualityCategory\" : \"II\", \"is214\" : true, \"creditEqual\" : \"0.2\", \"id\" : 2191, \"reserveUokh\" : \"Категория качества УОКХ\", \"worthinessLevel\" : \"ENOUGH\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"additionalInfo\" : \"Дополнительная информация отсутствует\", \"generalF303s\" : [ { \"periodInterestPayment\" : [ \"5\" ], \"anotherClassification590p\" : \"Обязательный возврат задолженности\", \"changingComponentType\" : [ \"1\", \"99\" ], \"specialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"creditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"periodMainPayment\" : [ \"1\", \"7\" ], \"paymentSource\" : [ \"11\", \"99\" ], \"insuranceType\" : [ \"2\", \"3\" ], \"interestRateType\" : [ \"M\" ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"creditType\" : [ \"1.1\", \"1.2\" ], \"classification590P\" : [ \"2\", \"6.1\" ], \"id\" : 2191, \"interestPeriodPrevious\" : \"-\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"periodInterestPayment\" : [ \"5\" ], \"anotherClassification590p\" : \"Обязательный возврат задолженности\", \"changingComponentType\" : [ \"1\", \"99\" ], \"specialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"creditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"periodMainPayment\" : [ \"1\", \"7\" ], \"paymentSource\" : [ \"11\", \"99\" ], \"insuranceType\" : [ \"2\", \"3\" ], \"interestRateType\" : [ \"M\" ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"creditType\" : [ \"1.1\", \"1.2\" ], \"classification590P\" : [ \"2\", \"6.1\" ], \"id\" : 2191, \"interestPeriodPrevious\" : \"-\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"id\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"programOfSubsidy\" : \"629\", \"lastUpdatedBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"subsidyRate\" : \"4,65%\", \"entryDate\" : 1558057600, \"sppiTest\" : \"Y\", \"operationBase\" : \"Дополнительное соглашение № 1 от 31.01.2024 к Кредитному договору № 90-123/КЛ-23 от 15.02.2023\", \"generalPurposes\" : [ { \"purposeStructurers\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"purposeStructurers\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"bkiDate\" : 1558057600, \"creditConveyor\" : false, \"redemptions\" : [ { \"types\" : [ null, null ], \"another\" : \"Обязательный возврат задолженности\", \"description\" : \"Формулировка очередности погашения\", \"id\" : 1991, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"types\" : [ null, null ], \"another\" : \"Обязательный возврат задолженности\", \"description\" : \"Формулировка очередности погашения\", \"id\" : 1991, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"generalPenaltys\" : [ { \"id\" : 2191, \"penaltyPayments\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"id\" : 2191, \"penaltyPayments\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"baseSmall\" : \"ДС №13\", \"versionStatusLastUpdated\" : 1557057600, \"generalPercents\" : [ { \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"interestPeriod\" : \"Процентный период Сублимита 1 до конца года\" }, { \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"interestPeriod\" : \"Процентный период Сублимита 1 до конца года\" } ], \"businessModel\" : \"TO_GET\", \"sublimits\" : true, \"sum\" : 4650000000, \"generalRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"base\" : \"CURRENT\" } ], \"verificationPassed\" : false, \"versionStatus\" : \"DRAFT\", \"versionOperationDate\" : 1557057600, \"uid\" : \"36f16a79-a998-4419-82da-f2769001713f-C\", \"isDifferentVersion\" : true, \"generalEscrows\" : [ { \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"another\" : \"Формат расчета(иное)\", \"sublimitNumber\" : \"Номер сублимита\", \"id\" : 2191, \"revolverValue\" : 10.15, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"revolverBase\" : \"LIMIT\" }, { \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"another\" : \"Формат расчета(иное)\", \"sublimitNumber\" : \"Номер сублимита\", \"id\" : 2191, \"revolverValue\" : 10.15, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ], \"revolverBase\" : \"LIMIT\" } ], \"generalCommissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 2191, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 2191, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"currency\" : \"RUB\", \"formatRepayment\" : true, \"limits\" : [ { \"interestRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" } ], \"qualityCategory\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9874, \"dateFrom\" : 1557057600, \"value\" : \"II\" }, \"sublimitNumber\" : \"Номер сублимита\", \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"1.1\", \"financialPosition\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9547, \"dateFrom\" : 1557057600, \"value\" : \"AVERAGE\" }, \"f303Classification590P\" : { \"classifications\" : [ \"2\", \"6.1\" ], \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"another\" : \"Обязательный возврат задолженности\", \"dateTo\" : 1567057600, \"id\" : 8456, \"dateFrom\" : 1557057600 }, \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"commissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"is214\" : true, \"additionalInfo\" : \"Комментарий пользователя\", \"id\" : 1023, \"penaltys\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualConditionsReserve\" : true, \"debtService\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6478, \"dateFrom\" : 1557057600, \"value\" : \"GOOD\" }, \"f303InsuranceType\" : [ \"2\", \"3\" ], \"reserveUokh\" : \"Категория качества УОКХ\", \"scheduleAvailability\" : [ { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"individualConditionsInterestOrder\" : true, \"f303PeriodInterestPayment\" : [ \"5\" ], \"individualConditionsInterestRatesCapitalized\" : true, \"isScheduleAvailabilityFinancing\" : false, \"purposes\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"f303InterestPeriodPrevious\" : \"-\", \"status\" : \"DRAFT\", \"termEndDate\" : \"30.06.2026\", \"f303CreditType\" : [ \"1.1\", \"1.2\" ], \"individualConditionsEscrowObjects\" : true, \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"creditEqual\" : \"0.2\", \"another\" : \"Формат расчета(иное)\", \"sum\" : 1250000000.33, \"availability\" : { \"amount\" : 500000000, \"entryDate\" : 1557057600, \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"available\" : \"Y\", \"id\" : 2223 }, \"reserve\" : [ { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"term\" : \"С даты заключения договора по 30.06.2024 или дата окончания инвестиционной фазы\", \"individualConditionsPenaltys\" : true, \"individualConditionsInterestRatesCurrent\" : true, \"f303SpecialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"f303CreditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"f303PeriodMainPayment\" : [ \"1\", \"7\" ], \"f303PaymentSource\" : [ \"11\", \"99\" ], \"individualConditionsPurposes\" : true, \"sumForAccounting\" : 950000000, \"revolverValue\" : 10.15, \"revolverBase\" : \"LIMIT\", \"f303ChangingComponentType\" : [ \"1\", \"99\" ], \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualSchedule\" : true, \"worthinessLevel\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9314, \"dateFrom\" : 1557057600, \"value\" : \"ENOUGH\" }, \"interestPeriod\" : \"Процентный период означает каледарный месяц, при этом (а) Первый процентный период...\", \"f303InterestRateType\" : [ \"M\" ], \"individualConditionsF303\" : true }, { \"interestRates\" : [ { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" }, { \"components\" : [ { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"kind\" : \"WEIGHTED\", \"id\" : 9547, \"type\" : \"SPECIAL\", \"value\" : \"%%=3% + КС ЦБ на дату первой выдачи\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"basePeriod\" : \"MONTHLY\", \"kind\" : \"CAPITALIZED\", \"dateTo\" : \"По дату окончания РНС (включительно)\", \"id\" : 1583, \"type\" : \"WEIGHTED\", \"dateFrom\" : \"С даты первой выборки\", \"value\" : \"Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"base\" : \"CURRENT\" } ], \"qualityCategory\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9874, \"dateFrom\" : 1557057600, \"value\" : \"II\" }, \"sublimitNumber\" : \"Номер сублимита\", \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"number\" : \"1.1\", \"financialPosition\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9547, \"dateFrom\" : 1557057600, \"value\" : \"AVERAGE\" }, \"f303Classification590P\" : { \"classifications\" : [ \"2\", \"6.1\" ], \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"another\" : \"Обязательный возврат задолженности\", \"dateTo\" : 1567057600, \"id\" : 8456, \"dateFrom\" : 1557057600 }, \"purposeAfina\" : { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 3216546 }, \"commissions\" : [ { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amountType\" : \"AMOUNT\", \"schedule\" : [ { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"Не позднее даты первой выборки по сублимиту 1.1\", \"amountType\" : \"AMOUNT\", \"amount\" : 20000, \"id\" : 7423, \"percentOf\" : \"От суммы комиссии\", \"percent\" : 0.3, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"amount\" : \"100000\", \"another\" : \"Вид комиссии (иное)\", \"id\" : 5223, \"type\" : \"FOR_LIMIT\", \"percentOf\" : \"От суммы сублимита 1.1\", \"percent\" : 0.0115, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"is214\" : true, \"additionalInfo\" : \"Комментарий пользователя\", \"id\" : 1023, \"penaltys\" : [ { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"amount\" : \"БС*2, где БС - Базовая ставка = 15,25%\", \"id\" : 6533, \"type\" : \"OVERDUE_CREDIT\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualConditionsReserve\" : true, \"debtService\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6478, \"dateFrom\" : 1557057600, \"value\" : \"GOOD\" }, \"f303InsuranceType\" : [ \"2\", \"3\" ], \"reserveUokh\" : \"Категория качества УОКХ\", \"scheduleAvailability\" : [ { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"dateTo\" : \"По дату окончания РНС (включительно)\", \"maxAmountLoanIssued\" : \"100000.0\", \"id\" : 9874, \"dateFrom\" : \"С даты первой выборки\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"interestOrder\" : [ { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" }, { \"endDate\" : \"По дату окончания Инвестиционной фазы сублимита 1.1\", \"id\" : 4123, \"value\" : \"Начисленные проценты - не оплачиваются, капитализированные проценты - не оплачиваются\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"startDate\" : \"С даты первой выборки\" } ], \"individualConditionsInterestOrder\" : true, \"f303PeriodInterestPayment\" : [ \"5\" ], \"individualConditionsInterestRatesCapitalized\" : true, \"isScheduleAvailabilityFinancing\" : false, \"purposes\" : [ { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"purpose\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 65, \"purposeStructurator\" : { \"name\" : \"Синдикат по 214 ФЗ для эскроу\", \"id\" : 12345 }, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"f303InterestPeriodPrevious\" : \"-\", \"status\" : \"DRAFT\", \"termEndDate\" : \"30.06.2026\", \"f303CreditType\" : [ \"1.1\", \"1.2\" ], \"individualConditionsEscrowObjects\" : true, \"escrowObjects\" : [ { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 }, { \"investmentEndDate\" : \"С даты заключения договора до даты раскрытия счетов эскроу\", \"collateralMinPrices\" : [ { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"sqMtPieceCollateralMinPriceValid\" : 500, \"propertyType\" : \"RESIDENTAL\", \"another\" : \"Тип недвижимости (иное)\", \"collateralMinPriceFormat\" : \"REGULAR\", \"minPrice\" : 100000, \"id\" : 10, \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"ЖК на Замоскворечной\", \"id\" : 2223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"exploitationEntryDate\" : 1557057600 } ], \"creditEqual\" : \"0.2\", \"another\" : \"Формат расчета(иное)\", \"sum\" : 1250000000.33, \"availability\" : { \"amount\" : 500000000, \"entryDate\" : 1557057600, \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"available\" : \"Y\", \"id\" : 2223 }, \"reserve\" : [ { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 6546, \"dateFrom\" : 1557057600, \"type\" : \"RVPS\", \"value\" : 0.21, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"term\" : \"С даты заключения договора по 30.06.2024 или дата окончания инвестиционной фазы\", \"individualConditionsPenaltys\" : true, \"individualConditionsInterestRatesCurrent\" : true, \"f303SpecialConditionCode\" : [ \"K\", \"CH\", \"LZ\" ], \"f303CreditPurpose\" : [ \"2.1\", \"4.1\", \"5\" ], \"f303PeriodMainPayment\" : [ \"1\", \"7\" ], \"f303PaymentSource\" : [ \"11\", \"99\" ], \"individualConditionsPurposes\" : true, \"sumForAccounting\" : 950000000, \"revolverValue\" : 10.15, \"revolverBase\" : \"LIMIT\", \"f303ChangingComponentType\" : [ \"1\", \"99\" ], \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"individualSchedule\" : true, \"worthinessLevel\" : { \"byDispositionUuid\" : \"3422b448-2460-4fd2-9183-8000de6f8343\", \"dateTo\" : 1567057600, \"id\" : 9314, \"dateFrom\" : 1557057600, \"value\" : \"ENOUGH\" }, \"interestPeriod\" : \"Процентный период означает каледарный месяц, при этом (а) Первый процентный период...\", \"f303InterestRateType\" : [ \"M\" ], \"individualConditionsF303\" : true } ], \"contractStatus\" : \"DRAFT\", \"generalSchedules\" : [ { \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] }, { \"schedule\" : [ { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"date\" : \"01.01.2021\", \"amount\" : \"150000000,00\", \"id\" : 3223, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"id\" : 2191, \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\", \"limits\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ] } ], \"pointOfDirectPayment\" : \"б/н от 10.01.2023\", \"versionNumber\" : 0, \"isLastVersion\" : true, \"agentOfSubsidy\" : \"DOMRF\", \"createdBy\" : { \"roles\" : \"Сотрудник ОСКБ, Координатор ОСКБ\", \"id\" : \"4f87d20e-3ac8-4086-86f4-6705ecdc80d6\", \"position\" : \"Генеральный конструктор\", \"login\" : \"s.korolev\", \"department\" : \"Отдел Банковского Обслуживания\", \"fio\" : \"Королев Сергей\", \"email\" : \"elka-bank-oscb@domrf.ru\" }, \"marketTest\" : \"PASSED\", \"eventOperationDate\" : 1557057600, \"accounts\" : [ { \"requisitesOfDirectPayment\" : \"б/н от 10.01.2023\", \"codeOfSubdivision\" : \"0000\", \"id\" : 1991, \"accountNumber\" : \"40702810100000012345\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" }, { \"requisitesOfDirectPayment\" : \"б/н от 10.01.2023\", \"codeOfSubdivision\" : \"0000\", \"id\" : 1991, \"accountNumber\" : \"40702810100000012345\", \"uuid\" : \"36f16a79-a998-4419-82da-f2769001713f\" } ], \"additionalComment\" : \"Требуется пересчитать начисленные проценты по договору\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/dictionary/creditPurpose : Метод получения данных из справочника целей
     * Метод позволяет получить данные из справочника целей
     *
     * @return OK  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getDictionaryPurpose
     */
    default ResponseEntity<List<GetDictionaryPurposeCreditInner>> getDictionaryPurpose() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 12345 }, { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 12345 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/dictionary/creditPurposeAfina : Метод получения данных из справочника целей Новой Афины
     * Метод позволяет получить данные из справочника целей Новой Афины
     *
     * @return OK  Успешное выполнение операции. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#getDictionaryPurposeAfina
     */
    default ResponseEntity<List<GetDictionaryPurposeCreditInner>> getDictionaryPurposeAfina() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 12345 }, { \"name\" : \"Проектное финансирование по 214-ФЗ (эскроу)\", \"id\" : 12345 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/credit/{id}/{versionNumber}/rollback-status : Метод обновления статуса договора-контейнера (Утверждено-&gt;Черновик или Утверждено/Закрыт-&gt;Утверждено)/статуса версии (Утверждено-&gt;Черновик) кредитного договора
     * Метод позволяет обновить статус договора-контейнера (версия&#x3D;0)/статус версии (версия&gt;0) и произвести сопровождающие действия над КД по businessID и versionNumber
     *
     * @param id Бизнес-Идентификатор договора (UUID) (required)
     * @param versionNumber Номер версии (конкретного договора) (required)
     * @return OK  Успешное выполнение операции. Статус версии (версия&gt;0)/договора-контейнера (версия&#x3D;0) КД обновлен. (status code 200)
     *         or Bad request  Ошибка валидации  Входные параметры не соответствуют требованиям/условиям  Некорректный синтаксис запроса (status code 400)
     *         or Unauthorized  Не передан токен авторизации (status code 401)
     *         or Forbidden  Отсутствуют права на выполнение операции (status code 403)
     *         or Not Found  Договор с указанным идентификатором не существует (status code 404)
     *         or Internal Server Error  Недоступность сервера  Иные неучтенные ошибки (status code 500)
     * @see ApiApi#rollbackStatus
     */
    default ResponseEntity<Void> rollbackStatus(UUID id,
        Integer versionNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 5, \"description\" : \"description\", \"fields\" : \"inn,date,sum\", \"techMessage\" : \"techMessage\", \"timestamp\" : 1700584933 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
