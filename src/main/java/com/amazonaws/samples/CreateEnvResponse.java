package com.amazonaws.samples;

public class CreateEnvResponse {
	
	private String ApplicationId ;                                              //ApplicationID
	private String Description ; 
	private String Id ;                                                         //Env ID
	private String Monitors;                                                    //Datatype needs to change
	private String Name;
	private String State;
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMonitors() {
		return Monitors;
	}
	public void setMonitors(String monitors) {
		Monitors = monitors;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	
	

}
