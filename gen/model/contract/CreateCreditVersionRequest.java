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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.AgentOfSubsidy;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.BusinessModel;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateAccountDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateClientDetails;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditCommission;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditEscrowObject;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditF303;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditInterestOrder;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditInterestRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditPenaltys;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditPurposes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditReserve;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateCreditSchedule;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateEarlyReturn;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateLimit;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateRedemption;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreditType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.Currency;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.DispositionType;
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
 * CreateCreditVersionRequest
 */

@JsonTypeName("createCreditVersionRequest")
/**
 * DTO CreateCreditVersionRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateCreditVersionRequest {

  private String uid;

  private Integer parentVersionNumber;

  private UUID parentBusinessId;

  private Long versionOperationDate;

  private String baseSmall;

  private String number;

  private String operationBase;

  private Long date;

  private CreateClientDetails clientDetails;

  private CreditType creditType;

  private Currency currency;

  private Long entryDate;

  private Long endDate;

  private BigDecimal sum;

  private Boolean sublimits;

  private String pointOfDirectPayment;

  @Valid
  private List<@Valid CreateAccountDTO> accounts = new ArrayList<>();

  private Long bkiDate;

  private AgentOfSubsidy agentOfSubsidy;

  private ProgramOfSubsidy programOfSubsidy;

  private String subsidyRate;

  private Boolean creditConveyor;

  private String additionalInfo;

  private SppiTest sppiTest;

  private BusinessModel businessModel;

  @Valid
  private List<@Valid CreateRedemption> redemptions = new ArrayList<>();

  @Valid
  private List<@Valid CreateEarlyReturn> earlyReturns = new ArrayList<>();

  @Valid
  private List<@Valid CreateLimit> limits = new ArrayList<>();

  private MarketTest marketTest;

  private Boolean formatRepayment;

  @Valid
  private List<@Valid CreateCreditSchedule> generalSchedules = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditCommission> generalCommissions = new ArrayList<>();

  private Boolean verificationPassed;

  private Long eventOperationDate;

  private String additionalComment;

  private DispositionType dispositionType;

  private Boolean unfulfilledObligationsAbsent;

  @Valid
  private List<@Valid CreateCreditEscrowObject> generalEscrows = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditInterestRate> generalRates = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditInterestOrder> generalPercents = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditPenaltys> generalPenaltys = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditReserve> generalReserves = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditF303> generalF303s = new ArrayList<>();

  @Valid
  private List<@Valid CreateCreditPurposes> generalPurposes = new ArrayList<>();

  public CreateCreditVersionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCreditVersionRequest(Integer parentVersionNumber, String number, Long date, CreateClientDetails clientDetails) {
    this.parentVersionNumber = parentVersionNumber;
    this.number = number;
    this.date = date;
    this.clientDetails = clientDetails;
  }

  public CreateCreditVersionRequest uid(String uid) {
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

  public CreateCreditVersionRequest parentVersionNumber(Integer parentVersionNumber) {
    this.parentVersionNumber = parentVersionNumber;
    return this;
  }

  /**
   * Get parentVersionNumber
   * @return parentVersionNumber
  */
  @NotNull 
  @Schema(name = "parentVersionNumber", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parentVersionNumber")
  public Integer getParentVersionNumber() {
    return parentVersionNumber;
  }

  public void setParentVersionNumber(Integer parentVersionNumber) {
    this.parentVersionNumber = parentVersionNumber;
  }

  public CreateCreditVersionRequest parentBusinessId(UUID parentBusinessId) {
    this.parentBusinessId = parentBusinessId;
    return this;
  }

  /**
   * Get parentBusinessId
   * @return parentBusinessId
  */
  @Valid 
  @Schema(name = "parentBusinessId", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentBusinessId")
  public UUID getParentBusinessId() {
    return parentBusinessId;
  }

  public void setParentBusinessId(UUID parentBusinessId) {
    this.parentBusinessId = parentBusinessId;
  }

  public CreateCreditVersionRequest versionOperationDate(Long versionOperationDate) {
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

  public CreateCreditVersionRequest baseSmall(String baseSmall) {
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

  public CreateCreditVersionRequest number(String number) {
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

  public CreateCreditVersionRequest operationBase(String operationBase) {
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

  public CreateCreditVersionRequest date(Long date) {
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

  public CreateCreditVersionRequest clientDetails(CreateClientDetails clientDetails) {
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
  public CreateClientDetails getClientDetails() {
    return clientDetails;
  }

  public void setClientDetails(CreateClientDetails clientDetails) {
    this.clientDetails = clientDetails;
  }

  public CreateCreditVersionRequest creditType(CreditType creditType) {
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

  public CreateCreditVersionRequest currency(Currency currency) {
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

  public CreateCreditVersionRequest entryDate(Long entryDate) {
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

  public CreateCreditVersionRequest endDate(Long endDate) {
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

  public CreateCreditVersionRequest sum(BigDecimal sum) {
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

  public CreateCreditVersionRequest sublimits(Boolean sublimits) {
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

  public CreateCreditVersionRequest pointOfDirectPayment(String pointOfDirectPayment) {
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

  public CreateCreditVersionRequest accounts(List<@Valid CreateAccountDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CreateCreditVersionRequest addAccountsItem(CreateAccountDTO accountsItem) {
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
  public List<@Valid CreateAccountDTO> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<@Valid CreateAccountDTO> accounts) {
    this.accounts = accounts;
  }

  public CreateCreditVersionRequest bkiDate(Long bkiDate) {
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

  public CreateCreditVersionRequest agentOfSubsidy(AgentOfSubsidy agentOfSubsidy) {
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

  public CreateCreditVersionRequest programOfSubsidy(ProgramOfSubsidy programOfSubsidy) {
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

  public CreateCreditVersionRequest subsidyRate(String subsidyRate) {
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

  public CreateCreditVersionRequest creditConveyor(Boolean creditConveyor) {
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

  public CreateCreditVersionRequest additionalInfo(String additionalInfo) {
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

  public CreateCreditVersionRequest sppiTest(SppiTest sppiTest) {
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

  public CreateCreditVersionRequest businessModel(BusinessModel businessModel) {
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

  public CreateCreditVersionRequest redemptions(List<@Valid CreateRedemption> redemptions) {
    this.redemptions = redemptions;
    return this;
  }

  public CreateCreditVersionRequest addRedemptionsItem(CreateRedemption redemptionsItem) {
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
  public List<@Valid CreateRedemption> getRedemptions() {
    return redemptions;
  }

  public void setRedemptions(List<@Valid CreateRedemption> redemptions) {
    this.redemptions = redemptions;
  }

  public CreateCreditVersionRequest earlyReturns(List<@Valid CreateEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
    return this;
  }

  public CreateCreditVersionRequest addEarlyReturnsItem(CreateEarlyReturn earlyReturnsItem) {
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
  public List<@Valid CreateEarlyReturn> getEarlyReturns() {
    return earlyReturns;
  }

  public void setEarlyReturns(List<@Valid CreateEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
  }

  public CreateCreditVersionRequest limits(List<@Valid CreateLimit> limits) {
    this.limits = limits;
    return this;
  }

  public CreateCreditVersionRequest addLimitsItem(CreateLimit limitsItem) {
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
  public List<@Valid CreateLimit> getLimits() {
    return limits;
  }

  public void setLimits(List<@Valid CreateLimit> limits) {
    this.limits = limits;
  }

  public CreateCreditVersionRequest marketTest(MarketTest marketTest) {
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

  public CreateCreditVersionRequest formatRepayment(Boolean formatRepayment) {
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

  public CreateCreditVersionRequest generalSchedules(List<@Valid CreateCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
    return this;
  }

  public CreateCreditVersionRequest addGeneralSchedulesItem(CreateCreditSchedule generalSchedulesItem) {
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
  public List<@Valid CreateCreditSchedule> getGeneralSchedules() {
    return generalSchedules;
  }

  public void setGeneralSchedules(List<@Valid CreateCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
  }

  public CreateCreditVersionRequest generalCommissions(List<@Valid CreateCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
    return this;
  }

  public CreateCreditVersionRequest addGeneralCommissionsItem(CreateCreditCommission generalCommissionsItem) {
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
  public List<@Valid CreateCreditCommission> getGeneralCommissions() {
    return generalCommissions;
  }

  public void setGeneralCommissions(List<@Valid CreateCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
  }

  public CreateCreditVersionRequest verificationPassed(Boolean verificationPassed) {
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

  public CreateCreditVersionRequest eventOperationDate(Long eventOperationDate) {
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

  public CreateCreditVersionRequest additionalComment(String additionalComment) {
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

  public CreateCreditVersionRequest dispositionType(DispositionType dispositionType) {
    this.dispositionType = dispositionType;
    return this;
  }

  /**
   * Get dispositionType
   * @return dispositionType
  */
  @Valid 
  @Schema(name = "dispositionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dispositionType")
  public DispositionType getDispositionType() {
    return dispositionType;
  }

  public void setDispositionType(DispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  public CreateCreditVersionRequest unfulfilledObligationsAbsent(Boolean unfulfilledObligationsAbsent) {
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

  public CreateCreditVersionRequest generalEscrows(List<@Valid CreateCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
    return this;
  }

  public CreateCreditVersionRequest addGeneralEscrowsItem(CreateCreditEscrowObject generalEscrowsItem) {
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
  public List<@Valid CreateCreditEscrowObject> getGeneralEscrows() {
    return generalEscrows;
  }

  public void setGeneralEscrows(List<@Valid CreateCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
  }

  public CreateCreditVersionRequest generalRates(List<@Valid CreateCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
    return this;
  }

  public CreateCreditVersionRequest addGeneralRatesItem(CreateCreditInterestRate generalRatesItem) {
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
  public List<@Valid CreateCreditInterestRate> getGeneralRates() {
    return generalRates;
  }

  public void setGeneralRates(List<@Valid CreateCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
  }

  public CreateCreditVersionRequest generalPercents(List<@Valid CreateCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
    return this;
  }

  public CreateCreditVersionRequest addGeneralPercentsItem(CreateCreditInterestOrder generalPercentsItem) {
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
  public List<@Valid CreateCreditInterestOrder> getGeneralPercents() {
    return generalPercents;
  }

  public void setGeneralPercents(List<@Valid CreateCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
  }

  public CreateCreditVersionRequest generalPenaltys(List<@Valid CreateCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
    return this;
  }

  public CreateCreditVersionRequest addGeneralPenaltysItem(CreateCreditPenaltys generalPenaltysItem) {
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
  public List<@Valid CreateCreditPenaltys> getGeneralPenaltys() {
    return generalPenaltys;
  }

  public void setGeneralPenaltys(List<@Valid CreateCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
  }

  public CreateCreditVersionRequest generalReserves(List<@Valid CreateCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
    return this;
  }

  public CreateCreditVersionRequest addGeneralReservesItem(CreateCreditReserve generalReservesItem) {
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
  public List<@Valid CreateCreditReserve> getGeneralReserves() {
    return generalReserves;
  }

  public void setGeneralReserves(List<@Valid CreateCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
  }

  public CreateCreditVersionRequest generalF303s(List<@Valid CreateCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
    return this;
  }

  public CreateCreditVersionRequest addGeneralF303sItem(CreateCreditF303 generalF303sItem) {
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
  public List<@Valid CreateCreditF303> getGeneralF303s() {
    return generalF303s;
  }

  public void setGeneralF303s(List<@Valid CreateCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
  }

  public CreateCreditVersionRequest generalPurposes(List<@Valid CreateCreditPurposes> generalPurposes) {
    this.generalPurposes = generalPurposes;
    return this;
  }

  public CreateCreditVersionRequest addGeneralPurposesItem(CreateCreditPurposes generalPurposesItem) {
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
  public List<@Valid CreateCreditPurposes> getGeneralPurposes() {
    return generalPurposes;
  }

  public void setGeneralPurposes(List<@Valid CreateCreditPurposes> generalPurposes) {
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
    CreateCreditVersionRequest createCreditVersionRequest = (CreateCreditVersionRequest) o;
    return Objects.equals(this.uid, createCreditVersionRequest.uid) &&
        Objects.equals(this.parentVersionNumber, createCreditVersionRequest.parentVersionNumber) &&
        Objects.equals(this.parentBusinessId, createCreditVersionRequest.parentBusinessId) &&
        Objects.equals(this.versionOperationDate, createCreditVersionRequest.versionOperationDate) &&
        Objects.equals(this.baseSmall, createCreditVersionRequest.baseSmall) &&
        Objects.equals(this.number, createCreditVersionRequest.number) &&
        Objects.equals(this.operationBase, createCreditVersionRequest.operationBase) &&
        Objects.equals(this.date, createCreditVersionRequest.date) &&
        Objects.equals(this.clientDetails, createCreditVersionRequest.clientDetails) &&
        Objects.equals(this.creditType, createCreditVersionRequest.creditType) &&
        Objects.equals(this.currency, createCreditVersionRequest.currency) &&
        Objects.equals(this.entryDate, createCreditVersionRequest.entryDate) &&
        Objects.equals(this.endDate, createCreditVersionRequest.endDate) &&
        Objects.equals(this.sum, createCreditVersionRequest.sum) &&
        Objects.equals(this.sublimits, createCreditVersionRequest.sublimits) &&
        Objects.equals(this.pointOfDirectPayment, createCreditVersionRequest.pointOfDirectPayment) &&
        Objects.equals(this.accounts, createCreditVersionRequest.accounts) &&
        Objects.equals(this.bkiDate, createCreditVersionRequest.bkiDate) &&
        Objects.equals(this.agentOfSubsidy, createCreditVersionRequest.agentOfSubsidy) &&
        Objects.equals(this.programOfSubsidy, createCreditVersionRequest.programOfSubsidy) &&
        Objects.equals(this.subsidyRate, createCreditVersionRequest.subsidyRate) &&
        Objects.equals(this.creditConveyor, createCreditVersionRequest.creditConveyor) &&
        Objects.equals(this.additionalInfo, createCreditVersionRequest.additionalInfo) &&
        Objects.equals(this.sppiTest, createCreditVersionRequest.sppiTest) &&
        Objects.equals(this.businessModel, createCreditVersionRequest.businessModel) &&
        Objects.equals(this.redemptions, createCreditVersionRequest.redemptions) &&
        Objects.equals(this.earlyReturns, createCreditVersionRequest.earlyReturns) &&
        Objects.equals(this.limits, createCreditVersionRequest.limits) &&
        Objects.equals(this.marketTest, createCreditVersionRequest.marketTest) &&
        Objects.equals(this.formatRepayment, createCreditVersionRequest.formatRepayment) &&
        Objects.equals(this.generalSchedules, createCreditVersionRequest.generalSchedules) &&
        Objects.equals(this.generalCommissions, createCreditVersionRequest.generalCommissions) &&
        Objects.equals(this.verificationPassed, createCreditVersionRequest.verificationPassed) &&
        Objects.equals(this.eventOperationDate, createCreditVersionRequest.eventOperationDate) &&
        Objects.equals(this.additionalComment, createCreditVersionRequest.additionalComment) &&
        Objects.equals(this.dispositionType, createCreditVersionRequest.dispositionType) &&
        Objects.equals(this.unfulfilledObligationsAbsent, createCreditVersionRequest.unfulfilledObligationsAbsent) &&
        Objects.equals(this.generalEscrows, createCreditVersionRequest.generalEscrows) &&
        Objects.equals(this.generalRates, createCreditVersionRequest.generalRates) &&
        Objects.equals(this.generalPercents, createCreditVersionRequest.generalPercents) &&
        Objects.equals(this.generalPenaltys, createCreditVersionRequest.generalPenaltys) &&
        Objects.equals(this.generalReserves, createCreditVersionRequest.generalReserves) &&
        Objects.equals(this.generalF303s, createCreditVersionRequest.generalF303s) &&
        Objects.equals(this.generalPurposes, createCreditVersionRequest.generalPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, parentVersionNumber, parentBusinessId, versionOperationDate, baseSmall, number, operationBase, date, clientDetails, creditType, currency, entryDate, endDate, sum, sublimits, pointOfDirectPayment, accounts, bkiDate, agentOfSubsidy, programOfSubsidy, subsidyRate, creditConveyor, additionalInfo, sppiTest, businessModel, redemptions, earlyReturns, limits, marketTest, formatRepayment, generalSchedules, generalCommissions, verificationPassed, eventOperationDate, additionalComment, dispositionType, unfulfilledObligationsAbsent, generalEscrows, generalRates, generalPercents, generalPenaltys, generalReserves, generalF303s, generalPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCreditVersionRequest {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    parentVersionNumber: ").append(toIndentedString(parentVersionNumber)).append("\n");
    sb.append("    parentBusinessId: ").append(toIndentedString(parentBusinessId)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    sb.append("    dispositionType: ").append(toIndentedString(dispositionType)).append("\n");
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

