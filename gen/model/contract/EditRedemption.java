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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.RedemptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * EditRedemption
 */

@JsonTypeName("editRedemption")
/**
 * DTO EditRedemption.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class EditRedemption {

  private Long id;

  @Valid
  private List<RedemptionType> types = new ArrayList<>();

  private String description;

  private UUID uuid;

  private String another;

  public EditRedemption id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1991", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EditRedemption types(List<RedemptionType> types) {
    this.types = types;
    return this;
  }

  public EditRedemption addTypesItem(RedemptionType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @Valid 
  @Schema(name = "types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<RedemptionType> getTypes() {
    return types;
  }

  public void setTypes(List<RedemptionType> types) {
    this.types = types;
  }

  public EditRedemption description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Формулировка очередности погашения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditRedemption uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", example = "36f16a79-a998-4419-82da-f2769001713f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public EditRedemption another(String another) {
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
    EditRedemption editRedemption = (EditRedemption) o;
    return Objects.equals(this.id, editRedemption.id) &&
        Objects.equals(this.types, editRedemption.types) &&
        Objects.equals(this.description, editRedemption.description) &&
        Objects.equals(this.uuid, editRedemption.uuid) &&
        Objects.equals(this.another, editRedemption.another);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, types, description, uuid, another);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditRedemption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

