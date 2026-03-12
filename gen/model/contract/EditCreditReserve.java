package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.DebtServiceValue;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.FinancialPositionValue;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.QualityCategoryValue;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.WorthinessLevelValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EditCreditReserve
 */

@JsonTypeName("editCreditReserve")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class EditCreditReserve {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  private Boolean is214;

  private WorthinessLevelValue worthinessLevel;

  private FinancialPositionValue financialPosition;

  private DebtServiceValue debtService;

  private QualityCategoryValue qualityCategory;

  private BigDecimal reserveRate;

  private String reserveUokh;

  private String creditEqual;

  private UUID uuid;

  public EditCreditReserve id(Long id) {
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

  public EditCreditReserve limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public EditCreditReserve addLimitsItem(UUID limitsItem) {
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

  public EditCreditReserve is214(Boolean is214) {
    this.is214 = is214;
    return this;
  }

  /**
   * Get is214
   * @return is214
  */
  
  @Schema(name = "is214", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is214")
  public Boolean getIs214() {
    return is214;
  }

  public void setIs214(Boolean is214) {
    this.is214 = is214;
  }

  public EditCreditReserve worthinessLevel(WorthinessLevelValue worthinessLevel) {
    this.worthinessLevel = worthinessLevel;
    return this;
  }

  /**
   * Get worthinessLevel
   * @return worthinessLevel
  */
  @Valid 
  @Schema(name = "worthinessLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("worthinessLevel")
  public WorthinessLevelValue getWorthinessLevel() {
    return worthinessLevel;
  }

  public void setWorthinessLevel(WorthinessLevelValue worthinessLevel) {
    this.worthinessLevel = worthinessLevel;
  }

  public EditCreditReserve financialPosition(FinancialPositionValue financialPosition) {
    this.financialPosition = financialPosition;
    return this;
  }

  /**
   * Get financialPosition
   * @return financialPosition
  */
  @Valid 
  @Schema(name = "financialPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("financialPosition")
  public FinancialPositionValue getFinancialPosition() {
    return financialPosition;
  }

  public void setFinancialPosition(FinancialPositionValue financialPosition) {
    this.financialPosition = financialPosition;
  }

  public EditCreditReserve debtService(DebtServiceValue debtService) {
    this.debtService = debtService;
    return this;
  }

  /**
   * Get debtService
   * @return debtService
  */
  @Valid 
  @Schema(name = "debtService", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtService")
  public DebtServiceValue getDebtService() {
    return debtService;
  }

  public void setDebtService(DebtServiceValue debtService) {
    this.debtService = debtService;
  }

  public EditCreditReserve qualityCategory(QualityCategoryValue qualityCategory) {
    this.qualityCategory = qualityCategory;
    return this;
  }

  /**
   * Get qualityCategory
   * @return qualityCategory
  */
  @Valid 
  @Schema(name = "qualityCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qualityCategory")
  public QualityCategoryValue getQualityCategory() {
    return qualityCategory;
  }

  public void setQualityCategory(QualityCategoryValue qualityCategory) {
    this.qualityCategory = qualityCategory;
  }

  public EditCreditReserve reserveRate(BigDecimal reserveRate) {
    this.reserveRate = reserveRate;
    return this;
  }

  /**
   * Get reserveRate
   * @return reserveRate
  */
  @Valid 
  @Schema(name = "reserveRate", example = "0.21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserveRate")
  public BigDecimal getReserveRate() {
    return reserveRate;
  }

  public void setReserveRate(BigDecimal reserveRate) {
    this.reserveRate = reserveRate;
  }

  public EditCreditReserve reserveUokh(String reserveUokh) {
    this.reserveUokh = reserveUokh;
    return this;
  }

  /**
   * Get reserveUokh
   * @return reserveUokh
  */
  
  @Schema(name = "reserveUokh", example = "Категория качества УОКХ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserveUokh")
  public String getReserveUokh() {
    return reserveUokh;
  }

  public void setReserveUokh(String reserveUokh) {
    this.reserveUokh = reserveUokh;
  }

  public EditCreditReserve creditEqual(String creditEqual) {
    this.creditEqual = creditEqual;
    return this;
  }

  /**
   * Get creditEqual
   * @return creditEqual
  */
  
  @Schema(name = "creditEqual", example = "0.2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditEqual")
  public String getCreditEqual() {
    return creditEqual;
  }

  public void setCreditEqual(String creditEqual) {
    this.creditEqual = creditEqual;
  }

  public EditCreditReserve uuid(UUID uuid) {
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
    EditCreditReserve editCreditReserve = (EditCreditReserve) o;
    return Objects.equals(this.id, editCreditReserve.id) &&
        Objects.equals(this.limits, editCreditReserve.limits) &&
        Objects.equals(this.is214, editCreditReserve.is214) &&
        Objects.equals(this.worthinessLevel, editCreditReserve.worthinessLevel) &&
        Objects.equals(this.financialPosition, editCreditReserve.financialPosition) &&
        Objects.equals(this.debtService, editCreditReserve.debtService) &&
        Objects.equals(this.qualityCategory, editCreditReserve.qualityCategory) &&
        Objects.equals(this.reserveRate, editCreditReserve.reserveRate) &&
        Objects.equals(this.reserveUokh, editCreditReserve.reserveUokh) &&
        Objects.equals(this.creditEqual, editCreditReserve.creditEqual) &&
        Objects.equals(this.uuid, editCreditReserve.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, is214, worthinessLevel, financialPosition, debtService, qualityCategory, reserveRate, reserveUokh, creditEqual, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditCreditReserve {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    is214: ").append(toIndentedString(is214)).append("\n");
    sb.append("    worthinessLevel: ").append(toIndentedString(worthinessLevel)).append("\n");
    sb.append("    financialPosition: ").append(toIndentedString(financialPosition)).append("\n");
    sb.append("    debtService: ").append(toIndentedString(debtService)).append("\n");
    sb.append("    qualityCategory: ").append(toIndentedString(qualityCategory)).append("\n");
    sb.append("    reserveRate: ").append(toIndentedString(reserveRate)).append("\n");
    sb.append("    reserveUokh: ").append(toIndentedString(reserveUokh)).append("\n");
    sb.append("    creditEqual: ").append(toIndentedString(creditEqual)).append("\n");
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

