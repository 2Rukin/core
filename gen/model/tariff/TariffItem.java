package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import lombok.Builder;
import lombok.Data;

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

/**
 * Данные тарифа
 */

@Schema(name = "tariffItem", description = "Данные тарифа")
@JsonTypeName("tariffItem")
/**
 * DTO TariffItem.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class TariffItem {

  private Integer id;

  private String externalCode;

  private String tariffName;

  private String formulaName;

  private Boolean formulaPictureExists;

  private UUID formulaPictureUUID;

  private String formulaPictureMime;

  private String formulaPictureExtension;

  private Integer formulaPictureSizeBytes;

  private String formulaPictureFileName;

  private Boolean helpFileExists;

  private UUID helpFileUUID;

  private String helpFileMime;

  private String helpFileExtension;

  private Integer helpFileSizeBytes;

  private String helpFileName;

  private Boolean isActive;

  public TariffItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffItem(Integer id, String externalCode) {
    this.id = id;
    this.externalCode = externalCode;
  }

  public TariffItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TariffItem externalCode(String externalCode) {
    this.externalCode = externalCode;
    return this;
  }

  /**
   * Get externalCode
   * @return externalCode
  */
  @NotNull 
  @Schema(name = "externalCode", example = "ASD-12", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("externalCode")
  public String getExternalCode() {
    return externalCode;
  }

  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }

  public TariffItem tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Get tariffName
   * @return tariffName
  */
  
  @Schema(name = "tariffName", example = "RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tariffName")
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public TariffItem formulaName(String formulaName) {
    this.formulaName = formulaName;
    return this;
  }

  /**
   * Get formulaName
   * @return formulaName
  */
  
  @Schema(name = "formulaName", example = "Формула2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaName")
  public String getFormulaName() {
    return formulaName;
  }

  public void setFormulaName(String formulaName) {
    this.formulaName = formulaName;
  }

  public TariffItem formulaPictureExists(Boolean formulaPictureExists) {
    this.formulaPictureExists = formulaPictureExists;
    return this;
  }

  /**
   * Get formulaPictureExists
   * @return formulaPictureExists
  */
  
  @Schema(name = "formulaPictureExists", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureExists")
  public Boolean getFormulaPictureExists() {
    return formulaPictureExists;
  }

  public void setFormulaPictureExists(Boolean formulaPictureExists) {
    this.formulaPictureExists = formulaPictureExists;
  }

  public TariffItem formulaPictureUUID(UUID formulaPictureUUID) {
    this.formulaPictureUUID = formulaPictureUUID;
    return this;
  }

  /**
   * Get formulaPictureUUID
   * @return formulaPictureUUID
  */
  @Valid 
  @Schema(name = "formulaPictureUUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureUUID")
  public UUID getFormulaPictureUUID() {
    return formulaPictureUUID;
  }

  public void setFormulaPictureUUID(UUID formulaPictureUUID) {
    this.formulaPictureUUID = formulaPictureUUID;
  }

  public TariffItem formulaPictureMime(String formulaPictureMime) {
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

  public TariffItem formulaPictureExtension(String formulaPictureExtension) {
    this.formulaPictureExtension = formulaPictureExtension;
    return this;
  }

  /**
   * Get formulaPictureExtension
   * @return formulaPictureExtension
  */
  
  @Schema(name = "formulaPictureExtension", example = "jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureExtension")
  public String getFormulaPictureExtension() {
    return formulaPictureExtension;
  }

  public void setFormulaPictureExtension(String formulaPictureExtension) {
    this.formulaPictureExtension = formulaPictureExtension;
  }

  public TariffItem formulaPictureSizeBytes(Integer formulaPictureSizeBytes) {
    this.formulaPictureSizeBytes = formulaPictureSizeBytes;
    return this;
  }

  /**
   * Get formulaPictureSizeBytes
   * @return formulaPictureSizeBytes
  */
  
  @Schema(name = "formulaPictureSizeBytes", example = "52", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureSizeBytes")
  public Integer getFormulaPictureSizeBytes() {
    return formulaPictureSizeBytes;
  }

  public void setFormulaPictureSizeBytes(Integer formulaPictureSizeBytes) {
    this.formulaPictureSizeBytes = formulaPictureSizeBytes;
  }

  public TariffItem formulaPictureFileName(String formulaPictureFileName) {
    this.formulaPictureFileName = formulaPictureFileName;
    return this;
  }

  /**
   * Get formulaPictureFileName
   * @return formulaPictureFileName
  */
  
  @Schema(name = "formulaPictureFileName", example = "111111-2222222222-333333.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureFileName")
  public String getFormulaPictureFileName() {
    return formulaPictureFileName;
  }

  public void setFormulaPictureFileName(String formulaPictureFileName) {
    this.formulaPictureFileName = formulaPictureFileName;
  }

  public TariffItem helpFileExists(Boolean helpFileExists) {
    this.helpFileExists = helpFileExists;
    return this;
  }

  /**
   * Get helpFileExists
   * @return helpFileExists
  */
  
  @Schema(name = "helpFileExists", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileExists")
  public Boolean getHelpFileExists() {
    return helpFileExists;
  }

  public void setHelpFileExists(Boolean helpFileExists) {
    this.helpFileExists = helpFileExists;
  }

  public TariffItem helpFileUUID(UUID helpFileUUID) {
    this.helpFileUUID = helpFileUUID;
    return this;
  }

  /**
   * Get helpFileUUID
   * @return helpFileUUID
  */
  @Valid 
  @Schema(name = "helpFileUUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileUUID")
  public UUID getHelpFileUUID() {
    return helpFileUUID;
  }

  public void setHelpFileUUID(UUID helpFileUUID) {
    this.helpFileUUID = helpFileUUID;
  }

  public TariffItem helpFileMime(String helpFileMime) {
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

  public TariffItem helpFileExtension(String helpFileExtension) {
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

  public TariffItem helpFileSizeBytes(Integer helpFileSizeBytes) {
    this.helpFileSizeBytes = helpFileSizeBytes;
    return this;
  }

  /**
   * Get helpFileSizeBytes
   * @return helpFileSizeBytes
  */
  
  @Schema(name = "helpFileSizeBytes", example = "255", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileSizeBytes")
  public Integer getHelpFileSizeBytes() {
    return helpFileSizeBytes;
  }

  public void setHelpFileSizeBytes(Integer helpFileSizeBytes) {
    this.helpFileSizeBytes = helpFileSizeBytes;
  }

  public TariffItem helpFileName(String helpFileName) {
    this.helpFileName = helpFileName;
    return this;
  }

  /**
   * Get helpFileName
   * @return helpFileName
  */
  
  @Schema(name = "helpFileName", example = "FilePath with Extension to Help File if Exists  (COMPLEX FIELD = helpFileUUID + '.' + Extension)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileName")
  public String getHelpFileName() {
    return helpFileName;
  }

  public void setHelpFileName(String helpFileName) {
    this.helpFileName = helpFileName;
  }

  public TariffItem isActive(Boolean isActive) {
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
    TariffItem tariffItem = (TariffItem) o;
    return Objects.equals(this.id, tariffItem.id) &&
        Objects.equals(this.externalCode, tariffItem.externalCode) &&
        Objects.equals(this.tariffName, tariffItem.tariffName) &&
        Objects.equals(this.formulaName, tariffItem.formulaName) &&
        Objects.equals(this.formulaPictureExists, tariffItem.formulaPictureExists) &&
        Objects.equals(this.formulaPictureUUID, tariffItem.formulaPictureUUID) &&
        Objects.equals(this.formulaPictureMime, tariffItem.formulaPictureMime) &&
        Objects.equals(this.formulaPictureExtension, tariffItem.formulaPictureExtension) &&
        Objects.equals(this.formulaPictureSizeBytes, tariffItem.formulaPictureSizeBytes) &&
        Objects.equals(this.formulaPictureFileName, tariffItem.formulaPictureFileName) &&
        Objects.equals(this.helpFileExists, tariffItem.helpFileExists) &&
        Objects.equals(this.helpFileUUID, tariffItem.helpFileUUID) &&
        Objects.equals(this.helpFileMime, tariffItem.helpFileMime) &&
        Objects.equals(this.helpFileExtension, tariffItem.helpFileExtension) &&
        Objects.equals(this.helpFileSizeBytes, tariffItem.helpFileSizeBytes) &&
        Objects.equals(this.helpFileName, tariffItem.helpFileName) &&
        Objects.equals(this.isActive, tariffItem.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalCode, tariffName, formulaName, formulaPictureExists, formulaPictureUUID, formulaPictureMime, formulaPictureExtension, formulaPictureSizeBytes, formulaPictureFileName, helpFileExists, helpFileUUID, helpFileMime, helpFileExtension, helpFileSizeBytes, helpFileName, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    formulaName: ").append(toIndentedString(formulaName)).append("\n");
    sb.append("    formulaPictureExists: ").append(toIndentedString(formulaPictureExists)).append("\n");
    sb.append("    formulaPictureUUID: ").append(toIndentedString(formulaPictureUUID)).append("\n");
    sb.append("    formulaPictureMime: ").append(toIndentedString(formulaPictureMime)).append("\n");
    sb.append("    formulaPictureExtension: ").append(toIndentedString(formulaPictureExtension)).append("\n");
    sb.append("    formulaPictureSizeBytes: ").append(toIndentedString(formulaPictureSizeBytes)).append("\n");
    sb.append("    formulaPictureFileName: ").append(toIndentedString(formulaPictureFileName)).append("\n");
    sb.append("    helpFileExists: ").append(toIndentedString(helpFileExists)).append("\n");
    sb.append("    helpFileUUID: ").append(toIndentedString(helpFileUUID)).append("\n");
    sb.append("    helpFileMime: ").append(toIndentedString(helpFileMime)).append("\n");
    sb.append("    helpFileExtension: ").append(toIndentedString(helpFileExtension)).append("\n");
    sb.append("    helpFileSizeBytes: ").append(toIndentedString(helpFileSizeBytes)).append("\n");
    sb.append("    helpFileName: ").append(toIndentedString(helpFileName)).append("\n");
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

