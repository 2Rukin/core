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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
@Controller
@RequestMapping("${openapi.openAPIForContracts.base-path:}")
public class ApiApiController implements ApiApi {

    private final ApiApiDelegate delegate;

    public ApiApiController(@Autowired(required = false) ApiApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ApiApiDelegate() {});
    }

    @Override
    public ApiApiDelegate getDelegate() {
        return delegate;
    }

}
