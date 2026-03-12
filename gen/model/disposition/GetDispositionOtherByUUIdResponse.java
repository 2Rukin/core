package ru.domrf.elka.cdrd.contract_service.gen.model.disposition;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionStatusDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.DispositionTypeDTO;
import ru.domrf.elka.cdrd.contract_service.gen.model.disposition.OperationKind;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetDispositionOtherByUUIdResponse
 */

@JsonTypeName("getDispositionOtherByUUIdResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:04.562804400+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetDispositionOtherByUUIdResponse {

  private UUID id;

  private DispositionTypeDTO type;

  private String number;

  private Long date;

  private DispositionStatusDTO status;

  private OperationKind operationKind;

  private String kindOther;

  private String content;

  private String reason;

  private UUID contractId;

  private Integer contractVersion;

  private UUID executorId;

  private String executorTitle;

  private UUID authorizedId;

  private String authorizedTitle;

  public GetDispositionOtherByUUIdResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDispositionOtherByUUIdResponse(UUID id, DispositionTypeDTO type, String number, Long date, DispositionStatusDTO status) {
    this.id = id;
    this.type = type;
    this.number = number;
    this.date = date;
    this.status = status;
  }

  public GetDispositionOtherByUUIdResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", example = "3422b448-2460-4fd2-9183-8000de6f8343", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetDispositionOtherByUUIdResponse type(DispositionTypeDTO type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public DispositionTypeDTO getType() {
    return type;
  }

  public void setType(DispositionTypeDTO type) {
    this.type = type;
  }

  public GetDispositionOtherByUUIdResponse number(String number) {
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

  public GetDispositionOtherByUUIdResponse date(Long date) {
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

  public GetDispositionOtherByUUIdResponse status(DispositionStatusDTO status) {
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

  public GetDispositionOtherByUUIdResponse operationKind(OperationKind operationKind) {
    this.operationKind = operationKind;
    return this;
  }

  /**
   * Get operationKind
   * @return operationKind
  */
  @Valid 
  @Schema(name = "operationKind", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationKind")
  public OperationKind getOperationKind() {
    return operationKind;
  }

  public void setOperationKind(OperationKind operationKind) {
    this.operationKind = operationKind;
  }

  public GetDispositionOtherByUUIdResponse kindOther(String kindOther) {
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

  public GetDispositionOtherByUUIdResponse content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", example = "Осуществить списание денежных средств с расчетного счета Заемщика № 40702810600010008971 в размере 100 000, 00 (Сто тысяч 00/100) рублей за каждый день просрочки исполнения обязательства, а именно за 16.03.2021 марта 2021г.  по Кредитному договор № 90-024/КЛ-20 от 27.02.2020 г., в связи с наступлением события, указанного в статье 18.4, за нарушение условий п. (e) Cтатьи 17.37 Кредитного договора № 90-024/КЛ-20 от 27.02.2020 г.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GetDispositionOtherByUUIdResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "reason", example = "Заключение нового кредитного договора", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetDispositionOtherByUUIdResponse contractId(UUID contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
  */
  @Valid 
  @Schema(name = "contractId", example = "566122ae-8862-46e2-b554-e0db518f6dd4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractId")
  public UUID getContractId() {
    return contractId;
  }

  public void setContractId(UUID contractId) {
    this.contractId = contractId;
  }

  public GetDispositionOtherByUUIdResponse contractVersion(Integer contractVersion) {
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

  public GetDispositionOtherByUUIdResponse executorId(UUID executorId) {
    this.executorId = executorId;
    return this;
  }

  /**
   * Get executorId
   * @return executorId
  */
  @Valid 
  @Schema(name = "executorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executorId")
  public UUID getExecutorId() {
    return executorId;
  }

  public void setExecutorId(UUID executorId) {
    this.executorId = executorId;
  }

  public GetDispositionOtherByUUIdResponse executorTitle(String executorTitle) {
    this.executorTitle = executorTitle;
    return this;
  }

  /**
   * Get executorTitle
   * @return executorTitle
  */
  
  @Schema(name = "executorTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executorTitle")
  public String getExecutorTitle() {
    return executorTitle;
  }

  public void setExecutorTitle(String executorTitle) {
    this.executorTitle = executorTitle;
  }

  public GetDispositionOtherByUUIdResponse authorizedId(UUID authorizedId) {
    this.authorizedId = authorizedId;
    return this;
  }

  /**
   * Get authorizedId
   * @return authorizedId
  */
  @Valid 
  @Schema(name = "authorizedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedId")
  public UUID getAuthorizedId() {
    return authorizedId;
  }

  public void setAuthorizedId(UUID authorizedId) {
    this.authorizedId = authorizedId;
  }

  public GetDispositionOtherByUUIdResponse authorizedTitle(String authorizedTitle) {
    this.authorizedTitle = authorizedTitle;
    return this;
  }

  /**
   * Get authorizedTitle
   * @return authorizedTitle
  */
  
  @Schema(name = "authorizedTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizedTitle")
  public String getAuthorizedTitle() {
    return authorizedTitle;
  }

  public void setAuthorizedTitle(String authorizedTitle) {
    this.authorizedTitle = authorizedTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDispositionOtherByUUIdResponse getDispositionOtherByUUIdResponse = (GetDispositionOtherByUUIdResponse) o;
    return Objects.equals(this.id, getDispositionOtherByUUIdResponse.id) &&
        Objects.equals(this.type, getDispositionOtherByUUIdResponse.type) &&
        Objects.equals(this.number, getDispositionOtherByUUIdResponse.number) &&
        Objects.equals(this.date, getDispositionOtherByUUIdResponse.date) &&
        Objects.equals(this.status, getDispositionOtherByUUIdResponse.status) &&
        Objects.equals(this.operationKind, getDispositionOtherByUUIdResponse.operationKind) &&
        Objects.equals(this.kindOther, getDispositionOtherByUUIdResponse.kindOther) &&
        Objects.equals(this.content, getDispositionOtherByUUIdResponse.content) &&
        Objects.equals(this.reason, getDispositionOtherByUUIdResponse.reason) &&
        Objects.equals(this.contractId, getDispositionOtherByUUIdResponse.contractId) &&
        Objects.equals(this.contractVersion, getDispositionOtherByUUIdResponse.contractVersion) &&
        Objects.equals(this.executorId, getDispositionOtherByUUIdResponse.executorId) &&
        Objects.equals(this.executorTitle, getDispositionOtherByUUIdResponse.executorTitle) &&
        Objects.equals(this.authorizedId, getDispositionOtherByUUIdResponse.authorizedId) &&
        Objects.equals(this.authorizedTitle, getDispositionOtherByUUIdResponse.authorizedTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, number, date, status, operationKind, kindOther, content, reason, contractId, contractVersion, executorId, executorTitle, authorizedId, authorizedTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDispositionOtherByUUIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationKind: ").append(toIndentedString(operationKind)).append("\n");
    sb.append("    kindOther: ").append(toIndentedString(kindOther)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractVersion: ").append(toIndentedString(contractVersion)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    executorTitle: ").append(toIndentedString(executorTitle)).append("\n");
    sb.append("    authorizedId: ").append(toIndentedString(authorizedId)).append("\n");
    sb.append("    authorizedTitle: ").append(toIndentedString(authorizedTitle)).append("\n");
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

