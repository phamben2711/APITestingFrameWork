package Tes_RestAssured.APITestingFramework;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
public class TestAPI11 {
	public static Response response;
    private String userAdminClientId = System.getenv("M2M_USER_ADMIN_CLIENT_ID");
    private String userAdminClientSecret = System.getenv("M2M_USER_ADMIN_CLIENT_SECRET");

    private String oauth2Payload = "{\n" +
            "  \"client_id\": \"" + userAdminClientId + "\",\n" +
            "  \"client_secret\": \"" + userAdminClientSecret + "\",\n" +
            "  \"audience\": \"https://some-url.com/user\",\n" +
            "  \"grant_type\": \"client_credentials\",\n" +
            "  \"scope\": \"user:admin\" \n}";

    private static String createUserPayload = "{\n" +
            "  \"username\": \"api-user\",\n" +
            "  \"email\": \"api-user@putsbox.com\",\n" +
            "  \"password\": \"Passw0rd123!\",\n" +
            "  \"firstName\": \"my-first-name\",\n" +
            "  \"lastName\": \"my-last-name\",\n" +
            "  \"roles\": [\"read\"] \n}";

    public void userAdminConfigSetup() {
        requestSpecification = given().auth().oauth2(getAccessToken(oauth2Payload))
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .contentType(ContentType.JSON);
    }

    public String getAccessToken(String payload) {
        return given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/token")
                .then().extract().response()
                .jsonPath().getString("access_token");
    }

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://some-url.com";
    }

    @Test
    public void createUser() {
        userAdminConfigSetup();
        response = given(requestSpecification)
                .body(createUserPayload)
                .post("/user")
                .then().extract().response();

        Assert.assertEquals(201, response.statusCode());
    }
}
