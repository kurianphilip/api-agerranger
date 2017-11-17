package test;

import org.junit.*;
import com.sun.javafx.collections.MappingChange.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;




public class AddNewPerson extends BasePath {
	
	@Test
	public void addANewPerson()
	{
		
		Person person = new Person("Dolly", "Parton", "25");
		
		System.out.println(person.getAttributes());
		
		given()
		.contentType("application/json")
		.body(person.getAttributes())
		.when()
		.post("/AddPerson")
		.then().statusCode(204);
		
		
		
	}
	

}
