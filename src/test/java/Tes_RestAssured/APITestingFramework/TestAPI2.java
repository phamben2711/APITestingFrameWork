package Tes_RestAssured.APITestingFramework;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



@Test

public class TestAPI2 {

	
	@Test
	public void postRequestDataAPI() 
	{ 
		String  tokenString="Zed8G9pKZhxDRkZlC-6Oob7eNZdq3TkcHu3t0oRSqk0QHgb0FOWEQX_FoouHXzM0Hqz6zKjtr3MRJfHdcID48Q-EfRxoEuP5yOyqmjK6bihO_QkMsFuMocwCcxDD6CvhzVwaGNWC14WXgVLC_qvC9LfYbHGC8G31wxCRM4gb20UFIBWyYXtaUnL54kzeB8JIzopf9y4B9YHbsVUnDPL8RIRzkpsf3JTvBmxt0w7Vit1_hzeOHfAwNHqN-MhoXMpCLZHz0aIrbG8EGyUYlR0Mu7PsIUphK3MXys3Jz0jNuVPo-yoIMOi57CF28S60rPwBcnlkRDM3HYrqmPU_EHk79w";
	   RestAssured.baseURI = "https://bookstore.demoqa.com";
	   RestAssured.get("https://bookstore.demoqa.com");
	   RequestSpecification request1 = RestAssured.given().auth().oauth2(tokenString);
	   // JSONObject is a class that represents a Simple JSON. 
	   // We can add Key - Value pairs using the put method 
	   JSONObject requestParams = new JSONObject(); 
	   requestParams.put("userId", "TQ123"); 
	   requestParams.put("isbn", "9781449325862"); 
	   requestParams.put("phone","0123456789");
	   requestParams.put("gmail","nhatuyendung2@gmail.com");
	   // Add a header stating the Request body is a JSON 
	   request1.header("Content-Type", "application/json"); // Add the Json to the body of the request 
	   request1.body(requestParams.toString()); // Post the request and check the response
	   Response response = request1.request(Method.POST, "/swagger/#/BookStore/BookStoreV1BooksGet");
//			   post("/swagger/#/BookStore/BookStoreV1BooksGet"); 
	   System.out.println("The status received: " + response.statusLine());
	   response.then().log().body();
	}


	     @Test
	     public void updateData() {
			 String userId= "toolsqa_test";
		     String baseUrl="https://bookstore.demoqa.com";
		     String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRlc3RpbmcxMjMiLCJwYXNzd29yZCI6IlBhc3N3b3JkQDEiLCJpYXQiOjE2Mjg1NjQyMjF9.lW8JJvJF7jKebbqPiHOBGtCAus8D9Nv1BK6IoIIMJQ4";
		     String isbn ="9781449325865";
		  RestAssured.baseURI = baseUrl;
		  RequestSpecification httpRequest = RestAssured.given()
			 .header("Authorization", "Bearer " + token)
	         .header("Content-Type", "application/json")
	         .header("correlation","application/json");
		  //Calling the Delete API with request body
		  Response res = httpRequest
				   .body("{ \"isbn\": \"" + isbn + "\", \"userId\": \"" + userId + "\"}")
				   .put("/swagger/#/BookStore/BookStoreV1BooksGet");
		  HashMap<String,String> body =new HashMap<String, String>();
		  body.put("firstname", "Jim");
		  body.put("lastname", "Brown");
		  httpRequest.body(body);
		  
		  //Fetching the response code from the request and validating the same
		  System.out.println("The response code - " +res.getStatusCode());
	          Assert.assertEquals(res.getStatusCode(),200);
		  }
	 
	 	  @Test
	 	  public void deleteData() {
	 	     String userId= "de5d75d1-59b4-487e-b632-f18bc0665c0d";
			 	String baseUrl="https://bookstore.demoqa.com";
			 	String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRlc3RpbmcxMjMiLCJwYXNzd29yZCI6IlBhc3N3b3JkQDEiLCJpYXQiOjE2Mjg1NjQyMjF9.lW8JJvJF7jKebbqPiHOBGtCAus8D9Nv1BK6IoIIMJQ4";
			 	String isbn ="9781449337711";
	 		  RestAssured.baseURI = baseUrl;
	 		  RequestSpecification httpRequest = RestAssured.given()
	 				     .header("Authorization", "Bearer " + token)
	 			         .header("Content-Type", "application/json");
	 		  //Calling the Delete API with request body
	 		  Response res = httpRequest.body("{ \"isbn\": \"" + isbn + "\", \"userId\": \"" + userId + "\"}")
	 				  	 .delete("/swagger/#/BookStore/BookStoreV1BooksGet");
	 		  //Fetching the response code from the request and validating the same
	 		  System.out.println("The response code is - " +res.getStatusCode());
	 	      Assert.assertEquals(res.getStatusCode(),200);
	      
	 	  }
}
