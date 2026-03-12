package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.LimitAvailable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EditLimitAvailability
 */

@JsonTypeName("editLimitAvailability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class EditLimitAvailability {

  private Long id;

  private LimitAvailable available;

  private BigDecimal amount;

  public EditLimitAvailability id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2223", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EditLimitAvailability available(LimitAvailable available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  */
  @Valid 
  @Schema(name = "available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available")
  public LimitAvailable getAvailable() {
    return available;
  }

  public void setAvailable(LimitAvailable available) {
    this.available = available;
  }

  public EditLimitAvailability amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", example = "500000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditLimitAvailability editLimitAvailability = (EditLimitAvailability) o;
    return Objects.equals(this.id, editLimitAvailability.id) &&
        Objects.equals(this.available, editLimitAvailability.available) &&
        Objects.equals(this.amount, editLimitAvailability.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, available, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLimitAvailability {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

