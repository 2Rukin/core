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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAllContractsRequestFiltering;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAllContractsRequestSorting;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetContractsItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * PageGetContracts
 */

@JsonTypeName("pageGetContracts")
/**
 * DTO PageGetContracts.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class PageGetContracts {

  private Integer currentPage;

  private Integer limit;

  private Long totalElements;

  private GetAllContractsRequestSorting sorting;

  private GetAllContractsRequestFiltering filtering;

  @Valid
  private List<@Valid GetContractsItem> content = new ArrayList<>();

  public PageGetContracts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageGetContracts(Integer currentPage, Integer limit, Long totalElements, GetAllContractsRequestSorting sorting, List<@Valid GetContractsItem> content) {
    this.currentPage = currentPage;
    this.limit = limit;
    this.totalElements = totalElements;
    this.sorting = sorting;
    this.content = content;
  }

  public PageGetContracts currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
  */
  @NotNull 
  @Schema(name = "currentPage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public PageGetContracts limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  @NotNull 
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PageGetContracts totalElements(Long totalElements) {
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

  public PageGetContracts sorting(GetAllContractsRequestSorting sorting) {
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
  public GetAllContractsRequestSorting getSorting() {
    return sorting;
  }

  public void setSorting(GetAllContractsRequestSorting sorting) {
    this.sorting = sorting;
  }

  public PageGetContracts filtering(GetAllContractsRequestFiltering filtering) {
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
  public GetAllContractsRequestFiltering getFiltering() {
    return filtering;
  }

  public void setFiltering(GetAllContractsRequestFiltering filtering) {
    this.filtering = filtering;
  }

  public PageGetContracts content(List<@Valid GetContractsItem> content) {
    this.content = content;
    return this;
  }

  public PageGetContracts addContentItem(GetContractsItem contentItem) {
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
  public List<@Valid GetContractsItem> getContent() {
    return content;
  }

  public void setContent(List<@Valid GetContractsItem> content) {
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
    PageGetContracts pageGetContracts = (PageGetContracts) o;
    return Objects.equals(this.currentPage, pageGetContracts.currentPage) &&
        Objects.equals(this.limit, pageGetContracts.limit) &&
        Objects.equals(this.totalElements, pageGetContracts.totalElements) &&
        Objects.equals(this.sorting, pageGetContracts.sorting) &&
        Objects.equals(this.filtering, pageGetContracts.filtering) &&
        Objects.equals(this.content, pageGetContracts.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, limit, totalElements, sorting, filtering, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageGetContracts {\n");
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

