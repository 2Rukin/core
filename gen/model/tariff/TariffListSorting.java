package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TariffListSorting
 */

@JsonTypeName("tariffListSorting")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.237390300+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class TariffListSorting {

  /**
   * Параметр для сортировки
   */
  public enum SortByEnum {
    ID("id"),
    
    NAME("name");

    private String value;

    SortByEnum(String value) {
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
    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SortByEnum sortBy;

  /**
   * Порядок сортировки
   */
  public enum SortTypeEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortTypeEnum(String value) {
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
    public static SortTypeEnum fromValue(String value) {
      for (SortTypeEnum b : SortTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SortTypeEnum sortType;

  public TariffListSorting() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffListSorting(SortByEnum sortBy, SortTypeEnum sortType) {
    this.sortBy = sortBy;
    this.sortType = sortType;
  }

  public TariffListSorting sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Параметр для сортировки
   * @return sortBy
  */
  @NotNull 
  @Schema(name = "sortBy", description = "Параметр для сортировки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }

  public TariffListSorting sortType(SortTypeEnum sortType) {
    this.sortType = sortType;
    return this;
  }

  /**
   * Порядок сортировки
   * @return sortType
  */
  @NotNull 
  @Schema(name = "sortType", description = "Порядок сортировки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sortType")
  public SortTypeEnum getSortType() {
    return sortType;
  }

  public void setSortType(SortTypeEnum sortType) {
    this.sortType = sortType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffListSorting tariffListSorting = (TariffListSorting) o;
    return Objects.equals(this.sortBy, tariffListSorting.sortBy) &&
        Objects.equals(this.sortType, tariffListSorting.sortType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffListSorting {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

