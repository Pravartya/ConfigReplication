package com.amazonaws.samples;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;

public class ScanItems {
	static AmazonDynamoDB dynamoDB;
	
	
	private static void init() throws Exception{
		ProfileCredentialsProvider credentialProvider=new ProfileCredentialsProvider();
		try {
			credentialProvider.getCredentials();
		}
		catch(Exception e){
			throw new AmazonClientException("Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/home/baba/.aws/credentials), and is in valid format.",
                    e);
		}
	 dynamoDB=AmazonDynamoDBClientBuilder.standard()
			 .withCredentials(credentialProvider)
			 .withRegion("us-east-1")
			 .build();
	}

	public static void main(String[] args) {
		  try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			DynamoDB dynamodb=new DynamoDB(dynamoDB);
			Table table=dynamodb.getTable("ConfigurationTable");
			ScanSpec scanSpec = new ScanSpec().withProjectionExpression("DomainName,Realm,ConfigName,Values1");
//					.withFilterExpression("#yr between :start_yr and :end_yr").withNameMap(new
//					NameMap().with("#yr", "year"))
//					.withValueMap(new ValueMap());
					try {
					ItemCollection<ScanOutcome> items = table.scan(scanSpec);
					Iterator<Item> iter = items.iterator();
					while (iter.hasNext()) {
					Item item = iter.next();
					System.out.println(item.toString());
					}
					}
					catch (Exception e) {
					System.err.println("Unable to scan the table:");
					System.err.println(e.getMessage());
					}
			


}
}
