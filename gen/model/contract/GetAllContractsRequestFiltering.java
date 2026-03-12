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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractTypes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractVersionStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Параметры для фильтрации (столбец, значение фильтра)
 */

@Schema(name = "getAllContractsRequestFiltering", description = "Параметры для фильтрации (столбец, значение фильтра)")
@JsonTypeName("getAllContractsRequestFiltering")
/**
 * DTO GetAllContractsRequestFiltering.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetAllContractsRequestFiltering {

  private String number;

  private Long date;

  private ContractStatus contractStatus;

  private ContractVersionStatus versionStatus;

  private ContractTypes type;

  private String client;

  private String inn;

  private Integer versionNumber;

  public GetAllContractsRequestFiltering number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", example = "90-0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public GetAllContractsRequestFiltering date(Long date) {
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

  public GetAllContractsRequestFiltering contractStatus(ContractStatus contractStatus) {
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

  public GetAllContractsRequestFiltering versionStatus(ContractVersionStatus versionStatus) {
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

  public GetAllContractsRequestFiltering type(ContractTypes type) {
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
  public ContractTypes getType() {
    return type;
  }

  public void setType(ContractTypes type) {
    this.type = type;
  }

  public GetAllContractsRequestFiltering client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  
  @Schema(name = "client", example = "Ромаш", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public GetAllContractsRequestFiltering inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  
  @Schema(name = "inn", example = "7708", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public GetAllContractsRequestFiltering versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  
  @Schema(name = "versionNumber", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionNumber")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllContractsRequestFiltering getAllContractsRequestFiltering = (GetAllContractsRequestFiltering) o;
    return Objects.equals(this.number, getAllContractsRequestFiltering.number) &&
        Objects.equals(this.date, getAllContractsRequestFiltering.date) &&
        Objects.equals(this.contractStatus, getAllContractsRequestFiltering.contractStatus) &&
        Objects.equals(this.versionStatus, getAllContractsRequestFiltering.versionStatus) &&
        Objects.equals(this.type, getAllContractsRequestFiltering.type) &&
        Objects.equals(this.client, getAllContractsRequestFiltering.client) &&
        Objects.equals(this.inn, getAllContractsRequestFiltering.inn) &&
        Objects.equals(this.versionNumber, getAllContractsRequestFiltering.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, contractStatus, versionStatus, type, client, inn, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllContractsRequestFiltering {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

