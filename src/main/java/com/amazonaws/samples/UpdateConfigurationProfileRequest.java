package com.amazonaws.samples;

public class UpdateConfigurationProfileRequest {
	
	
	private String ApplicationId;
	private String ConfigurationProfileId;
	private String Description;
	private String Name;
	private String RetrievalRoleArn;
	private String Validators;                                                          //DataType needs to change
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public String getConfigurationProfileId() {
		return ConfigurationProfileId;
	}
	public void setConfigurationProfileId(String configurationProfileId) {
		ConfigurationProfileId = configurationProfileId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public String getValidators() {
		return Validators;
	}
	public void setValidators(String validators) {
		Validators = validators;
	}
	

}
