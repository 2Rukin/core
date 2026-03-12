package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

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
import jakarta.annotation.Generated;

/**
 * GetDispositionByContractRsDTO
 */

@JsonTypeName("getDispositionByContractRsDTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetDispositionByContractRsDTO {

  private UUID dispositionId;

  public GetDispositionByContractRsDTO dispositionId(UUID dispositionId) {
    this.dispositionId = dispositionId;
    return this;
  }

  /**
   * Get dispositionId
   * @return dispositionId
  */
  @Valid 
  @Schema(name = "dispositionId", example = "566122ae-8862-46e2-b554-e0db518f6dd4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dispositionId")
  public UUID getDispositionId() {
    return dispositionId;
  }

  public void setDispositionId(UUID dispositionId) {
    this.dispositionId = dispositionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDispositionByContractRsDTO getDispositionByContractRsDTO = (GetDispositionByContractRsDTO) o;
    return Objects.equals(this.dispositionId, getDispositionByContractRsDTO.dispositionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDispositionByContractRsDTO {\n");
    sb.append("    dispositionId: ").append(toIndentedString(dispositionId)).append("\n");
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

