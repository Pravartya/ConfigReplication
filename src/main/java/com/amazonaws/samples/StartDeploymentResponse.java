package com.amazonaws.samples;

public class StartDeploymentResponse {
	private String ApplicationId;
	private String CompletedAt;                                          //DataTypes need to be changed to Time Stamp
	private String ConfigurationLocationUri;
	private String ConfigurationName;
	private String ConfigurationProfileId;
	private String ConfigurationVersion;
	private int DeploymentDurationInMinutes;
	private int DeploymentNumber;
	private String DeploymentStrategyId;
	private String Description;
	private String EnvironmentId;
	private String EventLog ;                                              //DataTypes need to changed 
	private int FinalBakeTimeInMinutes;
	private float GrowthFactor;
	private float PercentageComplete;
	private String StartedAt ;                                            //Datatypes need to be change
	private String State;
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public String getCompletedAt() {
		return CompletedAt;
	}
	public void setCompletedAt(String completedAt) {
		CompletedAt = completedAt;
	}
	public String getConfigurationLocationUri() {
		return ConfigurationLocationUri;
	}
	public void setConfigurationLocationUri(String configurationLocationUri) {
		ConfigurationLocationUri = configurationLocationUri;
	}
	public String getConfigurationName() {
		return ConfigurationName;
	}
	public void setConfigurationName(String configurationName) {
		ConfigurationName = configurationName;
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
	public int getDeploymentDurationInMinutes() {
		return DeploymentDurationInMinutes;
	}
	public void setDeploymentDurationInMinutes(int deploymentDurationInMinutes) {
		DeploymentDurationInMinutes = deploymentDurationInMinutes;
	}
	public int getDeploymentNumber() {
		return DeploymentNumber;
	}
	public void setDeploymentNumber(int deploymentNumber) {
		DeploymentNumber = deploymentNumber;
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
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	public String getEventLog() {
		return EventLog;
	}
	public void setEventLog(String eventLog) {
		EventLog = eventLog;
	}
	public int getFinalBakeTimeInMinutes() {
		return FinalBakeTimeInMinutes;
	}
	public void setFinalBakeTimeInMinutes(int finalBakeTimeInMinutes) {
		FinalBakeTimeInMinutes = finalBakeTimeInMinutes;
	}
	public float getGrowthFactor() {
		return GrowthFactor;
	}
	public void setGrowthFactor(float growthFactor) {
		GrowthFactor = growthFactor;
	}
	public float getPercentageComplete() {
		return PercentageComplete;
	}
	public void setPercentageComplete(float percentageComplete) {
		PercentageComplete = percentageComplete;
	}
	public String getStartedAt() {
		return StartedAt;
	}
	public void setStartedAt(String startedAt) {
		StartedAt = startedAt;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	

	
	
}
