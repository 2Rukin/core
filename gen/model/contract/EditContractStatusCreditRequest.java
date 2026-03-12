package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractStatus;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractVersionStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditContractStatusCreditRequest
 */

@JsonTypeName("editContractStatusCreditRequest")
/**
 * DTO EditContractStatusCreditRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditContractStatusCreditRequest {

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  public EditContractStatusCreditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditContractStatusCreditRequest(ContractStatus contractStatus) {
    this.contractStatus = contractStatus;
  }

  public EditContractStatusCreditRequest contractStatus(ContractStatus contractStatus) {
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

  public EditContractStatusCreditRequest versionStatus(ContractVersionStatus versionStatus) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditContractStatusCreditRequest editContractStatusCreditRequest = (EditContractStatusCreditRequest) o;
    return Objects.equals(this.contractStatus, editContractStatusCreditRequest.contractStatus) &&
        Objects.equals(this.versionStatus, editContractStatusCreditRequest.versionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractStatus, versionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditContractStatusCreditRequest {\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
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

