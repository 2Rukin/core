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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ShortContractInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * PageGetContractVersions
 */

@JsonTypeName("pageGetContractVersions")
/**
 * DTO PageGetContractVersions.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class PageGetContractVersions {

  private Long totalElements;

  @Valid
  private List<@Valid ShortContractInfo> content = new ArrayList<>();

  public PageGetContractVersions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageGetContractVersions(Long totalElements, List<@Valid ShortContractInfo> content) {
    this.totalElements = totalElements;
    this.content = content;
  }

  public PageGetContractVersions totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull 
  @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageGetContractVersions content(List<@Valid ShortContractInfo> content) {
    this.content = content;
    return this;
  }

  public PageGetContractVersions addContentItem(ShortContractInfo contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid ShortContractInfo> getContent() {
    return content;
  }

  public void setContent(List<@Valid ShortContractInfo> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageGetContractVersions pageGetContractVersions = (PageGetContractVersions) o;
    return Objects.equals(this.totalElements, pageGetContractVersions.totalElements) &&
        Objects.equals(this.content, pageGetContractVersions.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetContractVersions {\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

