package com.amazonaws.samples;

public class GetConfigurationResponse {
	
	
	private String ConfigurationVersion;
	private String ContentType;                                                     //DataTypes needs to be changed
	private String Content;
	public String getConfigurationVersion() {
		return ConfigurationVersion;
	}
	public void setConfigurationVersion(String configurationVersion) {
		ConfigurationVersion = configurationVersion;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}          
	

}
