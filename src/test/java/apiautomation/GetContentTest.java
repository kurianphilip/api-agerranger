package apiautomation;

import org.junit.*;

import helpers.api.BasePath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;




public class GetContentTest extends BasePath {
	
	@Test
	public void verifyName(){
		given().when().get("/GetAllPeople").then().body(containsString("Alexander"));
	}
	
	

}
