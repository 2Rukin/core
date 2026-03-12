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
 * Gets or Sets f303CreditPurposeItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum F303CreditPurposeItem {
  
  _1("1"),
  
  _2("2"),
  
  _2_1("2.1"),
  
  _2_2("2.2"),
  
  _2_3("2.3"),
  
  _2_4("2.4"),
  
  _2_5("2.5"),
  
  _2_6("2.6"),
  
  _3("3"),
  
  _4("4"),
  
  _4_1("4.1"),
  
  _4_2("4.2"),
  
  _4_3("4.3"),
  
  _4_4("4.4"),
  
  _4_5("4.5"),
  
  _4_6("4.6"),
  
  _4_7("4.7"),
  
  _4_8("4.8"),
  
  _4_9("4.9"),
  
  _5("5"),
  
  _5_1("5.1"),
  
  _5_2("5.2"),
  
  _5_3("5.3"),
  
  _5_4("5.4"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  _10("10"),
  
  _11("11"),
  
  _12("12"),
  
  _13("13"),
  
  _99("99"),
  
  _0("0");

  private String value;

  F303CreditPurposeItem(String value) {
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
  public static F303CreditPurposeItem fromValue(String value) {
    for (F303CreditPurposeItem b : F303CreditPurposeItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

