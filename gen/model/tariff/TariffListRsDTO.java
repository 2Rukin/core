package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffListItem;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffListSorting;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Получение списка тарифов в DTO
 */

@Schema(name = "tariffListRsDTO", description = "Получение списка тарифов в DTO")
@JsonTypeName("tariffListRsDTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.237390300+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class TariffListRsDTO {

  private TariffListSorting sorting;

  @Valid
  private List<@Valid TariffListItem> content = new ArrayList<>();

  public TariffListRsDTO sorting(TariffListSorting sorting) {
    this.sorting = sorting;
    return this;
  }

  /**
   * Get sorting
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public TariffListSorting getSorting() {
    return sorting;
  }

  public void setSorting(TariffListSorting sorting) {
    this.sorting = sorting;
  }

  public TariffListRsDTO content(List<@Valid TariffListItem> content) {
    this.content = content;
    return this;
  }

  public TariffListRsDTO addContentItem(TariffListItem contentItem) {
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
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid TariffListItem> getContent() {
    return content;
  }

  public void setContent(List<@Valid TariffListItem> content) {
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
    TariffListRsDTO tariffListRsDTO = (TariffListRsDTO) o;
    return Objects.equals(this.sorting, tariffListRsDTO.sorting) &&
        Objects.equals(this.content, tariffListRsDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorting, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffListRsDTO {\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

