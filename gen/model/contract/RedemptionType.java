package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
 * Gets or Sets redemptionType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum RedemptionType {
  
  BY_ESCROW("BY_ESCROW"),
  
  BY_SALE("BY_SALE"),
  
  BY_VAT_AND_GUARANTEE("BY_VAT_AND_GUARANTEE"),
  
  BY_CREDIT("BY_CREDIT"),
  
  EARLY_RETURN("EARLY_RETURN"),
  
  BY_VAT("BY_VAT"),
  
  PAYMENTS_BY_GUARANTEES("PAYMENTS_BY_GUARANTEES"),
  
  PRE_PAYMENT("PRE_PAYMENT"),
  
  RETURN_LETTER_OF_CREDIT("RETURN_LETTER_OF_CREDIT"),
  
  RETURN_BY_SALE("RETURN_BY_SALE"),
  
  RETURN_BY_ACCOUNT("RETURN_BY_ACCOUNT"),
  
  RETURN_BY_AUCTION("RETURN_BY_AUCTION"),
  
  RETURN_BY_DKP("RETURN_BY_DKP"),
  
  RETURN_BY_DKPBN("RETURN_BY_DKPBN"),
  
  ANOTHER("ANOTHER");

  private String value;

  RedemptionType(String value) {
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
  public static RedemptionType fromValue(String value) {
    for (RedemptionType b : RedemptionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

