package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.QualityCategoryValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetQualityCategory
 */

@JsonTypeName("getQualityCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetQualityCategory {

  private Long id;

  private Long dateFrom;

  private Long dateTo;

  private QualityCategoryValue value;

  private UUID byDispositionUuid;

  public GetQualityCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "9874", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetQualityCategory dateFrom(Long dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  
  @Schema(name = "dateFrom", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateFrom")
  public Long getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Long dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetQualityCategory dateTo(Long dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  */
  
  @Schema(name = "dateTo", example = "1567057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTo")
  public Long getDateTo() {
    return dateTo;
  }

  public void setDateTo(Long dateTo) {
    this.dateTo = dateTo;
  }

  public GetQualityCategory value(QualityCategoryValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public QualityCategoryValue getValue() {
    return value;
  }

  public void setValue(QualityCategoryValue value) {
    this.value = value;
  }

  public GetQualityCategory byDispositionUuid(UUID byDispositionUuid) {
    this.byDispositionUuid = byDispositionUuid;
    return this;
  }

  /**
   * Get byDispositionUuid
   * @return byDispositionUuid
  */
  @Valid 
  @Schema(name = "byDispositionUuid", example = "3422b448-2460-4fd2-9183-8000de6f8343", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("byDispositionUuid")
  public UUID getByDispositionUuid() {
    return byDispositionUuid;
  }

  public void setByDispositionUuid(UUID byDispositionUuid) {
    this.byDispositionUuid = byDispositionUuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQualityCategory getQualityCategory = (GetQualityCategory) o;
    return Objects.equals(this.id, getQualityCategory.id) &&
        Objects.equals(this.dateFrom, getQualityCategory.dateFrom) &&
        Objects.equals(this.dateTo, getQualityCategory.dateTo) &&
        Objects.equals(this.value, getQualityCategory.value) &&
        Objects.equals(this.byDispositionUuid, getQualityCategory.byDispositionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateFrom, dateTo, value, byDispositionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQualityCategory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    byDispositionUuid: ").append(toIndentedString(byDispositionUuid)).append("\n");
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

