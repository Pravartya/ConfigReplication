package com.amazonaws.samples;

public class GetDeploymentRequest {
	private String ApplicationId;
	private String DeploymentNumber ; 
	private String EnvironmentId;
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public String getDeploymentNumber() {
		return DeploymentNumber;
	}
	public void setDeploymentNumber(String deploymentNumber) {
		DeploymentNumber = deploymentNumber;
	}
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	
	
	

}
