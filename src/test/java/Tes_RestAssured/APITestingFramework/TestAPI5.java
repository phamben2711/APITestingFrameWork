package Tes_RestAssured.APITestingFramework;
import java.util.HashMap;
import java.util.Map;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class TestAPI5 {
	@Test
	public void PostDataToWeb()
	{
		Map<String,String> data = new HashMap<String,String>();
		data.put("firstname", "Jim");
		  data.put("lastname", "Brown");
		  data.put("Customer", "John Smith");
		
		
		//GIVEN
		RestAssured
		   .given()
			  .baseUri("https://reqbin.com/echo/post/json")
			  .contentType(ContentType.JSON)
			  .body(data)
			  .log()
			  .all()
		// WHEN
		   .when()
			   .post()
		// THEN
		   .then()
			   .assertThat()
			   .statusCode(200)
			   .log()
			   .all();
		
	}
}
