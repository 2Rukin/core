package ru.domrf.elka.cdrd.contract_service.gen.model.contract;

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
 * GetUserInfo
 */

@JsonTypeName("getUserInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T15:43:01.318520700+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class GetUserInfo {

  private UUID id;

  private String login;

  private String email;

  private String roles;

  private String fio;

  private String position;

  private String department;

  public GetUserInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUserInfo(UUID id, String login, String fio) {
    this.id = id;
    this.login = login;
    this.fio = fio;
  }

  public GetUserInfo id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", example = "4f87d20e-3ac8-4086-86f4-6705ecdc80d6", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetUserInfo login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  @NotNull 
  @Schema(name = "login", example = "s.korolev", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public GetUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "elka-bank-oscb@domrf.ru", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetUserInfo roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", example = "Сотрудник ОСКБ, Координатор ОСКБ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public GetUserInfo fio(String fio) {
    this.fio = fio;
    return this;
  }

  /**
   * Get fio
   * @return fio
  */
  @NotNull 
  @Schema(name = "fio", example = "Королев Сергей", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fio")
  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public GetUserInfo position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  
  @Schema(name = "position", example = "Генеральный конструктор", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public GetUserInfo department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  
  @Schema(name = "department", example = "Отдел Банковского Обслуживания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfo getUserInfo = (GetUserInfo) o;
    return Objects.equals(this.id, getUserInfo.id) &&
        Objects.equals(this.login, getUserInfo.login) &&
        Objects.equals(this.email, getUserInfo.email) &&
        Objects.equals(this.roles, getUserInfo.roles) &&
        Objects.equals(this.fio, getUserInfo.fio) &&
        Objects.equals(this.position, getUserInfo.position) &&
        Objects.equals(this.department, getUserInfo.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, email, roles, fio, position, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    fio: ").append(toIndentedString(fio)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

