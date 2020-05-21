package com.amazonaws.samples;

public class CreateEnvRequest {

	private String Description;
	private String Monitors;                   // Datatype needs to change to Array Of Monitor Objects
	private String Name;
	private String Tags;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	
	
	
}
