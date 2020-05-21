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
		response.setDescription("Application Description");                                            //where to fetch appplication details
		response.setId("ApplicationID");
		response.setName("ApplicationName");

		
		return response;
		
		
	}
	
	//GET CONFIGURATION
	public GetConfigurationResponse getConfiguration(GetApplicationRequest getApplicationRequest) {
		GetConfigurationResponse response = new GetConfigurationResponse();
		response.setConfigurationVersion("Configuration Version");
		response.setContent("Content frm DDB");
		response.setContentType("Content Type");
		
		
		return response;
	}
	
	
	
	
	//GET CONFIGURATION PROFILE
	public GetConfigurationProfileResponse getConfigurationProfile(GetConfigurationProfileRequest getConfigurationProfileRequest) {
		GetConfigurationProfileResponse response = new GetConfigurationProfileResponse();
		response.setApplicationId(getConfigurationProfileRequest.getApplicationId());
		response.setDescription("Configuration Profile Description");
		response.setId(getConfigurationProfileRequest.getConfigurationProfileId());
		response.setLocationUri("URI location of configuration");
		response.setName("Configuration Profile Name");
		response.setRetrievalRoleArn("ARN");
		response.setValidators("Validation");
		
		
		return response;
		
	}
	
	
	//GET DEPLOYMENT 
	public GetDeploymentResponse getDeployment(GetConfigurationProfileRequest getDeploymentRequest) {

		GetDeploymentResponse response = new GetDeploymentResponse();
		response.setApplicationId(getDeploymentRequest.getApplicationId());
		response.setCompletedAt("Completed time");
		response.setConfigurationLocationUri("configuration Location Uri");
		response.setConfigurationName("configurationName");
		response.setConfigurationProfileId(getDeploymentRequest.getConfigurationProfileId());
		response.setConfigurationVersion("configuration Version"); 
		response.setDeploymentDurationInMinutes(5);                                           //some random number
		response.setDeploymentNumber(5);                                                      //some random number
		response.setDeploymentStrategyId("deploymentStrategyId");
		response.setDescription("description");                                              
		response.setEnvironmentId("environmentId");
		response.setEventLog("eventLog");
		response.setFinalBakeTimeInMinutes(5);                                                //some random number
		response.setGrowthFactor(5);                                                          //some random number
		response.setGrowthType("growthType"); 		
		response.setPercentageComplete(5);                                                    //some random number
		response.setStartedAt("time startedAt");
		response.setState("state of deployment");
		
		
		return response;
		
	}
	
	
	
	//GET DEPLOYMENT STRATEGY
	public GetDeploymentStrategyResponse getDeploymentStrategy(GetDeploymentStrategyRequest getDeploymentStrategyRequest) {
		GetDeploymentStrategyResponse response = new GetDeploymentStrategyResponse();
		response.setDeploymentDurationInMinutes(5);                                               //some random number
		response.setDescription("description of deployment strategy");
		response.setFinalBakeTimeInMinutes("finalBakeTimeInMinutes");
		response.setGrowthFactor(5);                                                                //some random number
		response.setId(getDeploymentStrategyRequest.getDeploymentStrategyId());
		response.setName("name of the deployment strategy");
		response.setReplicateTo("replicateTo");
		
		
		return response;
		
	}
	
	
	
	//GET ENV
	public GetEnvironmentResponse getEnvironment(GetEnvironmentRequest getEnvironmentRequest) {
		GetEnvironmentResponse response = new GetEnvironmentResponse();
		response.setApplicationId(getEnvironmentRequest.getApplicationId());
		response.setDescription("description of the env");
		response.setId(getEnvironmentRequest.getEnvironmentId());
		response.setMonitors("monitors");
		response.setName("name of the env");
		response.setState("state of the env");         
		
		return response;
		
	
		
	}
	
	
	//LIST APPLICATIONS
	public ListApplicationsResponse listApplication(ListApplicationsRequest listApplicationRequest) {
		ListApplicationsResponse response = new ListApplicationsResponse();
		response.setItems("items");
		response.setNextToken("NextToken");
		
		return response;
		
		
	}
	
	
	//LIST CONFIGURATIONS PROFILE
	public ListApplicationsResponse listConfigurationProfile(ListConfigurationProfilesRequest listConfigurationProfilesRequest) {
		ListApplicationsResponse response = new ListApplicationsResponse();
		response.setItems("items");
		response.setNextToken("nextToken");
		
		
		
		return response;
		
	}
	
	
	
	//LIST Deployments
	public ListDeploymentsResponse listDeployment(ListDeploymentsRequest listDeploymentsRequest) {
		
		ListDeploymentsResponse response = new ListDeploymentsResponse();
		response.setItems("items");
		response.setNextToken("nextToken");
		
		
		return response;
		
	}

	
	
	//ListDeploymentStrategies
	
	public ListDeploymentStrategiesResponse listDeploymentStrategy(ListDeploymentsRequest listDeploymentRequest) {
		
		ListDeploymentStrategiesResponse response = new ListDeploymentStrategiesResponse();
		response.setItems("items");
		response.setNextToken("nextToken");
		
		return response;
		
		
		
	}
	
	
	
	//LIST ENV
	public ListEnvironmentsResponse listEnvironment(ListEnvironmentsRequest listEnvrionmentEnvironmentsRequest) {
		
		ListEnvironmentsResponse response = new ListEnvironmentsResponse();
		response.setItems("items");
		response.setNextToken("nextToken");
		
		
		return response;
		
		
	}
	
	//LIST TAGS FOR RESOURCE         ####     PENDING    ######
	
	
	
	
	
	
	//START DEPLOYMENT
	public StartDeploymentResponse startDeployment(StartDeploymentRequest startDeploymentRequest) {
		StartDeploymentResponse response =  new StartDeploymentResponse();
		response.setApplicationId(startDeploymentRequest.getApplicationId());
		response.setCompletedAt("completedAt");
		response.setConfigurationLocationUri("configurationLocationUri");
		response.setConfigurationName("configurationName");
		response.setConfigurationProfileId(startDeploymentRequest.getConfigurationProfileId());
		response.setConfigurationVersion(startDeploymentRequest.getConfigurationVersion());
		response.setDeploymentDurationInMinutes(5);                                                            //random number
		response.setDeploymentNumber(5);                                                                     //random number
		response.setDeploymentStrategyId(startDeploymentRequest.getDeploymentStrategyId());
		response.setDescription(startDeploymentRequest.getDescription());
		response.setEnvironmentId(startDeploymentRequest.getEnvironmentId());
		response.setEventLog("eventLog");
		response.setFinalBakeTimeInMinutes(5);                                                             //random number
		response.setGrowthFactor(5)    ;                                                                     //random number
		response.setPercentageComplete(5);                                                                  //random number
		response.setStartedAt("startedAt");                                           
		response.setState("state of deployment");
		
		
		return response;
		
	}
	
	
	
	//STOP DEPLOYMENT
	public StopDeploymentResponse stopDeploymentResponse(StopDeploymentRequest stopDeploymentRequest) {
		StopDeploymentResponse response = new StopDeploymentResponse();
		response.setApplicationId(stopDeploymentRequest.getApplicationId());
		response.setCompletedAt("completedAt");
		response.setConfigurationLocationUri("configurationLocationUri");
		response.setConfigurationName("configurationName");
		response.setConfigurationProfileId("configurationProfileId");
		response.setConfigurationVersion("configurationVersion");
		response.setDeploymentDurationInMinutes(5);                                                      //random number
		response.setDeploymentNumber(stopDeploymentRequest.getDeploymentNumber());
		response.setDeploymentStrategyId("deploymentStrategyId");
		response.setDescription("description");
		response.setEnvironmentId(stopDeploymentRequest.getEnvironmentId());
		response.setEventLog("eventLog");
		response.setFinalBakeTimeInMinutes(5);                                                           //random number
		response.setGrowthFactor(5);                                                                     //random number
		response.setGrowthType("growthType"); 
		response.setPercentageComplete(5);                                                              //random numbers
		response.setStartedAt("startedAt");
		response.setState("state");
		
		
		
		return response;
		
	}
	
	
	//TAG RESOURCE      ####     PENDING         ######
	
	
	
	
	
	
	
	//UNTAG RESOURCE     ####     PENDING        ######
	
	
	
	
	
	//UPDATE APPLICATION
	public UpdateApplicationResponse updateApplication(UpdateApplicationRequest updateApplicationRequest) {
		UpdateApplicationResponse response = new UpdateApplicationResponse();
		response.setDescription(updateApplicationRequest.getDescription());
		response.setId(updateApplicationRequest.getApplicationId());
		response.setName(updateApplicationRequest.getName());
		
		
		return response;
	}
	
	
	
	
	//UPDATE CONFIGURATION PROFILE\
	public UpdateConfigurationProfileResponse updateConfigurationProfile(UpdateConfigurationProfileRequest updateConfigurationProfileRequest) {
	
		
		UpdateConfigurationProfileResponse response = new UpdateConfigurationProfileResponse();
		response.setApplicationId(updateConfigurationProfileRequest.getApplicationId());
		response.setDescription(updateConfigurationProfileRequest.getDescription());
		response.setId(updateConfigurationProfileRequest.getConfigurationProfileId());
		response.setLocationUri("locationUri of configuration");
		response.setName(updateConfigurationProfileRequest.getName());
		response.setRetrievalRoleArn(updateConfigurationProfileRequest.getRetrievalRoleArn());
		response.setValidators(updateConfigurationProfileRequest.getValidators());
		
		
		return response;
	
	
	}
	
	
	
	//UPDATE DEPLOYMENT STRATEGY
	public UpdateDeploymentStrategyResponse updateDeploymentStrategy(UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest) {
		UpdateDeploymentStrategyResponse response = new UpdateDeploymentStrategyResponse();
		response.setDeploymentDurationInMinutes(updateDeploymentStrategyRequest.getDeploymentDurationInMinutes());                                                          //random number
		response.setDescription(updateDeploymentStrategyRequest.getDescription());
		response.setFinalBakeTimeInMinutes(updateDeploymentStrategyRequest.getFinalBakeTimeInMinutes());
		response.setGrowthFactor(updateDeploymentStrategyRequest.getGrowthFactor());
		response.setGrowthType(updateDeploymentStrategyRequest.getGrowthType());
		response.setId(updateDeploymentStrategyRequest.getDeploymentStrategyId());
		response.setName("Name of the deployment Strategy");
		response.setReplicateTo("replicateTo");
		
		
		return response;
		
	}
	
	
	
	//UPDATE ENV
	public UpdateEnvironmentResponse updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {
		UpdateEnvironmentResponse response = new UpdateEnvironmentResponse();
		response.setApplicationId(updateEnvironmentRequest.getApplicationId());
		response.setDescription(updateEnvironmentRequest.getDescription());
		response.setId(updateEnvironmentRequest.getEnvironmentId());
		response.setMonitors(updateEnvironmentRequest.getMonitors());
		response.setName(updateEnvironmentRequest.getName());
		response.setState("state");
		
		
		return response;
		
	}
	
	
	//VALIDATE CONFIGURATION
	public ValidateConfigurationResponse validateConfiguration(ValidateConfigurationRequest validateConfigurationRequest) {
		return null;
		//HTTP RESPONSE 
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
