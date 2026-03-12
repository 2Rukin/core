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
 * CreatePurpose
 */

@JsonTypeName("createPurpose")
/**
 * DTO CreatePurpose.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreatePurpose {

  private String purpose;

  private Integer purposeId;

  private UUID uuid;

  public CreatePurpose purpose(String purpose) {
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

  public CreatePurpose purposeId(Integer purposeId) {
    this.purposeId = purposeId;
    return this;
  }

  /**
   * Get purposeId
   * @return purposeId
  */
  
  @Schema(name = "purposeId", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeId")
  public Integer getPurposeId() {
    return purposeId;
  }

  public void setPurposeId(Integer purposeId) {
    this.purposeId = purposeId;
  }

  public CreatePurpose uuid(UUID uuid) {
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
    CreatePurpose createPurpose = (CreatePurpose) o;
    return Objects.equals(this.purpose, createPurpose.purpose) &&
        Objects.equals(this.purposeId, createPurpose.purposeId) &&
        Objects.equals(this.uuid, createPurpose.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, purposeId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePurpose {\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    purposeId: ").append(toIndentedString(purposeId)).append("\n");
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

