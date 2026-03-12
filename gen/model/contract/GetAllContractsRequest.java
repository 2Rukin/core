package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAllContractsRequestFiltering;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetAllContractsRequestSorting;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetAllContractsRequest
 */

@JsonTypeName("getAllContractsRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetAllContractsRequest {

  private Integer pageSize = 20;

  private Integer pageNumber = 0;

  private GetAllContractsRequestSorting sorting;

  private GetAllContractsRequestFiltering filtering;

  public GetAllContractsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetAllContractsRequest(Integer pageSize, GetAllContractsRequestSorting sorting) {
    this.pageSize = pageSize;
    this.sorting = sorting;
  }

  public GetAllContractsRequest pageSize(Integer pageSize) {
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

  public GetAllContractsRequest pageNumber(Integer pageNumber) {
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

  public GetAllContractsRequest sorting(GetAllContractsRequestSorting sorting) {
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

  public GetAllContractsRequest filtering(GetAllContractsRequestFiltering filtering) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllContractsRequest getAllContractsRequest = (GetAllContractsRequest) o;
    return Objects.equals(this.pageSize, getAllContractsRequest.pageSize) &&
        Objects.equals(this.pageNumber, getAllContractsRequest.pageNumber) &&
        Objects.equals(this.sorting, getAllContractsRequest.sorting) &&
        Objects.equals(this.filtering, getAllContractsRequest.filtering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, sorting, filtering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllContractsRequest {\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
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

