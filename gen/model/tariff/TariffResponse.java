package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import ru.domrf.elka.cdrd.contract_service.gen.model.tariff.TariffItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Получение тарифа в DTO
 */

@Schema(name = "tariffRsDTO", description = "Получение тарифа в DTO")
@JsonTypeName("tariffRsDTO")
/**
 * DTO TariffResponse.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class TariffResponse {

  private TariffItem content;

  public TariffResponse content(TariffItem content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public TariffItem getContent() {
    return content;
  }

  public void setContent(TariffItem content) {
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
    TariffResponse tariffRsDTO = (TariffResponse) o;
    return Objects.equals(this.content, tariffRsDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffResponse {\n");
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

