package ru.domrf.elka.cdrd.contract_service.gen.api.disposition;

import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.CreateDispositionCloseCreditRqDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditDispositionCloseCreditRqDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.EditStatusDispositionCloseCreditRqDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ErrorRsDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetDispositionCloseCreditByIdRsDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ShortDispositionInfo;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
@Controller
@RequestMapping("${openapi.openAPIForDispositions.base-path:}")
public class CloseCreditApiController implements CloseCreditApi {

    private final CloseCreditApiDelegate delegate;

    public CloseCreditApiController(@Autowired(required = false) CloseCreditApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CloseCreditApiDelegate() {});
    }

    @Override
    public CloseCreditApiDelegate getDelegate() {
        return delegate;
    }

}
