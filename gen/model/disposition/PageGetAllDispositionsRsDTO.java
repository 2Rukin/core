package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRqFilteringDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRqSortingDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageGetAllDispositionsRsDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class PageGetAllDispositionsRsDTO {

  private Integer currentPage;

  private Integer limit;

  private Long totalElements;

  private GetAllDispositionsRqSortingDTO sorting;

  private GetAllDispositionsRqFilteringDTO filtering;

  @Valid
  private List<@Valid GetAllDispositionsRsDTO> content = new ArrayList<>();

  public PageGetAllDispositionsRsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageGetAllDispositionsRsDTO(Integer currentPage, Integer limit, Long totalElements, GetAllDispositionsRqSortingDTO sorting, List<@Valid GetAllDispositionsRsDTO> content) {
    this.currentPage = currentPage;
    this.limit = limit;
    this.totalElements = totalElements;
    this.sorting = sorting;
    this.content = content;
  }

  public PageGetAllDispositionsRsDTO currentPage(Integer currentPage) {
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

  public PageGetAllDispositionsRsDTO limit(Integer limit) {
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

  public PageGetAllDispositionsRsDTO totalElements(Long totalElements) {
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

  public PageGetAllDispositionsRsDTO sorting(GetAllDispositionsRqSortingDTO sorting) {
    this.sorting = sorting;
    return this;
  }

  /**
   * Get sorting
   * @return sorting
  */
  @NotNull @Valid 
  @Schema(name = "sorting", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sorting")
  public GetAllDispositionsRqSortingDTO getSorting() {
    return sorting;
  }

  public void setSorting(GetAllDispositionsRqSortingDTO sorting) {
    this.sorting = sorting;
  }

  public PageGetAllDispositionsRsDTO filtering(GetAllDispositionsRqFilteringDTO filtering) {
    this.filtering = filtering;
    return this;
  }

  /**
   * Get filtering
   * @return filtering
  */
  @Valid 
  @Schema(name = "filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filtering")
  public GetAllDispositionsRqFilteringDTO getFiltering() {
    return filtering;
  }

  public void setFiltering(GetAllDispositionsRqFilteringDTO filtering) {
    this.filtering = filtering;
  }

  public PageGetAllDispositionsRsDTO content(List<@Valid GetAllDispositionsRsDTO> content) {
    this.content = content;
    return this;
  }

  public PageGetAllDispositionsRsDTO addContentItem(GetAllDispositionsRsDTO contentItem) {
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
  public List<@Valid GetAllDispositionsRsDTO> getContent() {
    return content;
  }

  public void setContent(List<@Valid GetAllDispositionsRsDTO> content) {
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
    PageGetAllDispositionsRsDTO pageGetAllDispositionsRsDTO = (PageGetAllDispositionsRsDTO) o;
    return Objects.equals(this.currentPage, pageGetAllDispositionsRsDTO.currentPage) &&
        Objects.equals(this.limit, pageGetAllDispositionsRsDTO.limit) &&
        Objects.equals(this.totalElements, pageGetAllDispositionsRsDTO.totalElements) &&
        Objects.equals(this.sorting, pageGetAllDispositionsRsDTO.sorting) &&
        Objects.equals(this.filtering, pageGetAllDispositionsRsDTO.filtering) &&
        Objects.equals(this.content, pageGetAllDispositionsRsDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, limit, totalElements, sorting, filtering, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetAllDispositionsRsDTO {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
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

