package tests;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteProduct {
	@Test
	public void delete()
	{
		RequestSpecification request = RestAssured.given();
		Response response = request.delete("http://localhost:3030/products/309062");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
	}
}

