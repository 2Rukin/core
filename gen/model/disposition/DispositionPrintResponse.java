package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * DispositionPrintResponse
 */

/**
 * DTO DispositionPrintResponse.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class DispositionPrintResponse {

  private UUID id;

  private String file;

  public DispositionPrintResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DispositionPrintResponse(UUID id, String file) {
    this.id = id;
    this.file = file;
  }

  public DispositionPrintResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", example = "3422b448-2460-4fd2-9183-8000de6f8343", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DispositionPrintResponse file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @NotNull 
  @Schema(name = "file", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositionPrintResponse dispositionPrintRsDTO = (DispositionPrintResponse) o;
    return Objects.equals(this.id, dispositionPrintRsDTO.id) &&
        Objects.equals(this.file, dispositionPrintRsDTO.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositionPrintResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

