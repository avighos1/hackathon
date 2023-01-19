package com.finastra.openapi.api.metaData;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.finastra.openapi.api.services.autosave.MetaDataSaveService;
import com.finastra.openapi.model.autosave.MetaDataRequestResponse;
import com.finastra.openapi.model.autosave.MetaDataSaveSubmissionResponse;
import com.misys.portal.common.tracer.GTPException;
import com.misys.portal.webservices.apis.exception.internal.ExceptionHandlerControllerForRestAPI;

@Controller
public class MetaDataFormController extends ExceptionHandlerControllerForRestAPI implements MetaDataForm
{

	@Autowired
	MetaDataSaveService metaDataSaveService;
	
	@Override
	public ResponseEntity<MetaDataSaveSubmissionResponse> saveMetaData(
			@Valid MetaDataRequestResponse metaDataRequest) throws GTPException
	{
		MetaDataSaveSubmissionResponse metaDataSaveResponse = metaDataSaveService.saveMetaData(metaDataRequest);
		return new ResponseEntity<MetaDataSaveSubmissionResponse>(metaDataSaveResponse, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<MetaDataRequestResponse> getSavedMetaData(@Valid String screenName)
			throws GTPException
	{
		MetaDataRequestResponse metaDataRequestResponse = new MetaDataRequestResponse();
		metaDataRequestResponse.setscreenName(screenName);
		return new ResponseEntity<MetaDataRequestResponse>(
				metaDataSaveService.getSavedMetaData(metaDataRequestResponse), HttpStatus.OK);
	}

}
