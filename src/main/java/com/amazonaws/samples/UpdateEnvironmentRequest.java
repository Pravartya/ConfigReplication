package com.amazonaws.samples;

public class UpdateEnvironmentRequest {

	
	private String ApplicationId;
	private String EnvironmentId;
	private String Description;
	private String Monitors;                                                  //Datatypes needs to be changed
	private String Name;
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
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getMonitors() {
		return Monitors;
	}
	public void setMonitors(String monitors) {
		Monitors = monitors;
	}
	
}
