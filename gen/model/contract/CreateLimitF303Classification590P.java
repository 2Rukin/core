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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303classifications590PItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * CreateLimitF303Classification590P
 */

@JsonTypeName("createLimit_f303Classification590P")
/**
 * DTO CreateLimitF303Classification590P.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class CreateLimitF303Classification590P {

  @Valid
  private List<F303classifications590PItem> classifications = new ArrayList<>();

  private String another;

  public CreateLimitF303Classification590P classifications(List<F303classifications590PItem> classifications) {
    this.classifications = classifications;
    return this;
  }

  public CreateLimitF303Classification590P addClassificationsItem(F303classifications590PItem classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

  /**
   * Get classifications
   * @return classifications
  */
  @Valid 
  @Schema(name = "classifications", example = "[\"2\",\"6.1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classifications")
  public List<F303classifications590PItem> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<F303classifications590PItem> classifications) {
    this.classifications = classifications;
  }

  public CreateLimitF303Classification590P another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Обязательный возврат задолженности", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLimitF303Classification590P createLimitF303Classification590P = (CreateLimitF303Classification590P) o;
    return Objects.equals(this.classifications, createLimitF303Classification590P.classifications) &&
        Objects.equals(this.another, createLimitF303Classification590P.another);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifications, another);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLimitF303Classification590P {\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
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

