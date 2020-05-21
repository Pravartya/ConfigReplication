package com.amazonaws.samples;

public class ListEnvironmentsRequest {
	private String ApplicationId;
	private int MaxResults;
	private String NextToken;
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
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
