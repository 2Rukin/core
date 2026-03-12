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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303ChangingComponentTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditPurposeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InsuranceTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InterestRateTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PaymentSourceItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodInterestPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodMainPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303SpecialConditionCodeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303classifications590PItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetCreditF303
 */

@JsonTypeName("getCreditF303")
/**
 * DTO GetCreditF303.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetCreditF303 {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  @Valid
  private List<F303CreditTypeItem> creditType = new ArrayList<>();

  @Valid
  private List<F303CreditPurposeItem> creditPurpose = new ArrayList<>();

  @Valid
  private List<F303InterestRateTypeItem> interestRateType = new ArrayList<>();

  private String interestPeriodPrevious;

  @Valid
  private List<F303ChangingComponentTypeItem> changingComponentType = new ArrayList<>();

  @Valid
  private List<F303PeriodMainPaymentItem> periodMainPayment = new ArrayList<>();

  @Valid
  private List<F303PeriodInterestPaymentItem> periodInterestPayment = new ArrayList<>();

  @Valid
  private List<F303PaymentSourceItem> paymentSource = new ArrayList<>();

  @Valid
  private List<F303SpecialConditionCodeItem> specialConditionCode = new ArrayList<>();

  @Valid
  private List<F303InsuranceTypeItem> insuranceType = new ArrayList<>();

  @Valid
  private List<F303classifications590PItem> classification590P = new ArrayList<>();

  private String anotherClassification590p;

  private UUID uuid;

  public GetCreditF303 id(Long id) {
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

  public GetCreditF303 limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public GetCreditF303 addLimitsItem(UUID limitsItem) {
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

  public GetCreditF303 creditType(List<F303CreditTypeItem> creditType) {
    this.creditType = creditType;
    return this;
  }

  public GetCreditF303 addCreditTypeItem(F303CreditTypeItem creditTypeItem) {
    if (this.creditType == null) {
      this.creditType = new ArrayList<>();
    }
    this.creditType.add(creditTypeItem);
    return this;
  }

  /**
   * Get creditType
   * @return creditType
  */
  @Valid 
  @Schema(name = "creditType", example = "[\"1.1\",\"1.2\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditType")
  public List<F303CreditTypeItem> getCreditType() {
    return creditType;
  }

  public void setCreditType(List<F303CreditTypeItem> creditType) {
    this.creditType = creditType;
  }

  public GetCreditF303 creditPurpose(List<F303CreditPurposeItem> creditPurpose) {
    this.creditPurpose = creditPurpose;
    return this;
  }

  public GetCreditF303 addCreditPurposeItem(F303CreditPurposeItem creditPurposeItem) {
    if (this.creditPurpose == null) {
      this.creditPurpose = new ArrayList<>();
    }
    this.creditPurpose.add(creditPurposeItem);
    return this;
  }

  /**
   * Get creditPurpose
   * @return creditPurpose
  */
  @Valid 
  @Schema(name = "creditPurpose", example = "[\"2.1\",\"4.1\",\"5\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditPurpose")
  public List<F303CreditPurposeItem> getCreditPurpose() {
    return creditPurpose;
  }

  public void setCreditPurpose(List<F303CreditPurposeItem> creditPurpose) {
    this.creditPurpose = creditPurpose;
  }

  public GetCreditF303 interestRateType(List<F303InterestRateTypeItem> interestRateType) {
    this.interestRateType = interestRateType;
    return this;
  }

  public GetCreditF303 addInterestRateTypeItem(F303InterestRateTypeItem interestRateTypeItem) {
    if (this.interestRateType == null) {
      this.interestRateType = new ArrayList<>();
    }
    this.interestRateType.add(interestRateTypeItem);
    return this;
  }

  /**
   * Get interestRateType
   * @return interestRateType
  */
  @Valid 
  @Schema(name = "interestRateType", example = "[\"M\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestRateType")
  public List<F303InterestRateTypeItem> getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(List<F303InterestRateTypeItem> interestRateType) {
    this.interestRateType = interestRateType;
  }

  public GetCreditF303 interestPeriodPrevious(String interestPeriodPrevious) {
    this.interestPeriodPrevious = interestPeriodPrevious;
    return this;
  }

  /**
   * Get interestPeriodPrevious
   * @return interestPeriodPrevious
  */
  
  @Schema(name = "interestPeriodPrevious", example = "-", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestPeriodPrevious")
  public String getInterestPeriodPrevious() {
    return interestPeriodPrevious;
  }

  public void setInterestPeriodPrevious(String interestPeriodPrevious) {
    this.interestPeriodPrevious = interestPeriodPrevious;
  }

  public GetCreditF303 changingComponentType(List<F303ChangingComponentTypeItem> changingComponentType) {
    this.changingComponentType = changingComponentType;
    return this;
  }

  public GetCreditF303 addChangingComponentTypeItem(F303ChangingComponentTypeItem changingComponentTypeItem) {
    if (this.changingComponentType == null) {
      this.changingComponentType = new ArrayList<>();
    }
    this.changingComponentType.add(changingComponentTypeItem);
    return this;
  }

  /**
   * Get changingComponentType
   * @return changingComponentType
  */
  @Valid 
  @Schema(name = "changingComponentType", example = "[\"1\",\"99\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changingComponentType")
  public List<F303ChangingComponentTypeItem> getChangingComponentType() {
    return changingComponentType;
  }

  public void setChangingComponentType(List<F303ChangingComponentTypeItem> changingComponentType) {
    this.changingComponentType = changingComponentType;
  }

  public GetCreditF303 periodMainPayment(List<F303PeriodMainPaymentItem> periodMainPayment) {
    this.periodMainPayment = periodMainPayment;
    return this;
  }

  public GetCreditF303 addPeriodMainPaymentItem(F303PeriodMainPaymentItem periodMainPaymentItem) {
    if (this.periodMainPayment == null) {
      this.periodMainPayment = new ArrayList<>();
    }
    this.periodMainPayment.add(periodMainPaymentItem);
    return this;
  }

  /**
   * Get periodMainPayment
   * @return periodMainPayment
  */
  @Valid 
  @Schema(name = "periodMainPayment", example = "[\"1\",\"7\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodMainPayment")
  public List<F303PeriodMainPaymentItem> getPeriodMainPayment() {
    return periodMainPayment;
  }

  public void setPeriodMainPayment(List<F303PeriodMainPaymentItem> periodMainPayment) {
    this.periodMainPayment = periodMainPayment;
  }

  public GetCreditF303 periodInterestPayment(List<F303PeriodInterestPaymentItem> periodInterestPayment) {
    this.periodInterestPayment = periodInterestPayment;
    return this;
  }

  public GetCreditF303 addPeriodInterestPaymentItem(F303PeriodInterestPaymentItem periodInterestPaymentItem) {
    if (this.periodInterestPayment == null) {
      this.periodInterestPayment = new ArrayList<>();
    }
    this.periodInterestPayment.add(periodInterestPaymentItem);
    return this;
  }

  /**
   * Get periodInterestPayment
   * @return periodInterestPayment
  */
  @Valid 
  @Schema(name = "periodInterestPayment", example = "[\"5\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodInterestPayment")
  public List<F303PeriodInterestPaymentItem> getPeriodInterestPayment() {
    return periodInterestPayment;
  }

  public void setPeriodInterestPayment(List<F303PeriodInterestPaymentItem> periodInterestPayment) {
    this.periodInterestPayment = periodInterestPayment;
  }

  public GetCreditF303 paymentSource(List<F303PaymentSourceItem> paymentSource) {
    this.paymentSource = paymentSource;
    return this;
  }

  public GetCreditF303 addPaymentSourceItem(F303PaymentSourceItem paymentSourceItem) {
    if (this.paymentSource == null) {
      this.paymentSource = new ArrayList<>();
    }
    this.paymentSource.add(paymentSourceItem);
    return this;
  }

  /**
   * Get paymentSource
   * @return paymentSource
  */
  @Valid 
  @Schema(name = "paymentSource", example = "[\"11\",\"99\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentSource")
  public List<F303PaymentSourceItem> getPaymentSource() {
    return paymentSource;
  }

  public void setPaymentSource(List<F303PaymentSourceItem> paymentSource) {
    this.paymentSource = paymentSource;
  }

  public GetCreditF303 specialConditionCode(List<F303SpecialConditionCodeItem> specialConditionCode) {
    this.specialConditionCode = specialConditionCode;
    return this;
  }

  public GetCreditF303 addSpecialConditionCodeItem(F303SpecialConditionCodeItem specialConditionCodeItem) {
    if (this.specialConditionCode == null) {
      this.specialConditionCode = new ArrayList<>();
    }
    this.specialConditionCode.add(specialConditionCodeItem);
    return this;
  }

  /**
   * Get specialConditionCode
   * @return specialConditionCode
  */
  @Valid 
  @Schema(name = "specialConditionCode", example = "[\"K\",\"CH\",\"LZ\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialConditionCode")
  public List<F303SpecialConditionCodeItem> getSpecialConditionCode() {
    return specialConditionCode;
  }

  public void setSpecialConditionCode(List<F303SpecialConditionCodeItem> specialConditionCode) {
    this.specialConditionCode = specialConditionCode;
  }

  public GetCreditF303 insuranceType(List<F303InsuranceTypeItem> insuranceType) {
    this.insuranceType = insuranceType;
    return this;
  }

  public GetCreditF303 addInsuranceTypeItem(F303InsuranceTypeItem insuranceTypeItem) {
    if (this.insuranceType == null) {
      this.insuranceType = new ArrayList<>();
    }
    this.insuranceType.add(insuranceTypeItem);
    return this;
  }

  /**
   * Get insuranceType
   * @return insuranceType
  */
  @Valid 
  @Schema(name = "insuranceType", example = "[\"2\",\"3\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insuranceType")
  public List<F303InsuranceTypeItem> getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(List<F303InsuranceTypeItem> insuranceType) {
    this.insuranceType = insuranceType;
  }

  public GetCreditF303 classification590P(List<F303classifications590PItem> classification590P) {
    this.classification590P = classification590P;
    return this;
  }

  public GetCreditF303 addClassification590PItem(F303classifications590PItem classification590PItem) {
    if (this.classification590P == null) {
      this.classification590P = new ArrayList<>();
    }
    this.classification590P.add(classification590PItem);
    return this;
  }

  /**
   * Get classification590P
   * @return classification590P
  */
  @Valid 
  @Schema(name = "classification590P", example = "[\"2\",\"6.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classification590P")
  public List<F303classifications590PItem> getClassification590P() {
    return classification590P;
  }

  public void setClassification590P(List<F303classifications590PItem> classification590P) {
    this.classification590P = classification590P;
  }

  public GetCreditF303 anotherClassification590p(String anotherClassification590p) {
    this.anotherClassification590p = anotherClassification590p;
    return this;
  }

  /**
   * Get anotherClassification590p
   * @return anotherClassification590p
  */
  
  @Schema(name = "anotherClassification590p", example = "Обязательный возврат задолженности", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anotherClassification590p")
  public String getAnotherClassification590p() {
    return anotherClassification590p;
  }

  public void setAnotherClassification590p(String anotherClassification590p) {
    this.anotherClassification590p = anotherClassification590p;
  }

  public GetCreditF303 uuid(UUID uuid) {
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
    GetCreditF303 getCreditF303 = (GetCreditF303) o;
    return Objects.equals(this.id, getCreditF303.id) &&
        Objects.equals(this.limits, getCreditF303.limits) &&
        Objects.equals(this.creditType, getCreditF303.creditType) &&
        Objects.equals(this.creditPurpose, getCreditF303.creditPurpose) &&
        Objects.equals(this.interestRateType, getCreditF303.interestRateType) &&
        Objects.equals(this.interestPeriodPrevious, getCreditF303.interestPeriodPrevious) &&
        Objects.equals(this.changingComponentType, getCreditF303.changingComponentType) &&
        Objects.equals(this.periodMainPayment, getCreditF303.periodMainPayment) &&
        Objects.equals(this.periodInterestPayment, getCreditF303.periodInterestPayment) &&
        Objects.equals(this.paymentSource, getCreditF303.paymentSource) &&
        Objects.equals(this.specialConditionCode, getCreditF303.specialConditionCode) &&
        Objects.equals(this.insuranceType, getCreditF303.insuranceType) &&
        Objects.equals(this.classification590P, getCreditF303.classification590P) &&
        Objects.equals(this.anotherClassification590p, getCreditF303.anotherClassification590p) &&
        Objects.equals(this.uuid, getCreditF303.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, creditType, creditPurpose, interestRateType, interestPeriodPrevious, changingComponentType, periodMainPayment, periodInterestPayment, paymentSource, specialConditionCode, insuranceType, classification590P, anotherClassification590p, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCreditF303 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    creditType: ").append(toIndentedString(creditType)).append("\n");
    sb.append("    creditPurpose: ").append(toIndentedString(creditPurpose)).append("\n");
    sb.append("    interestRateType: ").append(toIndentedString(interestRateType)).append("\n");
    sb.append("    interestPeriodPrevious: ").append(toIndentedString(interestPeriodPrevious)).append("\n");
    sb.append("    changingComponentType: ").append(toIndentedString(changingComponentType)).append("\n");
    sb.append("    periodMainPayment: ").append(toIndentedString(periodMainPayment)).append("\n");
    sb.append("    periodInterestPayment: ").append(toIndentedString(periodInterestPayment)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    specialConditionCode: ").append(toIndentedString(specialConditionCode)).append("\n");
    sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
    sb.append("    classification590P: ").append(toIndentedString(classification590P)).append("\n");
    sb.append("    anotherClassification590p: ").append(toIndentedString(anotherClassification590p)).append("\n");
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

