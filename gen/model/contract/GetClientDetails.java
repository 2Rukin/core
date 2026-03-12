package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientDetails
 */

@JsonTypeName("getClientDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetClientDetails {

  private Long id;

  private String name;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    LEGAL_ENTITY("LEGAL_ENTITY"),
    
    PHYSICAL_ENTITY("PHYSICAL_ENTITY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String inn;

  private String kpp;

  private String ogrn;

  private String registrationAddress;

  private String groupCompanyName;

  private String groupCompanyComposition;

  /**
   * Gets or Sets mspType
   */
  public enum MspTypeEnum {
    MICRO("MICRO"),
    
    SMALL("SMALL"),
    
    MIDDLE("MIDDLE"),
    
    NOT_MSP("NOT_MSP");

    private String value;

    MspTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MspTypeEnum fromValue(String value) {
      for (MspTypeEnum b : MspTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MspTypeEnum mspType;

  private String additionalInfo;

  public GetClientDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetClientDetails(Long id, String name, String inn) {
    this.id = id;
    this.name = name;
    this.inn = inn;
  }

  public GetClientDetails id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "115", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetClientDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "ОАО Апельсин", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetClientDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", example = "LEGAL_ENTITY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetClientDetails inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  @NotNull 
  @Schema(name = "inn", example = "7707121314", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public GetClientDetails kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

  /**
   * Get kpp
   * @return kpp
  */
  
  @Schema(name = "kpp", example = "1236547", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }

  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  public GetClientDetails ogrn(String ogrn) {
    this.ogrn = ogrn;
    return this;
  }

  /**
   * Get ogrn
   * @return ogrn
  */
  
  @Schema(name = "ogrn", example = "01515480445145", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ogrn")
  public String getOgrn() {
    return ogrn;
  }

  public void setOgrn(String ogrn) {
    this.ogrn = ogrn;
  }

  public GetClientDetails registrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
    return this;
  }

  /**
   * Get registrationAddress
   * @return registrationAddress
  */
  
  @Schema(name = "registrationAddress", example = "Москва, Замоскворечная ул, д.1, к.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationAddress")
  public String getRegistrationAddress() {
    return registrationAddress;
  }

  public void setRegistrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
  }

  public GetClientDetails groupCompanyName(String groupCompanyName) {
    this.groupCompanyName = groupCompanyName;
    return this;
  }

  /**
   * Get groupCompanyName
   * @return groupCompanyName
  */
  
  @Schema(name = "groupCompanyName", example = "ГК Фруктовый сад", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupCompanyName")
  public String getGroupCompanyName() {
    return groupCompanyName;
  }

  public void setGroupCompanyName(String groupCompanyName) {
    this.groupCompanyName = groupCompanyName;
  }

  public GetClientDetails groupCompanyComposition(String groupCompanyComposition) {
    this.groupCompanyComposition = groupCompanyComposition;
    return this;
  }

  /**
   * Get groupCompanyComposition
   * @return groupCompanyComposition
  */
  
  @Schema(name = "groupCompanyComposition", example = "ООО Мандарин (ИНН 7707123456), ЗАО Яблоко (ИНН 7707123789), ООО Банан (ИНН 7707123321)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupCompanyComposition")
  public String getGroupCompanyComposition() {
    return groupCompanyComposition;
  }

  public void setGroupCompanyComposition(String groupCompanyComposition) {
    this.groupCompanyComposition = groupCompanyComposition;
  }

  public GetClientDetails mspType(MspTypeEnum mspType) {
    this.mspType = mspType;
    return this;
  }

  /**
   * Get mspType
   * @return mspType
  */
  
  @Schema(name = "mspType", example = "MICRO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mspType")
  public MspTypeEnum getMspType() {
    return mspType;
  }

  public void setMspType(MspTypeEnum mspType) {
    this.mspType = mspType;
  }

  public GetClientDetails additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  
  @Schema(name = "additionalInfo", example = "Дополнительная информация по клиенту отсутствует", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientDetails getClientDetails = (GetClientDetails) o;
    return Objects.equals(this.id, getClientDetails.id) &&
        Objects.equals(this.name, getClientDetails.name) &&
        Objects.equals(this.type, getClientDetails.type) &&
        Objects.equals(this.inn, getClientDetails.inn) &&
        Objects.equals(this.kpp, getClientDetails.kpp) &&
        Objects.equals(this.ogrn, getClientDetails.ogrn) &&
        Objects.equals(this.registrationAddress, getClientDetails.registrationAddress) &&
        Objects.equals(this.groupCompanyName, getClientDetails.groupCompanyName) &&
        Objects.equals(this.groupCompanyComposition, getClientDetails.groupCompanyComposition) &&
        Objects.equals(this.mspType, getClientDetails.mspType) &&
        Objects.equals(this.additionalInfo, getClientDetails.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, inn, kpp, ogrn, registrationAddress, groupCompanyName, groupCompanyComposition, mspType, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    kpp: ").append(toIndentedString(kpp)).append("\n");
    sb.append("    ogrn: ").append(toIndentedString(ogrn)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    groupCompanyName: ").append(toIndentedString(groupCompanyName)).append("\n");
    sb.append("    groupCompanyComposition: ").append(toIndentedString(groupCompanyComposition)).append("\n");
    sb.append("    mspType: ").append(toIndentedString(mspType)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

