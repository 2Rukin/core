package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetPurposeCredit;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetPurpose
 */

@JsonTypeName("getPurpose")
/**
 * DTO GetPurpose.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetPurpose {

  private Long id;

  private String purpose;

  private GetPurposeCredit purposeStructurator;

  private UUID uuid;

  public GetPurpose id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "65", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetPurpose purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  */
  
  @Schema(name = "purpose", example = "Проектное финансирование по 214-ФЗ (эскроу)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public GetPurpose purposeStructurator(GetPurposeCredit purposeStructurator) {
    this.purposeStructurator = purposeStructurator;
    return this;
  }

  /**
   * Get purposeStructurator
   * @return purposeStructurator
  */
  @Valid 
  @Schema(name = "purposeStructurator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeStructurator")
  public GetPurposeCredit getPurposeStructurator() {
    return purposeStructurator;
  }

  public void setPurposeStructurator(GetPurposeCredit purposeStructurator) {
    this.purposeStructurator = purposeStructurator;
  }

  public GetPurpose uuid(UUID uuid) {
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
    GetPurpose getPurpose = (GetPurpose) o;
    return Objects.equals(this.id, getPurpose.id) &&
        Objects.equals(this.purpose, getPurpose.purpose) &&
        Objects.equals(this.purposeStructurator, getPurpose.purposeStructurator) &&
        Objects.equals(this.uuid, getPurpose.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, purpose, purposeStructurator, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPurpose {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    purposeStructurator: ").append(toIndentedString(purposeStructurator)).append("\n");
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

