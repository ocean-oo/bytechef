/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytechef.ee.platform.configuration.web.rest;

import com.bytechef.ee.platform.configuration.web.rest.model.GitConfigurationModel;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-25T11:11:24.219402+02:00[Europe/Zagreb]", comments = "Generator version: 7.13.0")
@Validated
@Tag(name = "git-configuration", description = "The Platform Git Configuration Internal API")
public interface GitConfigurationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /workspaces/{id}/git-configuration : Get git configuration of a workspace.
     * Get git configuration of a workspace.
     *
     * @param id The id of a workspace. (required)
     * @return The git configuration object. (status code 200)
     */
    @Operation(
        operationId = "getGitConfiguration",
        summary = "Get git configuration of a workspace.",
        description = "Get git configuration of a workspace.",
        tags = { "git-configuration" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The git configuration object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GitConfigurationModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/workspaces/{id}/git-configuration",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GitConfigurationModel> getGitConfiguration(
        @Parameter(name = "id", description = "The id of a workspace.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"url\" : \"url\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /workspaces/{id}/git-configuration : Update git configuration.
     * Update git configuration.
     *
     * @param id The id of a workspace. (required)
     * @param gitConfigurationModel  (required)
     * @return Successful operation. (status code 204)
     */
    @Operation(
        operationId = "updateGitConfiguration",
        summary = "Update git configuration.",
        description = "Update git configuration.",
        tags = { "git-configuration" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/workspaces/{id}/git-configuration",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> updateGitConfiguration(
        @Parameter(name = "id", description = "The id of a workspace.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "GitConfigurationModel", description = "", required = true) @Valid @RequestBody GitConfigurationModel gitConfigurationModel
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
