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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCommissionPayment;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * CreateCommission
 */

@JsonTypeName("createCommission")
/**
 * DTO CreateCommission.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateCommission {

  private CommissionType type;

  private String another;

  private AmountType amountType;

  private String amount;

  private BigDecimal percent;

  private String percentOf;

  @Valid
  private List<@Valid CreateCommissionPayment> schedule = new ArrayList<>();

  private UUID uuid;

  public CreateCommission type(CommissionType type) {
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

  public CreateCommission another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Вид комиссии (иное)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public CreateCommission amountType(AmountType amountType) {
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

  public CreateCommission amount(String amount) {
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

  public CreateCommission percent(BigDecimal percent) {
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

  public CreateCommission percentOf(String percentOf) {
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

  public CreateCommission schedule(List<@Valid CreateCommissionPayment> schedule) {
    this.schedule = schedule;
    return this;
  }

  public CreateCommission addScheduleItem(CreateCommissionPayment scheduleItem) {
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
  public List<@Valid CreateCommissionPayment> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<@Valid CreateCommissionPayment> schedule) {
    this.schedule = schedule;
  }

  public CreateCommission uuid(UUID uuid) {
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
    CreateCommission createCommission = (CreateCommission) o;
    return Objects.equals(this.type, createCommission.type) &&
        Objects.equals(this.another, createCommission.another) &&
        Objects.equals(this.amountType, createCommission.amountType) &&
        Objects.equals(this.amount, createCommission.amount) &&
        Objects.equals(this.percent, createCommission.percent) &&
        Objects.equals(this.percentOf, createCommission.percentOf) &&
        Objects.equals(this.schedule, createCommission.schedule) &&
        Objects.equals(this.uuid, createCommission.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, another, amountType, amount, percent, percentOf, schedule, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommission {\n");
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

