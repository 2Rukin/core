package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
 * CreateAccountDTO
 */

@JsonTypeName("createAccountDTO")
/**
 * DTO CreateAccountDTO.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateAccountDTO {

  private String accountNumber;

  private String codeOfSubdivision;

  private String requisitesOfDirectPayment;

  private UUID uuid;

  public CreateAccountDTO accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  
  @Schema(name = "accountNumber", example = "40702810100000012345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CreateAccountDTO codeOfSubdivision(String codeOfSubdivision) {
    this.codeOfSubdivision = codeOfSubdivision;
    return this;
  }

  /**
   * Get codeOfSubdivision
   * @return codeOfSubdivision
  */
  
  @Schema(name = "codeOfSubdivision", example = "0000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeOfSubdivision")
  public String getCodeOfSubdivision() {
    return codeOfSubdivision;
  }

  public void setCodeOfSubdivision(String codeOfSubdivision) {
    this.codeOfSubdivision = codeOfSubdivision;
  }

  public CreateAccountDTO requisitesOfDirectPayment(String requisitesOfDirectPayment) {
    this.requisitesOfDirectPayment = requisitesOfDirectPayment;
    return this;
  }

  /**
   * Get requisitesOfDirectPayment
   * @return requisitesOfDirectPayment
  */
  
  @Schema(name = "requisitesOfDirectPayment", example = "б/н от 10.01.2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requisitesOfDirectPayment")
  public String getRequisitesOfDirectPayment() {
    return requisitesOfDirectPayment;
  }

  public void setRequisitesOfDirectPayment(String requisitesOfDirectPayment) {
    this.requisitesOfDirectPayment = requisitesOfDirectPayment;
  }

  public CreateAccountDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountDTO createAccountDTO = (CreateAccountDTO) o;
    return Objects.equals(this.accountNumber, createAccountDTO.accountNumber) &&
        Objects.equals(this.codeOfSubdivision, createAccountDTO.codeOfSubdivision) &&
        Objects.equals(this.requisitesOfDirectPayment, createAccountDTO.requisitesOfDirectPayment) &&
        Objects.equals(this.uuid, createAccountDTO.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, codeOfSubdivision, requisitesOfDirectPayment, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountDTO {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    codeOfSubdivision: ").append(toIndentedString(codeOfSubdivision)).append("\n");
    sb.append("    requisitesOfDirectPayment: ").append(toIndentedString(requisitesOfDirectPayment)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

