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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.AgentOfSubsidy;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.BusinessModel;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreditType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.Currency;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditAccountDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditClientDetails;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditCommission;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditEscrowObject;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditF303;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditInterestOrder;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditInterestRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditPenaltys;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditPurposes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditReserve;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditCreditSchedule;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditEarlyReturn;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditLimit;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditRedemption;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.MarketTest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ProgramOfSubsidy;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.SppiTest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditCreditRequest
 */

@JsonTypeName("editCreditRequest")
/**
 * DTO EditCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditCreditRequest {

  private String uid;

  private Long versionOperationDate;

  private String baseSmall;

  private String number;

  private Long date;

  private String operationBase;

  private EditClientDetails clientDetails;

  private CreditType creditType;

  private Currency currency;

  private Long entryDate;

  private Long endDate;

  private BigDecimal sum;

  private Boolean sublimits;

  private String pointOfDirectPayment;

  @Valid
  private List<@Valid EditAccountDTO> accounts = new ArrayList<>();

  private Long bkiDate;

  private AgentOfSubsidy agentOfSubsidy;

  private ProgramOfSubsidy programOfSubsidy;

  private String subsidyRate;

  private Boolean creditConveyor;

  private String additionalInfo;

  private SppiTest sppiTest;

  private BusinessModel businessModel;

  @Valid
  private List<@Valid EditRedemption> redemptions = new ArrayList<>();

  @Valid
  private List<@Valid EditEarlyReturn> earlyReturns = new ArrayList<>();

  @Valid
  private List<@Valid EditLimit> limits = new ArrayList<>();

  private MarketTest marketTest;

  private Boolean formatRepayment;

  @Valid
  private List<@Valid EditCreditSchedule> generalSchedules = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditCommission> generalCommissions = new ArrayList<>();

  private Boolean verificationPassed;

  private Long eventOperationDate;

  private String additionalComment;

  private Boolean unfulfilledObligationsAbsent;

  @Valid
  private List<@Valid EditCreditEscrowObject> generalEscrows = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditInterestRate> generalRates = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditInterestOrder> generalPercents = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditPenaltys> generalPenaltys = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditReserve> generalReserves = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditF303> generalF303s = new ArrayList<>();

  @Valid
  private List<@Valid EditCreditPurposes> generalPurposes = new ArrayList<>();

  public EditCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditCreditRequest(String number, Long date, EditClientDetails clientDetails) {
    this.number = number;
    this.date = date;
    this.clientDetails = clientDetails;
  }

  public EditCreditRequest uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
  */
  
  @Schema(name = "uid", example = "36f16a79-a998-4419-82da-f2769001713f-C", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public EditCreditRequest versionOperationDate(Long versionOperationDate) {
    this.versionOperationDate = versionOperationDate;
    return this;
  }

  /**
   * Get versionOperationDate
   * @return versionOperationDate
  */
  
  @Schema(name = "versionOperationDate", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionOperationDate")
  public Long getVersionOperationDate() {
    return versionOperationDate;
  }

  public void setVersionOperationDate(Long versionOperationDate) {
    this.versionOperationDate = versionOperationDate;
  }

  public EditCreditRequest baseSmall(String baseSmall) {
    this.baseSmall = baseSmall;
    return this;
  }

  /**
   * Get baseSmall
   * @return baseSmall
  */
  
  @Schema(name = "baseSmall", example = "ДС №13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseSmall")
  public String getBaseSmall() {
    return baseSmall;
  }

  public void setBaseSmall(String baseSmall) {
    this.baseSmall = baseSmall;
  }

  public EditCreditRequest number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "90-05/15-S07", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public EditCreditRequest date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @NotNull 
  @Schema(name = "date", example = "1557057600", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public EditCreditRequest operationBase(String operationBase) {
    this.operationBase = operationBase;
    return this;
  }

  /**
   * Get operationBase
   * @return operationBase
  */
  
  @Schema(name = "operationBase", example = "Дополнительное соглашение № 1 от 31.01.2024 к Кредитному договору № 90-123/КЛ-23 от 15.02.2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationBase")
  public String getOperationBase() {
    return operationBase;
  }

  public void setOperationBase(String operationBase) {
    this.operationBase = operationBase;
  }

  public EditCreditRequest clientDetails(EditClientDetails clientDetails) {
    this.clientDetails = clientDetails;
    return this;
  }

  /**
   * Get clientDetails
   * @return clientDetails
  */
  @NotNull @Valid 
  @Schema(name = "clientDetails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clientDetails")
  public EditClientDetails getClientDetails() {
    return clientDetails;
  }

  public void setClientDetails(EditClientDetails clientDetails) {
    this.clientDetails = clientDetails;
  }

  public EditCreditRequest creditType(CreditType creditType) {
    this.creditType = creditType;
    return this;
  }

  /**
   * Get creditType
   * @return creditType
  */
  @Valid 
  @Schema(name = "creditType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditType")
  public CreditType getCreditType() {
    return creditType;
  }

  public void setCreditType(CreditType creditType) {
    this.creditType = creditType;
  }

  public EditCreditRequest currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public EditCreditRequest entryDate(Long entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Get entryDate
   * @return entryDate
  */
  
  @Schema(name = "entryDate", example = "1558057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryDate")
  public Long getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(Long entryDate) {
    this.entryDate = entryDate;
  }

  public EditCreditRequest endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", example = "1697057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public EditCreditRequest sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }

  /**
   * Get sum
   * @return sum
  */
  @Valid 
  @Schema(name = "sum", example = "4650000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sum")
  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  public EditCreditRequest sublimits(Boolean sublimits) {
    this.sublimits = sublimits;
    return this;
  }

  /**
   * Get sublimits
   * @return sublimits
  */
  
  @Schema(name = "sublimits", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sublimits")
  public Boolean getSublimits() {
    return sublimits;
  }

  public void setSublimits(Boolean sublimits) {
    this.sublimits = sublimits;
  }

  public EditCreditRequest pointOfDirectPayment(String pointOfDirectPayment) {
    this.pointOfDirectPayment = pointOfDirectPayment;
    return this;
  }

  /**
   * Get pointOfDirectPayment
   * @return pointOfDirectPayment
  */
  
  @Schema(name = "pointOfDirectPayment", example = "б/н от 10.01.2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointOfDirectPayment")
  public String getPointOfDirectPayment() {
    return pointOfDirectPayment;
  }

  public void setPointOfDirectPayment(String pointOfDirectPayment) {
    this.pointOfDirectPayment = pointOfDirectPayment;
  }

  public EditCreditRequest accounts(List<@Valid EditAccountDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public EditCreditRequest addAccountsItem(EditAccountDTO accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  */
  @Valid 
  @Schema(name = "accounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accounts")
  public List<@Valid EditAccountDTO> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<@Valid EditAccountDTO> accounts) {
    this.accounts = accounts;
  }

  public EditCreditRequest bkiDate(Long bkiDate) {
    this.bkiDate = bkiDate;
    return this;
  }

  /**
   * Get bkiDate
   * @return bkiDate
  */
  
  @Schema(name = "bkiDate", example = "1558057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bkiDate")
  public Long getBkiDate() {
    return bkiDate;
  }

  public void setBkiDate(Long bkiDate) {
    this.bkiDate = bkiDate;
  }

  public EditCreditRequest agentOfSubsidy(AgentOfSubsidy agentOfSubsidy) {
    this.agentOfSubsidy = agentOfSubsidy;
    return this;
  }

  /**
   * Get agentOfSubsidy
   * @return agentOfSubsidy
  */
  @Valid 
  @Schema(name = "agentOfSubsidy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentOfSubsidy")
  public AgentOfSubsidy getAgentOfSubsidy() {
    return agentOfSubsidy;
  }

  public void setAgentOfSubsidy(AgentOfSubsidy agentOfSubsidy) {
    this.agentOfSubsidy = agentOfSubsidy;
  }

  public EditCreditRequest programOfSubsidy(ProgramOfSubsidy programOfSubsidy) {
    this.programOfSubsidy = programOfSubsidy;
    return this;
  }

  /**
   * Get programOfSubsidy
   * @return programOfSubsidy
  */
  @Valid 
  @Schema(name = "programOfSubsidy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("programOfSubsidy")
  public ProgramOfSubsidy getProgramOfSubsidy() {
    return programOfSubsidy;
  }

  public void setProgramOfSubsidy(ProgramOfSubsidy programOfSubsidy) {
    this.programOfSubsidy = programOfSubsidy;
  }

  public EditCreditRequest subsidyRate(String subsidyRate) {
    this.subsidyRate = subsidyRate;
    return this;
  }

  /**
   * Get subsidyRate
   * @return subsidyRate
  */
  
  @Schema(name = "subsidyRate", example = "4,65%", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidyRate")
  public String getSubsidyRate() {
    return subsidyRate;
  }

  public void setSubsidyRate(String subsidyRate) {
    this.subsidyRate = subsidyRate;
  }

  public EditCreditRequest creditConveyor(Boolean creditConveyor) {
    this.creditConveyor = creditConveyor;
    return this;
  }

  /**
   * Get creditConveyor
   * @return creditConveyor
  */
  
  @Schema(name = "creditConveyor", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditConveyor")
  public Boolean getCreditConveyor() {
    return creditConveyor;
  }

  public void setCreditConveyor(Boolean creditConveyor) {
    this.creditConveyor = creditConveyor;
  }

  public EditCreditRequest additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  
  @Schema(name = "additionalInfo", example = "Дополнительная информация отсутствует", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public EditCreditRequest sppiTest(SppiTest sppiTest) {
    this.sppiTest = sppiTest;
    return this;
  }

  /**
   * Get sppiTest
   * @return sppiTest
  */
  @Valid 
  @Schema(name = "sppiTest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sppiTest")
  public SppiTest getSppiTest() {
    return sppiTest;
  }

  public void setSppiTest(SppiTest sppiTest) {
    this.sppiTest = sppiTest;
  }

  public EditCreditRequest businessModel(BusinessModel businessModel) {
    this.businessModel = businessModel;
    return this;
  }

  /**
   * Get businessModel
   * @return businessModel
  */
  @Valid 
  @Schema(name = "businessModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessModel")
  public BusinessModel getBusinessModel() {
    return businessModel;
  }

  public void setBusinessModel(BusinessModel businessModel) {
    this.businessModel = businessModel;
  }

  public EditCreditRequest redemptions(List<@Valid EditRedemption> redemptions) {
    this.redemptions = redemptions;
    return this;
  }

  public EditCreditRequest addRedemptionsItem(EditRedemption redemptionsItem) {
    if (this.redemptions == null) {
      this.redemptions = new ArrayList<>();
    }
    this.redemptions.add(redemptionsItem);
    return this;
  }

  /**
   * Get redemptions
   * @return redemptions
  */
  @Valid 
  @Schema(name = "redemptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptions")
  public List<@Valid EditRedemption> getRedemptions() {
    return redemptions;
  }

  public void setRedemptions(List<@Valid EditRedemption> redemptions) {
    this.redemptions = redemptions;
  }

  public EditCreditRequest earlyReturns(List<@Valid EditEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
    return this;
  }

  public EditCreditRequest addEarlyReturnsItem(EditEarlyReturn earlyReturnsItem) {
    if (this.earlyReturns == null) {
      this.earlyReturns = new ArrayList<>();
    }
    this.earlyReturns.add(earlyReturnsItem);
    return this;
  }

  /**
   * Get earlyReturns
   * @return earlyReturns
  */
  @Valid 
  @Schema(name = "earlyReturns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earlyReturns")
  public List<@Valid EditEarlyReturn> getEarlyReturns() {
    return earlyReturns;
  }

  public void setEarlyReturns(List<@Valid EditEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
  }

  public EditCreditRequest limits(List<@Valid EditLimit> limits) {
    this.limits = limits;
    return this;
  }

  public EditCreditRequest addLimitsItem(EditLimit limitsItem) {
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
  public List<@Valid EditLimit> getLimits() {
    return limits;
  }

  public void setLimits(List<@Valid EditLimit> limits) {
    this.limits = limits;
  }

  public EditCreditRequest marketTest(MarketTest marketTest) {
    this.marketTest = marketTest;
    return this;
  }

  /**
   * Get marketTest
   * @return marketTest
  */
  @Valid 
  @Schema(name = "marketTest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketTest")
  public MarketTest getMarketTest() {
    return marketTest;
  }

  public void setMarketTest(MarketTest marketTest) {
    this.marketTest = marketTest;
  }

  public EditCreditRequest formatRepayment(Boolean formatRepayment) {
    this.formatRepayment = formatRepayment;
    return this;
  }

  /**
   * Get formatRepayment
   * @return formatRepayment
  */
  
  @Schema(name = "formatRepayment", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatRepayment")
  public Boolean getFormatRepayment() {
    return formatRepayment;
  }

  public void setFormatRepayment(Boolean formatRepayment) {
    this.formatRepayment = formatRepayment;
  }

  public EditCreditRequest generalSchedules(List<@Valid EditCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
    return this;
  }

  public EditCreditRequest addGeneralSchedulesItem(EditCreditSchedule generalSchedulesItem) {
    if (this.generalSchedules == null) {
      this.generalSchedules = new ArrayList<>();
    }
    this.generalSchedules.add(generalSchedulesItem);
    return this;
  }

  /**
   * Get generalSchedules
   * @return generalSchedules
  */
  @Valid 
  @Schema(name = "generalSchedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalSchedules")
  public List<@Valid EditCreditSchedule> getGeneralSchedules() {
    return generalSchedules;
  }

  public void setGeneralSchedules(List<@Valid EditCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
  }

  public EditCreditRequest generalCommissions(List<@Valid EditCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
    return this;
  }

  public EditCreditRequest addGeneralCommissionsItem(EditCreditCommission generalCommissionsItem) {
    if (this.generalCommissions == null) {
      this.generalCommissions = new ArrayList<>();
    }
    this.generalCommissions.add(generalCommissionsItem);
    return this;
  }

  /**
   * Get generalCommissions
   * @return generalCommissions
  */
  @Valid 
  @Schema(name = "generalCommissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalCommissions")
  public List<@Valid EditCreditCommission> getGeneralCommissions() {
    return generalCommissions;
  }

  public void setGeneralCommissions(List<@Valid EditCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
  }

  public EditCreditRequest verificationPassed(Boolean verificationPassed) {
    this.verificationPassed = verificationPassed;
    return this;
  }

  /**
   * Get verificationPassed
   * @return verificationPassed
  */
  
  @Schema(name = "verificationPassed", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verificationPassed")
  public Boolean getVerificationPassed() {
    return verificationPassed;
  }

  public void setVerificationPassed(Boolean verificationPassed) {
    this.verificationPassed = verificationPassed;
  }

  public EditCreditRequest eventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
    return this;
  }

  /**
   * Get eventOperationDate
   * @return eventOperationDate
  */
  
  @Schema(name = "eventOperationDate", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventOperationDate")
  public Long getEventOperationDate() {
    return eventOperationDate;
  }

  public void setEventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
  }

  public EditCreditRequest additionalComment(String additionalComment) {
    this.additionalComment = additionalComment;
    return this;
  }

  /**
   * Get additionalComment
   * @return additionalComment
  */
  
  @Schema(name = "additionalComment", example = "Требуется пересчитать начисленные проценты по договору", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalComment")
  public String getAdditionalComment() {
    return additionalComment;
  }

  public void setAdditionalComment(String additionalComment) {
    this.additionalComment = additionalComment;
  }

  public EditCreditRequest unfulfilledObligationsAbsent(Boolean unfulfilledObligationsAbsent) {
    this.unfulfilledObligationsAbsent = unfulfilledObligationsAbsent;
    return this;
  }

  /**
   * Get unfulfilledObligationsAbsent
   * @return unfulfilledObligationsAbsent
  */
  
  @Schema(name = "unfulfilledObligationsAbsent", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unfulfilledObligationsAbsent")
  public Boolean getUnfulfilledObligationsAbsent() {
    return unfulfilledObligationsAbsent;
  }

  public void setUnfulfilledObligationsAbsent(Boolean unfulfilledObligationsAbsent) {
    this.unfulfilledObligationsAbsent = unfulfilledObligationsAbsent;
  }

  public EditCreditRequest generalEscrows(List<@Valid EditCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
    return this;
  }

  public EditCreditRequest addGeneralEscrowsItem(EditCreditEscrowObject generalEscrowsItem) {
    if (this.generalEscrows == null) {
      this.generalEscrows = new ArrayList<>();
    }
    this.generalEscrows.add(generalEscrowsItem);
    return this;
  }

  /**
   * Get generalEscrows
   * @return generalEscrows
  */
  @Valid 
  @Schema(name = "generalEscrows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalEscrows")
  public List<@Valid EditCreditEscrowObject> getGeneralEscrows() {
    return generalEscrows;
  }

  public void setGeneralEscrows(List<@Valid EditCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
  }

  public EditCreditRequest generalRates(List<@Valid EditCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
    return this;
  }

  public EditCreditRequest addGeneralRatesItem(EditCreditInterestRate generalRatesItem) {
    if (this.generalRates == null) {
      this.generalRates = new ArrayList<>();
    }
    this.generalRates.add(generalRatesItem);
    return this;
  }

  /**
   * Get generalRates
   * @return generalRates
  */
  @Valid 
  @Schema(name = "generalRates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalRates")
  public List<@Valid EditCreditInterestRate> getGeneralRates() {
    return generalRates;
  }

  public void setGeneralRates(List<@Valid EditCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
  }

  public EditCreditRequest generalPercents(List<@Valid EditCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
    return this;
  }

  public EditCreditRequest addGeneralPercentsItem(EditCreditInterestOrder generalPercentsItem) {
    if (this.generalPercents == null) {
      this.generalPercents = new ArrayList<>();
    }
    this.generalPercents.add(generalPercentsItem);
    return this;
  }

  /**
   * Get generalPercents
   * @return generalPercents
  */
  @Valid 
  @Schema(name = "generalPercents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalPercents")
  public List<@Valid EditCreditInterestOrder> getGeneralPercents() {
    return generalPercents;
  }

  public void setGeneralPercents(List<@Valid EditCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
  }

  public EditCreditRequest generalPenaltys(List<@Valid EditCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
    return this;
  }

  public EditCreditRequest addGeneralPenaltysItem(EditCreditPenaltys generalPenaltysItem) {
    if (this.generalPenaltys == null) {
      this.generalPenaltys = new ArrayList<>();
    }
    this.generalPenaltys.add(generalPenaltysItem);
    return this;
  }

  /**
   * Get generalPenaltys
   * @return generalPenaltys
  */
  @Valid 
  @Schema(name = "generalPenaltys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalPenaltys")
  public List<@Valid EditCreditPenaltys> getGeneralPenaltys() {
    return generalPenaltys;
  }

  public void setGeneralPenaltys(List<@Valid EditCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
  }

  public EditCreditRequest generalReserves(List<@Valid EditCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
    return this;
  }

  public EditCreditRequest addGeneralReservesItem(EditCreditReserve generalReservesItem) {
    if (this.generalReserves == null) {
      this.generalReserves = new ArrayList<>();
    }
    this.generalReserves.add(generalReservesItem);
    return this;
  }

  /**
   * Get generalReserves
   * @return generalReserves
  */
  @Valid 
  @Schema(name = "generalReserves", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalReserves")
  public List<@Valid EditCreditReserve> getGeneralReserves() {
    return generalReserves;
  }

  public void setGeneralReserves(List<@Valid EditCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
  }

  public EditCreditRequest generalF303s(List<@Valid EditCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
    return this;
  }

  public EditCreditRequest addGeneralF303sItem(EditCreditF303 generalF303sItem) {
    if (this.generalF303s == null) {
      this.generalF303s = new ArrayList<>();
    }
    this.generalF303s.add(generalF303sItem);
    return this;
  }

  /**
   * Get generalF303s
   * @return generalF303s
  */
  @Valid 
  @Schema(name = "generalF303s", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalF303s")
  public List<@Valid EditCreditF303> getGeneralF303s() {
    return generalF303s;
  }

  public void setGeneralF303s(List<@Valid EditCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
  }

  public EditCreditRequest generalPurposes(List<@Valid EditCreditPurposes> generalPurposes) {
    this.generalPurposes = generalPurposes;
    return this;
  }

  public EditCreditRequest addGeneralPurposesItem(EditCreditPurposes generalPurposesItem) {
    if (this.generalPurposes == null) {
      this.generalPurposes = new ArrayList<>();
    }
    this.generalPurposes.add(generalPurposesItem);
    return this;
  }

  /**
   * Get generalPurposes
   * @return generalPurposes
  */
  @Valid 
  @Schema(name = "generalPurposes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalPurposes")
  public List<@Valid EditCreditPurposes> getGeneralPurposes() {
    return generalPurposes;
  }

  public void setGeneralPurposes(List<@Valid EditCreditPurposes> generalPurposes) {
    this.generalPurposes = generalPurposes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditCreditRequest editCreditRequest = (EditCreditRequest) o;
    return Objects.equals(this.uid, editCreditRequest.uid) &&
        Objects.equals(this.versionOperationDate, editCreditRequest.versionOperationDate) &&
        Objects.equals(this.baseSmall, editCreditRequest.baseSmall) &&
        Objects.equals(this.number, editCreditRequest.number) &&
        Objects.equals(this.date, editCreditRequest.date) &&
        Objects.equals(this.operationBase, editCreditRequest.operationBase) &&
        Objects.equals(this.clientDetails, editCreditRequest.clientDetails) &&
        Objects.equals(this.creditType, editCreditRequest.creditType) &&
        Objects.equals(this.currency, editCreditRequest.currency) &&
        Objects.equals(this.entryDate, editCreditRequest.entryDate) &&
        Objects.equals(this.endDate, editCreditRequest.endDate) &&
        Objects.equals(this.sum, editCreditRequest.sum) &&
        Objects.equals(this.sublimits, editCreditRequest.sublimits) &&
        Objects.equals(this.pointOfDirectPayment, editCreditRequest.pointOfDirectPayment) &&
        Objects.equals(this.accounts, editCreditRequest.accounts) &&
        Objects.equals(this.bkiDate, editCreditRequest.bkiDate) &&
        Objects.equals(this.agentOfSubsidy, editCreditRequest.agentOfSubsidy) &&
        Objects.equals(this.programOfSubsidy, editCreditRequest.programOfSubsidy) &&
        Objects.equals(this.subsidyRate, editCreditRequest.subsidyRate) &&
        Objects.equals(this.creditConveyor, editCreditRequest.creditConveyor) &&
        Objects.equals(this.additionalInfo, editCreditRequest.additionalInfo) &&
        Objects.equals(this.sppiTest, editCreditRequest.sppiTest) &&
        Objects.equals(this.businessModel, editCreditRequest.businessModel) &&
        Objects.equals(this.redemptions, editCreditRequest.redemptions) &&
        Objects.equals(this.earlyReturns, editCreditRequest.earlyReturns) &&
        Objects.equals(this.limits, editCreditRequest.limits) &&
        Objects.equals(this.marketTest, editCreditRequest.marketTest) &&
        Objects.equals(this.formatRepayment, editCreditRequest.formatRepayment) &&
        Objects.equals(this.generalSchedules, editCreditRequest.generalSchedules) &&
        Objects.equals(this.generalCommissions, editCreditRequest.generalCommissions) &&
        Objects.equals(this.verificationPassed, editCreditRequest.verificationPassed) &&
        Objects.equals(this.eventOperationDate, editCreditRequest.eventOperationDate) &&
        Objects.equals(this.additionalComment, editCreditRequest.additionalComment) &&
        Objects.equals(this.unfulfilledObligationsAbsent, editCreditRequest.unfulfilledObligationsAbsent) &&
        Objects.equals(this.generalEscrows, editCreditRequest.generalEscrows) &&
        Objects.equals(this.generalRates, editCreditRequest.generalRates) &&
        Objects.equals(this.generalPercents, editCreditRequest.generalPercents) &&
        Objects.equals(this.generalPenaltys, editCreditRequest.generalPenaltys) &&
        Objects.equals(this.generalReserves, editCreditRequest.generalReserves) &&
        Objects.equals(this.generalF303s, editCreditRequest.generalF303s) &&
        Objects.equals(this.generalPurposes, editCreditRequest.generalPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, versionOperationDate, baseSmall, number, date, operationBase, clientDetails, creditType, currency, entryDate, endDate, sum, sublimits, pointOfDirectPayment, accounts, bkiDate, agentOfSubsidy, programOfSubsidy, subsidyRate, creditConveyor, additionalInfo, sppiTest, businessModel, redemptions, earlyReturns, limits, marketTest, formatRepayment, generalSchedules, generalCommissions, verificationPassed, eventOperationDate, additionalComment, unfulfilledObligationsAbsent, generalEscrows, generalRates, generalPercents, generalPenaltys, generalReserves, generalF303s, generalPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditCreditRequest {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    clientDetails: ").append(toIndentedString(clientDetails)).append("\n");
    sb.append("    creditType: ").append(toIndentedString(creditType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    sublimits: ").append(toIndentedString(sublimits)).append("\n");
    sb.append("    pointOfDirectPayment: ").append(toIndentedString(pointOfDirectPayment)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    bkiDate: ").append(toIndentedString(bkiDate)).append("\n");
    sb.append("    agentOfSubsidy: ").append(toIndentedString(agentOfSubsidy)).append("\n");
    sb.append("    programOfSubsidy: ").append(toIndentedString(programOfSubsidy)).append("\n");
    sb.append("    subsidyRate: ").append(toIndentedString(subsidyRate)).append("\n");
    sb.append("    creditConveyor: ").append(toIndentedString(creditConveyor)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    sppiTest: ").append(toIndentedString(sppiTest)).append("\n");
    sb.append("    businessModel: ").append(toIndentedString(businessModel)).append("\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    earlyReturns: ").append(toIndentedString(earlyReturns)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    marketTest: ").append(toIndentedString(marketTest)).append("\n");
    sb.append("    formatRepayment: ").append(toIndentedString(formatRepayment)).append("\n");
    sb.append("    generalSchedules: ").append(toIndentedString(generalSchedules)).append("\n");
    sb.append("    generalCommissions: ").append(toIndentedString(generalCommissions)).append("\n");
    sb.append("    verificationPassed: ").append(toIndentedString(verificationPassed)).append("\n");
    sb.append("    eventOperationDate: ").append(toIndentedString(eventOperationDate)).append("\n");
    sb.append("    additionalComment: ").append(toIndentedString(additionalComment)).append("\n");
    sb.append("    unfulfilledObligationsAbsent: ").append(toIndentedString(unfulfilledObligationsAbsent)).append("\n");
    sb.append("    generalEscrows: ").append(toIndentedString(generalEscrows)).append("\n");
    sb.append("    generalRates: ").append(toIndentedString(generalRates)).append("\n");
    sb.append("    generalPercents: ").append(toIndentedString(generalPercents)).append("\n");
    sb.append("    generalPenaltys: ").append(toIndentedString(generalPenaltys)).append("\n");
    sb.append("    generalReserves: ").append(toIndentedString(generalReserves)).append("\n");
    sb.append("    generalF303s: ").append(toIndentedString(generalF303s)).append("\n");
    sb.append("    generalPurposes: ").append(toIndentedString(generalPurposes)).append("\n");
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

