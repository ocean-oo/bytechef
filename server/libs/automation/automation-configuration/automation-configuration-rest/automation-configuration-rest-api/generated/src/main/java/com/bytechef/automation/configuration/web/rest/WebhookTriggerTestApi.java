/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytechef.automation.configuration.web.rest;

import com.bytechef.automation.configuration.web.rest.model.StartWebhookTriggerTest200ResponseModel;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:24.735623+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
@Validated
@Tag(name = "webhook-trigger-test", description = "The Automation Webhook Trigger Internal API")
public interface WebhookTriggerTestApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /webhooks/{workflowId}/test/start : Test a webhook trigger
     * Test a webhook trigger.
     *
     * @param workflowId The id of a workflow. (required)
     * @return Returns the webhook URL. (status code 200)
     */
    @Operation(
        operationId = "startWebhookTriggerTest",
        summary = "Test a webhook trigger",
        description = "Test a webhook trigger.",
        tags = { "webhook-trigger-test" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Returns the webhook URL.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = StartWebhookTriggerTest200ResponseModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/webhooks/{workflowId}/test/start",
        produces = { "application/json" }
    )
    
    default ResponseEntity<StartWebhookTriggerTest200ResponseModel> startWebhookTriggerTest(
        @Parameter(name = "workflowId", description = "The id of a workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"webhookUrl\" : \"webhookUrl\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /webhooks/{workflowId}/test/stop : Test a webhook trigger
     * Test a webhook trigger.
     *
     * @param workflowId The id of a workflow. (required)
     * @return Successful operation. (status code 204)
     */
    @Operation(
        operationId = "stopWebhookTriggerTest",
        summary = "Test a webhook trigger",
        description = "Test a webhook trigger.",
        tags = { "webhook-trigger-test" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/webhooks/{workflowId}/test/stop"
    )
    
    default ResponseEntity<Void> stopWebhookTriggerTest(
        @Parameter(name = "workflowId", description = "The id of a workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
