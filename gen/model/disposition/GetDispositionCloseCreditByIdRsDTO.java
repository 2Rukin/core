package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionStatusDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionTypeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetDispositionCloseCreditByIdRsDTO
 */

@JsonTypeName("getDispositionCloseCreditByIdRsDTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetDispositionCloseCreditByIdRsDTO {

  private UUID id;

  private String number;

  private Long date;

  private DispositionTypeDTO type;

  private DispositionStatusDTO status;

  private String kodRequest;

  private UUID contractId;

  private Integer contractVersion;

  private Long operationDate;

  private String operationType;

  private UUID executorId;

  private String executorTitle;

  private UUID authorizedId;

  private String authorizedTitle;

  private String operationBase;

  private Long createdTimestamp;

  private UUID createdBy;

  private Long lastUpdatedTimestamp;

  private UUID lastUpdatedBy;

  private String contractClientInn;

  private String contractClientName;

  private String contractNumber;

  private Long contractDate;

  private String contractUID;

  private String contractType;

  private String content;

  private String comment;

  private Boolean verificationPassed;

  private String purposeAfina;

  private Long eventOperationDate;

  private String additionalComment;

  public GetDispositionCloseCreditByIdRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDispositionCloseCreditByIdRsDTO(UUID id, String number, Long date, DispositionTypeDTO type, DispositionStatusDTO status, UUID contractId, Integer contractVersion, String operationType, Long eventOperationDate) {
    this.id = id;
    this.number = number;
    this.date = date;
    this.type = type;
    this.status = status;
    this.contractId = contractId;
    this.contractVersion = contractVersion;
    this.operationType = operationType;
    this.eventOperationDate = eventOperationDate;
  }

  public GetDispositionCloseCreditByIdRsDTO id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetDispositionCloseCreditByIdRsDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public GetDispositionCloseCreditByIdRsDTO date(Long date) {
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

  public GetDispositionCloseCreditByIdRsDTO type(DispositionTypeDTO type) {
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
  public DispositionTypeDTO getType() {
    return type;
  }

  public void setType(DispositionTypeDTO type) {
    this.type = type;
  }

  public GetDispositionCloseCreditByIdRsDTO status(DispositionStatusDTO status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public DispositionStatusDTO getStatus() {
    return status;
  }

  public void setStatus(DispositionStatusDTO status) {
    this.status = status;
  }

  public GetDispositionCloseCreditByIdRsDTO kodRequest(String kodRequest) {
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

  public GetDispositionCloseCreditByIdRsDTO contractId(UUID contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
  */
  @NotNull @Valid 
  @Schema(name = "contractId", example = "566122ae-8862-46e2-b554-e0db518f6dd4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractId")
  public UUID getContractId() {
    return contractId;
  }

  public void setContractId(UUID contractId) {
    this.contractId = contractId;
  }

  public GetDispositionCloseCreditByIdRsDTO contractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
    return this;
  }

  /**
   * Get contractVersion
   * @return contractVersion
  */
  @NotNull 
  @Schema(name = "contractVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractVersion")
  public Integer getContractVersion() {
    return contractVersion;
  }

  public void setContractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
  }

  public GetDispositionCloseCreditByIdRsDTO operationDate(Long operationDate) {
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

  public GetDispositionCloseCreditByIdRsDTO operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  */
  @NotNull 
  @Schema(name = "operationType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public GetDispositionCloseCreditByIdRsDTO executorId(UUID executorId) {
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

  public GetDispositionCloseCreditByIdRsDTO executorTitle(String executorTitle) {
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

  public GetDispositionCloseCreditByIdRsDTO authorizedId(UUID authorizedId) {
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

  public GetDispositionCloseCreditByIdRsDTO authorizedTitle(String authorizedTitle) {
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

  public GetDispositionCloseCreditByIdRsDTO operationBase(String operationBase) {
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

  public GetDispositionCloseCreditByIdRsDTO createdTimestamp(Long createdTimestamp) {
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

  public GetDispositionCloseCreditByIdRsDTO createdBy(UUID createdBy) {
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

  public GetDispositionCloseCreditByIdRsDTO lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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

  public GetDispositionCloseCreditByIdRsDTO lastUpdatedBy(UUID lastUpdatedBy) {
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

  public GetDispositionCloseCreditByIdRsDTO contractClientInn(String contractClientInn) {
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

  public GetDispositionCloseCreditByIdRsDTO contractClientName(String contractClientName) {
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

  public GetDispositionCloseCreditByIdRsDTO contractNumber(String contractNumber) {
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

  public GetDispositionCloseCreditByIdRsDTO contractDate(Long contractDate) {
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

  public GetDispositionCloseCreditByIdRsDTO contractUID(String contractUID) {
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

  public GetDispositionCloseCreditByIdRsDTO contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
  */
  
  @Schema(name = "contractType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractType")
  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public GetDispositionCloseCreditByIdRsDTO content(String content) {
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

  public GetDispositionCloseCreditByIdRsDTO comment(String comment) {
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

  public GetDispositionCloseCreditByIdRsDTO verificationPassed(Boolean verificationPassed) {
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

  public GetDispositionCloseCreditByIdRsDTO purposeAfina(String purposeAfina) {
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

  public GetDispositionCloseCreditByIdRsDTO eventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
    return this;
  }

  /**
   * Get eventOperationDate
   * @return eventOperationDate
  */
  @NotNull 
  @Schema(name = "eventOperationDate", example = "1557057600", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventOperationDate")
  public Long getEventOperationDate() {
    return eventOperationDate;
  }

  public void setEventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
  }

  public GetDispositionCloseCreditByIdRsDTO additionalComment(String additionalComment) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDispositionCloseCreditByIdRsDTO getDispositionCloseCreditByIdRsDTO = (GetDispositionCloseCreditByIdRsDTO) o;
    return Objects.equals(this.id, getDispositionCloseCreditByIdRsDTO.id) &&
        Objects.equals(this.number, getDispositionCloseCreditByIdRsDTO.number) &&
        Objects.equals(this.date, getDispositionCloseCreditByIdRsDTO.date) &&
        Objects.equals(this.type, getDispositionCloseCreditByIdRsDTO.type) &&
        Objects.equals(this.status, getDispositionCloseCreditByIdRsDTO.status) &&
        Objects.equals(this.kodRequest, getDispositionCloseCreditByIdRsDTO.kodRequest) &&
        Objects.equals(this.contractId, getDispositionCloseCreditByIdRsDTO.contractId) &&
        Objects.equals(this.contractVersion, getDispositionCloseCreditByIdRsDTO.contractVersion) &&
        Objects.equals(this.operationDate, getDispositionCloseCreditByIdRsDTO.operationDate) &&
        Objects.equals(this.operationType, getDispositionCloseCreditByIdRsDTO.operationType) &&
        Objects.equals(this.executorId, getDispositionCloseCreditByIdRsDTO.executorId) &&
        Objects.equals(this.executorTitle, getDispositionCloseCreditByIdRsDTO.executorTitle) &&
        Objects.equals(this.authorizedId, getDispositionCloseCreditByIdRsDTO.authorizedId) &&
        Objects.equals(this.authorizedTitle, getDispositionCloseCreditByIdRsDTO.authorizedTitle) &&
        Objects.equals(this.operationBase, getDispositionCloseCreditByIdRsDTO.operationBase) &&
        Objects.equals(this.createdTimestamp, getDispositionCloseCreditByIdRsDTO.createdTimestamp) &&
        Objects.equals(this.createdBy, getDispositionCloseCreditByIdRsDTO.createdBy) &&
        Objects.equals(this.lastUpdatedTimestamp, getDispositionCloseCreditByIdRsDTO.lastUpdatedTimestamp) &&
        Objects.equals(this.lastUpdatedBy, getDispositionCloseCreditByIdRsDTO.lastUpdatedBy) &&
        Objects.equals(this.contractClientInn, getDispositionCloseCreditByIdRsDTO.contractClientInn) &&
        Objects.equals(this.contractClientName, getDispositionCloseCreditByIdRsDTO.contractClientName) &&
        Objects.equals(this.contractNumber, getDispositionCloseCreditByIdRsDTO.contractNumber) &&
        Objects.equals(this.contractDate, getDispositionCloseCreditByIdRsDTO.contractDate) &&
        Objects.equals(this.contractUID, getDispositionCloseCreditByIdRsDTO.contractUID) &&
        Objects.equals(this.contractType, getDispositionCloseCreditByIdRsDTO.contractType) &&
        Objects.equals(this.content, getDispositionCloseCreditByIdRsDTO.content) &&
        Objects.equals(this.comment, getDispositionCloseCreditByIdRsDTO.comment) &&
        Objects.equals(this.verificationPassed, getDispositionCloseCreditByIdRsDTO.verificationPassed) &&
        Objects.equals(this.purposeAfina, getDispositionCloseCreditByIdRsDTO.purposeAfina) &&
        Objects.equals(this.eventOperationDate, getDispositionCloseCreditByIdRsDTO.eventOperationDate) &&
        Objects.equals(this.additionalComment, getDispositionCloseCreditByIdRsDTO.additionalComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, date, type, status, kodRequest, contractId, contractVersion, operationDate, operationType, executorId, executorTitle, authorizedId, authorizedTitle, operationBase, createdTimestamp, createdBy, lastUpdatedTimestamp, lastUpdatedBy, contractClientInn, contractClientName, contractNumber, contractDate, contractUID, contractType, content, comment, verificationPassed, purposeAfina, eventOperationDate, additionalComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDispositionCloseCreditByIdRsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kodRequest: ").append(toIndentedString(kodRequest)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    executorTitle: ").append(toIndentedString(executorTitle)).append("\n");
    sb.append("    authorizedId: ").append(toIndentedString(authorizedId)).append("\n");
    sb.append("    authorizedTitle: ").append(toIndentedString(authorizedTitle)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    contractClientInn: ").append(toIndentedString(contractClientInn)).append("\n");
    sb.append("    contractClientName: ").append(toIndentedString(contractClientName)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    contractUID: ").append(toIndentedString(contractUID)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    verificationPassed: ").append(toIndentedString(verificationPassed)).append("\n");
    sb.append("    purposeAfina: ").append(toIndentedString(purposeAfina)).append("\n");
    sb.append("    eventOperationDate: ").append(toIndentedString(eventOperationDate)).append("\n");
    sb.append("    additionalComment: ").append(toIndentedString(additionalComment)).append("\n");
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

