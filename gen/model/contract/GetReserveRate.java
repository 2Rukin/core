package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ReserveRateType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetReserveRate
 */

@JsonTypeName("getReserveRate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetReserveRate {

  private Long id;

  private Long dateFrom;

  private Long dateTo;

  private ReserveRateType type;

  private BigDecimal value;

  private UUID byDispositionUuid;

  private UUID uuid;

  public GetReserveRate id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "6546", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetReserveRate dateFrom(Long dateFrom) {
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

  public GetReserveRate dateTo(Long dateTo) {
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

  public GetReserveRate type(ReserveRateType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public ReserveRateType getType() {
    return type;
  }

  public void setType(ReserveRateType type) {
    this.type = type;
  }

  public GetReserveRate value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", example = "0.21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetReserveRate byDispositionUuid(UUID byDispositionUuid) {
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

  public GetReserveRate uuid(UUID uuid) {
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
    GetReserveRate getReserveRate = (GetReserveRate) o;
    return Objects.equals(this.id, getReserveRate.id) &&
        Objects.equals(this.dateFrom, getReserveRate.dateFrom) &&
        Objects.equals(this.dateTo, getReserveRate.dateTo) &&
        Objects.equals(this.type, getReserveRate.type) &&
        Objects.equals(this.value, getReserveRate.value) &&
        Objects.equals(this.byDispositionUuid, getReserveRate.byDispositionUuid) &&
        Objects.equals(this.uuid, getReserveRate.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateFrom, dateTo, type, value, byDispositionUuid, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReserveRate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    byDispositionUuid: ").append(toIndentedString(byDispositionUuid)).append("\n");
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

