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
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.AmountType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetCommissionPayment
 */

@JsonTypeName("getCommissionPayment")
/**
 * DTO GetCommissionPayment.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetCommissionPayment {

  private Long id;

  private String date;

  private AmountType amountType;

  private BigDecimal amount;

  private BigDecimal percent;

  private String percentOf;

  private UUID uuid;

  public GetCommissionPayment id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "7423", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetCommissionPayment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", example = "Не позднее даты первой выборки по сублимиту 1.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public GetCommissionPayment amountType(AmountType amountType) {
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

  public GetCommissionPayment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", example = "20000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public GetCommissionPayment percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
  */
  @Valid 
  @Schema(name = "percent", example = "0.3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public GetCommissionPayment percentOf(String percentOf) {
    this.percentOf = percentOf;
    return this;
  }

  /**
   * Get percentOf
   * @return percentOf
  */
  
  @Schema(name = "percentOf", example = "От суммы комиссии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentOf")
  public String getPercentOf() {
    return percentOf;
  }

  public void setPercentOf(String percentOf) {
    this.percentOf = percentOf;
  }

  public GetCommissionPayment uuid(UUID uuid) {
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
    GetCommissionPayment getCommissionPayment = (GetCommissionPayment) o;
    return Objects.equals(this.id, getCommissionPayment.id) &&
        Objects.equals(this.date, getCommissionPayment.date) &&
        Objects.equals(this.amountType, getCommissionPayment.amountType) &&
        Objects.equals(this.amount, getCommissionPayment.amount) &&
        Objects.equals(this.percent, getCommissionPayment.percent) &&
        Objects.equals(this.percentOf, getCommissionPayment.percentOf) &&
        Objects.equals(this.uuid, getCommissionPayment.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amountType, amount, percent, percentOf, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommissionPayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    percentOf: ").append(toIndentedString(percentOf)).append("\n");
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

