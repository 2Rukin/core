package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditInterestOrderItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditCreditInterestOrder
 */

@JsonTypeName("editCreditInterestOrder")
/**
 * DTO EditCreditInterestOrder.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditCreditInterestOrder {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  @Valid
  private List<@Valid EditInterestOrderItem> interestOrder = new ArrayList<>();

  private String interestPeriod;

  private UUID uuid;

  public EditCreditInterestOrder id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2191", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EditCreditInterestOrder limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public EditCreditInterestOrder addLimitsItem(UUID limitsItem) {
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

  public EditCreditInterestOrder interestOrder(List<@Valid EditInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
    return this;
  }

  public EditCreditInterestOrder addInterestOrderItem(EditInterestOrderItem interestOrderItem) {
    if (this.interestOrder == null) {
      this.interestOrder = new ArrayList<>();
    }
    this.interestOrder.add(interestOrderItem);
    return this;
  }

  /**
   * Get interestOrder
   * @return interestOrder
  */
  @Valid 
  @Schema(name = "interestOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestOrder")
  public List<@Valid EditInterestOrderItem> getInterestOrder() {
    return interestOrder;
  }

  public void setInterestOrder(List<@Valid EditInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
  }

  public EditCreditInterestOrder interestPeriod(String interestPeriod) {
    this.interestPeriod = interestPeriod;
    return this;
  }

  /**
   * Get interestPeriod
   * @return interestPeriod
  */
  
  @Schema(name = "interestPeriod", example = "Процентный период Сублимита 1 до конца года", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestPeriod")
  public String getInterestPeriod() {
    return interestPeriod;
  }

  public void setInterestPeriod(String interestPeriod) {
    this.interestPeriod = interestPeriod;
  }

  public EditCreditInterestOrder uuid(UUID uuid) {
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
    EditCreditInterestOrder editCreditInterestOrder = (EditCreditInterestOrder) o;
    return Objects.equals(this.id, editCreditInterestOrder.id) &&
        Objects.equals(this.limits, editCreditInterestOrder.limits) &&
        Objects.equals(this.interestOrder, editCreditInterestOrder.interestOrder) &&
        Objects.equals(this.interestPeriod, editCreditInterestOrder.interestPeriod) &&
        Objects.equals(this.uuid, editCreditInterestOrder.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, interestOrder, interestPeriod, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditCreditInterestOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    interestOrder: ").append(toIndentedString(interestOrder)).append("\n");
    sb.append("    interestPeriod: ").append(toIndentedString(interestPeriod)).append("\n");
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

