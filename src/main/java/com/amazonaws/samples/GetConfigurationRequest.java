package com.amazonaws.samples;

public class GetConfigurationRequest {

	private String Application;
	private String ClientConfigurationVersion;
	private String ClientId;
	private String Configuration;
	private String Environment;
	public String getApplication() {
		return Application;
	}
	public void setApplication(String application) {
		Application = application;
	}
	public String getClientConfigurationVersion() {
		return ClientConfigurationVersion;
	}
	public void setClientConfigurationVersion(String clientConfigurationVersion) {
		ClientConfigurationVersion = clientConfigurationVersion;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	public String getConfiguration() {
		return Configuration;
	}
	public void setConfiguration(String configuration) {
		Configuration = configuration;
	}
	public String getEnvironment() {
		return Environment;
	}
	public void setEnvironment(String environment) {
		Environment = environment;
	}
	
	
	
}
