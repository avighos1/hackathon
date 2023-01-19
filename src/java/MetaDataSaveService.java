package com.finastra.openapi.api.services.autosave;

import javax.validation.Valid;

import com.finastra.openapi.model.autosave.MetaDataRequestResponse;
import com.finastra.openapi.model.autosave.MetaDataSaveSubmissionResponse;
import com.misys.portal.common.tracer.GTPException;

public interface MetaDataSaveService
{
	MetaDataSaveSubmissionResponse saveMetaData(@Valid MetaDataRequestResponse metaDataSaveRequest) throws GTPException;
    MetaDataRequestResponse getSavedMetaData(@Valid MetaDataRequestResponse metaDataSaveRequest) throws GTPException;

}
