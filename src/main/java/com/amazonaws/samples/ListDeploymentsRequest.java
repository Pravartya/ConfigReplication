package com.amazonaws.samples;

public class ListDeploymentsRequest {
	
	
	private String ApplicationId;
	private String EnvironmentId;
	private int MaxResults;
	private String NextToken;
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
	public int getMaxResults() {
		return MaxResults;
	}
	public void setMaxResults(int maxResults) {
		MaxResults = maxResults;
	}
	public String getNextToken() {
		return NextToken;
	}
	public void setNextToken(String nextToken) {
		NextToken = nextToken;
	}
	
	

}
