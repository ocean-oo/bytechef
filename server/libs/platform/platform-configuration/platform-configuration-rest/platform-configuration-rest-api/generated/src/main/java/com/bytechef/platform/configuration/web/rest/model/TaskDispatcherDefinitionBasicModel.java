package com.bytechef.platform.configuration.web.rest.model;

import java.net.URI;
import java.util.Objects;
import com.bytechef.platform.configuration.web.rest.model.ResourcesModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A task dispatcher defines a strategy for dispatching tasks to be executed.
 */

@Schema(name = "TaskDispatcherDefinitionBasic", description = "A task dispatcher defines a strategy for dispatching tasks to be executed.")
@JsonTypeName("TaskDispatcherDefinitionBasic")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:25.895904+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
public class TaskDispatcherDefinitionBasicModel {

  private @Nullable String description;

  private @Nullable String icon;

  private String name;

  private Boolean outputDefined;

  private @Nullable Boolean outputFunctionDefined;

  private @Nullable Boolean outputSchemaDefined;

  private @Nullable ResourcesModel resources;

  private @Nullable String title;

  private @Nullable Boolean variablePropertiesDefined;

  private Integer version;

  public TaskDispatcherDefinitionBasicModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskDispatcherDefinitionBasicModel(String name, Boolean outputDefined, Integer version) {
    this.name = name;
    this.outputDefined = outputDefined;
    this.version = version;
  }

  public TaskDispatcherDefinitionBasicModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description.
   * @return description
   */
  
  @Schema(name = "description", description = "The description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskDispatcherDefinitionBasicModel icon(String icon) {
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

  public TaskDispatcherDefinitionBasicModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The task dispatcher name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The task dispatcher name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskDispatcherDefinitionBasicModel outputDefined(Boolean outputDefined) {
    this.outputDefined = outputDefined;
    return this;
  }

  /**
   * Does task dispatcher defines output.
   * @return outputDefined
   */
  @NotNull 
  @Schema(name = "outputDefined", description = "Does task dispatcher defines output.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("outputDefined")
  public Boolean getOutputDefined() {
    return outputDefined;
  }

  public void setOutputDefined(Boolean outputDefined) {
    this.outputDefined = outputDefined;
  }

  public TaskDispatcherDefinitionBasicModel outputFunctionDefined(Boolean outputFunctionDefined) {
    this.outputFunctionDefined = outputFunctionDefined;
    return this;
  }

  /**
   * Does task dispatcher defines output function.
   * @return outputFunctionDefined
   */
  
  @Schema(name = "outputFunctionDefined", description = "Does task dispatcher defines output function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputFunctionDefined")
  public Boolean getOutputFunctionDefined() {
    return outputFunctionDefined;
  }

  public void setOutputFunctionDefined(Boolean outputFunctionDefined) {
    this.outputFunctionDefined = outputFunctionDefined;
  }

  public TaskDispatcherDefinitionBasicModel outputSchemaDefined(Boolean outputSchemaDefined) {
    this.outputSchemaDefined = outputSchemaDefined;
    return this;
  }

  /**
   * Does task dispatcher defines output schema.
   * @return outputSchemaDefined
   */
  
  @Schema(name = "outputSchemaDefined", description = "Does task dispatcher defines output schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputSchemaDefined")
  public Boolean getOutputSchemaDefined() {
    return outputSchemaDefined;
  }

  public void setOutputSchemaDefined(Boolean outputSchemaDefined) {
    this.outputSchemaDefined = outputSchemaDefined;
  }

  public TaskDispatcherDefinitionBasicModel resources(ResourcesModel resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @Valid 
  @Schema(name = "resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resources")
  public ResourcesModel getResources() {
    return resources;
  }

  public void setResources(ResourcesModel resources) {
    this.resources = resources;
  }

  public TaskDispatcherDefinitionBasicModel title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title
   * @return title
   */
  
  @Schema(name = "title", description = "The title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TaskDispatcherDefinitionBasicModel variablePropertiesDefined(Boolean variablePropertiesDefined) {
    this.variablePropertiesDefined = variablePropertiesDefined;
    return this;
  }

  /**
   * Does task dispatcher define dynamic variable properties.
   * @return variablePropertiesDefined
   */
  
  @Schema(name = "variablePropertiesDefined", description = "Does task dispatcher define dynamic variable properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variablePropertiesDefined")
  public Boolean getVariablePropertiesDefined() {
    return variablePropertiesDefined;
  }

  public void setVariablePropertiesDefined(Boolean variablePropertiesDefined) {
    this.variablePropertiesDefined = variablePropertiesDefined;
  }

  public TaskDispatcherDefinitionBasicModel version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of a task dispatcher.
   * @return version
   */
  @NotNull 
  @Schema(name = "version", description = "The version of a task dispatcher.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDispatcherDefinitionBasicModel taskDispatcherDefinitionBasic = (TaskDispatcherDefinitionBasicModel) o;
    return Objects.equals(this.description, taskDispatcherDefinitionBasic.description) &&
        Objects.equals(this.icon, taskDispatcherDefinitionBasic.icon) &&
        Objects.equals(this.name, taskDispatcherDefinitionBasic.name) &&
        Objects.equals(this.outputDefined, taskDispatcherDefinitionBasic.outputDefined) &&
        Objects.equals(this.outputFunctionDefined, taskDispatcherDefinitionBasic.outputFunctionDefined) &&
        Objects.equals(this.outputSchemaDefined, taskDispatcherDefinitionBasic.outputSchemaDefined) &&
        Objects.equals(this.resources, taskDispatcherDefinitionBasic.resources) &&
        Objects.equals(this.title, taskDispatcherDefinitionBasic.title) &&
        Objects.equals(this.variablePropertiesDefined, taskDispatcherDefinitionBasic.variablePropertiesDefined) &&
        Objects.equals(this.version, taskDispatcherDefinitionBasic.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, icon, name, outputDefined, outputFunctionDefined, outputSchemaDefined, resources, title, variablePropertiesDefined, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDispatcherDefinitionBasicModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputDefined: ").append(toIndentedString(outputDefined)).append("\n");
    sb.append("    outputFunctionDefined: ").append(toIndentedString(outputFunctionDefined)).append("\n");
    sb.append("    outputSchemaDefined: ").append(toIndentedString(outputSchemaDefined)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    variablePropertiesDefined: ").append(toIndentedString(variablePropertiesDefined)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

