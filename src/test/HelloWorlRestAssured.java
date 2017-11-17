package test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;
import org.junit.Test;

public class HelloWorlRestAssured {
	
	
	@Test
	public void makeSureThatGoogleIsUp() 
	{
		given().when().get("http://www.google.com").then().statusCode(200);
		
	}
	

}
