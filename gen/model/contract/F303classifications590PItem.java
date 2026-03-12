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
 * Gets or Sets f303classifications590PItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public enum F303classifications590PItem {
  
  _1("1"),
  
  _1_1("1.1"),
  
  _2("2"),
  
  _2_1("2.1"),
  
  _3("3"),
  
  _3_1("3.1"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _6_1("6.1"),
  
  _6_2("6.2"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  _10("10"),
  
  _11("11"),
  
  _11_1("11.1"),
  
  _12("12"),
  
  _12_1("12.1"),
  
  _13("13"),
  
  _13_1("13.1"),
  
  _14("14"),
  
  _15("15"),
  
  _16("16"),
  
  _17("17"),
  
  _0("0"),
  
  _1001("1001");

  private String value;

  F303classifications590PItem(String value) {
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
  public static F303classifications590PItem fromValue(String value) {
    for (F303classifications590PItem b : F303classifications590PItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

