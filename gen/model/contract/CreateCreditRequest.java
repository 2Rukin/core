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
 * CreateCreditRequest
 */

@JsonTypeName("createCreditRequest")
/**
 * DTO CreateCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateCreditRequest {

  private String uid;

  private String number;

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

  public CreateCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCreditRequest(String number, Long date, CreateClientDetails clientDetails) {
    this.number = number;
    this.date = date;
    this.clientDetails = clientDetails;
  }

  public CreateCreditRequest uid(String uid) {
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

  public CreateCreditRequest number(String number) {
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

  public CreateCreditRequest date(Long date) {
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

  public CreateCreditRequest clientDetails(CreateClientDetails clientDetails) {
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

  public CreateCreditRequest creditType(CreditType creditType) {
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

  public CreateCreditRequest currency(Currency currency) {
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

  public CreateCreditRequest entryDate(Long entryDate) {
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

  public CreateCreditRequest endDate(Long endDate) {
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

  public CreateCreditRequest sum(BigDecimal sum) {
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

  public CreateCreditRequest sublimits(Boolean sublimits) {
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

  public CreateCreditRequest pointOfDirectPayment(String pointOfDirectPayment) {
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

  public CreateCreditRequest accounts(List<@Valid CreateAccountDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CreateCreditRequest addAccountsItem(CreateAccountDTO accountsItem) {
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

  public CreateCreditRequest bkiDate(Long bkiDate) {
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

  public CreateCreditRequest agentOfSubsidy(AgentOfSubsidy agentOfSubsidy) {
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

  public CreateCreditRequest programOfSubsidy(ProgramOfSubsidy programOfSubsidy) {
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

  public CreateCreditRequest subsidyRate(String subsidyRate) {
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

  public CreateCreditRequest creditConveyor(Boolean creditConveyor) {
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

  public CreateCreditRequest additionalInfo(String additionalInfo) {
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

  public CreateCreditRequest sppiTest(SppiTest sppiTest) {
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

  public CreateCreditRequest businessModel(BusinessModel businessModel) {
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

  public CreateCreditRequest redemptions(List<@Valid CreateRedemption> redemptions) {
    this.redemptions = redemptions;
    return this;
  }

  public CreateCreditRequest addRedemptionsItem(CreateRedemption redemptionsItem) {
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

  public CreateCreditRequest earlyReturns(List<@Valid CreateEarlyReturn> earlyReturns) {
    this.earlyReturns = earlyReturns;
    return this;
  }

  public CreateCreditRequest addEarlyReturnsItem(CreateEarlyReturn earlyReturnsItem) {
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

  public CreateCreditRequest limits(List<@Valid CreateLimit> limits) {
    this.limits = limits;
    return this;
  }

  public CreateCreditRequest addLimitsItem(CreateLimit limitsItem) {
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

  public CreateCreditRequest marketTest(MarketTest marketTest) {
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

  public CreateCreditRequest formatRepayment(Boolean formatRepayment) {
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

  public CreateCreditRequest generalSchedules(List<@Valid CreateCreditSchedule> generalSchedules) {
    this.generalSchedules = generalSchedules;
    return this;
  }

  public CreateCreditRequest addGeneralSchedulesItem(CreateCreditSchedule generalSchedulesItem) {
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

  public CreateCreditRequest generalCommissions(List<@Valid CreateCreditCommission> generalCommissions) {
    this.generalCommissions = generalCommissions;
    return this;
  }

  public CreateCreditRequest addGeneralCommissionsItem(CreateCreditCommission generalCommissionsItem) {
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

  public CreateCreditRequest verificationPassed(Boolean verificationPassed) {
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

  public CreateCreditRequest generalEscrows(List<@Valid CreateCreditEscrowObject> generalEscrows) {
    this.generalEscrows = generalEscrows;
    return this;
  }

  public CreateCreditRequest addGeneralEscrowsItem(CreateCreditEscrowObject generalEscrowsItem) {
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

  public CreateCreditRequest generalRates(List<@Valid CreateCreditInterestRate> generalRates) {
    this.generalRates = generalRates;
    return this;
  }

  public CreateCreditRequest addGeneralRatesItem(CreateCreditInterestRate generalRatesItem) {
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

  public CreateCreditRequest generalPercents(List<@Valid CreateCreditInterestOrder> generalPercents) {
    this.generalPercents = generalPercents;
    return this;
  }

  public CreateCreditRequest addGeneralPercentsItem(CreateCreditInterestOrder generalPercentsItem) {
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

  public CreateCreditRequest generalPenaltys(List<@Valid CreateCreditPenaltys> generalPenaltys) {
    this.generalPenaltys = generalPenaltys;
    return this;
  }

  public CreateCreditRequest addGeneralPenaltysItem(CreateCreditPenaltys generalPenaltysItem) {
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

  public CreateCreditRequest generalReserves(List<@Valid CreateCreditReserve> generalReserves) {
    this.generalReserves = generalReserves;
    return this;
  }

  public CreateCreditRequest addGeneralReservesItem(CreateCreditReserve generalReservesItem) {
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

  public CreateCreditRequest generalF303s(List<@Valid CreateCreditF303> generalF303s) {
    this.generalF303s = generalF303s;
    return this;
  }

  public CreateCreditRequest addGeneralF303sItem(CreateCreditF303 generalF303sItem) {
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

  public CreateCreditRequest generalPurposes(List<@Valid CreateCreditPurposes> generalPurposes) {
    this.generalPurposes = generalPurposes;
    return this;
  }

  public CreateCreditRequest addGeneralPurposesItem(CreateCreditPurposes generalPurposesItem) {
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
    CreateCreditRequest createCreditRequest = (CreateCreditRequest) o;
    return Objects.equals(this.uid, createCreditRequest.uid) &&
        Objects.equals(this.number, createCreditRequest.number) &&
        Objects.equals(this.date, createCreditRequest.date) &&
        Objects.equals(this.clientDetails, createCreditRequest.clientDetails) &&
        Objects.equals(this.creditType, createCreditRequest.creditType) &&
        Objects.equals(this.currency, createCreditRequest.currency) &&
        Objects.equals(this.entryDate, createCreditRequest.entryDate) &&
        Objects.equals(this.endDate, createCreditRequest.endDate) &&
        Objects.equals(this.sum, createCreditRequest.sum) &&
        Objects.equals(this.sublimits, createCreditRequest.sublimits) &&
        Objects.equals(this.pointOfDirectPayment, createCreditRequest.pointOfDirectPayment) &&
        Objects.equals(this.accounts, createCreditRequest.accounts) &&
        Objects.equals(this.bkiDate, createCreditRequest.bkiDate) &&
        Objects.equals(this.agentOfSubsidy, createCreditRequest.agentOfSubsidy) &&
        Objects.equals(this.programOfSubsidy, createCreditRequest.programOfSubsidy) &&
        Objects.equals(this.subsidyRate, createCreditRequest.subsidyRate) &&
        Objects.equals(this.creditConveyor, createCreditRequest.creditConveyor) &&
        Objects.equals(this.additionalInfo, createCreditRequest.additionalInfo) &&
        Objects.equals(this.sppiTest, createCreditRequest.sppiTest) &&
        Objects.equals(this.businessModel, createCreditRequest.businessModel) &&
        Objects.equals(this.redemptions, createCreditRequest.redemptions) &&
        Objects.equals(this.earlyReturns, createCreditRequest.earlyReturns) &&
        Objects.equals(this.limits, createCreditRequest.limits) &&
        Objects.equals(this.marketTest, createCreditRequest.marketTest) &&
        Objects.equals(this.formatRepayment, createCreditRequest.formatRepayment) &&
        Objects.equals(this.generalSchedules, createCreditRequest.generalSchedules) &&
        Objects.equals(this.generalCommissions, createCreditRequest.generalCommissions) &&
        Objects.equals(this.verificationPassed, createCreditRequest.verificationPassed) &&
        Objects.equals(this.generalEscrows, createCreditRequest.generalEscrows) &&
        Objects.equals(this.generalRates, createCreditRequest.generalRates) &&
        Objects.equals(this.generalPercents, createCreditRequest.generalPercents) &&
        Objects.equals(this.generalPenaltys, createCreditRequest.generalPenaltys) &&
        Objects.equals(this.generalReserves, createCreditRequest.generalReserves) &&
        Objects.equals(this.generalF303s, createCreditRequest.generalF303s) &&
        Objects.equals(this.generalPurposes, createCreditRequest.generalPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, number, date, clientDetails, creditType, currency, entryDate, endDate, sum, sublimits, pointOfDirectPayment, accounts, bkiDate, agentOfSubsidy, programOfSubsidy, subsidyRate, creditConveyor, additionalInfo, sppiTest, businessModel, redemptions, earlyReturns, limits, marketTest, formatRepayment, generalSchedules, generalCommissions, verificationPassed, generalEscrows, generalRates, generalPercents, generalPenaltys, generalReserves, generalF303s, generalPurposes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCreditRequest {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

