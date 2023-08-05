package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProduct {
	
	@Test
	public void testReponseCode()
	{

		Response resp = RestAssured.get("http://localhost:3030/products");
		int code = resp.getStatusCode();
		System.out.print("Status Code is " +code);

		Assert.assertEquals(code, 200);

	}

}

