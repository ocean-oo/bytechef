/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytechef.ee.embedded.configuration.web.rest;

import com.bytechef.ee.embedded.configuration.web.rest.model.TagModel;
import com.bytechef.ee.embedded.configuration.web.rest.model.UpdateTagsRequestModel;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:27.961653+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
@Validated
@Tag(name = "integration-instance-configuration-tag", description = "the integration-instance-configuration-tag API")
public interface IntegrationInstanceConfigurationTagApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /integration-instance-configurations/tags : Get integration instance configuration tags
     * Get integration instance configuration tags.
     *
     * @return The list of integration instance configuration tags. (status code 200)
     */
    @Operation(
        operationId = "getIntegrationInstanceConfigurationTags",
        summary = "Get integration instance configuration tags",
        description = "Get integration instance configuration tags.",
        tags = { "integration-instance-configuration-tag" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The list of integration instance configuration tags.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = TagModel.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/integration-instance-configurations/tags",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<TagModel>> getIntegrationInstanceConfigurationTags(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"__version\" : 5, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"name\" : \"name\", \"id\" : 1 }, { \"__version\" : 5, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"name\" : \"name\", \"id\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /integration-instance-configurations/{id}/tags : Updates tags of an existing integration instance configuration
     * Updates tags of an existing integration instance configuration.
     *
     * @param id The id of an integration instance configuration. (required)
     * @param updateTagsRequestModel  (required)
     * @return Successful operation. (status code 204)
     */
    @Operation(
        operationId = "updateIntegrationInstanceConfigurationTags",
        summary = "Updates tags of an existing integration instance configuration",
        description = "Updates tags of an existing integration instance configuration.",
        tags = { "integration-instance-configuration-tag" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/integration-instance-configurations/{id}/tags",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> updateIntegrationInstanceConfigurationTags(
        @Parameter(name = "id", description = "The id of an integration instance configuration.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "UpdateTagsRequestModel", description = "", required = true) @Valid @RequestBody UpdateTagsRequestModel updateTagsRequestModel
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
