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
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.GetInterestRateComponent;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.InterestRateBase;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.InterestRateBasePeriod;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.InterestRateKind;
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.InterestRateType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetInterestRate
 */

@JsonTypeName("getInterestRate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetInterestRate {

  private Long id;

  private InterestRateKind kind;

  private InterestRateType type;

  private String dateFrom;

  private String dateTo;

  private String value;

  @Valid
  private List<@Valid GetInterestRateComponent> components = new ArrayList<>();

  private InterestRateBase base;

  private InterestRateBasePeriod basePeriod;

  private UUID uuid;

  public GetInterestRate id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1583", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetInterestRate kind(InterestRateKind kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  @Valid 
  @Schema(name = "kind", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public InterestRateKind getKind() {
    return kind;
  }

  public void setKind(InterestRateKind kind) {
    this.kind = kind;
  }

  public GetInterestRate type(InterestRateType type) {
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
  public InterestRateType getType() {
    return type;
  }

  public void setType(InterestRateType type) {
    this.type = type;
  }

  public GetInterestRate dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  
  @Schema(name = "dateFrom", example = "С даты первой выборки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateFrom")
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetInterestRate dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  */
  
  @Schema(name = "dateTo", example = "По дату окончания РНС (включительно)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTo")
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public GetInterestRate value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", example = "Если СЗ>Э, то ПС=(Э*СС+(СЗ-Э)*БС)/СЗ, если ...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetInterestRate components(List<@Valid GetInterestRateComponent> components) {
    this.components = components;
    return this;
  }

  public GetInterestRate addComponentsItem(GetInterestRateComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Get components
   * @return components
  */
  @Valid 
  @Schema(name = "components", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("components")
  public List<@Valid GetInterestRateComponent> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid GetInterestRateComponent> components) {
    this.components = components;
  }

  public GetInterestRate base(InterestRateBase base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
  */
  @Valid 
  @Schema(name = "base", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base")
  public InterestRateBase getBase() {
    return base;
  }

  public void setBase(InterestRateBase base) {
    this.base = base;
  }

  public GetInterestRate basePeriod(InterestRateBasePeriod basePeriod) {
    this.basePeriod = basePeriod;
    return this;
  }

  /**
   * Get basePeriod
   * @return basePeriod
  */
  @Valid 
  @Schema(name = "basePeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("basePeriod")
  public InterestRateBasePeriod getBasePeriod() {
    return basePeriod;
  }

  public void setBasePeriod(InterestRateBasePeriod basePeriod) {
    this.basePeriod = basePeriod;
  }

  public GetInterestRate uuid(UUID uuid) {
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
    GetInterestRate getInterestRate = (GetInterestRate) o;
    return Objects.equals(this.id, getInterestRate.id) &&
        Objects.equals(this.kind, getInterestRate.kind) &&
        Objects.equals(this.type, getInterestRate.type) &&
        Objects.equals(this.dateFrom, getInterestRate.dateFrom) &&
        Objects.equals(this.dateTo, getInterestRate.dateTo) &&
        Objects.equals(this.value, getInterestRate.value) &&
        Objects.equals(this.components, getInterestRate.components) &&
        Objects.equals(this.base, getInterestRate.base) &&
        Objects.equals(this.basePeriod, getInterestRate.basePeriod) &&
        Objects.equals(this.uuid, getInterestRate.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, type, dateFrom, dateTo, value, components, base, basePeriod, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInterestRate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    basePeriod: ").append(toIndentedString(basePeriod)).append("\n");
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

