package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CollateralRevolverBase;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetEscrowObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetCreditEscrowObject
 */

@JsonTypeName("getCreditEscrowObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetCreditEscrowObject {

  private Long id;

  @Valid
  private List<UUID> limits = new ArrayList<>();

  @Valid
  private List<@Valid GetEscrowObject> escrowObjects = new ArrayList<>();

  private BigDecimal revolverValue;

  private CollateralRevolverBase revolverBase;

  private String another;

  private String sublimitNumber;

  private UUID uuid;

  public GetCreditEscrowObject id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2191", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetCreditEscrowObject limits(List<UUID> limits) {
    this.limits = limits;
    return this;
  }

  public GetCreditEscrowObject addLimitsItem(UUID limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * @return limits
  */
  @Valid 
  @Schema(name = "limits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limits")
  public List<UUID> getLimits() {
    return limits;
  }

  public void setLimits(List<UUID> limits) {
    this.limits = limits;
  }

  public GetCreditEscrowObject escrowObjects(List<@Valid GetEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
    return this;
  }

  public GetCreditEscrowObject addEscrowObjectsItem(GetEscrowObject escrowObjectsItem) {
    if (this.escrowObjects == null) {
      this.escrowObjects = new ArrayList<>();
    }
    this.escrowObjects.add(escrowObjectsItem);
    return this;
  }

  /**
   * Get escrowObjects
   * @return escrowObjects
  */
  @Valid 
  @Schema(name = "escrowObjects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("escrowObjects")
  public List<@Valid GetEscrowObject> getEscrowObjects() {
    return escrowObjects;
  }

  public void setEscrowObjects(List<@Valid GetEscrowObject> escrowObjects) {
    this.escrowObjects = escrowObjects;
  }

  public GetCreditEscrowObject revolverValue(BigDecimal revolverValue) {
    this.revolverValue = revolverValue;
    return this;
  }

  /**
   * Get revolverValue
   * @return revolverValue
  */
  @Valid 
  @Schema(name = "revolverValue", example = "10.15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revolverValue")
  public BigDecimal getRevolverValue() {
    return revolverValue;
  }

  public void setRevolverValue(BigDecimal revolverValue) {
    this.revolverValue = revolverValue;
  }

  public GetCreditEscrowObject revolverBase(CollateralRevolverBase revolverBase) {
    this.revolverBase = revolverBase;
    return this;
  }

  /**
   * Get revolverBase
   * @return revolverBase
  */
  @Valid 
  @Schema(name = "revolverBase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revolverBase")
  public CollateralRevolverBase getRevolverBase() {
    return revolverBase;
  }

  public void setRevolverBase(CollateralRevolverBase revolverBase) {
    this.revolverBase = revolverBase;
  }

  public GetCreditEscrowObject another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Формат расчета(иное)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public GetCreditEscrowObject sublimitNumber(String sublimitNumber) {
    this.sublimitNumber = sublimitNumber;
    return this;
  }

  /**
   * Get sublimitNumber
   * @return sublimitNumber
  */
  
  @Schema(name = "sublimitNumber", example = "Номер сублимита", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sublimitNumber")
  public String getSublimitNumber() {
    return sublimitNumber;
  }

  public void setSublimitNumber(String sublimitNumber) {
    this.sublimitNumber = sublimitNumber;
  }

  public GetCreditEscrowObject uuid(UUID uuid) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCreditEscrowObject getCreditEscrowObject = (GetCreditEscrowObject) o;
    return Objects.equals(this.id, getCreditEscrowObject.id) &&
        Objects.equals(this.limits, getCreditEscrowObject.limits) &&
        Objects.equals(this.escrowObjects, getCreditEscrowObject.escrowObjects) &&
        Objects.equals(this.revolverValue, getCreditEscrowObject.revolverValue) &&
        Objects.equals(this.revolverBase, getCreditEscrowObject.revolverBase) &&
        Objects.equals(this.another, getCreditEscrowObject.another) &&
        Objects.equals(this.sublimitNumber, getCreditEscrowObject.sublimitNumber) &&
        Objects.equals(this.uuid, getCreditEscrowObject.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limits, escrowObjects, revolverValue, revolverBase, another, sublimitNumber, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCreditEscrowObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    escrowObjects: ").append(toIndentedString(escrowObjects)).append("\n");
    sb.append("    revolverValue: ").append(toIndentedString(revolverValue)).append("\n");
    sb.append("    revolverBase: ").append(toIndentedString(revolverBase)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
    sb.append("    sublimitNumber: ").append(toIndentedString(sublimitNumber)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

