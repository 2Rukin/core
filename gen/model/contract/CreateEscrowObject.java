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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateLimitCollateralMinPrice;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateEscrowObject
 */

@JsonTypeName("createEscrowObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateEscrowObject {

  private String name;

  private Long exploitationEntryDate;

  private String investmentEndDate;

  @Valid
  private List<@Valid CreateLimitCollateralMinPrice> collateralMinPrices = new ArrayList<>();

  private UUID uuid;

  public CreateEscrowObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "ЖК на Замоскворечной", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateEscrowObject exploitationEntryDate(Long exploitationEntryDate) {
    this.exploitationEntryDate = exploitationEntryDate;
    return this;
  }

  /**
   * Get exploitationEntryDate
   * @return exploitationEntryDate
  */
  
  @Schema(name = "exploitationEntryDate", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exploitationEntryDate")
  public Long getExploitationEntryDate() {
    return exploitationEntryDate;
  }

  public void setExploitationEntryDate(Long exploitationEntryDate) {
    this.exploitationEntryDate = exploitationEntryDate;
  }

  public CreateEscrowObject investmentEndDate(String investmentEndDate) {
    this.investmentEndDate = investmentEndDate;
    return this;
  }

  /**
   * Get investmentEndDate
   * @return investmentEndDate
  */
  
  @Schema(name = "investmentEndDate", example = "С даты заключения договора до даты раскрытия счетов эскроу", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("investmentEndDate")
  public String getInvestmentEndDate() {
    return investmentEndDate;
  }

  public void setInvestmentEndDate(String investmentEndDate) {
    this.investmentEndDate = investmentEndDate;
  }

  public CreateEscrowObject collateralMinPrices(List<@Valid CreateLimitCollateralMinPrice> collateralMinPrices) {
    this.collateralMinPrices = collateralMinPrices;
    return this;
  }

  public CreateEscrowObject addCollateralMinPricesItem(CreateLimitCollateralMinPrice collateralMinPricesItem) {
    if (this.collateralMinPrices == null) {
      this.collateralMinPrices = new ArrayList<>();
    }
    this.collateralMinPrices.add(collateralMinPricesItem);
    return this;
  }

  /**
   * Get collateralMinPrices
   * @return collateralMinPrices
  */
  @Valid 
  @Schema(name = "collateralMinPrices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collateralMinPrices")
  public List<@Valid CreateLimitCollateralMinPrice> getCollateralMinPrices() {
    return collateralMinPrices;
  }

  public void setCollateralMinPrices(List<@Valid CreateLimitCollateralMinPrice> collateralMinPrices) {
    this.collateralMinPrices = collateralMinPrices;
  }

  public CreateEscrowObject uuid(UUID uuid) {
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
    CreateEscrowObject createEscrowObject = (CreateEscrowObject) o;
    return Objects.equals(this.name, createEscrowObject.name) &&
        Objects.equals(this.exploitationEntryDate, createEscrowObject.exploitationEntryDate) &&
        Objects.equals(this.investmentEndDate, createEscrowObject.investmentEndDate) &&
        Objects.equals(this.collateralMinPrices, createEscrowObject.collateralMinPrices) &&
        Objects.equals(this.uuid, createEscrowObject.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, exploitationEntryDate, investmentEndDate, collateralMinPrices, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEscrowObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exploitationEntryDate: ").append(toIndentedString(exploitationEntryDate)).append("\n");
    sb.append("    investmentEndDate: ").append(toIndentedString(investmentEndDate)).append("\n");
    sb.append("    collateralMinPrices: ").append(toIndentedString(collateralMinPrices)).append("\n");
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

