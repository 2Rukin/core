package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DispositionTypeDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum DispositionTypeDTO {
  
  NEW_CREDIT("NEW_CREDIT"),
  
  NEW_GUARANTEE_AGREEMENT("NEW_GUARANTEE_AGREEMENT"),
  
  NEW_GUARANTEE("NEW_GUARANTEE"),
  
  NEW_COLLATERAL("NEW_COLLATERAL"),
  
  CHANGE_CREDIT("CHANGE_CREDIT"),
  
  EDIT_GUARANTEE_AGREEMENT("EDIT_GUARANTEE_AGREEMENT"),
  
  EDIT_GUARANTEE("EDIT_GUARANTEE"),
  
  EDIT_COLLATERAL("EDIT_COLLATERAL"),
  
  EDIT_QUALITY_CATEGORY("EDIT_QUALITY_CATEGORY"),
  
  TERMINATION_CONTRACT("TERMINATION_CONTRACT"),
  
  GETTING_REFUND("GETTING_REFUND"),
  
  REFUND("REFUND"),
  
  ACCOUNTING_TRANSACTION("ACCOUNTING_TRANSACTION"),
  
  LIMIT_AVAILABILITY("LIMIT_AVAILABILITY"),
  
  OTHER("OTHER"),
  
  CLOSE_CREDIT("CLOSE_CREDIT");

  private String value;

  DispositionTypeDTO(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DispositionTypeDTO fromValue(String value) {
    for (DispositionTypeDTO b : DispositionTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

