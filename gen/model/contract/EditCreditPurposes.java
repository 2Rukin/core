package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.EditPurpose;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditCreditPurposes
 */

@JsonTypeName("editCreditPurposes")
/**
 * DTO EditCreditPurposes.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditCreditPurposes {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  private Integer purposeAfinaId;

  @Valid
  private List<@Valid EditPurpose> purposeStructurers = new ArrayList<>();

  private UUID uuid;

  public EditCreditPurposes id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2191", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EditCreditPurposes limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public EditCreditPurposes addLimitsItem(UUID limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * @return limits
  */
  @Valid 
  @Schema(name = "limits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limits")
  public List<UUID> getLimits() {
    return limits;
  }

  public void setLimits(List<UUID> limits) {
    this.limits = limits;
  }

  public EditCreditPurposes purposeAfinaId(Integer purposeAfinaId) {
    this.purposeAfinaId = purposeAfinaId;
    return this;
  }

  /**
   * Get purposeAfinaId
   * @return purposeAfinaId
  */
  
  @Schema(name = "purposeAfinaId", example = "36886", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeAfinaId")
  public Integer getPurposeAfinaId() {
    return purposeAfinaId;
  }

  public void setPurposeAfinaId(Integer purposeAfinaId) {
    this.purposeAfinaId = purposeAfinaId;
  }

  public EditCreditPurposes purposeStructurers(List<@Valid EditPurpose> purposeStructurers) {
    this.purposeStructurers = purposeStructurers;
    return this;
  }

  public EditCreditPurposes addPurposeStructurersItem(EditPurpose purposeStructurersItem) {
    if (this.purposeStructurers == null) {
      this.purposeStructurers = new ArrayList<>();
    }
    this.purposeStructurers.add(purposeStructurersItem);
    return this;
  }

  /**
   * Get purposeStructurers
   * @return purposeStructurers
  */
  @Valid 
  @Schema(name = "purposeStructurers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purposeStructurers")
  public List<@Valid EditPurpose> getPurposeStructurers() {
    return purposeStructurers;
  }

  public void setPurposeStructurers(List<@Valid EditPurpose> purposeStructurers) {
    this.purposeStructurers = purposeStructurers;
  }

  public EditCreditPurposes uuid(UUID uuid) {
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
    EditCreditPurposes editCreditPurposes = (EditCreditPurposes) o;
    return Objects.equals(this.id, editCreditPurposes.id) &&
        Objects.equals(this.limits, editCreditPurposes.limits) &&
        Objects.equals(this.purposeAfinaId, editCreditPurposes.purposeAfinaId) &&
        Objects.equals(this.purposeStructurers, editCreditPurposes.purposeStructurers) &&
        Objects.equals(this.uuid, editCreditPurposes.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, purposeAfinaId, purposeStructurers, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditCreditPurposes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    purposeAfinaId: ").append(toIndentedString(purposeAfinaId)).append("\n");
    sb.append("    purposeStructurers: ").append(toIndentedString(purposeStructurers)).append("\n");
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

