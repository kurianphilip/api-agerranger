package test;

import org.junit.*;
import com.sun.javafx.collections.MappingChange.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;




public class UpdateNewPerson extends FunctionalTest2 {
	
	@Test
	public void addANewPerson()
	{
		HashMap<String, String> person = new HashMap<>();
		person.put("FirstName", "Marvel");
		person.put("LastName", "Avengers");
		person.put("Age",  "1000");
		
		
		given()
		.contentType("application/json")
		.body(person)
		.when()
		.post("/AddPerson")
		.then().statusCode(204);
		
		
		
	}
	

}
