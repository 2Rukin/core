package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.FindDispositionsByNumberRsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageFindDispositionsByNumberRsDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class PageFindDispositionsByNumberRsDTO {

  private Integer currentPage;

  private Integer limit;

  private Long totalElements;

  @Valid
  private List<@Valid FindDispositionsByNumberRsDTO> content = new ArrayList<>();

  public PageFindDispositionsByNumberRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageFindDispositionsByNumberRsDTO(Integer currentPage, Integer limit, Long totalElements, List<@Valid FindDispositionsByNumberRsDTO> content) {
    this.currentPage = currentPage;
    this.limit = limit;
    this.totalElements = totalElements;
    this.content = content;
  }

  public PageFindDispositionsByNumberRsDTO currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
  */
  @NotNull 
  @Schema(name = "currentPage", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public PageFindDispositionsByNumberRsDTO limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  @NotNull 
  @Schema(name = "limit", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PageFindDispositionsByNumberRsDTO totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull 
  @Schema(name = "totalElements", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageFindDispositionsByNumberRsDTO content(List<@Valid FindDispositionsByNumberRsDTO> content) {
    this.content = content;
    return this;
  }

  public PageFindDispositionsByNumberRsDTO addContentItem(FindDispositionsByNumberRsDTO contentItem) {
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
  public List<@Valid FindDispositionsByNumberRsDTO> getContent() {
    return content;
  }

  public void setContent(List<@Valid FindDispositionsByNumberRsDTO> content) {
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
    PageFindDispositionsByNumberRsDTO pageFindDispositionsByNumberRsDTO = (PageFindDispositionsByNumberRsDTO) o;
    return Objects.equals(this.currentPage, pageFindDispositionsByNumberRsDTO.currentPage) &&
        Objects.equals(this.limit, pageFindDispositionsByNumberRsDTO.limit) &&
        Objects.equals(this.totalElements, pageFindDispositionsByNumberRsDTO.totalElements) &&
        Objects.equals(this.content, pageFindDispositionsByNumberRsDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, limit, totalElements, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFindDispositionsByNumberRsDTO {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

