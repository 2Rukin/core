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
import ru.domrf.elka.cdrd.contract_service.gen.model.contract.CreateInterestRateComponent;
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
 * CreateInterestRate
 */

@JsonTypeName("createInterestRate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateInterestRate {

  private InterestRateKind kind;

  private InterestRateType type;

  private String dateFrom;

  private String dateTo;

  private String value;

  private UUID uuid;

  @Valid
  private List<@Valid CreateInterestRateComponent> components = new ArrayList<>();

  private InterestRateBase base;

  private InterestRateBasePeriod basePeriod;

  public CreateInterestRate kind(InterestRateKind kind) {
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

  public CreateInterestRate type(InterestRateType type) {
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

  public CreateInterestRate dateFrom(String dateFrom) {
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

  public CreateInterestRate dateTo(String dateTo) {
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

  public CreateInterestRate value(String value) {
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

  public CreateInterestRate uuid(UUID uuid) {
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

  public CreateInterestRate components(List<@Valid CreateInterestRateComponent> components) {
    this.components = components;
    return this;
  }

  public CreateInterestRate addComponentsItem(CreateInterestRateComponent componentsItem) {
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
  public List<@Valid CreateInterestRateComponent> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid CreateInterestRateComponent> components) {
    this.components = components;
  }

  public CreateInterestRate base(InterestRateBase base) {
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

  public CreateInterestRate basePeriod(InterestRateBasePeriod basePeriod) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInterestRate createInterestRate = (CreateInterestRate) o;
    return Objects.equals(this.kind, createInterestRate.kind) &&
        Objects.equals(this.type, createInterestRate.type) &&
        Objects.equals(this.dateFrom, createInterestRate.dateFrom) &&
        Objects.equals(this.dateTo, createInterestRate.dateTo) &&
        Objects.equals(this.value, createInterestRate.value) &&
        Objects.equals(this.uuid, createInterestRate.uuid) &&
        Objects.equals(this.components, createInterestRate.components) &&
        Objects.equals(this.base, createInterestRate.base) &&
        Objects.equals(this.basePeriod, createInterestRate.basePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, type, dateFrom, dateTo, value, uuid, components, base, basePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInterestRate {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    basePeriod: ").append(toIndentedString(basePeriod)).append("\n");
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

