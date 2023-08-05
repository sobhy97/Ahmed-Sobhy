package tests;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateStore {
	@Test
	public void create()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "New store2024");
		json.put("type", "Mobile Accessories");
		json.put("address", "maadi");
		json.put("address2", "maadi22");
		json.put("city", "egypt");
		json.put("state", "EG");
		json.put("zip", "5430");
		json.put("lat", 44.969658);
		json.put("lng", -93.449539);
		json.put("hours", "3");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3030/stores");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
	}
}
