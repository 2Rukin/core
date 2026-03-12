package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.AmountType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CommissionType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCommissionPayment;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditCreditCommission
 */

@JsonTypeName("editCreditCommission")
/**
 * DTO EditCreditCommission.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditCreditCommission {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  private CommissionType type;

  private String another;

  private AmountType amountType;

  private String amount;

  private BigDecimal percent;

  private String percentOf;

  @Valid
  private List<@Valid EditCommissionPayment> schedule = new ArrayList<>();

  private UUID uuid;

  public EditCreditCommission id(Long id) {
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

  public EditCreditCommission limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public EditCreditCommission addLimitsItem(UUID limitsItem) {
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

  public EditCreditCommission type(CommissionType type) {
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
  public CommissionType getType() {
    return type;
  }

  public void setType(CommissionType type) {
    this.type = type;
  }

  public EditCreditCommission another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Вид комиссии(иное)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public EditCreditCommission amountType(AmountType amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * Get amountType
   * @return amountType
  */
  @Valid 
  @Schema(name = "amountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountType")
  public AmountType getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountType amountType) {
    this.amountType = amountType;
  }

  public EditCreditCommission amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", example = "100000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public EditCreditCommission percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
  */
  @Valid 
  @Schema(name = "percent", example = "0.0115", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public EditCreditCommission percentOf(String percentOf) {
    this.percentOf = percentOf;
    return this;
  }

  /**
   * Get percentOf
   * @return percentOf
  */
  
  @Schema(name = "percentOf", example = "От суммы сублимита 1.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentOf")
  public String getPercentOf() {
    return percentOf;
  }

  public void setPercentOf(String percentOf) {
    this.percentOf = percentOf;
  }

  public EditCreditCommission schedule(List<@Valid EditCommissionPayment> schedule) {
    this.schedule = schedule;
    return this;
  }

  public EditCreditCommission addScheduleItem(EditCommissionPayment scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @Valid 
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule")
  public List<@Valid EditCommissionPayment> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<@Valid EditCommissionPayment> schedule) {
    this.schedule = schedule;
  }

  public EditCreditCommission uuid(UUID uuid) {
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
    EditCreditCommission editCreditCommission = (EditCreditCommission) o;
    return Objects.equals(this.id, editCreditCommission.id) &&
        Objects.equals(this.limits, editCreditCommission.limits) &&
        Objects.equals(this.type, editCreditCommission.type) &&
        Objects.equals(this.another, editCreditCommission.another) &&
        Objects.equals(this.amountType, editCreditCommission.amountType) &&
        Objects.equals(this.amount, editCreditCommission.amount) &&
        Objects.equals(this.percent, editCreditCommission.percent) &&
        Objects.equals(this.percentOf, editCreditCommission.percentOf) &&
        Objects.equals(this.schedule, editCreditCommission.schedule) &&
        Objects.equals(this.uuid, editCreditCommission.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, type, another, amountType, amount, percent, percentOf, schedule, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditCreditCommission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    percentOf: ").append(toIndentedString(percentOf)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

