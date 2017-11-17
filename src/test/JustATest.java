package test;

import org.junit.*;
import com.sun.javafx.collections.MappingChange.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;



public class JustATest extends FunctionalTest2 {
	
	@Test
	public void verifyName() 
	{
		get("/GetAllPeople").then().body("FirstName", hasItems("Alexander"));
		
	}
	

}
