package ru.domrf.elka.cdrd.contract_service.gen.api.tariff;

import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.ErrorResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffListResponse;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffRequest;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffResponse;
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
 * A delegate to be called by the {@link ContractTariffMethodsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.237390300+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public interface ContractTariffMethodsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/contracts/tariff : Создать тариф
     * Создание тарифа
     *
     * @param tariffRqDTO  (required)
     * @return OK (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see ContractTariffMethodsApi#createTariff
     */
    default ResponseEntity<TariffResponse> createTariff(TariffRequest tariffRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : { \"formulaName\" : \"Формула2\", \"helpFileMime\" : \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\", \"externalCode\" : \"ASD-12\", \"helpFileExists\" : false, \"helpFileSizeBytes\" : 255, \"formulaPictureExists\" : false, \"formulaPictureMime\" : \"image/jpeg\", \"isActive\" : true, \"helpFileUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"formulaPictureSizeBytes\" : 52, \"formulaPictureExtension\" : \"jpg\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"formulaPictureUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"helpFileName\" : \"FilePath with Extension to Help File if Exists (COMPLEX FIELD = helpFileUUID + '.' + Extension)\", \"id\" : 1, \"helpFileExtension\" : \"docx\", \"formulaPictureFileName\" : \"111111-2222222222-333333.jpg\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/v1/contracts/tariff/{id} : Удалить тариф
     * Удаление тарифа
     *
     * @param id Идентификатор объекта (required)
     * @return OK (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see ContractTariffMethodsApi#deleteTariff
     */
    default ResponseEntity<TariffResponse> deleteTariff(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : { \"formulaName\" : \"Формула2\", \"helpFileMime\" : \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\", \"externalCode\" : \"ASD-12\", \"helpFileExists\" : false, \"helpFileSizeBytes\" : 255, \"formulaPictureExists\" : false, \"formulaPictureMime\" : \"image/jpeg\", \"isActive\" : true, \"helpFileUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"formulaPictureSizeBytes\" : 52, \"formulaPictureExtension\" : \"jpg\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"formulaPictureUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"helpFileName\" : \"FilePath with Extension to Help File if Exists (COMPLEX FIELD = helpFileUUID + '.' + Extension)\", \"id\" : 1, \"helpFileExtension\" : \"docx\", \"formulaPictureFileName\" : \"111111-2222222222-333333.jpg\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/tariff/{id} : Данные тарифа
     * Получение данных о тарифе
     *
     * @param id Идентификатор объекта (required)
     * @return OK (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see ContractTariffMethodsApi#getTariff
     */
    default ResponseEntity<TariffResponse> getTariff(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : { \"formulaName\" : \"Формула2\", \"helpFileMime\" : \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\", \"externalCode\" : \"ASD-12\", \"helpFileExists\" : false, \"helpFileSizeBytes\" : 255, \"formulaPictureExists\" : false, \"formulaPictureMime\" : \"image/jpeg\", \"isActive\" : true, \"helpFileUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"formulaPictureSizeBytes\" : 52, \"formulaPictureExtension\" : \"jpg\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"formulaPictureUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"helpFileName\" : \"FilePath with Extension to Help File if Exists (COMPLEX FIELD = helpFileUUID + '.' + Extension)\", \"id\" : 1, \"helpFileExtension\" : \"docx\", \"formulaPictureFileName\" : \"111111-2222222222-333333.jpg\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/v1/contracts/tariff/list : Список тарифов
     * Получение списка тарифов
     *
     * @return OK (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see ContractTariffMethodsApi#getTariffList
     */
    default ResponseEntity<TariffListResponse> getTariffList() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"sorting\" : { \"sortType\" : \"ASC\", \"sortBy\" : \"id\" }, \"content\" : [ { \"formulaName\" : \"Формула2\", \"externalCode\" : \"ASD-12\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"helpFileExists\" : false, \"formulaPictureExists\" : false, \"helpFileName\" : \"FilePath with Extension to Help File if Exists\", \"id\" : 0, \"isActive\" : true, \"formulaPictureFileName\" : \"FilePath with Extension to Picture if Exists\" }, { \"formulaName\" : \"Формула2\", \"externalCode\" : \"ASD-12\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"helpFileExists\" : false, \"formulaPictureExists\" : false, \"helpFileName\" : \"FilePath with Extension to Help File if Exists\", \"id\" : 0, \"isActive\" : true, \"formulaPictureFileName\" : \"FilePath with Extension to Picture if Exists\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/v1/contracts/tariff/{id} : Обновить тариф
     * Обновление тарифа
     *
     * @param id Идентификатор объекта (required)
     * @param tariffRqDTO  (required)
     * @return OK (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     * @see ContractTariffMethodsApi#updateTariff
     */
    default ResponseEntity<TariffResponse> updateTariff(Integer id,
        TariffRequest tariffRqDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : { \"formulaName\" : \"Формула2\", \"helpFileMime\" : \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\", \"externalCode\" : \"ASD-12\", \"helpFileExists\" : false, \"helpFileSizeBytes\" : 255, \"formulaPictureExists\" : false, \"formulaPictureMime\" : \"image/jpeg\", \"isActive\" : true, \"helpFileUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"formulaPictureSizeBytes\" : 52, \"formulaPictureExtension\" : \"jpg\", \"tariffName\" : \"RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)\", \"formulaPictureUUID\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"helpFileName\" : \"FilePath with Extension to Help File if Exists (COMPLEX FIELD = helpFileUUID + '.' + Extension)\", \"id\" : 1, \"helpFileExtension\" : \"docx\", \"formulaPictureFileName\" : \"111111-2222222222-333333.jpg\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 1, \"description\" : \"Отсутствуют обязательные параметры\", \"timestamp\" : 1557057600 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
