package Tes_RestAssured.APITestingFramework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
public class TestAPI10 {
	  public static Response doGetRequest(String endpoint) {
	        RestAssured.defaultParser = Parser.JSON;

	        return
	            given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
	                when().get(endpoint).
	                then().contentType(ContentType.JSON).extract().response();
	    }

	    public static void main(String[] args) {
	        Response response = doGetRequest("https://demoqa.com/BookStore/v1/Books");

	        List<String> jsonResponse = response.jsonPath().getList(null);

	        System.out.println(jsonResponse.size());
	    }
	    @Test
	    public void GetdataJson() {
	    	  Response response = doGetRequest("https://jsonplaceholder.typicode.com/users/");

	  	    List<Map<String, String>> respons = response.jsonPath().getList("title[0]");
	  	    System.out.print(respons.get(0).get("value"));
		}
	  
}
