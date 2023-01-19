package com.finastra.openapi.api.metaData;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finastra.openapi.model.ErrorResponse;
import com.finastra.openapi.model.autosave.MetaDataSaveSubmissionResponse;
import com.finastra.openapi.model.autosave.MetaDataRequestResponse;
import com.misys.portal.common.tracer.GTPException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-12T07:24:36.468Z")

@Validated
@Api(value = "save-transaction", description = "the save-transaction API")
@RequestMapping(value = "")
public interface MetaDataForm
{
	@ApiOperation(value = "Save Meta Data form", nickname = "saveMetaData", notes = "This API allows the system to save meta data form under new state.", response = MetaDataSaveSubmissionResponse.class, authorizations =
	{ @Authorization(value = "Oauth2", scopes = {

			}) }, tags =
	{ "Save Meta Data", })
	@ApiResponses(value =
	{ @ApiResponse(code = 200, message = "Successful response", response = MetaDataSaveSubmissionResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "Resource Not Found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal server error", response = ErrorResponse.class) })
	@RequestMapping(value = "/savemetadata", produces =
	{ "application/json" }, consumes =
	{ "application/json" }, method = RequestMethod.POST)
	ResponseEntity<MetaDataSaveSubmissionResponse> saveMetaData(
			@ApiParam(value = "Allow the system to save meta data form under new state", required = true) @Valid @RequestBody MetaDataRequestResponse metaDataRequest)
			throws GTPException;
	
	@ApiResponses(value =
		{ @ApiResponse(code = 200, message = "Successful response", response = MetaDataRequestResponse.class),
				@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
				@ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
				@ApiResponse(code = 404, message = "Resource Not Found", response = ErrorResponse.class),
				@ApiResponse(code = 500, message = "Internal server error", response = ErrorResponse.class) })
		@RequestMapping(value = "/savemetadata", produces =
		{ "application/json" }, consumes =
		{ "application/json" }, method = RequestMethod.GET)
		ResponseEntity<MetaDataRequestResponse> getSavedMetaData(
				@ApiParam(value = "The unique identifier for screen Name.") @Valid @RequestParam(value = "screenName", required = true) String screenName)
				throws GTPException;	

}
