package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Создание/обновление тарифа в DTO
 */

@Schema(name = "tariffRqDTO", description = "Создание/обновление тарифа в DTO")
@JsonTypeName("tariffRqDTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.237390300+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class TariffRqDTO {

  private String externalCode;

  private String nameTariff;

  private String nameFormula;

  private UUID formulaPictureUUID;

  private String formulaPictureMime;

  private String formulaPictureExtension;

  private Integer formulaPictureSizeBytes;

  private UUID helpFileUUID;

  private String helpFileMime;

  private String helpFileExtension;

  private Integer helpFileSizeBytes;

  private Boolean isActive;

  public TariffRqDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffRqDTO(String nameTariff, String nameFormula, UUID formulaPictureUUID, UUID helpFileUUID) {
    this.nameTariff = nameTariff;
    this.nameFormula = nameFormula;
    this.formulaPictureUUID = formulaPictureUUID;
    this.helpFileUUID = helpFileUUID;
  }

  public TariffRqDTO externalCode(String externalCode) {
    this.externalCode = externalCode;
    return this;
  }

  /**
   * Get externalCode
   * @return externalCode
  */
  
  @Schema(name = "externalCode", example = "ASD-12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalCode")
  public String getExternalCode() {
    return externalCode;
  }

  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }

  public TariffRqDTO nameTariff(String nameTariff) {
    this.nameTariff = nameTariff;
    return this;
  }

  /**
   * Get nameTariff
   * @return nameTariff
  */
  @NotNull 
  @Schema(name = "nameTariff", example = "RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nameTariff")
  public String getNameTariff() {
    return nameTariff;
  }

  public void setNameTariff(String nameTariff) {
    this.nameTariff = nameTariff;
  }

  public TariffRqDTO nameFormula(String nameFormula) {
    this.nameFormula = nameFormula;
    return this;
  }

  /**
   * Get nameFormula
   * @return nameFormula
  */
  @NotNull 
  @Schema(name = "nameFormula", example = "Формула2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nameFormula")
  public String getNameFormula() {
    return nameFormula;
  }

  public void setNameFormula(String nameFormula) {
    this.nameFormula = nameFormula;
  }

  public TariffRqDTO formulaPictureUUID(UUID formulaPictureUUID) {
    this.formulaPictureUUID = formulaPictureUUID;
    return this;
  }

  /**
   * Get formulaPictureUUID
   * @return formulaPictureUUID
  */
  @NotNull @Valid 
  @Schema(name = "formulaPictureUUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formulaPictureUUID")
  public UUID getFormulaPictureUUID() {
    return formulaPictureUUID;
  }

  public void setFormulaPictureUUID(UUID formulaPictureUUID) {
    this.formulaPictureUUID = formulaPictureUUID;
  }

  public TariffRqDTO formulaPictureMime(String formulaPictureMime) {
    this.formulaPictureMime = formulaPictureMime;
    return this;
  }

  /**
   * Get formulaPictureMime
   * @return formulaPictureMime
  */
  
  @Schema(name = "formulaPictureMime", example = "image/jpeg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureMime")
  public String getFormulaPictureMime() {
    return formulaPictureMime;
  }

  public void setFormulaPictureMime(String formulaPictureMime) {
    this.formulaPictureMime = formulaPictureMime;
  }

  public TariffRqDTO formulaPictureExtension(String formulaPictureExtension) {
    this.formulaPictureExtension = formulaPictureExtension;
    return this;
  }

  /**
   * Get formulaPictureExtension
   * @return formulaPictureExtension
  */
  
  @Schema(name = "formulaPictureExtension", example = "jpeg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureExtension")
  public String getFormulaPictureExtension() {
    return formulaPictureExtension;
  }

  public void setFormulaPictureExtension(String formulaPictureExtension) {
    this.formulaPictureExtension = formulaPictureExtension;
  }

  public TariffRqDTO formulaPictureSizeBytes(Integer formulaPictureSizeBytes) {
    this.formulaPictureSizeBytes = formulaPictureSizeBytes;
    return this;
  }

  /**
   * Get formulaPictureSizeBytes
   * @return formulaPictureSizeBytes
  */
  
  @Schema(name = "formulaPictureSizeBytes", example = "1254", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureSizeBytes")
  public Integer getFormulaPictureSizeBytes() {
    return formulaPictureSizeBytes;
  }

  public void setFormulaPictureSizeBytes(Integer formulaPictureSizeBytes) {
    this.formulaPictureSizeBytes = formulaPictureSizeBytes;
  }

  public TariffRqDTO helpFileUUID(UUID helpFileUUID) {
    this.helpFileUUID = helpFileUUID;
    return this;
  }

  /**
   * Get helpFileUUID
   * @return helpFileUUID
  */
  @NotNull @Valid 
  @Schema(name = "helpFileUUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("helpFileUUID")
  public UUID getHelpFileUUID() {
    return helpFileUUID;
  }

  public void setHelpFileUUID(UUID helpFileUUID) {
    this.helpFileUUID = helpFileUUID;
  }

  public TariffRqDTO helpFileMime(String helpFileMime) {
    this.helpFileMime = helpFileMime;
    return this;
  }

  /**
   * Get helpFileMime
   * @return helpFileMime
  */
  
  @Schema(name = "helpFileMime", example = "application/vnd.openxmlformats-officedocument.wordprocessingml.document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileMime")
  public String getHelpFileMime() {
    return helpFileMime;
  }

  public void setHelpFileMime(String helpFileMime) {
    this.helpFileMime = helpFileMime;
  }

  public TariffRqDTO helpFileExtension(String helpFileExtension) {
    this.helpFileExtension = helpFileExtension;
    return this;
  }

  /**
   * Get helpFileExtension
   * @return helpFileExtension
  */
  
  @Schema(name = "helpFileExtension", example = "docx", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileExtension")
  public String getHelpFileExtension() {
    return helpFileExtension;
  }

  public void setHelpFileExtension(String helpFileExtension) {
    this.helpFileExtension = helpFileExtension;
  }

  public TariffRqDTO helpFileSizeBytes(Integer helpFileSizeBytes) {
    this.helpFileSizeBytes = helpFileSizeBytes;
    return this;
  }

  /**
   * Get helpFileSizeBytes
   * @return helpFileSizeBytes
  */
  
  @Schema(name = "helpFileSizeBytes", example = "11262", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileSizeBytes")
  public Integer getHelpFileSizeBytes() {
    return helpFileSizeBytes;
  }

  public void setHelpFileSizeBytes(Integer helpFileSizeBytes) {
    this.helpFileSizeBytes = helpFileSizeBytes;
  }

  public TariffRqDTO isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffRqDTO tariffRqDTO = (TariffRqDTO) o;
    return Objects.equals(this.externalCode, tariffRqDTO.externalCode) &&
        Objects.equals(this.nameTariff, tariffRqDTO.nameTariff) &&
        Objects.equals(this.nameFormula, tariffRqDTO.nameFormula) &&
        Objects.equals(this.formulaPictureUUID, tariffRqDTO.formulaPictureUUID) &&
        Objects.equals(this.formulaPictureMime, tariffRqDTO.formulaPictureMime) &&
        Objects.equals(this.formulaPictureExtension, tariffRqDTO.formulaPictureExtension) &&
        Objects.equals(this.formulaPictureSizeBytes, tariffRqDTO.formulaPictureSizeBytes) &&
        Objects.equals(this.helpFileUUID, tariffRqDTO.helpFileUUID) &&
        Objects.equals(this.helpFileMime, tariffRqDTO.helpFileMime) &&
        Objects.equals(this.helpFileExtension, tariffRqDTO.helpFileExtension) &&
        Objects.equals(this.helpFileSizeBytes, tariffRqDTO.helpFileSizeBytes) &&
        Objects.equals(this.isActive, tariffRqDTO.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCode, nameTariff, nameFormula, formulaPictureUUID, formulaPictureMime, formulaPictureExtension, formulaPictureSizeBytes, helpFileUUID, helpFileMime, helpFileExtension, helpFileSizeBytes, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffRqDTO {\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    nameTariff: ").append(toIndentedString(nameTariff)).append("\n");
    sb.append("    nameFormula: ").append(toIndentedString(nameFormula)).append("\n");
    sb.append("    formulaPictureUUID: ").append(toIndentedString(formulaPictureUUID)).append("\n");
    sb.append("    formulaPictureMime: ").append(toIndentedString(formulaPictureMime)).append("\n");
    sb.append("    formulaPictureExtension: ").append(toIndentedString(formulaPictureExtension)).append("\n");
    sb.append("    formulaPictureSizeBytes: ").append(toIndentedString(formulaPictureSizeBytes)).append("\n");
    sb.append("    helpFileUUID: ").append(toIndentedString(helpFileUUID)).append("\n");
    sb.append("    helpFileMime: ").append(toIndentedString(helpFileMime)).append("\n");
    sb.append("    helpFileExtension: ").append(toIndentedString(helpFileExtension)).append("\n");
    sb.append("    helpFileSizeBytes: ").append(toIndentedString(helpFileSizeBytes)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

