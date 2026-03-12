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
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionStatusDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditStatusDispositionChangeCreditRequest
 */

@JsonTypeName("editStatusDispositionChangeCreditRqDTO")
/**
 * DTO EditStatusDispositionChangeCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditStatusDispositionChangeCreditRequest {

  private DispositionStatusDTO status;

  private UUID contractId;

  private Integer contractVersion;

  private String comment;

  public EditStatusDispositionChangeCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditStatusDispositionChangeCreditRequest(DispositionStatusDTO status, UUID contractId, Integer contractVersion) {
    this.status = status;
    this.contractId = contractId;
    this.contractVersion = contractVersion;
  }

  public EditStatusDispositionChangeCreditRequest status(DispositionStatusDTO status) {
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

  public EditStatusDispositionChangeCreditRequest contractId(UUID contractId) {
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

  public EditStatusDispositionChangeCreditRequest contractVersion(Integer contractVersion) {
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

  public EditStatusDispositionChangeCreditRequest comment(String comment) {
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
    EditStatusDispositionChangeCreditRequest editStatusDispositionChangeCreditRqDTO = (EditStatusDispositionChangeCreditRequest) o;
    return Objects.equals(this.status, editStatusDispositionChangeCreditRqDTO.status) &&
        Objects.equals(this.contractId, editStatusDispositionChangeCreditRqDTO.contractId) &&
        Objects.equals(this.contractVersion, editStatusDispositionChangeCreditRqDTO.contractVersion) &&
        Objects.equals(this.comment, editStatusDispositionChangeCreditRqDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, contractId, contractVersion, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditStatusDispositionChangeCreditRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
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

