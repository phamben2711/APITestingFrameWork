package Tes_RestAssured.APITestingFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.when;
public class TestAPI9 {
	@Test
	public void GetDataDetails() { 
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// specify the method type (GET) and the parameters if any. 
		//In this case the request does not take any parameters 
		Response response = httpRequest.request(Method.GET, "");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		List<Map<String, String>> descripton = response.jsonPath().getList("books");
		System.out.println("Status received2 => " + descripton.get(0).get("description"));
//		System.out.println("Response=>" + response.prettyPrint());
	   }
	
}
