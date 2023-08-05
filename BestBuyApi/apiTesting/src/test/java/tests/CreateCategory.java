package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCategory {
    @Test
    public void create()
    {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("name", "test2023");
        json.put("id", "4702");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3030/categories");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 201);
    }
}
