package Tes_RestAssured.APITestingFramework;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class TestAPI6 {
	@BeforeTest
    public void setup() {
        RestAssured.baseURI = "http://localhost:8080";
        @Test
        public void createJessionID(){
        JSSONObject json = new JSONObject();
        json.put("username","mukeshotwani");
        json.put("password","abcd@1234");

        Response resp = RestAssured.given().header("Content-Type","application/json")
        .body(json)
        .post("http://localhost:8081/rest/auth/1/session");
        System.out.println(resp.getStatusCode());
        System.out.println(resp.getBody().jsonPath().prettify());
      String sessionID =resp.getCookies().get("JSESSIONID");
Response response =RestAssured.given().contentType(ContentType.JSON)
.cookie("JSESSIONID",sessionID)
        .body{\"fields\":{\"project\":{\"key\":\"MUK\"},\"summary\":\"Rest\"}")
        .post()
    }
        }
}
