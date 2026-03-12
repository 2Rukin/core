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
 * Gets or Sets commissionType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum CommissionType {
  
  FOR_LIMIT("FOR_LIMIT"),
  
  FOR_EARLY_RETURN("FOR_EARLY_RETURN"),
  
  CHANGE_DATES("CHANGE_DATES"),
  
  CHANGE_ORDER_CALCULATION("CHANGE_ORDER_CALCULATION"),
  
  CHANGE_FINANCIAL_MODEL("CHANGE_FINANCIAL_MODEL"),
  
  CHANGE_TERMS_OF_RC("CHANGE_TERMS_OF_RC"),
  
  COMPREHENSIVE_REWORK("COMPREHENSIVE_REWORK"),
  
  CHANGE_AMOUNT_TERM("CHANGE_AMOUNT_TERM"),
  
  CHANGE_LIST("CHANGE_LIST"),
  
  ANOTHER("ANOTHER");

  private String value;

  CommissionType(String value) {
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
  public static CommissionType fromValue(String value) {
    for (CommissionType b : CommissionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

