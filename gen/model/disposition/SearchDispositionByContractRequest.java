package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * SearchDispositionByContractRequest
 */

@JsonTypeName("searchDispositionByContractRqDTO")
/**
 * DTO SearchDispositionByContractRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class SearchDispositionByContractRequest {

  private UUID contractId;

  private Integer contractVersion;

  public SearchDispositionByContractRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchDispositionByContractRequest(UUID contractId, Integer contractVersion) {
    this.contractId = contractId;
    this.contractVersion = contractVersion;
  }

  public SearchDispositionByContractRequest contractId(UUID contractId) {
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

  public SearchDispositionByContractRequest contractVersion(Integer contractVersion) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchDispositionByContractRequest searchDispositionByContractRqDTO = (SearchDispositionByContractRequest) o;
    return Objects.equals(this.contractId, searchDispositionByContractRqDTO.contractId) &&
        Objects.equals(this.contractVersion, searchDispositionByContractRqDTO.contractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchDispositionByContractRequest {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
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

