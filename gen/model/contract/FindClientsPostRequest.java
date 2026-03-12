package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
import jakarta.annotation.Generated;

/**
 * FindClientsPostRequest
 */

@JsonTypeName("findClientsPostRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class FindClientsPostRequest {

  private Integer pageSize = 10;

  private Integer pageNumber = 0;

  private String searchKey;

  public FindClientsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FindClientsPostRequest(Integer pageSize, String searchKey) {
    this.pageSize = pageSize;
    this.searchKey = searchKey;
  }

  public FindClientsPostRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  @NotNull 
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public FindClientsPostRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "pageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public FindClientsPostRequest searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  /**
   * Ключ поиска.
   * @return searchKey
  */
  @NotNull @Size(min = 3) 
  @Schema(name = "searchKey", example = "Апе", description = "Ключ поиска.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("searchKey")
  public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindClientsPostRequest findClientsPostRequest = (FindClientsPostRequest) o;
    return Objects.equals(this.pageSize, findClientsPostRequest.pageSize) &&
        Objects.equals(this.pageNumber, findClientsPostRequest.pageNumber) &&
        Objects.equals(this.searchKey, findClientsPostRequest.searchKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, searchKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindClientsPostRequest {\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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

