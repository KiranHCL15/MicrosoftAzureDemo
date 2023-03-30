package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SampleTest {
	
	
	@Test
	public void test()
	{
		//post request
		RestAssured.baseURI="https://reqres.in";
		given().log().all().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").when().post("/api/users").then().log().all().assertThat().statusCode(201).body("job",equalTo("leader"));
	}

}
