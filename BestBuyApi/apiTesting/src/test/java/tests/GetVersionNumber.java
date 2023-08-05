package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetVersionNumber {
    @Test
    public void testReponseCode()
    {

        Response resp = RestAssured.get("http://localhost:3030/version");
        int code = resp.getStatusCode();
        System.out.print("Status Code is " +code);

        Assert.assertEquals(code, 200);

    }
}
