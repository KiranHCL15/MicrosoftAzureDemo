package RestAssured;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse {
	@Test
	public void getData()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		int status=response.getStatusCode();
		Assert.assertEquals(status, 200);
	}
	@Test
	public void test()
	{
//		given().when().
	}

}
