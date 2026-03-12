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
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.F303classifications590PItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * GetLimitF303Classification590P
 */

@JsonTypeName("getLimit_f303Classification590P")
/**
 * DTO GetLimitF303Classification590P.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class GetLimitF303Classification590P {

  private Long id;

  @Valid
  private List<F303classifications590PItem> classifications = new ArrayList<>();

  private Long dateFrom;

  private Long dateTo;

  private UUID byDispositionUuid;

  private String another;

  public GetLimitF303Classification590P id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "8456", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetLimitF303Classification590P classifications(List<F303classifications590PItem> classifications) {
    this.classifications = classifications;
    return this;
  }

  public GetLimitF303Classification590P addClassificationsItem(F303classifications590PItem classificationsItem) {
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

  public GetLimitF303Classification590P dateFrom(Long dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  
  @Schema(name = "dateFrom", example = "1557057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateFrom")
  public Long getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Long dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetLimitF303Classification590P dateTo(Long dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  */
  
  @Schema(name = "dateTo", example = "1567057600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTo")
  public Long getDateTo() {
    return dateTo;
  }

  public void setDateTo(Long dateTo) {
    this.dateTo = dateTo;
  }

  public GetLimitF303Classification590P byDispositionUuid(UUID byDispositionUuid) {
    this.byDispositionUuid = byDispositionUuid;
    return this;
  }

  /**
   * Get byDispositionUuid
   * @return byDispositionUuid
  */
  @Valid 
  @Schema(name = "byDispositionUuid", example = "3422b448-2460-4fd2-9183-8000de6f8343", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("byDispositionUuid")
  public UUID getByDispositionUuid() {
    return byDispositionUuid;
  }

  public void setByDispositionUuid(UUID byDispositionUuid) {
    this.byDispositionUuid = byDispositionUuid;
  }

  public GetLimitF303Classification590P another(String another) {
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
    GetLimitF303Classification590P getLimitF303Classification590P = (GetLimitF303Classification590P) o;
    return Objects.equals(this.id, getLimitF303Classification590P.id) &&
        Objects.equals(this.classifications, getLimitF303Classification590P.classifications) &&
        Objects.equals(this.dateFrom, getLimitF303Classification590P.dateFrom) &&
        Objects.equals(this.dateTo, getLimitF303Classification590P.dateTo) &&
        Objects.equals(this.byDispositionUuid, getLimitF303Classification590P.byDispositionUuid) &&
        Objects.equals(this.another, getLimitF303Classification590P.another);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, classifications, dateFrom, dateTo, byDispositionUuid, another);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLimitF303Classification590P {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    byDispositionUuid: ").append(toIndentedString(byDispositionUuid)).append("\n");
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

