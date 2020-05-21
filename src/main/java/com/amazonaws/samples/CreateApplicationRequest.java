package com.amazonaws.samples;


public class CreateApplicationRequest{
	
	private String Description;
	private String Name;
	private String Tags;
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
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	public CreateApplicationRequest() {
		
	}

}
