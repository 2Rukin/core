package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.RedemptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateEarlyReturn
 */

@JsonTypeName("createEarlyReturn")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateEarlyReturn {

  private RedemptionType type;

  private String amount;

  private String term;

  private String commission;

  private String moratorium;

  private UUID uuid;

  private String another;

  public CreateEarlyReturn type(RedemptionType type) {
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
  public RedemptionType getType() {
    return type;
  }

  public void setType(RedemptionType type) {
    this.type = type;
  }

  public CreateEarlyReturn amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", example = "85% от остатков, размещенных на счетах эскроу", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CreateEarlyReturn term(String term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   * @return term
  */
  
  @Schema(name = "term", example = "В дату раскрытия счетов эскроу", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public CreateEarlyReturn commission(String commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  */
  
  @Schema(name = "commission", example = "Не взимается", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commission")
  public String getCommission() {
    return commission;
  }

  public void setCommission(String commission) {
    this.commission = commission;
  }

  public CreateEarlyReturn moratorium(String moratorium) {
    this.moratorium = moratorium;
    return this;
  }

  /**
   * Get moratorium
   * @return moratorium
  */
  
  @Schema(name = "moratorium", example = "Действует до 20.10.2016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moratorium")
  public String getMoratorium() {
    return moratorium;
  }

  public void setMoratorium(String moratorium) {
    this.moratorium = moratorium;
  }

  public CreateEarlyReturn uuid(UUID uuid) {
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

  public CreateEarlyReturn another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Обязательный возврат задолженности", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEarlyReturn createEarlyReturn = (CreateEarlyReturn) o;
    return Objects.equals(this.type, createEarlyReturn.type) &&
        Objects.equals(this.amount, createEarlyReturn.amount) &&
        Objects.equals(this.term, createEarlyReturn.term) &&
        Objects.equals(this.commission, createEarlyReturn.commission) &&
        Objects.equals(this.moratorium, createEarlyReturn.moratorium) &&
        Objects.equals(this.uuid, createEarlyReturn.uuid) &&
        Objects.equals(this.another, createEarlyReturn.another);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, term, commission, moratorium, uuid, another);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEarlyReturn {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    moratorium: ").append(toIndentedString(moratorium)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
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

