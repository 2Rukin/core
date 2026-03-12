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
 * GetAllDispositionsResponse
 */

/**
 * DTO GetAllDispositionsResponse.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetAllDispositionsResponse {

  private UUID id;

  private String number;

  private String type;

  private String status;

  private Long date;

  private UUID executorId;

  private String executorTitle;

  private UUID authorizedId;

  private String authorizedTitle;

  private UUID contractId;

  private Integer contractVersion;

  private Long operationDate;

  private Long createdTimestamp;

  private UUID createdBy;

  private Long lastUpdatedTimestamp;

  private UUID lastUpdatedBy;

  private String contractClientInn;

  private String contractClientName;

  public GetAllDispositionsResponse id(UUID id) {
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

  public GetAllDispositionsResponse number(String number) {
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

  public GetAllDispositionsResponse type(String type) {
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

  public GetAllDispositionsResponse status(String status) {
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

  public GetAllDispositionsResponse date(Long date) {
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

  public GetAllDispositionsResponse executorId(UUID executorId) {
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

  public GetAllDispositionsResponse executorTitle(String executorTitle) {
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

  public GetAllDispositionsResponse authorizedId(UUID authorizedId) {
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

  public GetAllDispositionsResponse authorizedTitle(String authorizedTitle) {
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

  public GetAllDispositionsResponse contractId(UUID contractId) {
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

  public GetAllDispositionsResponse contractVersion(Integer contractVersion) {
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

  public GetAllDispositionsResponse operationDate(Long operationDate) {
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

  public GetAllDispositionsResponse createdTimestamp(Long createdTimestamp) {
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

  public GetAllDispositionsResponse createdBy(UUID createdBy) {
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

  public GetAllDispositionsResponse lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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

  public GetAllDispositionsResponse lastUpdatedBy(UUID lastUpdatedBy) {
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

  public GetAllDispositionsResponse contractClientInn(String contractClientInn) {
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

  public GetAllDispositionsResponse contractClientName(String contractClientName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllDispositionsResponse getAllDispositionsRsDTO = (GetAllDispositionsResponse) o;
    return Objects.equals(this.id, getAllDispositionsRsDTO.id) &&
        Objects.equals(this.number, getAllDispositionsRsDTO.number) &&
        Objects.equals(this.type, getAllDispositionsRsDTO.type) &&
        Objects.equals(this.status, getAllDispositionsRsDTO.status) &&
        Objects.equals(this.date, getAllDispositionsRsDTO.date) &&
        Objects.equals(this.executorId, getAllDispositionsRsDTO.executorId) &&
        Objects.equals(this.executorTitle, getAllDispositionsRsDTO.executorTitle) &&
        Objects.equals(this.authorizedId, getAllDispositionsRsDTO.authorizedId) &&
        Objects.equals(this.authorizedTitle, getAllDispositionsRsDTO.authorizedTitle) &&
        Objects.equals(this.contractId, getAllDispositionsRsDTO.contractId) &&
        Objects.equals(this.contractVersion, getAllDispositionsRsDTO.contractVersion) &&
        Objects.equals(this.operationDate, getAllDispositionsRsDTO.operationDate) &&
        Objects.equals(this.createdTimestamp, getAllDispositionsRsDTO.createdTimestamp) &&
        Objects.equals(this.createdBy, getAllDispositionsRsDTO.createdBy) &&
        Objects.equals(this.lastUpdatedTimestamp, getAllDispositionsRsDTO.lastUpdatedTimestamp) &&
        Objects.equals(this.lastUpdatedBy, getAllDispositionsRsDTO.lastUpdatedBy) &&
        Objects.equals(this.contractClientInn, getAllDispositionsRsDTO.contractClientInn) &&
        Objects.equals(this.contractClientName, getAllDispositionsRsDTO.contractClientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, type, status, date, executorId, executorTitle, authorizedId, authorizedTitle, contractId, contractVersion, operationDate, createdTimestamp, createdBy, lastUpdatedTimestamp, lastUpdatedBy, contractClientInn, contractClientName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllDispositionsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    executorTitle: ").append(toIndentedString(executorTitle)).append("\n");
    sb.append("    authorizedId: ").append(toIndentedString(authorizedId)).append("\n");
    sb.append("    authorizedTitle: ").append(toIndentedString(authorizedTitle)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    contractClientInn: ").append(toIndentedString(contractClientInn)).append("\n");
    sb.append("    contractClientName: ").append(toIndentedString(contractClientName)).append("\n");
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

