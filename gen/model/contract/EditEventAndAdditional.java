package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditEventAndAdditional
 */

@JsonTypeName("editEventAndAdditional")
/**
 * DTO EditEventAndAdditional.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditEventAndAdditional {

  private Long eventOperationDate;

  private String additionalComment;

  public EditEventAndAdditional() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EditEventAndAdditional(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
  }

  public EditEventAndAdditional eventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
    return this;
  }

  /**
   * Get eventOperationDate
   * @return eventOperationDate
  */
  @NotNull 
  @Schema(name = "eventOperationDate", example = "1557057600", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventOperationDate")
  public Long getEventOperationDate() {
    return eventOperationDate;
  }

  public void setEventOperationDate(Long eventOperationDate) {
    this.eventOperationDate = eventOperationDate;
  }

  public EditEventAndAdditional additionalComment(String additionalComment) {
    this.additionalComment = additionalComment;
    return this;
  }

  /**
   * Get additionalComment
   * @return additionalComment
  */
  
  @Schema(name = "additionalComment", example = "Требуется пересчитать начисленные проценты по договору", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalComment")
  public String getAdditionalComment() {
    return additionalComment;
  }

  public void setAdditionalComment(String additionalComment) {
    this.additionalComment = additionalComment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditEventAndAdditional editEventAndAdditional = (EditEventAndAdditional) o;
    return Objects.equals(this.eventOperationDate, editEventAndAdditional.eventOperationDate) &&
        Objects.equals(this.additionalComment, editEventAndAdditional.additionalComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventOperationDate, additionalComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditEventAndAdditional {\n");
    sb.append("    eventOperationDate: ").append(toIndentedString(eventOperationDate)).append("\n");
    sb.append("    additionalComment: ").append(toIndentedString(additionalComment)).append("\n");
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

