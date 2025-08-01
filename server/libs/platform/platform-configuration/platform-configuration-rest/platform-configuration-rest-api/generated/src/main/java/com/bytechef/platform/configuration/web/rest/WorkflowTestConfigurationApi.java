/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytechef.platform.configuration.web.rest;

import com.bytechef.platform.configuration.web.rest.model.SaveWorkflowTestConfigurationConnectionRequestModel;
import com.bytechef.platform.configuration.web.rest.model.SaveWorkflowTestConfigurationInputsRequestModel;
import com.bytechef.platform.configuration.web.rest.model.WorkflowTestConfigurationConnectionModel;
import com.bytechef.platform.configuration.web.rest.model.WorkflowTestConfigurationModel;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:25.895904+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
@Validated
@Tag(name = "workflow-test-configuration", description = "The Platform Workflow Test Configuration Internal API")
public interface WorkflowTestConfigurationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /workflow-test-configurations/{workflowId} : Get a workflow test configuration
     * Get a workflow test configuration.
     *
     * @param workflowId The id of a workflow. (required)
     * @return Successful operation. (status code 200)
     */
    @Operation(
        operationId = "getWorkflowTestConfiguration",
        summary = "Get a workflow test configuration",
        description = "Get a workflow test configuration.",
        tags = { "workflow-test-configuration" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = WorkflowTestConfigurationModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/workflow-test-configurations/{workflowId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<WorkflowTestConfigurationModel> getWorkflowTestConfiguration(
        @Parameter(name = "workflowId", description = "The id of a workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"__version\" : 6, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"inputs\" : { \"key\" : \"inputs\" }, \"lastModifiedBy\" : \"lastModifiedBy\", \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 }, { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 } ], \"workflowId\" : \"workflowId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /workflow-test-configurations/{workflowId}/connections/{workflowNodeName} : Get a workflow test configuration connections
     * Get a workflow test configuration connections.
     *
     * @param workflowId The id of a testing workflow. (required)
     * @param workflowNodeName The action/trigger name defined in the workflow. (required)
     * @return Successful operation. (status code 200)
     */
    @Operation(
        operationId = "getWorkflowTestConfigurationConnections",
        summary = "Get a workflow test configuration connections",
        description = "Get a workflow test configuration connections.",
        tags = { "workflow-test-configuration" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = WorkflowTestConfigurationConnectionModel.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/workflow-test-configurations/{workflowId}/connections/{workflowNodeName}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<WorkflowTestConfigurationConnectionModel>> getWorkflowTestConfigurationConnections(
        @Parameter(name = "workflowId", description = "The id of a testing workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId,
        @Parameter(name = "workflowNodeName", description = "The action/trigger name defined in the workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowNodeName") String workflowNodeName
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 }, { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /workflow-test-configurations/{workflowId} : Create new or update an existing workflow test configuration
     * Create new or update an existing workflow test configuration.
     *
     * @param workflowId The id of a workflow. (required)
     * @param workflowTestConfigurationModel  (required)
     * @return The updated workflow test configuration object. (status code 200)
     */
    @Operation(
        operationId = "saveWorkflowTestConfiguration",
        summary = "Create new or update an existing workflow test configuration",
        description = "Create new or update an existing workflow test configuration.",
        tags = { "workflow-test-configuration" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The updated workflow test configuration object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = WorkflowTestConfigurationModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/workflow-test-configurations/{workflowId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<WorkflowTestConfigurationModel> saveWorkflowTestConfiguration(
        @Parameter(name = "workflowId", description = "The id of a workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId,
        @Parameter(name = "WorkflowTestConfigurationModel", description = "", required = true) @Valid @RequestBody WorkflowTestConfigurationModel workflowTestConfigurationModel
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"__version\" : 6, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"inputs\" : { \"key\" : \"inputs\" }, \"lastModifiedBy\" : \"lastModifiedBy\", \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 }, { \"workflowNodeName\" : \"workflowNodeName\", \"workflowConnectionKey\" : \"workflowConnectionKey\", \"connectionId\" : 0 } ], \"workflowId\" : \"workflowId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /workflow-test-configurations/{workflowId}/connections/{workflowNodeName}/{workflowConnectionKey} : Save a workflow test configuration connection
     * Save a workflow test configuration connection.
     *
     * @param workflowId The id of a testing workflow. (required)
     * @param workflowNodeName The action/trigger name defined in the workflow. (required)
     * @param workflowConnectionKey The key of a connection. (required)
     * @param saveWorkflowTestConfigurationConnectionRequestModel  (required)
     * @return Successful operation. (status code 204)
     */
    @Operation(
        operationId = "saveWorkflowTestConfigurationConnection",
        summary = "Save a workflow test configuration connection",
        description = "Save a workflow test configuration connection.",
        tags = { "workflow-test-configuration" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/workflow-test-configurations/{workflowId}/connections/{workflowNodeName}/{workflowConnectionKey}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> saveWorkflowTestConfigurationConnection(
        @Parameter(name = "workflowId", description = "The id of a testing workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId,
        @Parameter(name = "workflowNodeName", description = "The action/trigger name defined in the workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowNodeName") String workflowNodeName,
        @Parameter(name = "workflowConnectionKey", description = "The key of a connection.", required = true, in = ParameterIn.PATH) @PathVariable("workflowConnectionKey") String workflowConnectionKey,
        @Parameter(name = "SaveWorkflowTestConfigurationConnectionRequestModel", description = "", required = true) @Valid @RequestBody SaveWorkflowTestConfigurationConnectionRequestModel saveWorkflowTestConfigurationConnectionRequestModel
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /workflow-test-configurations/{workflowId}/inputs : Save a workflow test configuration inputs
     * Save a workflow test configuration inputs.
     *
     * @param workflowId The id of a testing workflow. (required)
     * @param saveWorkflowTestConfigurationInputsRequestModel  (required)
     * @return Successful operation. (status code 204)
     */
    @Operation(
        operationId = "saveWorkflowTestConfigurationInputs",
        summary = "Save a workflow test configuration inputs",
        description = "Save a workflow test configuration inputs.",
        tags = { "workflow-test-configuration" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/workflow-test-configurations/{workflowId}/inputs",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> saveWorkflowTestConfigurationInputs(
        @Parameter(name = "workflowId", description = "The id of a testing workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId,
        @Parameter(name = "SaveWorkflowTestConfigurationInputsRequestModel", description = "", required = true) @Valid @RequestBody SaveWorkflowTestConfigurationInputsRequestModel saveWorkflowTestConfigurationInputsRequestModel
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
