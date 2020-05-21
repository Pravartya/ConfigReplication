package com.amazonaws.samples;

public class CreateConfigurationProfileRequest {
	
	private String Description;
	private String LocationUri;
	private String Name; 
	private String RetrievalRoleArn;
	private String Tags;
	private String Validators;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocationUri() {
		return LocationUri;
	}
	public void setLocationUri(String locationUri) {
		LocationUri = locationUri;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRetrievalRoleArn() {
		return RetrievalRoleArn;
	}
	public void setRetrievalRoleArn(String retrievalRoleArn) {
		RetrievalRoleArn = retrievalRoleArn;
	}
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	public String getValidators() {
		return Validators;
	}
	public void setValidators(String validators) {
		Validators = validators;
	}
	
	

}
