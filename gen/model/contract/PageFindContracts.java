package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ContractTypes;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.ShortContractInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageFindContracts
 */

@JsonTypeName("pageFindContracts")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class PageFindContracts {

  private Integer currentPage;

  private Integer limit;

  private Long totalElements;

  private ContractTypes type;

  private String searchKey;

  @Valid
  private List<@Valid ShortContractInfo> content = new ArrayList<>();

  public PageFindContracts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageFindContracts(Integer currentPage, Integer limit, Long totalElements, String searchKey, List<@Valid ShortContractInfo> content) {
    this.currentPage = currentPage;
    this.limit = limit;
    this.totalElements = totalElements;
    this.searchKey = searchKey;
    this.content = content;
  }

  public PageFindContracts currentPage(Integer currentPage) {
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

  public PageFindContracts limit(Integer limit) {
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

  public PageFindContracts totalElements(Long totalElements) {
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

  public PageFindContracts type(ContractTypes type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public ContractTypes getType() {
    return type;
  }

  public void setType(ContractTypes type) {
    this.type = type;
  }

  public PageFindContracts searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  /**
   * Get searchKey
   * @return searchKey
  */
  @NotNull @Size(min = 3) 
  @Schema(name = "searchKey", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("searchKey")
  public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  public PageFindContracts content(List<@Valid ShortContractInfo> content) {
    this.content = content;
    return this;
  }

  public PageFindContracts addContentItem(ShortContractInfo contentItem) {
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
    PageFindContracts pageFindContracts = (PageFindContracts) o;
    return Objects.equals(this.currentPage, pageFindContracts.currentPage) &&
        Objects.equals(this.limit, pageFindContracts.limit) &&
        Objects.equals(this.totalElements, pageFindContracts.totalElements) &&
        Objects.equals(this.type, pageFindContracts.type) &&
        Objects.equals(this.searchKey, pageFindContracts.searchKey) &&
        Objects.equals(this.content, pageFindContracts.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, limit, totalElements, type, searchKey, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFindContracts {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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

