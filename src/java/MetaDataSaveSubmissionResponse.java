package com.finastra.openapi.model.autosave;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

/**
 * Details of the new form details to be saved
 */
@ApiModel(description = "Details of the new form details to be saved ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-12T07:24:36.468Z")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaDataSaveSubmissionResponse
{
	@JsonProperty("message")
	private String message = null;

	@JsonProperty("responseDetails")
	private Object responseDetails = null;
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((responseDetails == null) ? 0 : responseDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MetaDataSaveSubmissionResponse other = (MetaDataSaveSubmissionResponse) obj;
		if (message == null)
		{
			if (other.message != null)
				return false;
		}
		else if (!message.equals(other.message))
			return false;
		if (responseDetails == null)
		{
			if (other.responseDetails != null)
				return false;
		}
		else if (!responseDetails.equals(other.responseDetails))
			return false;
		return true;
	}

	public String getMessage()
	{
		return message;
	}

	public Object getResponseDetails()
	{
		return responseDetails;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setResponseDetails(Object responseDetails)
	{
		this.responseDetails = responseDetails;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("MetaDataSaveSubmissionResponse [message=");
		builder.append(message);
		builder.append(", responseDetails=");
		builder.append(responseDetails);
		builder.append("]");
		return builder.toString();
	}
}
