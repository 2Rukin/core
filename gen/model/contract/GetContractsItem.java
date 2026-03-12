package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractTypes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractVersionStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetUserInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Элемент списка кредитных договоров. На текущий момент сопадает с universal
 */

@Schema(name = "getContractsItem", description = "Элемент списка кредитных договоров. На текущий момент сопадает с universal")
@JsonTypeName("getContractsItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetContractsItem {

  private UUID id;

  private String uid;

  private Integer versionNumber;

  private String number;

  private Long date;

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  private ContractTypes type;

  private String client;

  private String inn;

  private Boolean isDifferentVersion;

  private Long versionOperationDate;

  private String baseSmall;

  private Long createdAt;

  private GetUserInfo createdBy;

  private Long lastUpdatedAt;

  private GetUserInfo lastUpdatedBy;

  public GetContractsItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetContractsItem(UUID id, Integer versionNumber, String number, Long date, ContractStatus contractStatus, ContractTypes type, String client, String inn) {
    this.id = id;
    this.versionNumber = versionNumber;
    this.number = number;
    this.date = date;
    this.contractStatus = contractStatus;
    this.type = type;
    this.client = client;
    this.inn = inn;
  }

  public GetContractsItem id(UUID id) {
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

  public GetContractsItem uid(String uid) {
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

  public GetContractsItem versionNumber(Integer versionNumber) {
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

  public GetContractsItem number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "90-023/КЛ-03S", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public GetContractsItem date(Long date) {
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

  public GetContractsItem contractStatus(ContractStatus contractStatus) {
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

  public GetContractsItem versionStatus(ContractVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
    return this;
  }

  /**
   * Get versionStatus
   * @return versionStatus
  */
  @Valid 
  @Schema(name = "versionStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionStatus")
  public ContractVersionStatus getVersionStatus() {
    return versionStatus;
  }

  public void setVersionStatus(ContractVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
  }

  public GetContractsItem type(ContractTypes type) {
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

  public GetContractsItem client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @NotNull 
  @Schema(name = "client", example = "ОАО Апельсин", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public GetContractsItem inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  @NotNull 
  @Schema(name = "inn", example = "7708071234", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public GetContractsItem isDifferentVersion(Boolean isDifferentVersion) {
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

  public GetContractsItem versionOperationDate(Long versionOperationDate) {
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

  public GetContractsItem baseSmall(String baseSmall) {
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

  public GetContractsItem createdAt(Long createdAt) {
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

  public GetContractsItem createdBy(GetUserInfo createdBy) {
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

  public GetContractsItem lastUpdatedAt(Long lastUpdatedAt) {
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

  public GetContractsItem lastUpdatedBy(GetUserInfo lastUpdatedBy) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractsItem getContractsItem = (GetContractsItem) o;
    return Objects.equals(this.id, getContractsItem.id) &&
        Objects.equals(this.uid, getContractsItem.uid) &&
        Objects.equals(this.versionNumber, getContractsItem.versionNumber) &&
        Objects.equals(this.number, getContractsItem.number) &&
        Objects.equals(this.date, getContractsItem.date) &&
        Objects.equals(this.contractStatus, getContractsItem.contractStatus) &&
        Objects.equals(this.versionStatus, getContractsItem.versionStatus) &&
        Objects.equals(this.type, getContractsItem.type) &&
        Objects.equals(this.client, getContractsItem.client) &&
        Objects.equals(this.inn, getContractsItem.inn) &&
        Objects.equals(this.isDifferentVersion, getContractsItem.isDifferentVersion) &&
        Objects.equals(this.versionOperationDate, getContractsItem.versionOperationDate) &&
        Objects.equals(this.baseSmall, getContractsItem.baseSmall) &&
        Objects.equals(this.createdAt, getContractsItem.createdAt) &&
        Objects.equals(this.createdBy, getContractsItem.createdBy) &&
        Objects.equals(this.lastUpdatedAt, getContractsItem.lastUpdatedAt) &&
        Objects.equals(this.lastUpdatedBy, getContractsItem.lastUpdatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, versionNumber, number, date, contractStatus, versionStatus, type, client, inn, isDifferentVersion, versionOperationDate, baseSmall, createdAt, createdBy, lastUpdatedAt, lastUpdatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractsItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    isDifferentVersion: ").append(toIndentedString(isDifferentVersion)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
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

