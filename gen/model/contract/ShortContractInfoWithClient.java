package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * ShortContractInfoWithClient
 */

@JsonTypeName("shortContractInfoWithClient")
/**
 * DTO ShortContractInfoWithClient.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class ShortContractInfoWithClient {

  private UUID id;

  private String uid;

  private ContractTypes type;

  private String number;

  private Long date;

  private Integer versionNumber;

  private String client;

  private String inn;

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  private Boolean isDifferentVersion;

  private Long versionOperationDate;

  private String baseSmall;

  private Boolean unfulfilledObligationsAbsent;

  public ShortContractInfoWithClient() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShortContractInfoWithClient(UUID id, ContractTypes type, String number, Long date, Integer versionNumber, String client, String inn) {
    this.id = id;
    this.type = type;
    this.number = number;
    this.date = date;
    this.versionNumber = versionNumber;
    this.client = client;
    this.inn = inn;
  }

  public ShortContractInfoWithClient id(UUID id) {
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

  public ShortContractInfoWithClient uid(String uid) {
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

  public ShortContractInfoWithClient type(ContractTypes type) {
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

  public ShortContractInfoWithClient number(String number) {
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

  public ShortContractInfoWithClient date(Long date) {
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

  public ShortContractInfoWithClient versionNumber(Integer versionNumber) {
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

  public ShortContractInfoWithClient client(String client) {
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

  public ShortContractInfoWithClient inn(String inn) {
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

  public ShortContractInfoWithClient contractStatus(ContractStatus contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * Get contractStatus
   * @return contractStatus
  */
  @Valid 
  @Schema(name = "contractStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractStatus")
  public ContractStatus getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(ContractStatus contractStatus) {
    this.contractStatus = contractStatus;
  }

  public ShortContractInfoWithClient versionStatus(ContractVersionStatus versionStatus) {
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

  public ShortContractInfoWithClient isDifferentVersion(Boolean isDifferentVersion) {
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

  public ShortContractInfoWithClient versionOperationDate(Long versionOperationDate) {
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

  public ShortContractInfoWithClient baseSmall(String baseSmall) {
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

  public ShortContractInfoWithClient unfulfilledObligationsAbsent(Boolean unfulfilledObligationsAbsent) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortContractInfoWithClient shortContractInfoWithClient = (ShortContractInfoWithClient) o;
    return Objects.equals(this.id, shortContractInfoWithClient.id) &&
        Objects.equals(this.uid, shortContractInfoWithClient.uid) &&
        Objects.equals(this.type, shortContractInfoWithClient.type) &&
        Objects.equals(this.number, shortContractInfoWithClient.number) &&
        Objects.equals(this.date, shortContractInfoWithClient.date) &&
        Objects.equals(this.versionNumber, shortContractInfoWithClient.versionNumber) &&
        Objects.equals(this.client, shortContractInfoWithClient.client) &&
        Objects.equals(this.inn, shortContractInfoWithClient.inn) &&
        Objects.equals(this.contractStatus, shortContractInfoWithClient.contractStatus) &&
        Objects.equals(this.versionStatus, shortContractInfoWithClient.versionStatus) &&
        Objects.equals(this.isDifferentVersion, shortContractInfoWithClient.isDifferentVersion) &&
        Objects.equals(this.versionOperationDate, shortContractInfoWithClient.versionOperationDate) &&
        Objects.equals(this.baseSmall, shortContractInfoWithClient.baseSmall) &&
        Objects.equals(this.unfulfilledObligationsAbsent, shortContractInfoWithClient.unfulfilledObligationsAbsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, type, number, date, versionNumber, client, inn, contractStatus, versionStatus, isDifferentVersion, versionOperationDate, baseSmall, unfulfilledObligationsAbsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortContractInfoWithClient {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
    sb.append("    isDifferentVersion: ").append(toIndentedString(isDifferentVersion)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
    sb.append("    unfulfilledObligationsAbsent: ").append(toIndentedString(unfulfilledObligationsAbsent)).append("\n");
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

