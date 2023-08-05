package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateServices {
    @Test
    public void create()
    {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("name", "new service 2023");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3030/services");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 201);
    }
}
