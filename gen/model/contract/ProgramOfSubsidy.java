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
 * Gets or Sets programOfSubsidy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum ProgramOfSubsidy {
  
  MSP("MSP"),
  
  _629("629"),
  
  TOURISM("TOURISM"),
  
  P68("P68"),
  
  P71("P71"),
  
  P72("P72"),
  
  NOTPART("NOTPART"),
  
  P215("P215"),
  
  P116("P116"),
  
  P125("P125"),
  
  P233("P233"),
  
  ST("ST");

  private String value;

  ProgramOfSubsidy(String value) {
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
  public static ProgramOfSubsidy fromValue(String value) {
    for (ProgramOfSubsidy b : ProgramOfSubsidy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

