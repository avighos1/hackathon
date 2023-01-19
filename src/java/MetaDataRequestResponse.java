package com.finastra.openapi.model.autosave;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of the new form details to be auto saved
 */
@ApiModel(description = "Details of the new form details to be auto saved ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-12T07:24:36.468Z")
public class MetaDataRequestResponse
{
	
	@JsonProperty("screenName")
	private String screenName = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("mappingKey")
	private String mappingKey = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("sectionName")
	private String sectionName = null;

	@JsonProperty("rendered")
	private String rendered = null;

	@JsonProperty("required")
	private String required = null;

	@JsonProperty("layoutClass")
	private String layoutClass = null;
	
	@JsonProperty("maxLength")
	private int maxLength;
	
	@JsonProperty("minLength")
	private int minLength;

	public MetaDataRequestResponse screenName(String screenName1)
	{
		this.screenName = screenName1;
		return this;
	}

	/**
	 * The unique identifier for a transaction
	 * 
	 * @return screenName
	 **/
	@ApiModelProperty(example = "Payments", value = "The unique identifier for a transaction")

	public String getscreenName()
	{
		return screenName;
	}

	public void setscreenName(String screenName)
	{
		this.screenName = screenName;
	}

	public MetaDataRequestResponse name(String name1)
	{
		this.name = name1;
		return this;
	}

	/**
	 * The unique identifier of the name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(example = "Lei Code", value = "The unique identifier of the name")

	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name = name;
	}

	public MetaDataRequestResponse mappingKey(String mappingKey1)
	{
		this.mappingKey = mappingKey1;
		return this;
	}

	/**
	 * The unique identifier of style class
	 * 
	 * @return mappingKey
	 **/
	@ApiModelProperty(example = "p-10", value = "The unique identifier of style class")

	public String getmappingKey()
	{
		return mappingKey;
	}

	public void setmappingKey(String mappingKey)
	{
		this.mappingKey = mappingKey;
	}

	public MetaDataRequestResponse type(String type1)
	{
		this.type = type1;
		return this;
	}

	/**
	 * The unique identifier for a transaction type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(example = "text", value = "The unique identifier for a transaction type")

	public String gettype()
	{
		return type;
	}

	public void settype(String type)
	{
		this.type = type;
	}

	public MetaDataRequestResponse sectionName(String sectionName1)
	{
		this.sectionName = sectionName1;
		return this;
	}

	/**
	 * Identifier for sectionName
	 * 
	 * @return sectionName
	 **/
	@ApiModelProperty(example = "BENEFICIARY_MASTER_MC", value = "Identifier for sectionName")

	public String getsectionName()
	{
		return sectionName;
	}

	public void setsectionName(String sectionName)
	{
		this.sectionName = sectionName;
	}

	public MetaDataRequestResponse rendered(String rendered1)
	{
		this.rendered = rendered1;
		return this;
	}

	/**
	 * The unique identifier of saved record rendered
	 * 
	 * @return rendered
	 **/
	@ApiModelProperty(example = "1", value = "The unique identifier of auto save record rendered")

	public String getrendered()
	{
		return rendered;
	}

	public void setrendered(String rendered)
	{
		this.rendered = rendered;
	}

	public MetaDataRequestResponse layoutClass(String layoutClass1)
	{
		this.layoutClass = layoutClass1;
		return this;
	}

	/**
	 * The unique identifier of layout class
	 * 
	 * @return layoutClass
	 **/
	@ApiModelProperty(example = "{...}", value = "The unique identifier of layout class")

	public String getlayoutClass()
	{
		return layoutClass;
	}

	public void setlayoutClass(String layoutClass)
	{
		this.layoutClass = layoutClass;
	}

	public MetaDataRequestResponse required(String required1)
	{
		this.required = required1;
		return this;
	}

	/**
	 * The unique identifier of saved record required
	 * 
	 * @return required
	 **/
	@ApiModelProperty(example = "{...}", value = "The unique identifier of saved record required")

	public String getrequired()
	{
		return required;
	}

	public void setrequired(String required)
	{
		this.required = required;
	}
	
	public MetaDataRequestResponse maxLength(int maxLength1)
	{
		this.maxLength = maxLength1;
		return this;
	}

	/**
	 * The unique identifier of maxLength
	 * 
	 * @return maxLength
	 **/
	@ApiModelProperty(example = "{...}", value = "The unique identifier of maxLength")

	public int getMaxLength()
	{
		return maxLength;
	}

	public void setMaxLength(int maxLength)
	{
		this.maxLength = maxLength;
	}
	
	public MetaDataRequestResponse minLength(int minLength1)
	{
		this.minLength = minLength1;
		return this;
	}

	/**
	 * The unique identifier of minLength
	 * 
	 * @return minLength
	 **/
	@ApiModelProperty(example = "{...}", value = "The unique identifier of minLength")

	public int getMinLength()
	{
		return minLength;
	}

	public void setMinLength(int minLength)
	{
		this.minLength = minLength;
	}


	@Override
	public boolean equals(java.lang.Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		MetaDataRequestResponse metaDataRequestResponse = (MetaDataRequestResponse) o;
		return Objects.equals(this.screenName, metaDataRequestResponse.screenName)
				&& Objects.equals(this.name, metaDataRequestResponse.name)
					&& Objects.equals(this.mappingKey, metaDataRequestResponse.mappingKey)
					&& Objects.equals(this.type, metaDataRequestResponse.type)
					&& Objects.equals(this.sectionName, metaDataRequestResponse.sectionName)
					&& Objects.equals(this.rendered, metaDataRequestResponse.rendered)
					&& Objects.equals(this.required, metaDataRequestResponse.required)
					&& Objects.equals(
							this.layoutClass,
								metaDataRequestResponse.layoutClass) 
					&& Objects.equals(
							this.minLength,
							metaDataRequestResponse.minLength) 
					&& Objects.equals(
							this.maxLength,
							metaDataRequestResponse.maxLength);
	}

	@Override
	public int hashCode()
	{
		return Objects
				.hash(screenName, name, mappingKey, type, sectionName, rendered, required, layoutClass, maxLength, minLength);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class metaDataRequestResponse {\n");

		sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mappingKey: ").append(toIndentedString(mappingKey)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
		sb.append("    rendered: ").append(toIndentedString(rendered)).append("\n");
		sb.append("    required: ").append(toIndentedString(required)).append("\n");
		sb.append("    layoutClass: ").append(toIndentedString(layoutClass)).append("\n");
		sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
		sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o)
	{
		if (o == null)
		{
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
