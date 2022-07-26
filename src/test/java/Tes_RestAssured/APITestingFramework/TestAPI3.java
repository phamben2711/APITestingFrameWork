package Tes_RestAssured.APITestingFramework;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestAPI3 {
	@BeforeTest
    public void setUp() {
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("nhatuyendung2");
		authScheme.setPassword("nhatuyendung2");
		RestAssured.authentication = authScheme;

}
	private static final String Endpoint = "https://rec2-all.accor.com/ssr/app/accor/hotels/paris-france/index.en.shtml?dateIn=2022-06-06&nights=1&compositions=1&stayplus=false&snu=false";
	public static void SetURL(String Endpoint) {
	RestAssured.baseURI=Endpoint;
	}
	@Test
	public void GetDataAccor() { 
		Map<String,String> headers =new HashMap<String, String>();
		headers.put("header", "value1");
		headers.put("header", "value2");
		String tokenString ="zqcypRVTOYC7qR61djpmRKL1Q0JDvFL_sHBjEXq0lauri-Dv4b-DW2qVQgfii8rQ3GkNsBxWm6daicHFgpm-DQg_O1juMDlfK9n9C0oLzm0G_lP3W3X17EgHuW_JUSa5QFM4aUSyAy7kC3-IXQO8DvtB17hdAwDqt-61iDD2yLI1zd1vUTB8hFdUd4zBdsIQKI8-Zm3G65Jq_3h7bBVit9AkyP6so0XJiflOiMwu90MDgYUfOi30t0lL64al4RBJPI-cwNKQZY-ZqV6tYka_CdrMxaU1NBXzX0G_MawwvhFUDaIDgTjbEqN6mSginn6EBCUrXY5M6C7zHuC2pOFh-TiC80db6F28RnXdjyuugRlnBN2-fE6LZizhDle3GIiZIaz5VAU2C8joyGblUm5SntQ8ygg-lsxmCkCsimNf9a8qbu4bw3VhuJfMYHa_Cg8n8AABkqGYDCx61_t8H32_Ef6_NswApuE-5bLE7Qf8i47WHkR3og2J6nWy9ESL1vqHUFAhTeiZKns-mef4fJl_dCNofJDv_XRiVEDg6gcJst0CeP5INCixgpxsWv3S-EhaIIqDMZOEjtaugpnUtlQqGiFjlHSUKW1ly4Zbn6dQI7sTTwyiSec0r8uAsqaMn6xrdTeXzx-XUEN5GxKEZfxf5YKpRqEQ9ZpM_H9SeZ1ikpJ5uen0DDmky-mJufEz4eahqpRSeoUeXkFvFKoXSvzGMgtA4csH58KgAvXmao1wr7v8cxuLiFFny3OMKyxopeN6_SKfj4Sr-fsam7yb1SZUQoXK33R0JND1GXygN8d7bES2FQAYcaxBKropZLi-TtdyvKKGbKCQ91RGTqt3K-McwMvLkoeoK39bO2e4cEmQXrhmdAJlbcUAZhQbr_13G7hgwvKPBI0Ac7NAsjiZNzvyioJ-3sS4QtthJa6ZpE5tMdvcNtNqfxxKsUBUkSxzCk-iH_6eTpRDyIlBuFVE3SK8Ix5TQaDF3o0TquQNzGgCUjBqZyYFJh1byC9SEeSYfHzLgbH0RhCCfTRs1-5zjSUNgF9c89_7zEhyftsDBs7l5w01lHakGtYJPJPWoPrCQ9bQ5cUi1Qsepl3bef7qntY_ry657dc5I3o8FzvWNMJihHaSc0I5Fc4xCM7-ra5np3cqTbuDAW9jCn_LyHr1pXIymbjA9_QhfKjTx3p-i4TXkGrb34NDgoutGmkmH7PdDWv41DeGefuAmB83z7pGsBUVY1lCLIc_9IKRqW94dxzJJKfz_3K9";
		SetURL(Endpoint); 
		RequestSpecification httpRequest = RestAssured.given().auth().oauth2(tokenString); 
		Response response = httpRequest.request(Method.GET, "");
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	   }
}
