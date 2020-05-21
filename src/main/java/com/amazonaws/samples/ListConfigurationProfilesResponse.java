package com.amazonaws.samples;

public class ListConfigurationProfilesResponse {
	
	
	private String Items;                                                   //Datatype needs to be changed
	private String NextToken;
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public String getNextToken() {
		return NextToken;
	}
	public void setNextToken(String nextToken) {
		NextToken = nextToken;
	}

}
