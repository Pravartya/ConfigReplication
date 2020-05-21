package com.amazonaws.samples;

public class UpdateDeploymentStrategyRequest {
	private String DeploymentStrategyId;
	private int DeploymentDurationInMinutes;
	private String Description;
	private int FinalBakeTimeInMinutes;
	private float GrowthFactor;
	private String GrowthType;
	public String getDeploymentStrategyId() {
		return DeploymentStrategyId;
	}
	public void setDeploymentStrategyId(String deploymentStrategyId) {
		DeploymentStrategyId = deploymentStrategyId;
	}
	public int getDeploymentDurationInMinutes() {
		return DeploymentDurationInMinutes;
	}
	public void setDeploymentDurationInMinutes(int  deploymentDurationInMinutes) {
		DeploymentDurationInMinutes = deploymentDurationInMinutes;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public String getGrowthType() {
		return GrowthType;
	}
	public void setGrowthType(String growthType) {
		GrowthType = growthType;
	}
	
	


}
