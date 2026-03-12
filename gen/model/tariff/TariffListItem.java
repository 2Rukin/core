package ru.domrf.elka.cdrd.contract_service.gen.model.tariff;

import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Тариф в списке
 */

@Schema(name = "tariffListItem", description = "Тариф в списке")
@JsonTypeName("tariffListItem")
/**
 * DTO TariffListItem.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class TariffListItem {

  private Integer id;

  private String externalCode;

  private String tariffName;

  private String formulaName;

  private Boolean formulaPictureExists;

  private String formulaPictureFileName;

  private Boolean helpFileExists;

  private String helpFileName;

  private Boolean isActive;

  public TariffListItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffListItem(Integer id, String externalCode, String tariffName, String formulaName) {
    this.id = id;
    this.externalCode = externalCode;
    this.tariffName = tariffName;
    this.formulaName = formulaName;
  }

  public TariffListItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TariffListItem externalCode(String externalCode) {
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

  public TariffListItem tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Get tariffName
   * @return tariffName
  */
  @NotNull 
  @Schema(name = "tariffName", example = "RUR_ЭСКИФ_ДР ЭСКРОУ Инвестиционная фаза (% в дату раскрытия)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tariffName")
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public TariffListItem formulaName(String formulaName) {
    this.formulaName = formulaName;
    return this;
  }

  /**
   * Get formulaName
   * @return formulaName
  */
  @NotNull 
  @Schema(name = "formulaName", example = "Формула2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formulaName")
  public String getFormulaName() {
    return formulaName;
  }

  public void setFormulaName(String formulaName) {
    this.formulaName = formulaName;
  }

  public TariffListItem formulaPictureExists(Boolean formulaPictureExists) {
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

  public TariffListItem formulaPictureFileName(String formulaPictureFileName) {
    this.formulaPictureFileName = formulaPictureFileName;
    return this;
  }

  /**
   * Get formulaPictureFileName
   * @return formulaPictureFileName
  */
  
  @Schema(name = "formulaPictureFileName", example = "FilePath with Extension to Picture if Exists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaPictureFileName")
  public String getFormulaPictureFileName() {
    return formulaPictureFileName;
  }

  public void setFormulaPictureFileName(String formulaPictureFileName) {
    this.formulaPictureFileName = formulaPictureFileName;
  }

  public TariffListItem helpFileExists(Boolean helpFileExists) {
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

  public TariffListItem helpFileName(String helpFileName) {
    this.helpFileName = helpFileName;
    return this;
  }

  /**
   * Get helpFileName
   * @return helpFileName
  */
  
  @Schema(name = "helpFileName", example = "FilePath with Extension to Help File if Exists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpFileName")
  public String getHelpFileName() {
    return helpFileName;
  }

  public void setHelpFileName(String helpFileName) {
    this.helpFileName = helpFileName;
  }

  public TariffListItem isActive(Boolean isActive) {
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
    TariffListItem tariffListItem = (TariffListItem) o;
    return Objects.equals(this.id, tariffListItem.id) &&
        Objects.equals(this.externalCode, tariffListItem.externalCode) &&
        Objects.equals(this.tariffName, tariffListItem.tariffName) &&
        Objects.equals(this.formulaName, tariffListItem.formulaName) &&
        Objects.equals(this.formulaPictureExists, tariffListItem.formulaPictureExists) &&
        Objects.equals(this.formulaPictureFileName, tariffListItem.formulaPictureFileName) &&
        Objects.equals(this.helpFileExists, tariffListItem.helpFileExists) &&
        Objects.equals(this.helpFileName, tariffListItem.helpFileName) &&
        Objects.equals(this.isActive, tariffListItem.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalCode, tariffName, formulaName, formulaPictureExists, formulaPictureFileName, helpFileExists, helpFileName, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    formulaName: ").append(toIndentedString(formulaName)).append("\n");
    sb.append("    formulaPictureExists: ").append(toIndentedString(formulaPictureExists)).append("\n");
    sb.append("    formulaPictureFileName: ").append(toIndentedString(formulaPictureFileName)).append("\n");
    sb.append("    helpFileExists: ").append(toIndentedString(helpFileExists)).append("\n");
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

