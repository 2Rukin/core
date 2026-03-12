package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.ContractDispositionType;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionStatusDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * CreateDispositionChangeCreditRequest
 */

@JsonTypeName("createDispositionChangeCreditRqDTO")
/**
 * DTO CreateDispositionChangeCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateDispositionChangeCreditRequest {

  private String number;

  private Long date;

  private DispositionStatusDTO status;

  private String kodRequest;

  private UUID contractId;

  private Integer contractVersion;

  private Long operationDate;

  private String operationType;

  private String operationBase;

  private String content;

  private String comment;

  private Long eventOperationDate;

  private String additionalComment;

  private ContractDispositionType contractDispositionType;

  public CreateDispositionChangeCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateDispositionChangeCreditRequest(String number, Long date, UUID contractId, Integer contractVersion, Long eventOperationDate, ContractDispositionType contractDispositionType) {
    this.number = number;
    this.date = date;
    this.contractId = contractId;
    this.contractVersion = contractVersion;
    this.eventOperationDate = eventOperationDate;
    this.contractDispositionType = contractDispositionType;
  }

  public CreateDispositionChangeCreditRequest number(String number) {
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

  public CreateDispositionChangeCreditRequest date(Long date) {
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

  public CreateDispositionChangeCreditRequest status(DispositionStatusDTO status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public DispositionStatusDTO getStatus() {
    return status;
  }

  public void setStatus(DispositionStatusDTO status) {
    this.status = status;
  }

  public CreateDispositionChangeCreditRequest kodRequest(String kodRequest) {
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

  public CreateDispositionChangeCreditRequest contractId(UUID contractId) {
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

  public CreateDispositionChangeCreditRequest contractVersion(Integer contractVersion) {
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

  public CreateDispositionChangeCreditRequest operationDate(Long operationDate) {
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

  public CreateDispositionChangeCreditRequest operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  */
  
  @Schema(name = "operationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public CreateDispositionChangeCreditRequest operationBase(String operationBase) {
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

  public CreateDispositionChangeCreditRequest content(String content) {
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

  public CreateDispositionChangeCreditRequest comment(String comment) {
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

  public CreateDispositionChangeCreditRequest eventOperationDate(Long eventOperationDate) {
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

  public CreateDispositionChangeCreditRequest additionalComment(String additionalComment) {
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

  public CreateDispositionChangeCreditRequest contractDispositionType(ContractDispositionType contractDispositionType) {
    this.contractDispositionType = contractDispositionType;
    return this;
  }

  /**
   * Get contractDispositionType
   * @return contractDispositionType
  */
  @NotNull @Valid 
  @Schema(name = "contractDispositionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractDispositionType")
  public ContractDispositionType getContractDispositionType() {
    return contractDispositionType;
  }

  public void setContractDispositionType(ContractDispositionType contractDispositionType) {
    this.contractDispositionType = contractDispositionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDispositionChangeCreditRequest createDispositionChangeCreditRqDTO = (CreateDispositionChangeCreditRequest) o;
    return Objects.equals(this.number, createDispositionChangeCreditRqDTO.number) &&
        Objects.equals(this.date, createDispositionChangeCreditRqDTO.date) &&
        Objects.equals(this.status, createDispositionChangeCreditRqDTO.status) &&
        Objects.equals(this.kodRequest, createDispositionChangeCreditRqDTO.kodRequest) &&
        Objects.equals(this.contractId, createDispositionChangeCreditRqDTO.contractId) &&
        Objects.equals(this.contractVersion, createDispositionChangeCreditRqDTO.contractVersion) &&
        Objects.equals(this.operationDate, createDispositionChangeCreditRqDTO.operationDate) &&
        Objects.equals(this.operationType, createDispositionChangeCreditRqDTO.operationType) &&
        Objects.equals(this.operationBase, createDispositionChangeCreditRqDTO.operationBase) &&
        Objects.equals(this.content, createDispositionChangeCreditRqDTO.content) &&
        Objects.equals(this.comment, createDispositionChangeCreditRqDTO.comment) &&
        Objects.equals(this.eventOperationDate, createDispositionChangeCreditRqDTO.eventOperationDate) &&
        Objects.equals(this.additionalComment, createDispositionChangeCreditRqDTO.additionalComment) &&
        Objects.equals(this.contractDispositionType, createDispositionChangeCreditRqDTO.contractDispositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, status, kodRequest, contractId, contractVersion, operationDate, operationType, operationBase, content, comment, eventOperationDate, additionalComment, contractDispositionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDispositionChangeCreditRequest {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kodRequest: ").append(toIndentedString(kodRequest)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    eventOperationDate: ").append(toIndentedString(eventOperationDate)).append("\n");
    sb.append("    additionalComment: ").append(toIndentedString(additionalComment)).append("\n");
    sb.append("    contractDispositionType: ").append(toIndentedString(contractDispositionType)).append("\n");
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

