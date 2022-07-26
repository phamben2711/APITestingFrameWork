package Tes_RestAssured.APITestingFramework;
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

public class TestAPI1 {
	String baseUrl ="https://www.phptravels.net/api/admin";
	/*
	@BeforeTest
    public void setUp() {
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("nhatuyendung2");
		authScheme.setPassword("nhatuyendung2");
		RestAssured.authentication = authScheme;

}
*/
	@Test
	public void GetAPI() { 
		String tokenString ="d2GsOsOAJcgErBB3Djy2O0C-n6RijtM3OqVTvvOJOPqRXk__-bDDvJIo5p7Mt4V7ir8AFcyGPlj4XFv_0t9ZESk-R2MQoz8ftTP32nbMCYfG3g57PCXb1qBqTmUST7M6RbT_Xy9ebS92QGlQFeV0kdIwtyMxPkV3b-3wWUcoQ05LjgBHIn61zOJ_Gy6wTgJDQbL7FIgHhPbnSgEYSSRcMCLt_F5hvqftfnbpcwRkQ3ABtjVof9r5DsxZTQt-zAhO1ydR68dSosi8MZZm7_H7IxSUmG6pdEs50Ubr2GPeaG9jtMKFtOTKhqC-juU6UNaspawrN37LYsmLHXTzmgPolw";
		// Specify the base URL to the RESTful web service 
//		RestAssured.baseURI = "https://localhost:44315"; 
		RestAssured.baseURI = baseUrl;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject(); 
		   requestParams.put("usertype", "Guest"); 
		   requestParams.put("servicetype", "Hotels"); 
		   httpRequest.header("Content-Type", "application/json"); 
		   httpRequest.body(requestParams.toString()); 
		   Response response = httpRequest.post("/quickbooking?service=none");
				//.auth().oauth2(tokenString); 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	   }
}
