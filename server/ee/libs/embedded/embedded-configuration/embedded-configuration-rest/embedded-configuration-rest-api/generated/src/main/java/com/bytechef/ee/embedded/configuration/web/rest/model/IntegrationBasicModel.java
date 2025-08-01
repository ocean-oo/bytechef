package com.bytechef.ee.embedded.configuration.web.rest.model;

import java.net.URI;
import java.util.Objects;
import com.bytechef.ee.embedded.configuration.web.rest.model.IntegrationStatusModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A group of workflows that make one logical integration.
 */

@Schema(name = "IntegrationBasic", description = "A group of workflows that make one logical integration.")
@JsonTypeName("IntegrationBasic")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:27.961653+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
public class IntegrationBasicModel {

  private String componentName;

  private @Nullable String createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdDate;

  private @Nullable String description;

  private @Nullable String icon;

  private @Nullable Long id;

  private @Nullable String lastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastModifiedDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastPublishedDate;

  private @Nullable IntegrationStatusModel lastStatus;

  private @Nullable Integer lastVersion;

  private Boolean multipleInstances = false;

  private @Nullable String name;

  public IntegrationBasicModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegrationBasicModel(String componentName, Boolean multipleInstances) {
    this.componentName = componentName;
    this.multipleInstances = multipleInstances;
  }

  public IntegrationBasicModel componentName(String componentName) {
    this.componentName = componentName;
    return this;
  }

  /**
   * The name of the integration's component.
   * @return componentName
   */
  @NotNull 
  @Schema(name = "componentName", description = "The name of the integration's component.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("componentName")
  public String getComponentName() {
    return componentName;
  }

  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  public IntegrationBasicModel createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The created by.
   * @return createdBy
   */
  
  @Schema(name = "createdBy", accessMode = Schema.AccessMode.READ_ONLY, description = "The created by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public IntegrationBasicModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The created date.
   * @return createdDate
   */
  @Valid 
  @Schema(name = "createdDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The created date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public IntegrationBasicModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of an integration.
   * @return description
   */
  
  @Schema(name = "description", description = "The description of an integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IntegrationBasicModel icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The icon.
   * @return icon
   */
  
  @Schema(name = "icon", description = "The icon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public IntegrationBasicModel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The id of an integration.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The id of an integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IntegrationBasicModel lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * The last modified by.
   * @return lastModifiedBy
   */
  
  @Schema(name = "lastModifiedBy", accessMode = Schema.AccessMode.READ_ONLY, description = "The last modified by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedBy")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public IntegrationBasicModel lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * The last modified date.
   * @return lastModifiedDate
   */
  @Valid 
  @Schema(name = "lastModifiedDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The last modified date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDate")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public IntegrationBasicModel lastPublishedDate(OffsetDateTime lastPublishedDate) {
    this.lastPublishedDate = lastPublishedDate;
    return this;
  }

  /**
   * The last published date.
   * @return lastPublishedDate
   */
  @Valid 
  @Schema(name = "lastPublishedDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The last published date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastPublishedDate")
  public OffsetDateTime getLastPublishedDate() {
    return lastPublishedDate;
  }

  public void setLastPublishedDate(OffsetDateTime lastPublishedDate) {
    this.lastPublishedDate = lastPublishedDate;
  }

  public IntegrationBasicModel lastStatus(IntegrationStatusModel lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

  /**
   * Get lastStatus
   * @return lastStatus
   */
  @Valid 
  @Schema(name = "lastStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastStatus")
  public IntegrationStatusModel getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(IntegrationStatusModel lastStatus) {
    this.lastStatus = lastStatus;
  }

  public IntegrationBasicModel lastVersion(Integer lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

  /**
   * The last version of an integration.
   * @return lastVersion
   */
  
  @Schema(name = "lastVersion", accessMode = Schema.AccessMode.READ_ONLY, description = "The last version of an integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastVersion")
  public Integer getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(Integer lastVersion) {
    this.lastVersion = lastVersion;
  }

  public IntegrationBasicModel multipleInstances(Boolean multipleInstances) {
    this.multipleInstances = multipleInstances;
    return this;
  }

  /**
   * If multiple instances of an integration are allowed or not.
   * @return multipleInstances
   */
  @NotNull 
  @Schema(name = "multipleInstances", description = "If multiple instances of an integration are allowed or not.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("multipleInstances")
  public Boolean getMultipleInstances() {
    return multipleInstances;
  }

  public void setMultipleInstances(Boolean multipleInstances) {
    this.multipleInstances = multipleInstances;
  }

  public IntegrationBasicModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of an integration.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of an integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationBasicModel integrationBasic = (IntegrationBasicModel) o;
    return Objects.equals(this.componentName, integrationBasic.componentName) &&
        Objects.equals(this.createdBy, integrationBasic.createdBy) &&
        Objects.equals(this.createdDate, integrationBasic.createdDate) &&
        Objects.equals(this.description, integrationBasic.description) &&
        Objects.equals(this.icon, integrationBasic.icon) &&
        Objects.equals(this.id, integrationBasic.id) &&
        Objects.equals(this.lastModifiedBy, integrationBasic.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, integrationBasic.lastModifiedDate) &&
        Objects.equals(this.lastPublishedDate, integrationBasic.lastPublishedDate) &&
        Objects.equals(this.lastStatus, integrationBasic.lastStatus) &&
        Objects.equals(this.lastVersion, integrationBasic.lastVersion) &&
        Objects.equals(this.multipleInstances, integrationBasic.multipleInstances) &&
        Objects.equals(this.name, integrationBasic.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentName, createdBy, createdDate, description, icon, id, lastModifiedBy, lastModifiedDate, lastPublishedDate, lastStatus, lastVersion, multipleInstances, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationBasicModel {\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastPublishedDate: ").append(toIndentedString(lastPublishedDate)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    multipleInstances: ").append(toIndentedString(multipleInstances)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

