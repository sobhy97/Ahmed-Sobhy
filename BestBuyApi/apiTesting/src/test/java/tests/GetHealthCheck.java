package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetHealthCheck {

    @Test
    public void testReponseCode()
    {

        Response resp = RestAssured.get("http://localhost:3030/healthcheck");
        int code = resp.getStatusCode();
        System.out.print("Status Code is " +code);

        Assert.assertEquals(code, 200);

    }

}
