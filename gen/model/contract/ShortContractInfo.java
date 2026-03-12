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
 * ShortContractInfo
 */

@JsonTypeName("shortContractInfo")
/**
 * DTO ShortContractInfo.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class ShortContractInfo {

  private UUID id;

  private String uid;

  private ContractTypes type;

  private String number;

  private Long date;

  private Integer versionNumber;

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  private Boolean isDifferentVersion;

  private Long versionOperationDate;

  private String baseSmall;

  public ShortContractInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShortContractInfo(UUID id, ContractTypes type, String number, Long date, Integer versionNumber) {
    this.id = id;
    this.type = type;
    this.number = number;
    this.date = date;
    this.versionNumber = versionNumber;
  }

  public ShortContractInfo id(UUID id) {
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

  public ShortContractInfo uid(String uid) {
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

  public ShortContractInfo type(ContractTypes type) {
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

  public ShortContractInfo number(String number) {
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

  public ShortContractInfo date(Long date) {
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

  public ShortContractInfo versionNumber(Integer versionNumber) {
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

  public ShortContractInfo contractStatus(ContractStatus contractStatus) {
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

  public ShortContractInfo versionStatus(ContractVersionStatus versionStatus) {
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

  public ShortContractInfo isDifferentVersion(Boolean isDifferentVersion) {
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

  public ShortContractInfo versionOperationDate(Long versionOperationDate) {
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

  public ShortContractInfo baseSmall(String baseSmall) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortContractInfo shortContractInfo = (ShortContractInfo) o;
    return Objects.equals(this.id, shortContractInfo.id) &&
        Objects.equals(this.uid, shortContractInfo.uid) &&
        Objects.equals(this.type, shortContractInfo.type) &&
        Objects.equals(this.number, shortContractInfo.number) &&
        Objects.equals(this.date, shortContractInfo.date) &&
        Objects.equals(this.versionNumber, shortContractInfo.versionNumber) &&
        Objects.equals(this.contractStatus, shortContractInfo.contractStatus) &&
        Objects.equals(this.versionStatus, shortContractInfo.versionStatus) &&
        Objects.equals(this.isDifferentVersion, shortContractInfo.isDifferentVersion) &&
        Objects.equals(this.versionOperationDate, shortContractInfo.versionOperationDate) &&
        Objects.equals(this.baseSmall, shortContractInfo.baseSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, type, number, date, versionNumber, contractStatus, versionStatus, isDifferentVersion, versionOperationDate, baseSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortContractInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
    sb.append("    isDifferentVersion: ").append(toIndentedString(isDifferentVersion)).append("\n");
    sb.append("    versionOperationDate: ").append(toIndentedString(versionOperationDate)).append("\n");
    sb.append("    baseSmall: ").append(toIndentedString(baseSmall)).append("\n");
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

