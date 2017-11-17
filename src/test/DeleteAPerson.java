package test;

import org.junit.*;
import com.sun.javafx.collections.MappingChange.Map;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class DeleteAPerson extends BasePath {
	
	@Test
	public void DelteAPerson()
	{
		given().pathParam("Id", 1906)
		.when().delete("/DeletePerson/{Id}")
		.then().statusCode(204);
		
		
	}
	
	
	

}
