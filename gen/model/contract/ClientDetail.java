package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
 * ClientDetail
 */

@JsonTypeName("clientDetail")
/**
 * DTO ClientDetail.
 *
 * @author GPT-5.2-Codex
 */
@Data
@Builder
public class ClientDetail {

  private String client;

  private String inn;

  public ClientDetail client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  
  @Schema(name = "client", example = "ОАО Апельсин", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public ClientDetail inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  
  @Schema(name = "inn", example = "7707123456", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetail clientDetail = (ClientDetail) o;
    return Objects.equals(this.client, clientDetail.client) &&
        Objects.equals(this.inn, clientDetail.inn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, inn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetail {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
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

