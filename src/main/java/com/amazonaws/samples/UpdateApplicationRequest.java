package com.amazonaws.samples;

public class UpdateApplicationRequest {
	
	
	
	
	
	private String ApplicationId;
	private String Description;
	private String Name;
	

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

	public String getApplicationId() {
		return ApplicationId;
	}

	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	

}
