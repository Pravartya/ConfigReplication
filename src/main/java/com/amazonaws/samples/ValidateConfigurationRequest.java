package com.amazonaws.samples;

public class ValidateConfigurationRequest {

	
	private String ApplicationId;
	private String ConfigurationProfileId;
	private String ConfigurationVersion;
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
	public String getConfigurationVersion() {
		return ConfigurationVersion;
	}
	public void setConfigurationVersion(String configurationVersion) {
		ConfigurationVersion = configurationVersion;
	}
	
	
	
}
