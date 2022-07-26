package Tes_RestAssured.APITestingFramework;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI8 {
	   @Test
	     public void updateData() {
		     String baseUrl="https://bookstore.demoqa.com";
		     String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRlc3RpbmcxMjMiLCJwYXNzd29yZCI6IlBhc3N3b3JkQDEiLCJpYXQiOjE2Mjg1NjQyMjF9.lW8JJvJF7jKebbqPiHOBGtCAus8D9Nv1BK6IoIIMJQ4";
		  RestAssured.baseURI = baseUrl;
		  RequestSpecification httpRequest = RestAssured.given()
				  .log().
				  ifValidationFails()
			 .header("Authorization", "Bearer " + token)
	         .header("Content-Type", "application/json")
	         .header("correlation","application/json");
		  HashMap<String,String> data =new HashMap<String, String>();
		  data.put("firstname", "Jim");
		  data.put("lastname", "Brown");
		  data.put("Customer", "John Smith");
		  httpRequest.body(data);
		  //Calling the Delete API with request body
		  Response response = httpRequest.request(Method.POST,"/swagger/#/BookStore/BookStoreV1BooksGet");
		  
		  //Fetching the response code from the request and validating the same
		  System.out.println("The response code - " +response.getStatusCode());
	          Reporter.log("The status code received for post"+response.getStatusCode());
	          System.out.println("Response body:"+response.body().asString());
	          String responseBody=response.getBody().prettyPrint();
	          System.out.println("Respnse Body is SUP Code Hashmap"+responseBody);
	          Reporter.log("Respnse Body is SUP Code Hashmap"+responseBody);
	          System.out.println("The response code - " +response.getBody().asString());
		  }
}
