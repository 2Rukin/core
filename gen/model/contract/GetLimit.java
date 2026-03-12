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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CollateralRevolverBase;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303ChangingComponentTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditPurposeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303CreditTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InsuranceTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303InterestRateTypeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PaymentSourceItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodInterestPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303PeriodMainPaymentItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303SpecialConditionCodeItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCommission;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetDebtService;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetEscrowObject;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetFinancialPosition;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetInterestOrderItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetInterestRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetLimitAvailability;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetLimitF303Classification590P;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetPayment;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetPenalty;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetPurpose;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetPurposeAfina;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetQualityCategory;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetReserveRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetScheduleAvailabilityLimit;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetWorthinessLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetLimit
 */

@JsonTypeName("getLimit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetLimit {

  private Long id;

  private UUID uuid;

  private String number;

  private BigDecimal sum;

  private BigDecimal sumForAccounting;

  private String term;

  private String termEndDate;

  private GetPurposeAfina purposeAfina;

  @Valid
  private List<@Valid GetPurpose> purposes = new ArrayList<>();

  private GetLimitAvailability availability;

  @Valid
  private List<@Valid GetEscrowObject> escrowObjects = new ArrayList<>();

  private Boolean individualSchedule;

  @Valid
  private List<@Valid GetPayment> schedule = new ArrayList<>();

  private String interestPeriod;

  @Valid
  private List<@Valid GetInterestOrderItem> interestOrder = new ArrayList<>();

  @Valid
  private List<@Valid GetCommission> commissions = new ArrayList<>();

  @Valid
  private List<@Valid GetInterestRate> interestRates = new ArrayList<>();

  @Valid
  private List<@Valid GetPenalty> penaltys = new ArrayList<>();

  private Boolean is214;

  private GetWorthinessLevel worthinessLevel;

  private GetFinancialPosition financialPosition;

  private GetDebtService debtService;

  private GetQualityCategory qualityCategory;

  @Valid
  private List<@Valid GetScheduleAvailabilityLimit> scheduleAvailability = new ArrayList<>();

  @Valid
  private List<@Valid GetReserveRate> reserve = new ArrayList<>();

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

  private GetLimitF303Classification590P f303Classification590P;

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

  public GetLimit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetLimit uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public GetLimit number(String number) {
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

  public GetLimit sum(BigDecimal sum) {
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

  public GetLimit sumForAccounting(BigDecimal sumForAccounting) {
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

  public GetLimit term(String term) {
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

  public GetLimit termEndDate(String termEndDate) {
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

  public GetLimit purposeAfina(GetPurposeAfina purposeAfina) {
    this.purposeAfina = purposeAfina;
    return this;
  }

  /**
   * Get purposeAfina
   * @return purposeAfina
  */
  @Valid 
  @Schema(name = "purposeAfina", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeAfina")
  public GetPurposeAfina getPurposeAfina() {
    return purposeAfina;
  }

  public void setPurposeAfina(GetPurposeAfina purposeAfina) {
    this.purposeAfina = purposeAfina;
  }

  public GetLimit purposes(List<@Valid GetPurpose> purposes) {
    this.purposes = purposes;
    return this;
  }

  public GetLimit addPurposesItem(GetPurpose purposesItem) {
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
  public List<@Valid GetPurpose> getPurposes() {
    return purposes;
  }

  public void setPurposes(List<@Valid GetPurpose> purposes) {
    this.purposes = purposes;
  }

  public GetLimit availability(GetLimitAvailability availability) {
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
  public GetLimitAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(GetLimitAvailability availability) {
    this.availability = availability;
  }

  public GetLimit escrowObjects(List<@Valid GetEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
    return this;
  }

  public GetLimit addEscrowObjectsItem(GetEscrowObject escrowObjectsItem) {
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
  public List<@Valid GetEscrowObject> getEscrowObjects() {
    return escrowObjects;
  }

  public void setEscrowObjects(List<@Valid GetEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
  }

  public GetLimit individualSchedule(Boolean individualSchedule) {
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

  public GetLimit schedule(List<@Valid GetPayment> schedule) {
    this.schedule = schedule;
    return this;
  }

  public GetLimit addScheduleItem(GetPayment scheduleItem) {
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
  public List<@Valid GetPayment> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<@Valid GetPayment> schedule) {
    this.schedule = schedule;
  }

  public GetLimit interestPeriod(String interestPeriod) {
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

  public GetLimit interestOrder(List<@Valid GetInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
    return this;
  }

  public GetLimit addInterestOrderItem(GetInterestOrderItem interestOrderItem) {
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
  public List<@Valid GetInterestOrderItem> getInterestOrder() {
    return interestOrder;
  }

  public void setInterestOrder(List<@Valid GetInterestOrderItem> interestOrder) {
    this.interestOrder = interestOrder;
  }

  public GetLimit commissions(List<@Valid GetCommission> commissions) {
    this.commissions = commissions;
    return this;
  }

  public GetLimit addCommissionsItem(GetCommission commissionsItem) {
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
  public List<@Valid GetCommission> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<@Valid GetCommission> commissions) {
    this.commissions = commissions;
  }

  public GetLimit interestRates(List<@Valid GetInterestRate> interestRates) {
    this.interestRates = interestRates;
    return this;
  }

  public GetLimit addInterestRatesItem(GetInterestRate interestRatesItem) {
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
  public List<@Valid GetInterestRate> getInterestRates() {
    return interestRates;
  }

  public void setInterestRates(List<@Valid GetInterestRate> interestRates) {
    this.interestRates = interestRates;
  }

  public GetLimit penaltys(List<@Valid GetPenalty> penaltys) {
    this.penaltys = penaltys;
    return this;
  }

  public GetLimit addPenaltysItem(GetPenalty penaltysItem) {
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
  public List<@Valid GetPenalty> getPenaltys() {
    return penaltys;
  }

  public void setPenaltys(List<@Valid GetPenalty> penaltys) {
    this.penaltys = penaltys;
  }

  public GetLimit is214(Boolean is214) {
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

  public GetLimit worthinessLevel(GetWorthinessLevel worthinessLevel) {
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
  public GetWorthinessLevel getWorthinessLevel() {
    return worthinessLevel;
  }

  public void setWorthinessLevel(GetWorthinessLevel worthinessLevel) {
    this.worthinessLevel = worthinessLevel;
  }

  public GetLimit financialPosition(GetFinancialPosition financialPosition) {
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
  public GetFinancialPosition getFinancialPosition() {
    return financialPosition;
  }

  public void setFinancialPosition(GetFinancialPosition financialPosition) {
    this.financialPosition = financialPosition;
  }

  public GetLimit debtService(GetDebtService debtService) {
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
  public GetDebtService getDebtService() {
    return debtService;
  }

  public void setDebtService(GetDebtService debtService) {
    this.debtService = debtService;
  }

  public GetLimit qualityCategory(GetQualityCategory qualityCategory) {
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
  public GetQualityCategory getQualityCategory() {
    return qualityCategory;
  }

  public void setQualityCategory(GetQualityCategory qualityCategory) {
    this.qualityCategory = qualityCategory;
  }

  public GetLimit scheduleAvailability(List<@Valid GetScheduleAvailabilityLimit> scheduleAvailability) {
    this.scheduleAvailability = scheduleAvailability;
    return this;
  }

  public GetLimit addScheduleAvailabilityItem(GetScheduleAvailabilityLimit scheduleAvailabilityItem) {
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
  public List<@Valid GetScheduleAvailabilityLimit> getScheduleAvailability() {
    return scheduleAvailability;
  }

  public void setScheduleAvailability(List<@Valid GetScheduleAvailabilityLimit> scheduleAvailability) {
    this.scheduleAvailability = scheduleAvailability;
  }

  public GetLimit reserve(List<@Valid GetReserveRate> reserve) {
    this.reserve = reserve;
    return this;
  }

  public GetLimit addReserveItem(GetReserveRate reserveItem) {
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
  public List<@Valid GetReserveRate> getReserve() {
    return reserve;
  }

  public void setReserve(List<@Valid GetReserveRate> reserve) {
    this.reserve = reserve;
  }

  public GetLimit status(ContractStatus status) {
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

  public GetLimit f303CreditType(List<F303CreditTypeItem> f303CreditType) {
    this.f303CreditType = f303CreditType;
    return this;
  }

  public GetLimit addF303CreditTypeItem(F303CreditTypeItem f303CreditTypeItem) {
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

  public GetLimit f303CreditPurpose(List<F303CreditPurposeItem> f303CreditPurpose) {
    this.f303CreditPurpose = f303CreditPurpose;
    return this;
  }

  public GetLimit addF303CreditPurposeItem(F303CreditPurposeItem f303CreditPurposeItem) {
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

  public GetLimit f303InterestRateType(List<F303InterestRateTypeItem> f303InterestRateType) {
    this.f303InterestRateType = f303InterestRateType;
    return this;
  }

  public GetLimit addF303InterestRateTypeItem(F303InterestRateTypeItem f303InterestRateTypeItem) {
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

  public GetLimit f303InterestPeriodPrevious(String f303InterestPeriodPrevious) {
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

  public GetLimit f303ChangingComponentType(List<F303ChangingComponentTypeItem> f303ChangingComponentType) {
    this.f303ChangingComponentType = f303ChangingComponentType;
    return this;
  }

  public GetLimit addF303ChangingComponentTypeItem(F303ChangingComponentTypeItem f303ChangingComponentTypeItem) {
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

  public GetLimit f303PeriodMainPayment(List<F303PeriodMainPaymentItem> f303PeriodMainPayment) {
    this.f303PeriodMainPayment = f303PeriodMainPayment;
    return this;
  }

  public GetLimit addF303PeriodMainPaymentItem(F303PeriodMainPaymentItem f303PeriodMainPaymentItem) {
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

  public GetLimit f303PeriodInterestPayment(List<F303PeriodInterestPaymentItem> f303PeriodInterestPayment) {
    this.f303PeriodInterestPayment = f303PeriodInterestPayment;
    return this;
  }

  public GetLimit addF303PeriodInterestPaymentItem(F303PeriodInterestPaymentItem f303PeriodInterestPaymentItem) {
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

  public GetLimit f303PaymentSource(List<F303PaymentSourceItem> f303PaymentSource) {
    this.f303PaymentSource = f303PaymentSource;
    return this;
  }

  public GetLimit addF303PaymentSourceItem(F303PaymentSourceItem f303PaymentSourceItem) {
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

  public GetLimit f303SpecialConditionCode(List<F303SpecialConditionCodeItem> f303SpecialConditionCode) {
    this.f303SpecialConditionCode = f303SpecialConditionCode;
    return this;
  }

  public GetLimit addF303SpecialConditionCodeItem(F303SpecialConditionCodeItem f303SpecialConditionCodeItem) {
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

  public GetLimit f303InsuranceType(List<F303InsuranceTypeItem> f303InsuranceType) {
    this.f303InsuranceType = f303InsuranceType;
    return this;
  }

  public GetLimit addF303InsuranceTypeItem(F303InsuranceTypeItem f303InsuranceTypeItem) {
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

  public GetLimit f303Classification590P(GetLimitF303Classification590P f303Classification590P) {
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
  public GetLimitF303Classification590P getF303Classification590P() {
    return f303Classification590P;
  }

  public void setF303Classification590P(GetLimitF303Classification590P f303Classification590P) {
    this.f303Classification590P = f303Classification590P;
  }

  public GetLimit creditEqual(String creditEqual) {
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

  public GetLimit revolverValue(BigDecimal revolverValue) {
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

  public GetLimit revolverBase(CollateralRevolverBase revolverBase) {
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

  public GetLimit another(String another) {
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

  public GetLimit sublimitNumber(String sublimitNumber) {
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

  public GetLimit isScheduleAvailabilityFinancing(Boolean isScheduleAvailabilityFinancing) {
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

  public GetLimit additionalInfo(String additionalInfo) {
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

  public GetLimit reserveUokh(String reserveUokh) {
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

  public GetLimit individualConditionsEscrowObjects(Boolean individualConditionsEscrowObjects) {
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

  public GetLimit individualConditionsInterestRatesCurrent(Boolean individualConditionsInterestRatesCurrent) {
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

  public GetLimit individualConditionsInterestRatesCapitalized(Boolean individualConditionsInterestRatesCapitalized) {
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

  public GetLimit individualConditionsInterestOrder(Boolean individualConditionsInterestOrder) {
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

  public GetLimit individualConditionsPenaltys(Boolean individualConditionsPenaltys) {
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

  public GetLimit individualConditionsReserve(Boolean individualConditionsReserve) {
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

  public GetLimit individualConditionsF303(Boolean individualConditionsF303) {
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

  public GetLimit individualConditionsPurposes(Boolean individualConditionsPurposes) {
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
    GetLimit getLimit = (GetLimit) o;
    return Objects.equals(this.id, getLimit.id) &&
        Objects.equals(this.uuid, getLimit.uuid) &&
        Objects.equals(this.number, getLimit.number) &&
        Objects.equals(this.sum, getLimit.sum) &&
        Objects.equals(this.sumForAccounting, getLimit.sumForAccounting) &&
        Objects.equals(this.term, getLimit.term) &&
        Objects.equals(this.termEndDate, getLimit.termEndDate) &&
        Objects.equals(this.purposeAfina, getLimit.purposeAfina) &&
        Objects.equals(this.purposes, getLimit.purposes) &&
        Objects.equals(this.availability, getLimit.availability) &&
        Objects.equals(this.escrowObjects, getLimit.escrowObjects) &&
        Objects.equals(this.individualSchedule, getLimit.individualSchedule) &&
        Objects.equals(this.schedule, getLimit.schedule) &&
        Objects.equals(this.interestPeriod, getLimit.interestPeriod) &&
        Objects.equals(this.interestOrder, getLimit.interestOrder) &&
        Objects.equals(this.commissions, getLimit.commissions) &&
        Objects.equals(this.interestRates, getLimit.interestRates) &&
        Objects.equals(this.penaltys, getLimit.penaltys) &&
        Objects.equals(this.is214, getLimit.is214) &&
        Objects.equals(this.worthinessLevel, getLimit.worthinessLevel) &&
        Objects.equals(this.financialPosition, getLimit.financialPosition) &&
        Objects.equals(this.debtService, getLimit.debtService) &&
        Objects.equals(this.qualityCategory, getLimit.qualityCategory) &&
        Objects.equals(this.scheduleAvailability, getLimit.scheduleAvailability) &&
        Objects.equals(this.reserve, getLimit.reserve) &&
        Objects.equals(this.status, getLimit.status) &&
        Objects.equals(this.f303CreditType, getLimit.f303CreditType) &&
        Objects.equals(this.f303CreditPurpose, getLimit.f303CreditPurpose) &&
        Objects.equals(this.f303InterestRateType, getLimit.f303InterestRateType) &&
        Objects.equals(this.f303InterestPeriodPrevious, getLimit.f303InterestPeriodPrevious) &&
        Objects.equals(this.f303ChangingComponentType, getLimit.f303ChangingComponentType) &&
        Objects.equals(this.f303PeriodMainPayment, getLimit.f303PeriodMainPayment) &&
        Objects.equals(this.f303PeriodInterestPayment, getLimit.f303PeriodInterestPayment) &&
        Objects.equals(this.f303PaymentSource, getLimit.f303PaymentSource) &&
        Objects.equals(this.f303SpecialConditionCode, getLimit.f303SpecialConditionCode) &&
        Objects.equals(this.f303InsuranceType, getLimit.f303InsuranceType) &&
        Objects.equals(this.f303Classification590P, getLimit.f303Classification590P) &&
        Objects.equals(this.creditEqual, getLimit.creditEqual) &&
        Objects.equals(this.revolverValue, getLimit.revolverValue) &&
        Objects.equals(this.revolverBase, getLimit.revolverBase) &&
        Objects.equals(this.another, getLimit.another) &&
        Objects.equals(this.sublimitNumber, getLimit.sublimitNumber) &&
        Objects.equals(this.isScheduleAvailabilityFinancing, getLimit.isScheduleAvailabilityFinancing) &&
        Objects.equals(this.additionalInfo, getLimit.additionalInfo) &&
        Objects.equals(this.reserveUokh, getLimit.reserveUokh) &&
        Objects.equals(this.individualConditionsEscrowObjects, getLimit.individualConditionsEscrowObjects) &&
        Objects.equals(this.individualConditionsInterestRatesCurrent, getLimit.individualConditionsInterestRatesCurrent) &&
        Objects.equals(this.individualConditionsInterestRatesCapitalized, getLimit.individualConditionsInterestRatesCapitalized) &&
        Objects.equals(this.individualConditionsInterestOrder, getLimit.individualConditionsInterestOrder) &&
        Objects.equals(this.individualConditionsPenaltys, getLimit.individualConditionsPenaltys) &&
        Objects.equals(this.individualConditionsReserve, getLimit.individualConditionsReserve) &&
        Objects.equals(this.individualConditionsF303, getLimit.individualConditionsF303) &&
        Objects.equals(this.individualConditionsPurposes, getLimit.individualConditionsPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, number, sum, sumForAccounting, term, termEndDate, purposeAfina, purposes, availability, escrowObjects, individualSchedule, schedule, interestPeriod, interestOrder, commissions, interestRates, penaltys, is214, worthinessLevel, financialPosition, debtService, qualityCategory, scheduleAvailability, reserve, status, f303CreditType, f303CreditPurpose, f303InterestRateType, f303InterestPeriodPrevious, f303ChangingComponentType, f303PeriodMainPayment, f303PeriodInterestPayment, f303PaymentSource, f303SpecialConditionCode, f303InsuranceType, f303Classification590P, creditEqual, revolverValue, revolverBase, another, sublimitNumber, isScheduleAvailabilityFinancing, additionalInfo, reserveUokh, individualConditionsEscrowObjects, individualConditionsInterestRatesCurrent, individualConditionsInterestRatesCapitalized, individualConditionsInterestOrder, individualConditionsPenaltys, individualConditionsReserve, individualConditionsF303, individualConditionsPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLimit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    sumForAccounting: ").append(toIndentedString(sumForAccounting)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    termEndDate: ").append(toIndentedString(termEndDate)).append("\n");
    sb.append("    purposeAfina: ").append(toIndentedString(purposeAfina)).append("\n");
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

