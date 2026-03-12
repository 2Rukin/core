package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.DispositionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditDispositionTypeCreditByIdAndVersionRequest
 */

@JsonTypeName("editDispositionTypeCreditByIdAndVersion_request")
/**
 * DTO EditDispositionTypeCreditByIdAndVersionRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditDispositionTypeCreditByIdAndVersionRequest {

  private DispositionType dispositionType;

  public EditDispositionTypeCreditByIdAndVersionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditDispositionTypeCreditByIdAndVersionRequest(DispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  public EditDispositionTypeCreditByIdAndVersionRequest dispositionType(DispositionType dispositionType) {
    this.dispositionType = dispositionType;
    return this;
  }

  /**
   * Get dispositionType
   * @return dispositionType
  */
  @NotNull @Valid 
  @Schema(name = "dispositionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dispositionType")
  public DispositionType getDispositionType() {
    return dispositionType;
  }

  public void setDispositionType(DispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditDispositionTypeCreditByIdAndVersionRequest editDispositionTypeCreditByIdAndVersionRequest = (EditDispositionTypeCreditByIdAndVersionRequest) o;
    return Objects.equals(this.dispositionType, editDispositionTypeCreditByIdAndVersionRequest.dispositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditDispositionTypeCreditByIdAndVersionRequest {\n");
    sb.append("    dispositionType: ").append(toIndentedString(dispositionType)).append("\n");
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

