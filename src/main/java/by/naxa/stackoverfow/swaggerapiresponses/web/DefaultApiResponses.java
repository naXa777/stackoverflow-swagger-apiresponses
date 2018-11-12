package by.naxa.stackoverfow.swaggerapiresponses.web;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A convenient meta-annotation for Swagger API responses.
 */
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses({
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Failure")})
@interface DefaultApiResponses {}
