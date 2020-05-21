package com.amazonaws.samples;

public class CreateDeploymentStrategyRequest {
	
	private int DeploymentDurationInMinutes;
	private String Decription;
	private int FinalBakeTimeInMinutes;
	private float GrowthFactor;
	private String GrowthType;
	private String Name;
	private String ReplicateTo;
	private String Tags;
	public int getDeploymentDurationMinutes() {
		return DeploymentDurationInMinutes;
	}
	public void setDeploymentDurationMinutes(int deploymentDurationInMinutes) {
		DeploymentDurationInMinutes = deploymentDurationInMinutes;
	}
	public String getDecription() {
		return Decription;
	}
	public void setDecription(String decription) {
		Decription = decription;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getReplicateTo() {
		return ReplicateTo;
	}
	public void setReplicateTo(String replicateTo) {
		ReplicateTo = replicateTo;
	}
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	
	

}
