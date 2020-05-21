package com.amazonaws.samples;

public class CreateDeploymentStrategyResponse {
	
	private int DeploymentDurationInMinutes;
	private String Description;
	private int FinalBakeTimeInMinutes;
	private float GrowthFactor;
	private String	GrowthType;
	private String Id; 
	private String Name;
	private String ReplicateTo;
	public int getDeploymentDurationInMinutes() {
		return DeploymentDurationInMinutes;
	}
	public void setDeploymentDurationInMinutes(int deploymentDurationInMinutes) {
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
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	
	

}
