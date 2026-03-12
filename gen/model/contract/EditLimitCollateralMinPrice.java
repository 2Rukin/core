package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CollateralMinPriceFormat;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.PropertyType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EditLimitCollateralMinPrice
 */

@JsonTypeName("editLimitCollateralMinPrice")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class EditLimitCollateralMinPrice {

  private Long id;

  private PropertyType propertyType;

  private String another;

  private CollateralMinPriceFormat collateralMinPriceFormat;

  private BigDecimal minPrice;

  private BigDecimal sqMtPieceCollateralMinPriceValid;

  private UUID uuid;

  public EditLimitCollateralMinPrice id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "325", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EditLimitCollateralMinPrice propertyType(PropertyType propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   * @return propertyType
  */
  @Valid 
  @Schema(name = "propertyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propertyType")
  public PropertyType getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(PropertyType propertyType) {
    this.propertyType = propertyType;
  }

  public EditLimitCollateralMinPrice another(String another) {
    this.another = another;
    return this;
  }

  /**
   * Get another
   * @return another
  */
  
  @Schema(name = "another", example = "Тип недвижимости (иное)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("another")
  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public EditLimitCollateralMinPrice collateralMinPriceFormat(CollateralMinPriceFormat collateralMinPriceFormat) {
    this.collateralMinPriceFormat = collateralMinPriceFormat;
    return this;
  }

  /**
   * Get collateralMinPriceFormat
   * @return collateralMinPriceFormat
  */
  @Valid 
  @Schema(name = "collateralMinPriceFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collateralMinPriceFormat")
  public CollateralMinPriceFormat getCollateralMinPriceFormat() {
    return collateralMinPriceFormat;
  }

  public void setCollateralMinPriceFormat(CollateralMinPriceFormat collateralMinPriceFormat) {
    this.collateralMinPriceFormat = collateralMinPriceFormat;
  }

  public EditLimitCollateralMinPrice minPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  /**
   * Get minPrice
   * @return minPrice
  */
  @Valid 
  @Schema(name = "minPrice", example = "100000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minPrice")
  public BigDecimal getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
  }

  public EditLimitCollateralMinPrice sqMtPieceCollateralMinPriceValid(BigDecimal sqMtPieceCollateralMinPriceValid) {
    this.sqMtPieceCollateralMinPriceValid = sqMtPieceCollateralMinPriceValid;
    return this;
  }

  /**
   * Get sqMtPieceCollateralMinPriceValid
   * @return sqMtPieceCollateralMinPriceValid
  */
  @Valid 
  @Schema(name = "sqMtPieceCollateralMinPriceValid", example = "500", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqMtPieceCollateralMinPriceValid")
  public BigDecimal getSqMtPieceCollateralMinPriceValid() {
    return sqMtPieceCollateralMinPriceValid;
  }

  public void setSqMtPieceCollateralMinPriceValid(BigDecimal sqMtPieceCollateralMinPriceValid) {
    this.sqMtPieceCollateralMinPriceValid = sqMtPieceCollateralMinPriceValid;
  }

  public EditLimitCollateralMinPrice uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EditLimitCollateralMinPrice editLimitCollateralMinPrice = (EditLimitCollateralMinPrice) o;
    return Objects.equals(this.id, editLimitCollateralMinPrice.id) &&
        Objects.equals(this.propertyType, editLimitCollateralMinPrice.propertyType) &&
        Objects.equals(this.another, editLimitCollateralMinPrice.another) &&
        Objects.equals(this.collateralMinPriceFormat, editLimitCollateralMinPrice.collateralMinPriceFormat) &&
        Objects.equals(this.minPrice, editLimitCollateralMinPrice.minPrice) &&
        Objects.equals(this.sqMtPieceCollateralMinPriceValid, editLimitCollateralMinPrice.sqMtPieceCollateralMinPriceValid) &&
        Objects.equals(this.uuid, editLimitCollateralMinPrice.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyType, another, collateralMinPriceFormat, minPrice, sqMtPieceCollateralMinPriceValid, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLimitCollateralMinPrice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    another: ").append(toIndentedString(another)).append("\n");
    sb.append("    collateralMinPriceFormat: ").append(toIndentedString(collateralMinPriceFormat)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    sqMtPieceCollateralMinPriceValid: ").append(toIndentedString(sqMtPieceCollateralMinPriceValid)).append("\n");
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

