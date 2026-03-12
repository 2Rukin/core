package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EditScheduleAvailabilityLimit
 */

@JsonTypeName("editScheduleAvailabilityLimit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class EditScheduleAvailabilityLimit {

  private Long id;

  private String dateFrom;

  private String dateTo;

  private String maxAmountLoanIssued;

  private UUID uuid;

  public EditScheduleAvailabilityLimit id(Long id) {
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

  public EditScheduleAvailabilityLimit dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  
  @Schema(name = "dateFrom", example = "С даты первой выборки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateFrom")
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public EditScheduleAvailabilityLimit dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  */
  
  @Schema(name = "dateTo", example = "По дату окончания РНС (включительно)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTo")
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public EditScheduleAvailabilityLimit maxAmountLoanIssued(String maxAmountLoanIssued) {
    this.maxAmountLoanIssued = maxAmountLoanIssued;
    return this;
  }

  /**
   * Get maxAmountLoanIssued
   * @return maxAmountLoanIssued
  */
  
  @Schema(name = "maxAmountLoanIssued", example = "100000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxAmountLoanIssued")
  public String getMaxAmountLoanIssued() {
    return maxAmountLoanIssued;
  }

  public void setMaxAmountLoanIssued(String maxAmountLoanIssued) {
    this.maxAmountLoanIssued = maxAmountLoanIssued;
  }

  public EditScheduleAvailabilityLimit uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditScheduleAvailabilityLimit editScheduleAvailabilityLimit = (EditScheduleAvailabilityLimit) o;
    return Objects.equals(this.id, editScheduleAvailabilityLimit.id) &&
        Objects.equals(this.dateFrom, editScheduleAvailabilityLimit.dateFrom) &&
        Objects.equals(this.dateTo, editScheduleAvailabilityLimit.dateTo) &&
        Objects.equals(this.maxAmountLoanIssued, editScheduleAvailabilityLimit.maxAmountLoanIssued) &&
        Objects.equals(this.uuid, editScheduleAvailabilityLimit.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateFrom, dateTo, maxAmountLoanIssued, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditScheduleAvailabilityLimit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    maxAmountLoanIssued: ").append(toIndentedString(maxAmountLoanIssued)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

