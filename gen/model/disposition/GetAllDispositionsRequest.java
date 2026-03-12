package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRqFilteringDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.GetAllDispositionsRqSortingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetAllDispositionsRequest
 */

/**
 * DTO GetAllDispositionsRequest.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetAllDispositionsRequest {

  private Integer pageSize = 20;

  private Integer pageNumber = 0;

  private GetAllDispositionsRqSortingDTO sorting;

  private GetAllDispositionsRqFilteringDTO filtering;

  public GetAllDispositionsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetAllDispositionsRequest(Integer pageSize, GetAllDispositionsRqSortingDTO sorting) {
    this.pageSize = pageSize;
    this.sorting = sorting;
  }

  public GetAllDispositionsRequest pageSize(Integer pageSize) {
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

  public GetAllDispositionsRequest pageNumber(Integer pageNumber) {
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

  public GetAllDispositionsRequest sorting(GetAllDispositionsRqSortingDTO sorting) {
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

  public GetAllDispositionsRequest filtering(GetAllDispositionsRqFilteringDTO filtering) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllDispositionsRequest getAllDispositionsRqDTO = (GetAllDispositionsRequest) o;
    return Objects.equals(this.pageSize, getAllDispositionsRqDTO.pageSize) &&
        Objects.equals(this.pageNumber, getAllDispositionsRqDTO.pageNumber) &&
        Objects.equals(this.sorting, getAllDispositionsRqDTO.sorting) &&
        Objects.equals(this.filtering, getAllDispositionsRqDTO.filtering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, sorting, filtering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllDispositionsRequest {\n");
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

