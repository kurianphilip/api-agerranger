package apiautomation;

import org.junit.*;
import com.sun.javafx.collections.MappingChange.Map;

import helpers.api.BasePath;
import helpers.api.Person;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;




public class UpdateAPerson extends BasePath {
	
	@Test
	public void updateNewPerson()
	{
		Person person = new Person("Dolly", "Parton", "4","1908");
		
		System.out.println(person.getAttributes());
		
		given()
		.body(person.getAttributes())
		.when()
		.contentType("application/json")
		.put("/UpdatePerson")
		.then().statusCode(204);
		
		
		
//		given().pathParam("Id", 1906)
//		.when().delete("/DeletePerson/{Id}")
//		.then().statusCode(204);
		
		
	}
	

}