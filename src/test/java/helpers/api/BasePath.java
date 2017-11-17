package helpers.api;

import org.junit.*;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class BasePath {
	
	
	@BeforeClass
	public static void setup(){
		
		String baseHost = System.getProperty("server.host");
		if(baseHost == null) {
			baseHost = "http://ageranger.azurewebsites.net/api/AgeRanger/";
		}
		
		RestAssured.baseURI = baseHost;

		
	}

}