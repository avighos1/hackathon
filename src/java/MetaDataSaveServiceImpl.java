package com.finastra.openapi.api.services.autosave;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.finastra.openapi.model.autosave.MetaDataRequestResponse;
import com.finastra.openapi.model.autosave.MetaDataSaveSubmissionResponse;
import com.misys.portal.common.bulk.BulkReference;
import com.misys.portal.common.bulk.BulkReferencesSet;
import com.misys.portal.common.bulk.field.IntegerField;
import com.misys.portal.common.bulk.field.StringField;
import com.misys.portal.common.tracer.GTPException;
import com.misys.portal.product.common.MetaDataSave;

@Service
public class MetaDataSaveServiceImpl implements MetaDataSaveService
{

	@Override
	public MetaDataSaveSubmissionResponse saveMetaData(
			@Valid MetaDataRequestResponse metaSave) throws GTPException
	{
		MetaDataSaveSubmissionResponse metaDataSaveResponse = new MetaDataSaveSubmissionResponse();
		// saving data into GTP_META_DATA table
		MetaDataSave metaDataSaveRequest = new MetaDataSave();
		metaDataSaveRequest.setScreenName(new StringField(metaSave.getscreenName()));
		metaDataSaveRequest.setName(new StringField(metaSave.getname()));
		metaDataSaveRequest.setType(new StringField(metaSave.gettype()));
		metaDataSaveRequest.setSectionName(new StringField(metaSave.getsectionName()));
		metaDataSaveRequest.setRendered(new StringField(metaSave.getrendered()));
		metaDataSaveRequest.setRequired(new StringField(metaSave.getrequired()));
		metaDataSaveRequest.setLayoutClass(new StringField(metaSave.getlayoutClass()));
		metaDataSaveRequest.setmappingKey(new StringField(metaSave.getmappingKey()));
		metaDataSaveRequest.setMaxLength(new IntegerField(metaSave.getMaxLength()));
		metaDataSaveRequest.setMinLength(new IntegerField(metaSave.getMinLength()));
		metaDataSaveRequest.saveIntoDB();
		metaDataSaveResponse.setMessage("Meta Save request successfully created");
		metaDataSaveResponse.setResponseDetails(metaSave);
		
		return metaDataSaveResponse;
	}

	@Override
	public MetaDataRequestResponse getSavedMetaData(@Valid MetaDataRequestResponse metaDataSaveRequest)
			throws GTPException
	{
		// fetching data from GTP_META_DATA table
		MetaDataSave metaSave = new MetaDataSave();
		BulkReferencesSet referencesSet = new BulkReferencesSet();
		addReferenceToBulkReferenceSet(referencesSet, "screenName", metaDataSaveRequest.getscreenName());
		addReferenceToBulkReferenceSet(referencesSet, "name", metaDataSaveRequest.getname());
		addReferenceToBulkReferenceSet(referencesSet, "type", metaDataSaveRequest.gettype());
		addReferenceToBulkReferenceSet(referencesSet, "sectionName", metaDataSaveRequest.getsectionName());
		addReferenceToBulkReferenceSet(referencesSet, "rendered", metaDataSaveRequest.getrendered());
		addReferenceToBulkReferenceSet(referencesSet, "required", metaDataSaveRequest.getrequired());
		addReferenceToBulkReferenceSet(referencesSet, "layoutClass", metaDataSaveRequest.getlayoutClass());
		addReferenceToBulkReferenceSet(referencesSet, "mappingKey", metaDataSaveRequest.getmappingKey());
		
		metaSave.retrieveFromDB(referencesSet);
		
		return metaDataSaveRequest;
	}
	
	private void addReferenceToBulkReferenceSet(BulkReferencesSet bulkRef, String field, String value)
	{
		if (StringUtils.isNotBlank(value))
		{
			bulkRef.add(new BulkReference(field, value));
		}
	}

}
