package com.amazonaws.samples;

public class StartDeploymentRequest {

	
	
	private String ApplicationId;
	private String EnvironmentId;
	private String ConfigurationProfileId;
	private String ConfigurationVersion;
	private String DeploymentStrategyId;
	private String Description;
	private String Tags;
	
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
	public String getDeploymentStrategyId() {
		return DeploymentStrategyId;
	}
	public void setDeploymentStrategyId(String deploymentStrategyId) {
		DeploymentStrategyId = deploymentStrategyId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	
}
