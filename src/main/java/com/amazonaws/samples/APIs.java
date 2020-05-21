package com.amazonaws.samples;


public class APIs {
	
	
	
	
	//CREAT APPLICATION API
	public CreateApplicationResponse createApplication(CreateApplicationRequest createApplicationRequest) {
		
		
		CreateApplicationResponse response =  new CreateApplicationResponse();
		response.setDescription(createApplicationRequest.getDescription());
		response.setId("App ID");                                                            // Application ID needs to be created
		response.setName(createApplicationRequest.getName());
		
		return response;
	}
	
	
	//CREATE CONFIGURATION PROFILE
	public CreateConfigurationProfileResponse createConfigurationProfile(CreateConfigurationProfileRequest createConfigurationProfileRequest) {
		
		CreateConfigurationProfileResponse response = new CreateConfigurationProfileResponse();
		response.setApplicationId("App ID");
		response.setDescription(createConfigurationProfileRequest.getDescription());      //Application ID (generated while creating application)
		response.setId("Configuration Profile ID");
		response.setLocationUri(createConfigurationProfileRequest.getLocationUri());
		response.setName(createConfigurationProfileRequest.getName());
		response.setRetrievalRoleArn(createConfigurationProfileRequest.getRetrievalRoleArn());
		response.setValidators(createConfigurationProfileRequest.getValidators());
		
		return response;
		
	}
	
	//CREATE DEPLOYMENT STRATEGY
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
