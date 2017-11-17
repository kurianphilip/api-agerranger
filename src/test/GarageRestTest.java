package test;

import org.junit.*;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;


public class GarageRestTest extends FunctionalTest2 {
	
	@Test
	public void basicPingTest() {
		given().when().get("/GetAllPeople").then().statusCode(200);
	}
	
	
	@Test
	public void invalidRequest() {
		given().when().get("/GetAllNames").then().statusCode(404);
	}

}
