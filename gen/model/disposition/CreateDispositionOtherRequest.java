package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionStatusDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.OperationKind;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Набор данных, необходимый для создания нового универсального распоряжения
 */

@Schema(name = "createDispositionOtherRequest", description = "Набор данных, необходимый для создания нового универсального распоряжения")
@JsonTypeName("createDispositionOtherRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class CreateDispositionOtherRequest {

  private String number;

  private Long date;

  private DispositionStatusDTO status;

  private OperationKind operationKind;

  private String kindOther;

  private String content;

  private String reason;

  private UUID contractId;

  private Integer contractVersion;

  public CreateDispositionOtherRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateDispositionOtherRequest(String number, Long date, DispositionStatusDTO status, OperationKind operationKind, String content, String reason, UUID contractId) {
    this.number = number;
    this.date = date;
    this.status = status;
    this.operationKind = operationKind;
    this.content = content;
    this.reason = reason;
    this.contractId = contractId;
  }

  public CreateDispositionOtherRequest number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "117ЮЛ-06/2023", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreateDispositionOtherRequest date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @NotNull 
  @Schema(name = "date", example = "1557057600", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public CreateDispositionOtherRequest status(DispositionStatusDTO status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public DispositionStatusDTO getStatus() {
    return status;
  }

  public void setStatus(DispositionStatusDTO status) {
    this.status = status;
  }

  public CreateDispositionOtherRequest operationKind(OperationKind operationKind) {
    this.operationKind = operationKind;
    return this;
  }

  /**
   * Get operationKind
   * @return operationKind
  */
  @NotNull @Valid 
  @Schema(name = "operationKind", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operationKind")
  public OperationKind getOperationKind() {
    return operationKind;
  }

  public void setOperationKind(OperationKind operationKind) {
    this.operationKind = operationKind;
  }

  public CreateDispositionOtherRequest kindOther(String kindOther) {
    this.kindOther = kindOther;
    return this;
  }

  /**
   * Get kindOther
   * @return kindOther
  */
  
  @Schema(name = "kindOther", example = "Что-то, что ввел пользователь", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kindOther")
  public String getKindOther() {
    return kindOther;
  }

  public void setKindOther(String kindOther) {
    this.kindOther = kindOther;
  }

  public CreateDispositionOtherRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull 
  @Schema(name = "content", example = "Осуществить списание денежных средств с расчетного счета Заемщика № 40702810600010008971 в размере 100 000, 00 (Сто тысяч 00/100) рублей за каждый день просрочки исполнения обязательства, а именно за 16.03.2021 марта 2021г.  по Кредитному договор № 90-024/КЛ-20 от 27.02.2020 г., в связи с наступлением события, указанного в статье 18.4, за нарушение условий п. (e) Cтатьи 17.37 Кредитного договора № 90-024/КЛ-20 от 27.02.2020 г.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CreateDispositionOtherRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", example = "Приложение 1 к Протоколу заседания Кредитного комитета АО Банк «ДОМ.РФ» № 38 КК/21 от 29.03.2021г.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CreateDispositionOtherRequest contractId(UUID contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
  */
  @NotNull @Valid 
  @Schema(name = "contractId", example = "566122ae-8862-46e2-b554-e0db518f6dd4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractId")
  public UUID getContractId() {
    return contractId;
  }

  public void setContractId(UUID contractId) {
    this.contractId = contractId;
  }

  public CreateDispositionOtherRequest contractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
    return this;
  }

  /**
   * Get contractVersion
   * @return contractVersion
  */
  
  @Schema(name = "contractVersion", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractVersion")
  public Integer getContractVersion() {
    return contractVersion;
  }

  public void setContractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDispositionOtherRequest createDispositionOtherRequest = (CreateDispositionOtherRequest) o;
    return Objects.equals(this.number, createDispositionOtherRequest.number) &&
        Objects.equals(this.date, createDispositionOtherRequest.date) &&
        Objects.equals(this.status, createDispositionOtherRequest.status) &&
        Objects.equals(this.operationKind, createDispositionOtherRequest.operationKind) &&
        Objects.equals(this.kindOther, createDispositionOtherRequest.kindOther) &&
        Objects.equals(this.content, createDispositionOtherRequest.content) &&
        Objects.equals(this.reason, createDispositionOtherRequest.reason) &&
        Objects.equals(this.contractId, createDispositionOtherRequest.contractId) &&
        Objects.equals(this.contractVersion, createDispositionOtherRequest.contractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, status, operationKind, kindOther, content, reason, contractId, contractVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDispositionOtherRequest {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationKind: ").append(toIndentedString(operationKind)).append("\n");
    sb.append("    kindOther: ").append(toIndentedString(kindOther)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
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

