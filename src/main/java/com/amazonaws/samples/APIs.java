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
	public CreateDeploymentStrategyResponse createDeploymentStrategy(CreateDeploymentStrategyRequest createDeploymentStrategyRequest) {
		CreateDeploymentStrategyResponse response = new CreateDeploymentStrategyResponse();
		response.setDeploymentDurationInMinutes(createDeploymentStrategyRequest.getDeploymentDurationMinutes());
		response.setDescription(createDeploymentStrategyRequest.getDecription());
		response.setFinalBakeTimeInMinutes(createDeploymentStrategyRequest.getDeploymentDurationMinutes());
		response.setGrowthFactor(createDeploymentStrategyRequest.getGrowthFactor());
		response.setGrowthType(createDeploymentStrategyRequest.getGrowthType());
		response.setId("Deployment Strategy ID");                                            //Deployment Strategy ID
		response.setName(createDeploymentStrategyRequest.getName());
		response.setReplicateTo(createDeploymentStrategyRequest.getReplicateTo());
		
		return response;
		
 }
	
	
	//CREATE ENVIRONMENT
	public CreateEnvResponse createEnv(CreateEnvRequest createEnvRequest) {
		CreateEnvResponse response =  new CreateEnvResponse();
		response.setApplicationId("Application ID") ;                                           //Application ID 
		response.setDescription(createEnvRequest.getDescription());
		response.setId("Env ID");
		response.setMonitors(createEnvRequest.getMonitors());
		response.setName(createEnvRequest.getName());
		response.setState("State of Env");                                                      //How do the response know?
		
		
		return response;
	
		
	}
	
	//DELETE APPLICATION
	public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest deleteApplicationRequest){
		return null;
	
	}
	

	//DELETE CONFIGURATION PROFILE
	public DeleteConfigurationProfileResponse deleteConfigurationProfile(DeleteConfigurationProfileRequest deleteConfigurationProfileRequest) {
		return null;
		
	}
	
	
	
	//DELETE DEPLOYMENT STRATEGY
	public DeleteDeploymentStrategyResponse deleteDeploymentStrategy(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest) {
		return null;
		
	}

	
	
	//DELETE ENV
	public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {
		return null;
		
	}
	
	
	//GET APPLICATION
	public GetApplicationResponse getApplication(GetApplicationRequest getApplicationRequest) {
		
		GetApplicationResponse response = new GetApplicationResponse();
		response.setDescription("Application Description");
		response.setId("ApplicationID");
		response.setName("ApplicationName");

		
		return response;
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
