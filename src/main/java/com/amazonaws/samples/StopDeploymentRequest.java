package com.amazonaws.samples;

public class StopDeploymentRequest {
	
	
	private String ApplicationId;
	private int DeploymentNumber;
	private String EnvironmentId;
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public int getDeploymentNumber() {
		return DeploymentNumber;
	}
	public void setDeploymentNumber(int deploymentNumber) {
		DeploymentNumber = deploymentNumber;
	}
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	
	
	

}
