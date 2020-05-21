package com.amazonaws.samples;

public class ListApplicationsResponse {
	
	
	private String Items;                                             //Datatypes needs to bechanged
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
