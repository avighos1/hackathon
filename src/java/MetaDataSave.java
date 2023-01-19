package com.misys.portal.product.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.misys.portal.common.bulk.BulkObject;
import com.misys.portal.common.bulk.field.BulkField;
import com.misys.portal.common.bulk.field.IntegerField;
import com.misys.portal.common.bulk.field.StringField;
import com.misys.portal.common.resources.TechnicalResourceProvider;
import com.misys.portal.common.tracer.GTPException;

public class MetaDataSave extends BulkObject
{
	public StringField screenName = new StringField(20);
	public StringField name = new StringField(20);
	public StringField type = new StringField(20);
	public StringField sectionName = new StringField(20);
	public StringField rendered = new StringField(20);
	public StringField required = new StringField(20);
	public StringField layoutClass = new StringField(20);
	public StringField mappingKey = new StringField(20);
	public IntegerField maxLength = new IntegerField(4);
	public IntegerField minLength = new IntegerField(4);
	

	public StringField getScreenName()
	{
		return screenName;
	}

	public void setScreenName(StringField screenName)
	{
		this.screenName = screenName;
	}

	public StringField getName()
	{
		return name;
	}

	public void setName(StringField name)
	{
		this.name = name;
	}

	public StringField getType()
	{
		return type;
	}

	public void setType(StringField type)
	{
		this.type = type;
	}

	public StringField getSectionName()
	{
		return sectionName;
	}

	public void setSectionName(StringField sectionName)
	{
		this.sectionName = sectionName;
	}

	public StringField getRendered()
	{
		return rendered;
	}

	public void setRendered(StringField rendered)
	{
		this.rendered = rendered;
	}

	public StringField getRequired()
	{
		return required;
	}

	public void setRequired(StringField required)
	{
		this.required = required;
	}

	public StringField getLayoutClass()
	{
		return layoutClass;
	}

	public void setLayoutClass(StringField layoutClass)
	{
		this.layoutClass = layoutClass;
	}

	public StringField getmappingKey()
	{
		return mappingKey;
	}

	public void setmappingKey(StringField mappingKey)
	{
		this.mappingKey = mappingKey;
	}

	public IntegerField getMaxLength()
	{
		return maxLength;
	}

	public void setMaxLength(IntegerField maxLength)
	{
		this.maxLength = maxLength;
	}

	public IntegerField getMinLength()
	{
		return minLength;
	}

	public void setMinLength(IntegerField minLength)
	{
		this.minLength = minLength;
	}

	/**
	 * constructor
	 */
	public MetaDataSave()
	{
		super();
		initAllFields();
	}

	@Override
	public String getDatabaseTableName() {
		return TechnicalResourceProvider.TABLE_GTP_META_DATA;
	}
	
	@Override
	public String getAuditType()
	{
		return null;
	}

	@Override
	public List<String> getKeys() {
		List<String> arrayOfKeys = new ArrayList();
		getNonEmptyValue(arrayOfKeys, this.screenName, "screenName");
		getNonEmptyValue(arrayOfKeys, this.name, "name");
		getNonEmptyValue(arrayOfKeys, this.type, "type");
		getNonEmptyValue(arrayOfKeys, this.sectionName, "sectionName");
		getNonEmptyValue(arrayOfKeys, this.rendered, "rendered");
		getNonEmptyValue(arrayOfKeys, this.required, "required");
		getNonEmptyValue(arrayOfKeys, this.mappingKey, "mappingKey");
		getNonEmptyValue(arrayOfKeys, this.layoutClass, "layoutClass");
		getNonEmptyValue(arrayOfKeys, this.maxLength, "maxLength");
		getNonEmptyValue(arrayOfKeys, this.minLength, "minLength");

		return arrayOfKeys;
	}
	
	@Override
	public List<String> getNonPersistedFields()
	{
		List<String> nonPersistedFieldKeys = new ArrayList();
		getEmptyValue(nonPersistedFieldKeys, this.screenName, "screenName");
		getEmptyValue(nonPersistedFieldKeys, this.name, "name");
		getEmptyValue(nonPersistedFieldKeys, this.type, "type");
		getEmptyValue(nonPersistedFieldKeys, this.rendered, "rendered");
		getEmptyValue(nonPersistedFieldKeys, this.sectionName, "sectionName");
		getEmptyValue(nonPersistedFieldKeys, this.required, "required");
		getEmptyValue(nonPersistedFieldKeys, this.mappingKey, "mappingKey");
		getEmptyValue(nonPersistedFieldKeys, this.layoutClass, "layoutClass");
		getEmptyValue(nonPersistedFieldKeys, this.maxLength, "maxLength");
		getEmptyValue(nonPersistedFieldKeys, this.minLength, "minLength");

		return nonPersistedFieldKeys;
	}
	
	private void getNonEmptyValue(List<String> keyList, BulkField bulk, String fieldName) {
		if (!ObjectUtils.isEmpty(bulk.getValue())) {
			keyList.add(fieldName);
		}
	}
	
	private void getEmptyValue(List<String> keyList, BulkField bulk, String fieldName) {
		if (ObjectUtils.isEmpty(bulk.getValue())) {
			keyList.add(fieldName);
		}
	}

	@Override
	public boolean isEmpty() {
		return ((this.name.isNull())
				|| (this.screenName.isNull())
				|| (this.sectionName.isNull()));
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	protected void initialize(Map keys) throws GTPException {
		this.retrieveFromDB(getReferences(keys));

		
	}
	@Override
	public void saveIntoDB() throws GTPException
	{
		super.saveIntoDB();
	}

}
