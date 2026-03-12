package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionTypeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditDispositionNewCreditRequest
 */

/**
 * DTO EditDispositionNewCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditDispositionNewCreditRequest {

  private DispositionTypeDTO type;

  private String number;

  private Long date;

  private String kodRequest;

  private String reason;

  private UUID contractId;

  private Integer contractVersion;

  private Long operationDate;

  private String operationBase;

  private String comment;

  public EditDispositionNewCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditDispositionNewCreditRequest(String number, Long date, UUID contractId) {
    this.number = number;
    this.date = date;
    this.contractId = contractId;
  }

  public EditDispositionNewCreditRequest type(DispositionTypeDTO type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public DispositionTypeDTO getType() {
    return type;
  }

  public void setType(DispositionTypeDTO type) {
    this.type = type;
  }

  public EditDispositionNewCreditRequest number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "117ЮЛ-06/2023", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public EditDispositionNewCreditRequest date(Long date) {
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

  public EditDispositionNewCreditRequest kodRequest(String kodRequest) {
    this.kodRequest = kodRequest;
    return this;
  }

  /**
   * Get kodRequest
   * @return kodRequest
  */
  
  @Schema(name = "kodRequest", example = "№1326 от 19.01.2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kodRequest")
  public String getKodRequest() {
    return kodRequest;
  }

  public void setKodRequest(String kodRequest) {
    this.kodRequest = kodRequest;
  }

  public EditDispositionNewCreditRequest reason(String reason) {
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

  public EditDispositionNewCreditRequest contractId(UUID contractId) {
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

  public EditDispositionNewCreditRequest contractVersion(Integer contractVersion) {
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

  public EditDispositionNewCreditRequest operationDate(Long operationDate) {
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

  public EditDispositionNewCreditRequest operationBase(String operationBase) {
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

  public EditDispositionNewCreditRequest comment(String comment) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditDispositionNewCreditRequest editDispositionNewCreditRqDTO = (EditDispositionNewCreditRequest) o;
    return Objects.equals(this.type, editDispositionNewCreditRqDTO.type) &&
        Objects.equals(this.number, editDispositionNewCreditRqDTO.number) &&
        Objects.equals(this.date, editDispositionNewCreditRqDTO.date) &&
        Objects.equals(this.kodRequest, editDispositionNewCreditRqDTO.kodRequest) &&
        Objects.equals(this.reason, editDispositionNewCreditRqDTO.reason) &&
        Objects.equals(this.contractId, editDispositionNewCreditRqDTO.contractId) &&
        Objects.equals(this.contractVersion, editDispositionNewCreditRqDTO.contractVersion) &&
        Objects.equals(this.operationDate, editDispositionNewCreditRqDTO.operationDate) &&
        Objects.equals(this.operationBase, editDispositionNewCreditRqDTO.operationBase) &&
        Objects.equals(this.comment, editDispositionNewCreditRqDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, date, kodRequest, reason, contractId, contractVersion, operationDate, operationBase, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditDispositionNewCreditRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    kodRequest: ").append(toIndentedString(kodRequest)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationBase: ").append(toIndentedString(operationBase)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

