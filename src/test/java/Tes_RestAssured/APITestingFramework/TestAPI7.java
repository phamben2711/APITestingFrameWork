package Tes_RestAssured.APITestingFramework;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Base64;

import org.testng.annotations.BeforeTest;
import static io.restassured.RestAssured.given;
public class TestAPI7 {
	public static String clientId = "some_client_id";
    public static String redirectUri = "some_redirect_uri";
    public static String scope = "some_scope";
    public static String username = "some_email";
    public static String password = "some_password";

    public static String encode(String str1, String str2) {
        return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
    }

    public static Response getCode() {
        String authorization = encode(username, password);
        return
                given()
                        .header("authorization", "Basic " + authorization)
                        .contentType(ContentType.URLENC)
                        .formParam("response_type", "code")
                        .queryParam("client_id", clientId)
                        .queryParam("redirect_uri", redirectUri)
                        .queryParam("scope", scope)
                        .post("/oauth2/authorize")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }

    public static String parseForOAuth2Code(Response response) {
        return response.jsonPath().getString("code");
    }

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://some-url.com";
    }


    @Test
    public void iShouldGetCode() {
        Response response = getCode();
        String code = parseForOAuth2Code(response);

//        Assertions.assertNotNull(code);
    }
}
