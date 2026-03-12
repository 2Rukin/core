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
 * CreateScheduleAvailabilityLimit
 */

@JsonTypeName("createScheduleAvailabilityLimit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateScheduleAvailabilityLimit {

  private String dateFrom;

  private String dateTo;

  private String maxAmountLoanIssued;

  private UUID uuid;

  public CreateScheduleAvailabilityLimit dateFrom(String dateFrom) {
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

  public CreateScheduleAvailabilityLimit dateTo(String dateTo) {
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

  public CreateScheduleAvailabilityLimit maxAmountLoanIssued(String maxAmountLoanIssued) {
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

  public CreateScheduleAvailabilityLimit uuid(UUID uuid) {
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
    CreateScheduleAvailabilityLimit createScheduleAvailabilityLimit = (CreateScheduleAvailabilityLimit) o;
    return Objects.equals(this.dateFrom, createScheduleAvailabilityLimit.dateFrom) &&
        Objects.equals(this.dateTo, createScheduleAvailabilityLimit.dateTo) &&
        Objects.equals(this.maxAmountLoanIssued, createScheduleAvailabilityLimit.maxAmountLoanIssued) &&
        Objects.equals(this.uuid, createScheduleAvailabilityLimit.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, maxAmountLoanIssued, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScheduleAvailabilityLimit {\n");
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

