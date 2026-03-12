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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CollateralRevolverBase;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCommission;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateDebtService;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateEscrowObject;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateFinancialPosition;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateInterestOrderItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateInterestRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateLimitAvailability;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateLimitF303Classification590P;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreatePayment;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreatePenalty;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreatePurpose;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateQualityCategory;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateReserveRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateScheduleAvailabilityLimit;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateWorthinessLevel;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303ChangingComponentTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditPurposeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InsuranceTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InterestRateTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PaymentSourceItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodInterestPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodMainPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303SpecialConditionCodeItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * CreateLimit
 */

@JsonTypeName("createLimit")
/**
 * DTO CreateLimit.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateLimit {

  private UUID uuid;

  private String number;

  private BigDecimal sum;

  private BigDecimal sumForAccounting;

  private String term;

  private String termEndDate;

  private Integer purposeAfinaId;

  @Valid
  private List<@Valid CreatePurpose> purposes = new ArrayList<>();

  private CreateLimitAvailability availability;

  @Valid
  private List<@Valid CreateEscrowObject> escrowObjects = new ArrayList<>();

  private Boolean individualSchedule;

  @Valid
  private List<@Valid CreatePayment> schedule = new ArrayList<>();

  private String interestPeriod;

  @Valid
  private List<@Valid CreateInterestOrderItem> interestOrder = new ArrayList<>();

  @Valid
  private List<@Valid CreateCommission> commissions = new ArrayList<>();

  @Valid
  private List<@Valid CreateInterestRate> interestRates = new ArrayList<>();

  @Valid
  private List<@Valid CreatePenalty> penaltys = new ArrayList<>();

  private Boolean is214;

  private CreateWorthinessLevel worthinessLevel;

  private CreateFinancialPosition financialPosition;

  private CreateDebtService debtService;

  private CreateQualityCategory qualityCategory;

  @Valid
  private List<@Valid CreateScheduleAvailabilityLimit> scheduleAvailability = new ArrayList<>();

  @Valid
  private List<@Valid CreateReserveRate> reserve = new ArrayList<>();

  private ContractStatus status;

  @Valid
  private List<F303CreditTypeItem> f303CreditType = new ArrayList<>();

  @Valid
  private List<F303CreditPurposeItem> f303CreditPurpose = new ArrayList<>();

  @Valid
  private List<F303InterestRateTypeItem> f303InterestRateType = new ArrayList<>();

  private String f303InterestPeriodPrevious;

  @Valid
  private List<F303ChangingComponentTypeItem> f303ChangingComponentType = new ArrayList<>();

  @Valid
  private List<F303PeriodMainPaymentItem> f303PeriodMainPayment = new ArrayList<>();

  @Valid
  private List<F303PeriodInterestPaymentItem> f303PeriodInterestPayment = new ArrayList<>();

  @Valid
  private List<F303PaymentSourceItem> f303PaymentSource = new ArrayList<>();

  @Valid
  private List<F303SpecialConditionCodeItem> f303SpecialConditionCode = new ArrayList<>();

  @Valid
  private List<F303InsuranceTypeItem> f303InsuranceType = new ArrayList<>();

  private CreateLimitF303Classification590P f303Classification590P;

  private String creditEqual;

  private BigDecimal revolverValue;

  private CollateralRevolverBase revolverBase;

  private String another;

  private String sublimitNumber;

  private Boolean isScheduleAvailabilityFinancing;

  private String additionalInfo;

  private String reserveUokh;

  private Boolean individualConditionsEscrowObjects;

  private Boolean individualConditionsInterestRatesCurrent;

  private Boolean individualConditionsInterestRatesCapitalized;

  private Boolean individualConditionsInterestOrder;

  private Boolean individualConditionsPenaltys;

  private Boolean individualConditionsReserve;

  private Boolean individualConditionsF303;

  private Boolean individualConditionsPurposes;

  public CreateLimit() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateLimit(UUID uuid) {
    this.uuid = uuid;
  }

  public CreateLimit uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @NotNull @Valid 
  @Schema(name = "uuid", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public CreateLimit number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", example = "1.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreateLimit sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }

  /**
   * Get sum
   * @return sum
  */
  @Valid 
  @Schema(name = "sum", example = "1250000000.33", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sum")
  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  public CreateLimit sumForAccounting(BigDecimal sumForAccounting) {
    this.sumForAccounting = sumForAccounting;
    return this;
  }

  /**
   * Get sumForAccounting
   * @return sumForAccounting
  */
  @Valid 
  @Schema(name = "sumForAccounting", example = "950000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sumForAccounting")
  public BigDecimal getSumForAccounting() {
    return sumForAccounting;
  }

  public void setSumForAccounting(BigDecimal sumForAccounting) {
    this.sumForAccounting = sumForAccounting;
  }

  public CreateLimit term(String term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   * @return term
  */
  
  @Schema(name = "term", example = "С даты заключения договора по 30.06.2024 или дата окончания инвестиционной фазы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public CreateLimit termEndDate(String termEndDate) {
    this.termEndDate = termEndDate;
    return this;
  }

  /**
   * Get termEndDate
   * @return termEndDate
  */
  
  @Schema(name = "termEndDate", example = "30.06.2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termEndDate")
  public String getTermEndDate() {
    return termEndDate;
  }

  public void setTermEndDate(String termEndDate) {
    this.termEndDate = termEndDate;
  }

  public CreateLimit purposeAfinaId(Integer purposeAfinaId) {
    this.purposeAfinaId = purposeAfinaId;
    return this;
  }

  /**
   * Get purposeAfinaId
   * @return purposeAfinaId
  */
  
  @Schema(name = "purposeAfinaId", example = "36886", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeAfinaId")
  public Integer getPurposeAfinaId() {
    return purposeAfinaId;
  }

  public void setPurposeAfinaId(Integer purposeAfinaId) {
    this.purposeAfinaId = purposeAfinaId;
  }

  public CreateLimit purposes(List<@Valid CreatePurpose> purposes) {
    this.purposes = purposes;
    return this;
  }

  public CreateLimit addPurposesItem(CreatePurpose purposesItem) {
    if (this.purposes == null) {
      this.purposes = new ArrayList<>();
    }
    this.purposes.add(purposesItem);
    return this;
  }

  /**
   * Get purposes
   * @return purposes
  */
  @Valid 
  @Schema(name = "purposes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposes")
  public List<@Valid CreatePurpose> getPurposes() {
    return purposes;
  }

  public void setPurposes(List<@Valid CreatePurpose> purposes) {
    this.purposes = purposes;
  }

  public CreateLimit availability(CreateLimitAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public CreateLimitAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(CreateLimitAvailability availability) {
    this.availability = availability;
  }

  public CreateLimit escrowObjects(List<@Valid CreateEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
    return this;
  }

  public CreateLimit addEscrowObjectsItem(CreateEscrowObject escrowObjectsItem) {
    if (this.escrowObjects == null) {
      this.escrowObjects = new ArrayList<>();
    }
    this.escrowObjects.add(escrowObjectsItem);
    return this;
  }

  /**
   * Get escrowObjects
   * @return escrowObjects
  */
  @Valid 
  @Schema(name = "escrowObjects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("escrowObjects")
  public List<@Valid CreateEscrowObject> getEscrowObjects() {
    return escrowObjects;
  }

  public void setEscrowObjects(List<@Valid CreateEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
  }

  public CreateLimit individualSchedule(Boolean individualSchedule) {
    this.individualSchedule = individualSchedule;
    return this;
  }

  /**
   * Get individualSchedule
   * @return individualSchedule
  */
  
  @Schema(name = "individualSchedule", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualSchedule")
  public Boolean getIndividualSchedule() {
    return individualSchedule;
  }

  public void setIndividualSchedule(Boolean individualSchedule) {
    this.individualSchedule = individualSchedule;
  }

  public CreateLimit schedule(List<@Valid CreatePayment> schedule) {
    this.schedule = schedule;
    return this;
  }

  public CreateLimit addScheduleItem(CreatePayment scheduleItem) {
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
  public List<@Valid CreatePayment> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<@Valid CreatePayment> schedule) {
    this.schedule = schedule;
  }

  public CreateLimit interestPeriod(String interestPeriod) {
    this.interestPeriod = interestPeriod;
    return this;
  }

  /**
   * Get interestPeriod
   * @return interestPeriod
  */
  
  @Schema(name = "interestPeriod", example = "Процентный период означает каледарный месяц, при этом (а) Первый процентный период...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestPeriod")
  public String getInterestPeriod() {
    return interestPeriod;
  }

  public void setInterestPeriod(String interestPeriod) {
    this.interestPeriod = interestPeriod;
  }

  public CreateLimit interestOrder(List<@Valid CreateInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
    return this;
  }

  public CreateLimit addInterestOrderItem(CreateInterestOrderItem interestOrderItem) {
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
  public List<@Valid CreateInterestOrderItem> getInterestOrder() {
    return interestOrder;
  }

  public void setInterestOrder(List<@Valid CreateInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
  }

  public CreateLimit commissions(List<@Valid CreateCommission> commissions) {
    this.commissions = commissions;
    return this;
  }

  public CreateLimit addCommissionsItem(CreateCommission commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
    this.commissions.add(commissionsItem);
    return this;
  }

  /**
   * Get commissions
   * @return commissions
  */
  @Valid 
  @Schema(name = "commissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commissions")
  public List<@Valid CreateCommission> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<@Valid CreateCommission> commissions) {
    this.commissions = commissions;
  }

  public CreateLimit interestRates(List<@Valid CreateInterestRate> interestRates) {
    this.interestRates = interestRates;
    return this;
  }

  public CreateLimit addInterestRatesItem(CreateInterestRate interestRatesItem) {
    if (this.interestRates == null) {
      this.interestRates = new ArrayList<>();
    }
    this.interestRates.add(interestRatesItem);
    return this;
  }

  /**
   * Get interestRates
   * @return interestRates
  */
  @Valid 
  @Schema(name = "interestRates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interestRates")
  public List<@Valid CreateInterestRate> getInterestRates() {
    return interestRates;
  }

  public void setInterestRates(List<@Valid CreateInterestRate> interestRates) {
    this.interestRates = interestRates;
  }

  public CreateLimit penaltys(List<@Valid CreatePenalty> penaltys) {
    this.penaltys = penaltys;
    return this;
  }

  public CreateLimit addPenaltysItem(CreatePenalty penaltysItem) {
    if (this.penaltys == null) {
      this.penaltys = new ArrayList<>();
    }
    this.penaltys.add(penaltysItem);
    return this;
  }

  /**
   * Get penaltys
   * @return penaltys
  */
  @Valid 
  @Schema(name = "penaltys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("penaltys")
  public List<@Valid CreatePenalty> getPenaltys() {
    return penaltys;
  }

  public void setPenaltys(List<@Valid CreatePenalty> penaltys) {
    this.penaltys = penaltys;
  }

  public CreateLimit is214(Boolean is214) {
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

  public CreateLimit worthinessLevel(CreateWorthinessLevel worthinessLevel) {
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
  public CreateWorthinessLevel getWorthinessLevel() {
    return worthinessLevel;
  }

  public void setWorthinessLevel(CreateWorthinessLevel worthinessLevel) {
    this.worthinessLevel = worthinessLevel;
  }

  public CreateLimit financialPosition(CreateFinancialPosition financialPosition) {
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
  public CreateFinancialPosition getFinancialPosition() {
    return financialPosition;
  }

  public void setFinancialPosition(CreateFinancialPosition financialPosition) {
    this.financialPosition = financialPosition;
  }

  public CreateLimit debtService(CreateDebtService debtService) {
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
  public CreateDebtService getDebtService() {
    return debtService;
  }

  public void setDebtService(CreateDebtService debtService) {
    this.debtService = debtService;
  }

  public CreateLimit qualityCategory(CreateQualityCategory qualityCategory) {
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
  public CreateQualityCategory getQualityCategory() {
    return qualityCategory;
  }

  public void setQualityCategory(CreateQualityCategory qualityCategory) {
    this.qualityCategory = qualityCategory;
  }

  public CreateLimit scheduleAvailability(List<@Valid CreateScheduleAvailabilityLimit> scheduleAvailability) {
    this.scheduleAvailability = scheduleAvailability;
    return this;
  }

  public CreateLimit addScheduleAvailabilityItem(CreateScheduleAvailabilityLimit scheduleAvailabilityItem) {
    if (this.scheduleAvailability == null) {
      this.scheduleAvailability = new ArrayList<>();
    }
    this.scheduleAvailability.add(scheduleAvailabilityItem);
    return this;
  }

  /**
   * Get scheduleAvailability
   * @return scheduleAvailability
  */
  @Valid 
  @Schema(name = "scheduleAvailability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduleAvailability")
  public List<@Valid CreateScheduleAvailabilityLimit> getScheduleAvailability() {
    return scheduleAvailability;
  }

  public void setScheduleAvailability(List<@Valid CreateScheduleAvailabilityLimit> scheduleAvailability) {
    this.scheduleAvailability = scheduleAvailability;
  }

  public CreateLimit reserve(List<@Valid CreateReserveRate> reserve) {
    this.reserve = reserve;
    return this;
  }

  public CreateLimit addReserveItem(CreateReserveRate reserveItem) {
    if (this.reserve == null) {
      this.reserve = new ArrayList<>();
    }
    this.reserve.add(reserveItem);
    return this;
  }

  /**
   * Get reserve
   * @return reserve
  */
  @Valid 
  @Schema(name = "reserve", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserve")
  public List<@Valid CreateReserveRate> getReserve() {
    return reserve;
  }

  public void setReserve(List<@Valid CreateReserveRate> reserve) {
    this.reserve = reserve;
  }

  public CreateLimit status(ContractStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public ContractStatus getStatus() {
    return status;
  }

  public void setStatus(ContractStatus status) {
    this.status = status;
  }

  public CreateLimit f303CreditType(List<F303CreditTypeItem> f303CreditType) {
    this.f303CreditType = f303CreditType;
    return this;
  }

  public CreateLimit addF303CreditTypeItem(F303CreditTypeItem f303CreditTypeItem) {
    if (this.f303CreditType == null) {
      this.f303CreditType = new ArrayList<>();
    }
    this.f303CreditType.add(f303CreditTypeItem);
    return this;
  }

  /**
   * Get f303CreditType
   * @return f303CreditType
  */
  @Valid 
  @Schema(name = "f303CreditType", example = "[\"1.1\",\"1.2\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303CreditType")
  public List<F303CreditTypeItem> getF303CreditType() {
    return f303CreditType;
  }

  public void setF303CreditType(List<F303CreditTypeItem> f303CreditType) {
    this.f303CreditType = f303CreditType;
  }

  public CreateLimit f303CreditPurpose(List<F303CreditPurposeItem> f303CreditPurpose) {
    this.f303CreditPurpose = f303CreditPurpose;
    return this;
  }

  public CreateLimit addF303CreditPurposeItem(F303CreditPurposeItem f303CreditPurposeItem) {
    if (this.f303CreditPurpose == null) {
      this.f303CreditPurpose = new ArrayList<>();
    }
    this.f303CreditPurpose.add(f303CreditPurposeItem);
    return this;
  }

  /**
   * Get f303CreditPurpose
   * @return f303CreditPurpose
  */
  @Valid 
  @Schema(name = "f303CreditPurpose", example = "[\"2.1\",\"4.1\",\"5\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303CreditPurpose")
  public List<F303CreditPurposeItem> getF303CreditPurpose() {
    return f303CreditPurpose;
  }

  public void setF303CreditPurpose(List<F303CreditPurposeItem> f303CreditPurpose) {
    this.f303CreditPurpose = f303CreditPurpose;
  }

  public CreateLimit f303InterestRateType(List<F303InterestRateTypeItem> f303InterestRateType) {
    this.f303InterestRateType = f303InterestRateType;
    return this;
  }

  public CreateLimit addF303InterestRateTypeItem(F303InterestRateTypeItem f303InterestRateTypeItem) {
    if (this.f303InterestRateType == null) {
      this.f303InterestRateType = new ArrayList<>();
    }
    this.f303InterestRateType.add(f303InterestRateTypeItem);
    return this;
  }

  /**
   * Get f303InterestRateType
   * @return f303InterestRateType
  */
  @Valid 
  @Schema(name = "f303InterestRateType", example = "[\"M\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303InterestRateType")
  public List<F303InterestRateTypeItem> getF303InterestRateType() {
    return f303InterestRateType;
  }

  public void setF303InterestRateType(List<F303InterestRateTypeItem> f303InterestRateType) {
    this.f303InterestRateType = f303InterestRateType;
  }

  public CreateLimit f303InterestPeriodPrevious(String f303InterestPeriodPrevious) {
    this.f303InterestPeriodPrevious = f303InterestPeriodPrevious;
    return this;
  }

  /**
   * Get f303InterestPeriodPrevious
   * @return f303InterestPeriodPrevious
  */
  
  @Schema(name = "f303InterestPeriodPrevious", example = "-", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303InterestPeriodPrevious")
  public String getF303InterestPeriodPrevious() {
    return f303InterestPeriodPrevious;
  }

  public void setF303InterestPeriodPrevious(String f303InterestPeriodPrevious) {
    this.f303InterestPeriodPrevious = f303InterestPeriodPrevious;
  }

  public CreateLimit f303ChangingComponentType(List<F303ChangingComponentTypeItem> f303ChangingComponentType) {
    this.f303ChangingComponentType = f303ChangingComponentType;
    return this;
  }

  public CreateLimit addF303ChangingComponentTypeItem(F303ChangingComponentTypeItem f303ChangingComponentTypeItem) {
    if (this.f303ChangingComponentType == null) {
      this.f303ChangingComponentType = new ArrayList<>();
    }
    this.f303ChangingComponentType.add(f303ChangingComponentTypeItem);
    return this;
  }

  /**
   * Get f303ChangingComponentType
   * @return f303ChangingComponentType
  */
  @Valid 
  @Schema(name = "f303ChangingComponentType", example = "[\"1\",\"99\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303ChangingComponentType")
  public List<F303ChangingComponentTypeItem> getF303ChangingComponentType() {
    return f303ChangingComponentType;
  }

  public void setF303ChangingComponentType(List<F303ChangingComponentTypeItem> f303ChangingComponentType) {
    this.f303ChangingComponentType = f303ChangingComponentType;
  }

  public CreateLimit f303PeriodMainPayment(List<F303PeriodMainPaymentItem> f303PeriodMainPayment) {
    this.f303PeriodMainPayment = f303PeriodMainPayment;
    return this;
  }

  public CreateLimit addF303PeriodMainPaymentItem(F303PeriodMainPaymentItem f303PeriodMainPaymentItem) {
    if (this.f303PeriodMainPayment == null) {
      this.f303PeriodMainPayment = new ArrayList<>();
    }
    this.f303PeriodMainPayment.add(f303PeriodMainPaymentItem);
    return this;
  }

  /**
   * Get f303PeriodMainPayment
   * @return f303PeriodMainPayment
  */
  @Valid 
  @Schema(name = "f303PeriodMainPayment", example = "[\"1\",\"7\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303PeriodMainPayment")
  public List<F303PeriodMainPaymentItem> getF303PeriodMainPayment() {
    return f303PeriodMainPayment;
  }

  public void setF303PeriodMainPayment(List<F303PeriodMainPaymentItem> f303PeriodMainPayment) {
    this.f303PeriodMainPayment = f303PeriodMainPayment;
  }

  public CreateLimit f303PeriodInterestPayment(List<F303PeriodInterestPaymentItem> f303PeriodInterestPayment) {
    this.f303PeriodInterestPayment = f303PeriodInterestPayment;
    return this;
  }

  public CreateLimit addF303PeriodInterestPaymentItem(F303PeriodInterestPaymentItem f303PeriodInterestPaymentItem) {
    if (this.f303PeriodInterestPayment == null) {
      this.f303PeriodInterestPayment = new ArrayList<>();
    }
    this.f303PeriodInterestPayment.add(f303PeriodInterestPaymentItem);
    return this;
  }

  /**
   * Get f303PeriodInterestPayment
   * @return f303PeriodInterestPayment
  */
  @Valid 
  @Schema(name = "f303PeriodInterestPayment", example = "[\"5\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303PeriodInterestPayment")
  public List<F303PeriodInterestPaymentItem> getF303PeriodInterestPayment() {
    return f303PeriodInterestPayment;
  }

  public void setF303PeriodInterestPayment(List<F303PeriodInterestPaymentItem> f303PeriodInterestPayment) {
    this.f303PeriodInterestPayment = f303PeriodInterestPayment;
  }

  public CreateLimit f303PaymentSource(List<F303PaymentSourceItem> f303PaymentSource) {
    this.f303PaymentSource = f303PaymentSource;
    return this;
  }

  public CreateLimit addF303PaymentSourceItem(F303PaymentSourceItem f303PaymentSourceItem) {
    if (this.f303PaymentSource == null) {
      this.f303PaymentSource = new ArrayList<>();
    }
    this.f303PaymentSource.add(f303PaymentSourceItem);
    return this;
  }

  /**
   * Get f303PaymentSource
   * @return f303PaymentSource
  */
  @Valid 
  @Schema(name = "f303PaymentSource", example = "[\"11\",\"99\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303PaymentSource")
  public List<F303PaymentSourceItem> getF303PaymentSource() {
    return f303PaymentSource;
  }

  public void setF303PaymentSource(List<F303PaymentSourceItem> f303PaymentSource) {
    this.f303PaymentSource = f303PaymentSource;
  }

  public CreateLimit f303SpecialConditionCode(List<F303SpecialConditionCodeItem> f303SpecialConditionCode) {
    this.f303SpecialConditionCode = f303SpecialConditionCode;
    return this;
  }

  public CreateLimit addF303SpecialConditionCodeItem(F303SpecialConditionCodeItem f303SpecialConditionCodeItem) {
    if (this.f303SpecialConditionCode == null) {
      this.f303SpecialConditionCode = new ArrayList<>();
    }
    this.f303SpecialConditionCode.add(f303SpecialConditionCodeItem);
    return this;
  }

  /**
   * Get f303SpecialConditionCode
   * @return f303SpecialConditionCode
  */
  @Valid 
  @Schema(name = "f303SpecialConditionCode", example = "[\"K\",\"CH\",\"LZ\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303SpecialConditionCode")
  public List<F303SpecialConditionCodeItem> getF303SpecialConditionCode() {
    return f303SpecialConditionCode;
  }

  public void setF303SpecialConditionCode(List<F303SpecialConditionCodeItem> f303SpecialConditionCode) {
    this.f303SpecialConditionCode = f303SpecialConditionCode;
  }

  public CreateLimit f303InsuranceType(List<F303InsuranceTypeItem> f303InsuranceType) {
    this.f303InsuranceType = f303InsuranceType;
    return this;
  }

  public CreateLimit addF303InsuranceTypeItem(F303InsuranceTypeItem f303InsuranceTypeItem) {
    if (this.f303InsuranceType == null) {
      this.f303InsuranceType = new ArrayList<>();
    }
    this.f303InsuranceType.add(f303InsuranceTypeItem);
    return this;
  }

  /**
   * Get f303InsuranceType
   * @return f303InsuranceType
  */
  @Valid 
  @Schema(name = "f303InsuranceType", example = "[\"2\",\"3\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303InsuranceType")
  public List<F303InsuranceTypeItem> getF303InsuranceType() {
    return f303InsuranceType;
  }

  public void setF303InsuranceType(List<F303InsuranceTypeItem> f303InsuranceType) {
    this.f303InsuranceType = f303InsuranceType;
  }

  public CreateLimit f303Classification590P(CreateLimitF303Classification590P f303Classification590P) {
    this.f303Classification590P = f303Classification590P;
    return this;
  }

  /**
   * Get f303Classification590P
   * @return f303Classification590P
  */
  @Valid 
  @Schema(name = "f303Classification590P", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f303Classification590P")
  public CreateLimitF303Classification590P getF303Classification590P() {
    return f303Classification590P;
  }

  public void setF303Classification590P(CreateLimitF303Classification590P f303Classification590P) {
    this.f303Classification590P = f303Classification590P;
  }

  public CreateLimit creditEqual(String creditEqual) {
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

  public CreateLimit revolverValue(BigDecimal revolverValue) {
    this.revolverValue = revolverValue;
    return this;
  }

  /**
   * Get revolverValue
   * @return revolverValue
  */
  @Valid 
  @Schema(name = "revolverValue", example = "10.15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revolverValue")
  public BigDecimal getRevolverValue() {
    return revolverValue;
  }

  public void setRevolverValue(BigDecimal revolverValue) {
    this.revolverValue = revolverValue;
  }

  public CreateLimit revolverBase(CollateralRevolverBase revolverBase) {
    this.revolverBase = revolverBase;
    return this;
  }

  /**
   * Get revolverBase
   * @return revolverBase
  */
  @Valid 
  @Schema(name = "revolverBase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revolverBase")
  public CollateralRevolverBase getRevolverBase() {
    return revolverBase;
  }

  public void setRevolverBase(CollateralRevolverBase revolverBase) {
    this.revolverBase = revolverBase;
  }

  public CreateLimit another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Формат расчета(иное)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public CreateLimit sublimitNumber(String sublimitNumber) {
    this.sublimitNumber = sublimitNumber;
    return this;
  }

  /**
   * Get sublimitNumber
   * @return sublimitNumber
  */
  
  @Schema(name = "sublimitNumber", example = "Номер сублимита", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sublimitNumber")
  public String getSublimitNumber() {
    return sublimitNumber;
  }

  public void setSublimitNumber(String sublimitNumber) {
    this.sublimitNumber = sublimitNumber;
  }

  public CreateLimit isScheduleAvailabilityFinancing(Boolean isScheduleAvailabilityFinancing) {
    this.isScheduleAvailabilityFinancing = isScheduleAvailabilityFinancing;
    return this;
  }

  /**
   * Get isScheduleAvailabilityFinancing
   * @return isScheduleAvailabilityFinancing
  */
  
  @Schema(name = "isScheduleAvailabilityFinancing", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isScheduleAvailabilityFinancing")
  public Boolean getIsScheduleAvailabilityFinancing() {
    return isScheduleAvailabilityFinancing;
  }

  public void setIsScheduleAvailabilityFinancing(Boolean isScheduleAvailabilityFinancing) {
    this.isScheduleAvailabilityFinancing = isScheduleAvailabilityFinancing;
  }

  public CreateLimit additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  
  @Schema(name = "additionalInfo", example = "Комментарий пользователя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public CreateLimit reserveUokh(String reserveUokh) {
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

  public CreateLimit individualConditionsEscrowObjects(Boolean individualConditionsEscrowObjects) {
    this.individualConditionsEscrowObjects = individualConditionsEscrowObjects;
    return this;
  }

  /**
   * Get individualConditionsEscrowObjects
   * @return individualConditionsEscrowObjects
  */
  
  @Schema(name = "individualConditionsEscrowObjects", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsEscrowObjects")
  public Boolean getIndividualConditionsEscrowObjects() {
    return individualConditionsEscrowObjects;
  }

  public void setIndividualConditionsEscrowObjects(Boolean individualConditionsEscrowObjects) {
    this.individualConditionsEscrowObjects = individualConditionsEscrowObjects;
  }

  public CreateLimit individualConditionsInterestRatesCurrent(Boolean individualConditionsInterestRatesCurrent) {
    this.individualConditionsInterestRatesCurrent = individualConditionsInterestRatesCurrent;
    return this;
  }

  /**
   * Get individualConditionsInterestRatesCurrent
   * @return individualConditionsInterestRatesCurrent
  */
  
  @Schema(name = "individualConditionsInterestRatesCurrent", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsInterestRatesCurrent")
  public Boolean getIndividualConditionsInterestRatesCurrent() {
    return individualConditionsInterestRatesCurrent;
  }

  public void setIndividualConditionsInterestRatesCurrent(Boolean individualConditionsInterestRatesCurrent) {
    this.individualConditionsInterestRatesCurrent = individualConditionsInterestRatesCurrent;
  }

  public CreateLimit individualConditionsInterestRatesCapitalized(Boolean individualConditionsInterestRatesCapitalized) {
    this.individualConditionsInterestRatesCapitalized = individualConditionsInterestRatesCapitalized;
    return this;
  }

  /**
   * Get individualConditionsInterestRatesCapitalized
   * @return individualConditionsInterestRatesCapitalized
  */
  
  @Schema(name = "individualConditionsInterestRatesCapitalized", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsInterestRatesCapitalized")
  public Boolean getIndividualConditionsInterestRatesCapitalized() {
    return individualConditionsInterestRatesCapitalized;
  }

  public void setIndividualConditionsInterestRatesCapitalized(Boolean individualConditionsInterestRatesCapitalized) {
    this.individualConditionsInterestRatesCapitalized = individualConditionsInterestRatesCapitalized;
  }

  public CreateLimit individualConditionsInterestOrder(Boolean individualConditionsInterestOrder) {
    this.individualConditionsInterestOrder = individualConditionsInterestOrder;
    return this;
  }

  /**
   * Get individualConditionsInterestOrder
   * @return individualConditionsInterestOrder
  */
  
  @Schema(name = "individualConditionsInterestOrder", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsInterestOrder")
  public Boolean getIndividualConditionsInterestOrder() {
    return individualConditionsInterestOrder;
  }

  public void setIndividualConditionsInterestOrder(Boolean individualConditionsInterestOrder) {
    this.individualConditionsInterestOrder = individualConditionsInterestOrder;
  }

  public CreateLimit individualConditionsPenaltys(Boolean individualConditionsPenaltys) {
    this.individualConditionsPenaltys = individualConditionsPenaltys;
    return this;
  }

  /**
   * Get individualConditionsPenaltys
   * @return individualConditionsPenaltys
  */
  
  @Schema(name = "individualConditionsPenaltys", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsPenaltys")
  public Boolean getIndividualConditionsPenaltys() {
    return individualConditionsPenaltys;
  }

  public void setIndividualConditionsPenaltys(Boolean individualConditionsPenaltys) {
    this.individualConditionsPenaltys = individualConditionsPenaltys;
  }

  public CreateLimit individualConditionsReserve(Boolean individualConditionsReserve) {
    this.individualConditionsReserve = individualConditionsReserve;
    return this;
  }

  /**
   * Get individualConditionsReserve
   * @return individualConditionsReserve
  */
  
  @Schema(name = "individualConditionsReserve", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsReserve")
  public Boolean getIndividualConditionsReserve() {
    return individualConditionsReserve;
  }

  public void setIndividualConditionsReserve(Boolean individualConditionsReserve) {
    this.individualConditionsReserve = individualConditionsReserve;
  }

  public CreateLimit individualConditionsF303(Boolean individualConditionsF303) {
    this.individualConditionsF303 = individualConditionsF303;
    return this;
  }

  /**
   * Get individualConditionsF303
   * @return individualConditionsF303
  */
  
  @Schema(name = "individualConditionsF303", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsF303")
  public Boolean getIndividualConditionsF303() {
    return individualConditionsF303;
  }

  public void setIndividualConditionsF303(Boolean individualConditionsF303) {
    this.individualConditionsF303 = individualConditionsF303;
  }

  public CreateLimit individualConditionsPurposes(Boolean individualConditionsPurposes) {
    this.individualConditionsPurposes = individualConditionsPurposes;
    return this;
  }

  /**
   * Get individualConditionsPurposes
   * @return individualConditionsPurposes
  */
  
  @Schema(name = "individualConditionsPurposes", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualConditionsPurposes")
  public Boolean getIndividualConditionsPurposes() {
    return individualConditionsPurposes;
  }

  public void setIndividualConditionsPurposes(Boolean individualConditionsPurposes) {
    this.individualConditionsPurposes = individualConditionsPurposes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLimit createLimit = (CreateLimit) o;
    return Objects.equals(this.uuid, createLimit.uuid) &&
        Objects.equals(this.number, createLimit.number) &&
        Objects.equals(this.sum, createLimit.sum) &&
        Objects.equals(this.sumForAccounting, createLimit.sumForAccounting) &&
        Objects.equals(this.term, createLimit.term) &&
        Objects.equals(this.termEndDate, createLimit.termEndDate) &&
        Objects.equals(this.purposeAfinaId, createLimit.purposeAfinaId) &&
        Objects.equals(this.purposes, createLimit.purposes) &&
        Objects.equals(this.availability, createLimit.availability) &&
        Objects.equals(this.escrowObjects, createLimit.escrowObjects) &&
        Objects.equals(this.individualSchedule, createLimit.individualSchedule) &&
        Objects.equals(this.schedule, createLimit.schedule) &&
        Objects.equals(this.interestPeriod, createLimit.interestPeriod) &&
        Objects.equals(this.interestOrder, createLimit.interestOrder) &&
        Objects.equals(this.commissions, createLimit.commissions) &&
        Objects.equals(this.interestRates, createLimit.interestRates) &&
        Objects.equals(this.penaltys, createLimit.penaltys) &&
        Objects.equals(this.is214, createLimit.is214) &&
        Objects.equals(this.worthinessLevel, createLimit.worthinessLevel) &&
        Objects.equals(this.financialPosition, createLimit.financialPosition) &&
        Objects.equals(this.debtService, createLimit.debtService) &&
        Objects.equals(this.qualityCategory, createLimit.qualityCategory) &&
        Objects.equals(this.scheduleAvailability, createLimit.scheduleAvailability) &&
        Objects.equals(this.reserve, createLimit.reserve) &&
        Objects.equals(this.status, createLimit.status) &&
        Objects.equals(this.f303CreditType, createLimit.f303CreditType) &&
        Objects.equals(this.f303CreditPurpose, createLimit.f303CreditPurpose) &&
        Objects.equals(this.f303InterestRateType, createLimit.f303InterestRateType) &&
        Objects.equals(this.f303InterestPeriodPrevious, createLimit.f303InterestPeriodPrevious) &&
        Objects.equals(this.f303ChangingComponentType, createLimit.f303ChangingComponentType) &&
        Objects.equals(this.f303PeriodMainPayment, createLimit.f303PeriodMainPayment) &&
        Objects.equals(this.f303PeriodInterestPayment, createLimit.f303PeriodInterestPayment) &&
        Objects.equals(this.f303PaymentSource, createLimit.f303PaymentSource) &&
        Objects.equals(this.f303SpecialConditionCode, createLimit.f303SpecialConditionCode) &&
        Objects.equals(this.f303InsuranceType, createLimit.f303InsuranceType) &&
        Objects.equals(this.f303Classification590P, createLimit.f303Classification590P) &&
        Objects.equals(this.creditEqual, createLimit.creditEqual) &&
        Objects.equals(this.revolverValue, createLimit.revolverValue) &&
        Objects.equals(this.revolverBase, createLimit.revolverBase) &&
        Objects.equals(this.another, createLimit.another) &&
        Objects.equals(this.sublimitNumber, createLimit.sublimitNumber) &&
        Objects.equals(this.isScheduleAvailabilityFinancing, createLimit.isScheduleAvailabilityFinancing) &&
        Objects.equals(this.additionalInfo, createLimit.additionalInfo) &&
        Objects.equals(this.reserveUokh, createLimit.reserveUokh) &&
        Objects.equals(this.individualConditionsEscrowObjects, createLimit.individualConditionsEscrowObjects) &&
        Objects.equals(this.individualConditionsInterestRatesCurrent, createLimit.individualConditionsInterestRatesCurrent) &&
        Objects.equals(this.individualConditionsInterestRatesCapitalized, createLimit.individualConditionsInterestRatesCapitalized) &&
        Objects.equals(this.individualConditionsInterestOrder, createLimit.individualConditionsInterestOrder) &&
        Objects.equals(this.individualConditionsPenaltys, createLimit.individualConditionsPenaltys) &&
        Objects.equals(this.individualConditionsReserve, createLimit.individualConditionsReserve) &&
        Objects.equals(this.individualConditionsF303, createLimit.individualConditionsF303) &&
        Objects.equals(this.individualConditionsPurposes, createLimit.individualConditionsPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, number, sum, sumForAccounting, term, termEndDate, purposeAfinaId, purposes, availability, escrowObjects, individualSchedule, schedule, interestPeriod, interestOrder, commissions, interestRates, penaltys, is214, worthinessLevel, financialPosition, debtService, qualityCategory, scheduleAvailability, reserve, status, f303CreditType, f303CreditPurpose, f303InterestRateType, f303InterestPeriodPrevious, f303ChangingComponentType, f303PeriodMainPayment, f303PeriodInterestPayment, f303PaymentSource, f303SpecialConditionCode, f303InsuranceType, f303Classification590P, creditEqual, revolverValue, revolverBase, another, sublimitNumber, isScheduleAvailabilityFinancing, additionalInfo, reserveUokh, individualConditionsEscrowObjects, individualConditionsInterestRatesCurrent, individualConditionsInterestRatesCapitalized, individualConditionsInterestOrder, individualConditionsPenaltys, individualConditionsReserve, individualConditionsF303, individualConditionsPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLimit {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    sumForAccounting: ").append(toIndentedString(sumForAccounting)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    termEndDate: ").append(toIndentedString(termEndDate)).append("\n");
    sb.append("    purposeAfinaId: ").append(toIndentedString(purposeAfinaId)).append("\n");
    sb.append("    purposes: ").append(toIndentedString(purposes)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    escrowObjects: ").append(toIndentedString(escrowObjects)).append("\n");
    sb.append("    individualSchedule: ").append(toIndentedString(individualSchedule)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    interestPeriod: ").append(toIndentedString(interestPeriod)).append("\n");
    sb.append("    interestOrder: ").append(toIndentedString(interestOrder)).append("\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    interestRates: ").append(toIndentedString(interestRates)).append("\n");
    sb.append("    penaltys: ").append(toIndentedString(penaltys)).append("\n");
    sb.append("    is214: ").append(toIndentedString(is214)).append("\n");
    sb.append("    worthinessLevel: ").append(toIndentedString(worthinessLevel)).append("\n");
    sb.append("    financialPosition: ").append(toIndentedString(financialPosition)).append("\n");
    sb.append("    debtService: ").append(toIndentedString(debtService)).append("\n");
    sb.append("    qualityCategory: ").append(toIndentedString(qualityCategory)).append("\n");
    sb.append("    scheduleAvailability: ").append(toIndentedString(scheduleAvailability)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    f303CreditType: ").append(toIndentedString(f303CreditType)).append("\n");
    sb.append("    f303CreditPurpose: ").append(toIndentedString(f303CreditPurpose)).append("\n");
    sb.append("    f303InterestRateType: ").append(toIndentedString(f303InterestRateType)).append("\n");
    sb.append("    f303InterestPeriodPrevious: ").append(toIndentedString(f303InterestPeriodPrevious)).append("\n");
    sb.append("    f303ChangingComponentType: ").append(toIndentedString(f303ChangingComponentType)).append("\n");
    sb.append("    f303PeriodMainPayment: ").append(toIndentedString(f303PeriodMainPayment)).append("\n");
    sb.append("    f303PeriodInterestPayment: ").append(toIndentedString(f303PeriodInterestPayment)).append("\n");
    sb.append("    f303PaymentSource: ").append(toIndentedString(f303PaymentSource)).append("\n");
    sb.append("    f303SpecialConditionCode: ").append(toIndentedString(f303SpecialConditionCode)).append("\n");
    sb.append("    f303InsuranceType: ").append(toIndentedString(f303InsuranceType)).append("\n");
    sb.append("    f303Classification590P: ").append(toIndentedString(f303Classification590P)).append("\n");
    sb.append("    creditEqual: ").append(toIndentedString(creditEqual)).append("\n");
    sb.append("    revolverValue: ").append(toIndentedString(revolverValue)).append("\n");
    sb.append("    revolverBase: ").append(toIndentedString(revolverBase)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
    sb.append("    sublimitNumber: ").append(toIndentedString(sublimitNumber)).append("\n");
    sb.append("    isScheduleAvailabilityFinancing: ").append(toIndentedString(isScheduleAvailabilityFinancing)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    reserveUokh: ").append(toIndentedString(reserveUokh)).append("\n");
    sb.append("    individualConditionsEscrowObjects: ").append(toIndentedString(individualConditionsEscrowObjects)).append("\n");
    sb.append("    individualConditionsInterestRatesCurrent: ").append(toIndentedString(individualConditionsInterestRatesCurrent)).append("\n");
    sb.append("    individualConditionsInterestRatesCapitalized: ").append(toIndentedString(individualConditionsInterestRatesCapitalized)).append("\n");
    sb.append("    individualConditionsInterestOrder: ").append(toIndentedString(individualConditionsInterestOrder)).append("\n");
    sb.append("    individualConditionsPenaltys: ").append(toIndentedString(individualConditionsPenaltys)).append("\n");
    sb.append("    individualConditionsReserve: ").append(toIndentedString(individualConditionsReserve)).append("\n");
    sb.append("    individualConditionsF303: ").append(toIndentedString(individualConditionsF303)).append("\n");
    sb.append("    individualConditionsPurposes: ").append(toIndentedString(individualConditionsPurposes)).append("\n");
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

