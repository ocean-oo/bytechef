package com.bytechef.ee.embedded.configuration.web.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * The blueprint that describe the execution of a job.
 */

@Schema(name = "WorkflowBasic", description = "The blueprint that describe the execution of a job.")
@JsonTypeName("WorkflowBasic")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:27.961653+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
public class WorkflowBasicModel {

  private @Nullable String createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdDate;

  private @Nullable String description;

  private @Nullable String id;

  private @Nullable String label;

  private @Nullable String lastModifiedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastModifiedDate;

  private @Nullable Integer version;

  private @Nullable Long integrationWorkflowId;

  private @Nullable String workflowReferenceCode;

  public WorkflowBasicModel createdBy(String createdBy) {
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

  public WorkflowBasicModel createdDate(OffsetDateTime createdDate) {
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

  public WorkflowBasicModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of a workflow.
   * @return description
   */
  
  @Schema(name = "description", description = "The description of a workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowBasicModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of a workflow.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The id of a workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowBasicModel label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The descriptive name for the workflow
   * @return label
   */
  
  @Schema(name = "label", accessMode = Schema.AccessMode.READ_ONLY, description = "The descriptive name for the workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public WorkflowBasicModel lastModifiedBy(String lastModifiedBy) {
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

  public WorkflowBasicModel lastModifiedDate(OffsetDateTime lastModifiedDate) {
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

  public WorkflowBasicModel version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "__version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("__version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public WorkflowBasicModel integrationWorkflowId(Long integrationWorkflowId) {
    this.integrationWorkflowId = integrationWorkflowId;
    return this;
  }

  /**
   * The integration workflow id
   * @return integrationWorkflowId
   */
  
  @Schema(name = "integrationWorkflowId", accessMode = Schema.AccessMode.READ_ONLY, description = "The integration workflow id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("integrationWorkflowId")
  public Long getIntegrationWorkflowId() {
    return integrationWorkflowId;
  }

  public void setIntegrationWorkflowId(Long integrationWorkflowId) {
    this.integrationWorkflowId = integrationWorkflowId;
  }

  public WorkflowBasicModel workflowReferenceCode(String workflowReferenceCode) {
    this.workflowReferenceCode = workflowReferenceCode;
    return this;
  }

  /**
   * The workflow reference code
   * @return workflowReferenceCode
   */
  
  @Schema(name = "workflowReferenceCode", accessMode = Schema.AccessMode.READ_ONLY, description = "The workflow reference code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowReferenceCode")
  public String getWorkflowReferenceCode() {
    return workflowReferenceCode;
  }

  public void setWorkflowReferenceCode(String workflowReferenceCode) {
    this.workflowReferenceCode = workflowReferenceCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowBasicModel workflowBasic = (WorkflowBasicModel) o;
    return Objects.equals(this.createdBy, workflowBasic.createdBy) &&
        Objects.equals(this.createdDate, workflowBasic.createdDate) &&
        Objects.equals(this.description, workflowBasic.description) &&
        Objects.equals(this.id, workflowBasic.id) &&
        Objects.equals(this.label, workflowBasic.label) &&
        Objects.equals(this.lastModifiedBy, workflowBasic.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, workflowBasic.lastModifiedDate) &&
        Objects.equals(this.version, workflowBasic.version) &&
        Objects.equals(this.integrationWorkflowId, workflowBasic.integrationWorkflowId) &&
        Objects.equals(this.workflowReferenceCode, workflowBasic.workflowReferenceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, id, label, lastModifiedBy, lastModifiedDate, version, integrationWorkflowId, workflowReferenceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowBasicModel {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    integrationWorkflowId: ").append(toIndentedString(integrationWorkflowId)).append("\n");
    sb.append("    workflowReferenceCode: ").append(toIndentedString(workflowReferenceCode)).append("\n");
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

