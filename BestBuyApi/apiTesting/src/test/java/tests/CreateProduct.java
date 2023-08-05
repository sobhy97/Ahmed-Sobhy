package tests;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateProduct {
	@Test
	public void create()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name","Iphone 14 promax");
		json.put("type", "Mobile Phone");
		json.put("upc", "12345673");
		json.put("price", 55000);
		json.put("description", "Black iphone 512G");
		json.put("model", "DC345");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3030/products");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
	}
	
	@Test
	public void getProductsList()
	{
		String data = RestAssured.get("http://localhost:3030/products").asString();
	}
}

	
