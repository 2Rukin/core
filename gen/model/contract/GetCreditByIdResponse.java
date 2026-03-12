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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.AgentOfSubsidy;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.BusinessModel;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractTypes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractVersionStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreditType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.Currency;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.DispositionType;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAccountDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetClientDetails;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditCommission;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditEscrowObject;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditF303;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditInterestOrder;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditInterestRate;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditPenaltys;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditPurposes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditReserve;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetCreditSchedule;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetEarlyReturn;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetLimit;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetRedemption;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetUserInfo;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.MarketTest;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ProgramOfSubsidy;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.SppiTest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetCreditByIdResponse
 */

@JsonTypeName("getCreditByIdResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetCreditByIdResponse {

  private UUID id;

  private String uid;

  private Integer versionNumber;

  private Boolean isLastVersion;

  private ContractTypes type;

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  private String number;

  private Long date;

  private String operationBase;

  private GetClientDetails clientDetails;

  private CreditType creditType;

  private Currency currency;

  private Long entryDate;

  private Long endDate;

  private BigDecimal sum;

  private Boolean sublimits;

  private String pointOfDirectPayment;

  @Valid
  private List<@Valid GetAccountDTO> accounts = new ArrayList<>();

  private Long bkiDate;

  private AgentOfSubsidy agentOfSubsidy;

  private ProgramOfSubsidy programOfSubsidy;

  private String subsidyRate;

  private Boolean creditConveyor;

  private String additionalInfo;

  private SppiTest sppiTest;

  private BusinessModel businessModel;

  @Valid
  private List<@Valid GetRedemption> redemptions = new ArrayList<>();

  @Valid
  private List<@Valid GetEarlyReturn> earlyReturns = new ArrayList<>();

  @Valid
  private List<@Valid GetLimit> limits = new ArrayList<>();

  private MarketTest marketTest;

  private Boolean formatRepayment;

  @Valid
  private List<@Valid GetCreditSchedule> generalSchedules = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditCommission> generalCommissions = new ArrayList<>();

  private Boolean isDifferentVersion;

  private Long versionOperationDate;

  private String baseSmall;

  private Long versionStatusLastUpdated;

  private Long createdAt;

  private GetUserInfo createdBy;

  private Long lastUpdatedAt;

  private GetUserInfo lastUpdatedBy;

  private Boolean verificationPassed;

  private Long eventOperationDate;

  private String additionalComment;

  private DispositionType dispositionType;

  private Boolean unfulfilledObligationsAbsent;

  @Valid
  private List<@Valid GetCreditEscrowObject> generalEscrows = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditInterestRate> generalRates = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditInterestOrder> generalPercents = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditPenaltys> generalPenaltys = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditReserve> generalReserves = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditF303> generalF303s = new ArrayList<>();

  @Valid
  private List<@Valid GetCreditPurposes> generalPurposes = new ArrayList<>();

  public GetCreditByIdResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCreditByIdResponse(UUID id, Integer versionNumber, ContractTypes type, ContractStatus contractStatus, ContractVersionStatus versionStatus, String number, Long date, GetClientDetails clientDetails) {
    this.id = id;
    this.versionNumber = versionNumber;
    this.type = type;
    this.contractStatus = contractStatus;
    this.versionStatus = versionStatus;
    this.number = number;
    this.date = date;
    this.clientDetails = clientDetails;
  }

  public GetCreditByIdResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetCreditByIdResponse uid(String uid) {
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

  public GetCreditByIdResponse versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  @NotNull 
  @Schema(name = "versionNumber", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionNumber")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  public GetCreditByIdResponse isLastVersion(Boolean isLastVersion) {
    this.isLastVersion = isLastVersion;
    return this;
  }

  /**
   * Get isLastVersion
   * @return isLastVersion
  */
  
  @Schema(name = "isLastVersion", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLastVersion")
  public Boolean getIsLastVersion() {
    return isLastVersion;
  }

  public void setIsLastVersion(Boolean isLastVersion) {
    this.isLastVersion = isLastVersion;
  }

  public GetCreditByIdResponse type(ContractTypes type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public ContractTypes getType() {
    return type;
  }

  public void setType(ContractTypes type) {
    this.type = type;
  }

  public GetCreditByIdResponse contractStatus(ContractStatus contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * Get contractStatus
   * @return contractStatus
  */
  @NotNull @Valid 
  @Schema(name = "contractStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractStatus")
  public ContractStatus getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(ContractStatus contractStatus) {
    this.contractStatus = contractStatus;
  }

  public GetCreditByIdResponse versionStatus(ContractVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
    return this;
  }

  /**
   * Get versionStatus
   * @return versionStatus
  */
  @NotNull @Valid 
  @Schema(name = "versionStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionStatus")
  public ContractVersionStatus getVersionStatus() {
    return versionStatus;
  }

  public void setVersionStatus(ContractVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
  }

  public GetCreditByIdResponse number(String number) {
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

  public GetCreditByIdResponse date(Long date) {
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

  public GetCreditByIdResponse operationBase(String operationBase) {
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

  public GetCreditByIdResponse clientDetails(GetClientDetails clientDetails) {
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
  public GetClientDetails getClientDetails() {
    return clientDetails;
  }

  public void setClientDetails(GetClientDetails clientDetails) {
    this.clientDetails = clientDetails;
  }

  public GetCreditByIdResponse creditType(CreditType creditType) {
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

  public GetCreditByIdResponse currency(Currency currency) {
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

  public GetCreditByIdResponse entryDate(Long entryDate) {
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

  public GetCreditByIdResponse endDate(Long endDate) {
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

  public GetCreditByIdResponse sum(BigDecimal sum) {
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

  public GetCreditByIdResponse sublimits(Boolean sublimits) {
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

  public GetCreditByIdResponse pointOfDirectPayment(String pointOfDirectPayment) {
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

  public GetCreditByIdResponse accounts(List<@Valid GetAccountDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public GetCreditByIdResponse addAccountsItem(GetAccountDTO accountsItem) {
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
  public List<@Valid GetAccountDTO> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<@Valid GetAccountDTO> accounts) {
    this.accounts = accounts;
  }

  public GetCreditByIdResponse bkiDate(Long bkiDate) {
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

  public GetCreditByIdResponse agentOfSubsidy(AgentOfSubsidy agentOfSubsidy) {
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

  public GetCreditByIdResponse programOfSubsidy(ProgramOfSubsidy programOfSubsidy) {
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

  public GetCreditByIdResponse subsidyRate(String subsidyRate) {
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

  public GetCreditByIdResponse creditConveyor(Boolean creditConveyor) {
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

  public GetCreditByIdResponse additionalInfo(String additionalInfo) {
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

  public GetCreditByIdResponse sppiTest(SppiTest sppiTest) {
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

  public GetCreditByIdResponse businessModel(BusinessModel businessModel) {
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

  public GetCreditByIdResponse redemptions(List<@Valid GetRedemption> redemptions) {
    this.redemptions = redemptions;
    return this;
  }

  public GetCreditByIdResponse addRedemptionsItem(GetRedemption redemptionsItem) {
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
  public List<@Valid GetRedemption> getRedemptions() {
    return redemptions;
  }

  public void setRedemptions(List<@Valid GetRedemption> redemptions) {
    this.redemptions = redemptions;
  }

  public GetCreditByIdResponse earlyReturns(List<@Valid GetEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
    return this;
  }

  public GetCreditByIdResponse addEarlyReturnsItem(GetEarlyReturn earlyReturnsItem) {
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
  public List<@Valid GetEarlyReturn> getEarlyReturns() {
    return earlyReturns;
  }

  public void setEarlyReturns(List<@Valid GetEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
  }

  public GetCreditByIdResponse limits(List<@Valid GetLimit> limits) {
    this.limits = limits;
    return this;
  }

  public GetCreditByIdResponse addLimitsItem(GetLimit limitsItem) {
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
  public List<@Valid GetLimit> getLimits() {
    return limits;
  }

  public void setLimits(List<@Valid GetLimit> limits) {
    this.limits = limits;
  }

  public GetCreditByIdResponse marketTest(MarketTest marketTest) {
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

  public GetCreditByIdResponse formatRepayment(Boolean formatRepayment) {
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

  public GetCreditByIdResponse generalSchedules(List<@Valid GetCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
    return this;
  }

  public GetCreditByIdResponse addGeneralSchedulesItem(GetCreditSchedule generalSchedulesItem) {
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
  public List<@Valid GetCreditSchedule> getGeneralSchedules() {
    return generalSchedules;
  }

  public void setGeneralSchedules(List<@Valid GetCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
  }

  public GetCreditByIdResponse generalCommissions(List<@Valid GetCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
    return this;
  }

  public GetCreditByIdResponse addGeneralCommissionsItem(GetCreditCommission generalCommissionsItem) {
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
  public List<@Valid GetCreditCommission> getGeneralCommissions() {
    return generalCommissions;
  }

  public void setGeneralCommissions(List<@Valid GetCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
  }

  public GetCreditByIdResponse isDifferentVersion(Boolean isDifferentVersion) {
    this.isDifferentVersion = isDifferentVersion;
    return this;
  }

  /**
   * Get isDifferentVersion
   * @return isDifferentVersion
  */
  
  @Schema(name = "isDifferentVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDifferentVersion")
  public Boolean getIsDifferentVersion() {
    return isDifferentVersion;
  }

  public void setIsDifferentVersion(Boolean isDifferentVersion) {
    this.isDifferentVersion = isDifferentVersion;
  }

  public GetCreditByIdResponse versionOperationDate(Long versionOperationDate) {
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

  public GetCreditByIdResponse baseSmall(String baseSmall) {
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

  public GetCreditByIdResponse versionStatusLastUpdated(Long versionStatusLastUpdated) {
    this.versionStatusLastUpdated = versionStatusLastUpdated;
    return this;
  }

  /**
   * Get versionStatusLastUpdated
   * @return versionStatusLastUpdated
  */
  
  @Schema(name = "versionStatusLastUpdated", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionStatusLastUpdated")
  public Long getVersionStatusLastUpdated() {
    return versionStatusLastUpdated;
  }

  public void setVersionStatusLastUpdated(Long versionStatusLastUpdated) {
    this.versionStatusLastUpdated = versionStatusLastUpdated;
  }

  public GetCreditByIdResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "createdAt", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public GetCreditByIdResponse createdBy(GetUserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @Valid 
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public GetUserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(GetUserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public GetCreditByIdResponse lastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  */
  
  @Schema(name = "lastUpdatedAt", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdatedAt")
  public Long getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public GetCreditByIdResponse lastUpdatedBy(GetUserInfo lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  */
  @Valid 
  @Schema(name = "lastUpdatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdatedBy")
  public GetUserInfo getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(GetUserInfo lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public GetCreditByIdResponse verificationPassed(Boolean verificationPassed) {
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

  public GetCreditByIdResponse eventOperationDate(Long eventOperationDate) {
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

  public GetCreditByIdResponse additionalComment(String additionalComment) {
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

  public GetCreditByIdResponse dispositionType(DispositionType dispositionType) {
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

  public GetCreditByIdResponse unfulfilledObligationsAbsent(Boolean unfulfilledObligationsAbsent) {
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

  public GetCreditByIdResponse generalEscrows(List<@Valid GetCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
    return this;
  }

  public GetCreditByIdResponse addGeneralEscrowsItem(GetCreditEscrowObject generalEscrowsItem) {
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
  public List<@Valid GetCreditEscrowObject> getGeneralEscrows() {
    return generalEscrows;
  }

  public void setGeneralEscrows(List<@Valid GetCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
  }

  public GetCreditByIdResponse generalRates(List<@Valid GetCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
    return this;
  }

  public GetCreditByIdResponse addGeneralRatesItem(GetCreditInterestRate generalRatesItem) {
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
  public List<@Valid GetCreditInterestRate> getGeneralRates() {
    return generalRates;
  }

  public void setGeneralRates(List<@Valid GetCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
  }

  public GetCreditByIdResponse generalPercents(List<@Valid GetCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
    return this;
  }

  public GetCreditByIdResponse addGeneralPercentsItem(GetCreditInterestOrder generalPercentsItem) {
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
  public List<@Valid GetCreditInterestOrder> getGeneralPercents() {
    return generalPercents;
  }

  public void setGeneralPercents(List<@Valid GetCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
  }

  public GetCreditByIdResponse generalPenaltys(List<@Valid GetCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
    return this;
  }

  public GetCreditByIdResponse addGeneralPenaltysItem(GetCreditPenaltys generalPenaltysItem) {
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
  public List<@Valid GetCreditPenaltys> getGeneralPenaltys() {
    return generalPenaltys;
  }

  public void setGeneralPenaltys(List<@Valid GetCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
  }

  public GetCreditByIdResponse generalReserves(List<@Valid GetCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
    return this;
  }

  public GetCreditByIdResponse addGeneralReservesItem(GetCreditReserve generalReservesItem) {
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
  public List<@Valid GetCreditReserve> getGeneralReserves() {
    return generalReserves;
  }

  public void setGeneralReserves(List<@Valid GetCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
  }

  public GetCreditByIdResponse generalF303s(List<@Valid GetCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
    return this;
  }

  public GetCreditByIdResponse addGeneralF303sItem(GetCreditF303 generalF303sItem) {
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
  public List<@Valid GetCreditF303> getGeneralF303s() {
    return generalF303s;
  }

  public void setGeneralF303s(List<@Valid GetCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
  }

  public GetCreditByIdResponse generalPurposes(List<@Valid GetCreditPurposes> generalPurposes) {
    this.generalPurposes = generalPurposes;
    return this;
  }

  public GetCreditByIdResponse addGeneralPurposesItem(GetCreditPurposes generalPurposesItem) {
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
  public List<@Valid GetCreditPurposes> getGeneralPurposes() {
    return generalPurposes;
  }

  public void setGeneralPurposes(List<@Valid GetCreditPurposes> generalPurposes) {
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
    GetCreditByIdResponse getCreditByIdResponse = (GetCreditByIdResponse) o;
    return Objects.equals(this.id, getCreditByIdResponse.id) &&
        Objects.equals(this.uid, getCreditByIdResponse.uid) &&
        Objects.equals(this.versionNumber, getCreditByIdResponse.versionNumber) &&
        Objects.equals(this.isLastVersion, getCreditByIdResponse.isLastVersion) &&
        Objects.equals(this.type, getCreditByIdResponse.type) &&
        Objects.equals(this.contractStatus, getCreditByIdResponse.contractStatus) &&
        Objects.equals(this.versionStatus, getCreditByIdResponse.versionStatus) &&
        Objects.equals(this.number, getCreditByIdResponse.number) &&
        Objects.equals(this.date, getCreditByIdResponse.date) &&
        Objects.equals(this.operationBase, getCreditByIdResponse.operationBase) &&
        Objects.equals(this.clientDetails, getCreditByIdResponse.clientDetails) &&
        Objects.equals(this.creditType, getCreditByIdResponse.creditType) &&
        Objects.equals(this.currency, getCreditByIdResponse.currency) &&
        Objects.equals(this.entryDate, getCreditByIdResponse.entryDate) &&
        Objects.equals(this.endDate, getCreditByIdResponse.endDate) &&
        Objects.equals(this.sum, getCreditByIdResponse.sum) &&
        Objects.equals(this.sublimits, getCreditByIdResponse.sublimits) &&
        Objects.equals(this.pointOfDirectPayment, getCreditByIdResponse.pointOfDirectPayment) &&
        Objects.equals(this.accounts, getCreditByIdResponse.accounts) &&
        Objects.equals(this.bkiDate, getCreditByIdResponse.bkiDate) &&
        Objects.equals(this.agentOfSubsidy, getCreditByIdResponse.agentOfSubsidy) &&
        Objects.equals(this.programOfSubsidy, getCreditByIdResponse.programOfSubsidy) &&
        Objects.equals(this.subsidyRate, getCreditByIdResponse.subsidyRate) &&
        Objects.equals(this.creditConveyor, getCreditByIdResponse.creditConveyor) &&
        Objects.equals(this.additionalInfo, getCreditByIdResponse.additionalInfo) &&
        Objects.equals(this.sppiTest, getCreditByIdResponse.sppiTest) &&
        Objects.equals(this.businessModel, getCreditByIdResponse.businessModel) &&
        Objects.equals(this.redemptions, getCreditByIdResponse.redemptions) &&
        Objects.equals(this.earlyReturns, getCreditByIdResponse.earlyReturns) &&
        Objects.equals(this.limits, getCreditByIdResponse.limits) &&
        Objects.equals(this.marketTest, getCreditByIdResponse.marketTest) &&
        Objects.equals(this.formatRepayment, getCreditByIdResponse.formatRepayment) &&
        Objects.equals(this.generalSchedules, getCreditByIdResponse.generalSchedules) &&
        Objects.equals(this.generalCommissions, getCreditByIdResponse.generalCommissions) &&
        Objects.equals(this.isDifferentVersion, getCreditByIdResponse.isDifferentVersion) &&
        Objects.equals(this.versionOperationDate, getCreditByIdResponse.versionOperationDate) &&
        Objects.equals(this.baseSmall, getCreditByIdResponse.baseSmall) &&
        Objects.equals(this.versionStatusLastUpdated, getCreditByIdResponse.versionStatusLastUpdated) &&
        Objects.equals(this.createdAt, getCreditByIdResponse.createdAt) &&
        Objects.equals(this.createdBy, getCreditByIdResponse.createdBy) &&
        Objects.equals(this.lastUpdatedAt, getCreditByIdResponse.lastUpdatedAt) &&
        Objects.equals(this.lastUpdatedBy, getCreditByIdResponse.lastUpdatedBy) &&
        Objects.equals(this.verificationPassed, getCreditByIdResponse.verificationPassed) &&
        Objects.equals(this.eventOperationDate, getCreditByIdResponse.eventOperationDate) &&
        Objects.equals(this.additionalComment, getCreditByIdResponse.additionalComment) &&
        Objects.equals(this.dispositionType, getCreditByIdResponse.dispositionType) &&
        Objects.equals(this.unfulfilledObligationsAbsent, getCreditByIdResponse.unfulfilledObligationsAbsent) &&
        Objects.equals(this.generalEscrows, getCreditByIdResponse.generalEscrows) &&
        Objects.equals(this.generalRates, getCreditByIdResponse.generalRates) &&
        Objects.equals(this.generalPercents, getCreditByIdResponse.generalPercents) &&
        Objects.equals(this.generalPenaltys, getCreditByIdResponse.generalPenaltys) &&
        Objects.equals(this.generalReserves, getCreditByIdResponse.generalReserves) &&
        Objects.equals(this.generalF303s, getCreditByIdResponse.generalF303s) &&
        Objects.equals(this.generalPurposes, getCreditByIdResponse.generalPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, versionNumber, isLastVersion, type, contractStatus, versionStatus, number, date, operationBase, clientDetails, creditType, currency, entryDate, endDate, sum, sublimits, pointOfDirectPayment, accounts, bkiDate, agentOfSubsidy, programOfSubsidy, subsidyRate, creditConveyor, additionalInfo, sppiTest, businessModel, redemptions, earlyReturns, limits, marketTest, formatRepayment, generalSchedules, generalCommissions, isDifferentVersion, versionOperationDate, baseSmall, versionStatusLastUpdated, createdAt, createdBy, lastUpdatedAt, lastUpdatedBy, verificationPassed, eventOperationDate, additionalComment, dispositionType, unfulfilledObligationsAbsent, generalEscrows, generalRates, generalPercents, generalPenaltys, generalReserves, generalF303s, generalPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCreditByIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    isLastVersion: ").append(toIndentedString(isLastVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
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
    sb.append("    isDifferentVersion: ").append(toIndentedString(isDifferentVersion)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
    sb.append("    versionStatusLastUpdated: ").append(toIndentedString(versionStatusLastUpdated)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
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

