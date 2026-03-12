package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetDispositionNewContractByIdResponse
 */

/**
 * DTO GetDispositionNewContractByIdResponse.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetDispositionNewContractByIdResponse {

  private UUID id;

  private String type;

  private String number;

  private Long date;

  private String status;

  private String kodRequest;

  private UUID contractId;

  private Integer contractVersion;

  private UUID executorId;

  private String executorTitle;

  private UUID authorizedId;

  private String authorizedTitle;

  private String reason;

  private Long operationDate;

  private String operationBase;

  private Long createdTimestamp;

  private UUID createdBy;

  private Long lastUpdatedTimestamp;

  private UUID lastUpdatedBy;

  private String content;

  private String comment;

  private String contractClientInn;

  private String contractClientName;

  private String contractNumber;

  private Long contractDate;

  private String contractUID;

  private String operationKind;

  private Boolean verificationPassed;

  private String purposeAfina;

  public GetDispositionNewContractByIdResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetDispositionNewContractByIdResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetDispositionNewContractByIdResponse number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public GetDispositionNewContractByIdResponse date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public GetDispositionNewContractByIdResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetDispositionNewContractByIdResponse kodRequest(String kodRequest) {
    this.kodRequest = kodRequest;
    return this;
  }

  /**
   * Get kodRequest
   * @return kodRequest
  */
  
  @Schema(name = "kodRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kodRequest")
  public String getKodRequest() {
    return kodRequest;
  }

  public void setKodRequest(String kodRequest) {
    this.kodRequest = kodRequest;
  }

  public GetDispositionNewContractByIdResponse contractId(UUID contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
  */
  @Valid 
  @Schema(name = "contractId", example = "566122ae-8862-46e2-b554-e0db518f6dd4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractId")
  public UUID getContractId() {
    return contractId;
  }

  public void setContractId(UUID contractId) {
    this.contractId = contractId;
  }

  public GetDispositionNewContractByIdResponse contractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
    return this;
  }

  /**
   * Get contractVersion
   * @return contractVersion
  */
  
  @Schema(name = "contractVersion", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractVersion")
  public Integer getContractVersion() {
    return contractVersion;
  }

  public void setContractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
  }

  public GetDispositionNewContractByIdResponse executorId(UUID executorId) {
    this.executorId = executorId;
    return this;
  }

  /**
   * Get executorId
   * @return executorId
  */
  @Valid 
  @Schema(name = "executorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executorId")
  public UUID getExecutorId() {
    return executorId;
  }

  public void setExecutorId(UUID executorId) {
    this.executorId = executorId;
  }

  public GetDispositionNewContractByIdResponse executorTitle(String executorTitle) {
    this.executorTitle = executorTitle;
    return this;
  }

  /**
   * Get executorTitle
   * @return executorTitle
  */
  
  @Schema(name = "executorTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executorTitle")
  public String getExecutorTitle() {
    return executorTitle;
  }

  public void setExecutorTitle(String executorTitle) {
    this.executorTitle = executorTitle;
  }

  public GetDispositionNewContractByIdResponse authorizedId(UUID authorizedId) {
    this.authorizedId = authorizedId;
    return this;
  }

  /**
   * Get authorizedId
   * @return authorizedId
  */
  @Valid 
  @Schema(name = "authorizedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedId")
  public UUID getAuthorizedId() {
    return authorizedId;
  }

  public void setAuthorizedId(UUID authorizedId) {
    this.authorizedId = authorizedId;
  }

  public GetDispositionNewContractByIdResponse authorizedTitle(String authorizedTitle) {
    this.authorizedTitle = authorizedTitle;
    return this;
  }

  /**
   * Get authorizedTitle
   * @return authorizedTitle
  */
  
  @Schema(name = "authorizedTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedTitle")
  public String getAuthorizedTitle() {
    return authorizedTitle;
  }

  public void setAuthorizedTitle(String authorizedTitle) {
    this.authorizedTitle = authorizedTitle;
  }

  public GetDispositionNewContractByIdResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "reason", example = "Заключение нового кредитного договора", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetDispositionNewContractByIdResponse operationDate(Long operationDate) {
    this.operationDate = operationDate;
    return this;
  }

  /**
   * Get operationDate
   * @return operationDate
  */
  
  @Schema(name = "operationDate", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationDate")
  public Long getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(Long operationDate) {
    this.operationDate = operationDate;
  }

  public GetDispositionNewContractByIdResponse operationBase(String operationBase) {
    this.operationBase = operationBase;
    return this;
  }

  /**
   * Get operationBase
   * @return operationBase
  */
  
  @Schema(name = "operationBase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationBase")
  public String getOperationBase() {
    return operationBase;
  }

  public void setOperationBase(String operationBase) {
    this.operationBase = operationBase;
  }

  public GetDispositionNewContractByIdResponse createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  /**
   * Get createdTimestamp
   * @return createdTimestamp
  */
  
  @Schema(name = "createdTimestamp", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdTimestamp")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public GetDispositionNewContractByIdResponse createdBy(UUID createdBy) {
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
  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public GetDispositionNewContractByIdResponse lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * Get lastUpdatedTimestamp
   * @return lastUpdatedTimestamp
  */
  
  @Schema(name = "lastUpdatedTimestamp", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdatedTimestamp")
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }

  public GetDispositionNewContractByIdResponse lastUpdatedBy(UUID lastUpdatedBy) {
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
  public UUID getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(UUID lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public GetDispositionNewContractByIdResponse content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GetDispositionNewContractByIdResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public GetDispositionNewContractByIdResponse contractClientInn(String contractClientInn) {
    this.contractClientInn = contractClientInn;
    return this;
  }

  /**
   * Get contractClientInn
   * @return contractClientInn
  */
  
  @Schema(name = "contractClientInn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractClientInn")
  public String getContractClientInn() {
    return contractClientInn;
  }

  public void setContractClientInn(String contractClientInn) {
    this.contractClientInn = contractClientInn;
  }

  public GetDispositionNewContractByIdResponse contractClientName(String contractClientName) {
    this.contractClientName = contractClientName;
    return this;
  }

  /**
   * Get contractClientName
   * @return contractClientName
  */
  
  @Schema(name = "contractClientName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractClientName")
  public String getContractClientName() {
    return contractClientName;
  }

  public void setContractClientName(String contractClientName) {
    this.contractClientName = contractClientName;
  }

  public GetDispositionNewContractByIdResponse contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

  /**
   * Get contractNumber
   * @return contractNumber
  */
  
  @Schema(name = "contractNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractNumber")
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }

  public GetDispositionNewContractByIdResponse contractDate(Long contractDate) {
    this.contractDate = contractDate;
    return this;
  }

  /**
   * Get contractDate
   * @return contractDate
  */
  
  @Schema(name = "contractDate", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractDate")
  public Long getContractDate() {
    return contractDate;
  }

  public void setContractDate(Long contractDate) {
    this.contractDate = contractDate;
  }

  public GetDispositionNewContractByIdResponse contractUID(String contractUID) {
    this.contractUID = contractUID;
    return this;
  }

  /**
   * Get contractUID
   * @return contractUID
  */
  
  @Schema(name = "contractUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractUID")
  public String getContractUID() {
    return contractUID;
  }

  public void setContractUID(String contractUID) {
    this.contractUID = contractUID;
  }

  public GetDispositionNewContractByIdResponse operationKind(String operationKind) {
    this.operationKind = operationKind;
    return this;
  }

  /**
   * Get operationKind
   * @return operationKind
  */
  
  @Schema(name = "operationKind", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationKind")
  public String getOperationKind() {
    return operationKind;
  }

  public void setOperationKind(String operationKind) {
    this.operationKind = operationKind;
  }

  public GetDispositionNewContractByIdResponse verificationPassed(Boolean verificationPassed) {
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

  public GetDispositionNewContractByIdResponse purposeAfina(String purposeAfina) {
    this.purposeAfina = purposeAfina;
    return this;
  }

  /**
   * Get purposeAfina
   * @return purposeAfina
  */
  
  @Schema(name = "purposeAfina", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeAfina")
  public String getPurposeAfina() {
    return purposeAfina;
  }

  public void setPurposeAfina(String purposeAfina) {
    this.purposeAfina = purposeAfina;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDispositionNewContractByIdResponse getDispositionNewContractByIdRsDTO = (GetDispositionNewContractByIdResponse) o;
    return Objects.equals(this.id, getDispositionNewContractByIdRsDTO.id) &&
        Objects.equals(this.type, getDispositionNewContractByIdRsDTO.type) &&
        Objects.equals(this.number, getDispositionNewContractByIdRsDTO.number) &&
        Objects.equals(this.date, getDispositionNewContractByIdRsDTO.date) &&
        Objects.equals(this.status, getDispositionNewContractByIdRsDTO.status) &&
        Objects.equals(this.kodRequest, getDispositionNewContractByIdRsDTO.kodRequest) &&
        Objects.equals(this.contractId, getDispositionNewContractByIdRsDTO.contractId) &&
        Objects.equals(this.contractVersion, getDispositionNewContractByIdRsDTO.contractVersion) &&
        Objects.equals(this.executorId, getDispositionNewContractByIdRsDTO.executorId) &&
        Objects.equals(this.executorTitle, getDispositionNewContractByIdRsDTO.executorTitle) &&
        Objects.equals(this.authorizedId, getDispositionNewContractByIdRsDTO.authorizedId) &&
        Objects.equals(this.authorizedTitle, getDispositionNewContractByIdRsDTO.authorizedTitle) &&
        Objects.equals(this.reason, getDispositionNewContractByIdRsDTO.reason) &&
        Objects.equals(this.operationDate, getDispositionNewContractByIdRsDTO.operationDate) &&
        Objects.equals(this.operationBase, getDispositionNewContractByIdRsDTO.operationBase) &&
        Objects.equals(this.createdTimestamp, getDispositionNewContractByIdRsDTO.createdTimestamp) &&
        Objects.equals(this.createdBy, getDispositionNewContractByIdRsDTO.createdBy) &&
        Objects.equals(this.lastUpdatedTimestamp, getDispositionNewContractByIdRsDTO.lastUpdatedTimestamp) &&
        Objects.equals(this.lastUpdatedBy, getDispositionNewContractByIdRsDTO.lastUpdatedBy) &&
        Objects.equals(this.content, getDispositionNewContractByIdRsDTO.content) &&
        Objects.equals(this.comment, getDispositionNewContractByIdRsDTO.comment) &&
        Objects.equals(this.contractClientInn, getDispositionNewContractByIdRsDTO.contractClientInn) &&
        Objects.equals(this.contractClientName, getDispositionNewContractByIdRsDTO.contractClientName) &&
        Objects.equals(this.contractNumber, getDispositionNewContractByIdRsDTO.contractNumber) &&
        Objects.equals(this.contractDate, getDispositionNewContractByIdRsDTO.contractDate) &&
        Objects.equals(this.contractUID, getDispositionNewContractByIdRsDTO.contractUID) &&
        Objects.equals(this.operationKind, getDispositionNewContractByIdRsDTO.operationKind) &&
        Objects.equals(this.verificationPassed, getDispositionNewContractByIdRsDTO.verificationPassed) &&
        Objects.equals(this.purposeAfina, getDispositionNewContractByIdRsDTO.purposeAfina);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, number, date, status, kodRequest, contractId, contractVersion, executorId, executorTitle, authorizedId, authorizedTitle, reason, operationDate, operationBase, createdTimestamp, createdBy, lastUpdatedTimestamp, lastUpdatedBy, content, comment, contractClientInn, contractClientName, contractNumber, contractDate, contractUID, operationKind, verificationPassed, purposeAfina);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDispositionNewContractByIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kodRequest: ").append(toIndentedString(kodRequest)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    executorTitle: ").append(toIndentedString(executorTitle)).append("\n");
    sb.append("    authorizedId: ").append(toIndentedString(authorizedId)).append("\n");
    sb.append("    authorizedTitle: ").append(toIndentedString(authorizedTitle)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contractClientInn: ").append(toIndentedString(contractClientInn)).append("\n");
    sb.append("    contractClientName: ").append(toIndentedString(contractClientName)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    contractUID: ").append(toIndentedString(contractUID)).append("\n");
    sb.append("    operationKind: ").append(toIndentedString(operationKind)).append("\n");
    sb.append("    verificationPassed: ").append(toIndentedString(verificationPassed)).append("\n");
    sb.append("    purposeAfina: ").append(toIndentedString(purposeAfina)).append("\n");
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

