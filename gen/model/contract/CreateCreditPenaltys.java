package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreatePenalty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateCreditPenaltys
 */

@JsonTypeName("createCreditPenaltys")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateCreditPenaltys {

  @Valid
  private List<UUID> limits = new ArrayList<>();

  @Valid
  private List<@Valid CreatePenalty> penaltyPayments = new ArrayList<>();

  private UUID uuid;

  public CreateCreditPenaltys limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public CreateCreditPenaltys addLimitsItem(UUID limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * @return limits
  */
  @Valid 
  @Schema(name = "limits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limits")
  public List<UUID> getLimits() {
    return limits;
  }

  public void setLimits(List<UUID> limits) {
    this.limits = limits;
  }

  public CreateCreditPenaltys penaltyPayments(List<@Valid CreatePenalty> penaltyPayments) {
    this.penaltyPayments = penaltyPayments;
    return this;
  }

  public CreateCreditPenaltys addPenaltyPaymentsItem(CreatePenalty penaltyPaymentsItem) {
    if (this.penaltyPayments == null) {
      this.penaltyPayments = new ArrayList<>();
    }
    this.penaltyPayments.add(penaltyPaymentsItem);
    return this;
  }

  /**
   * Get penaltyPayments
   * @return penaltyPayments
  */
  @Valid 
  @Schema(name = "penaltyPayments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("penaltyPayments")
  public List<@Valid CreatePenalty> getPenaltyPayments() {
    return penaltyPayments;
  }

  public void setPenaltyPayments(List<@Valid CreatePenalty> penaltyPayments) {
    this.penaltyPayments = penaltyPayments;
  }

  public CreateCreditPenaltys uuid(UUID uuid) {
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
    CreateCreditPenaltys createCreditPenaltys = (CreateCreditPenaltys) o;
    return Objects.equals(this.limits, createCreditPenaltys.limits) &&
        Objects.equals(this.penaltyPayments, createCreditPenaltys.penaltyPayments) &&
        Objects.equals(this.uuid, createCreditPenaltys.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, penaltyPayments, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCreditPenaltys {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    penaltyPayments: ").append(toIndentedString(penaltyPayments)).append("\n");
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

