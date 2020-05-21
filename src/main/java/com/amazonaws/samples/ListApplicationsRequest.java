package com.amazonaws.samples;

public class ListApplicationsRequest {

	
	private int MaxResults;
	private String NextToken;
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
