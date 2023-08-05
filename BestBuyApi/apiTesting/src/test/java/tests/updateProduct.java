package tests;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class updateProduct {
	
    @Test
	public void update()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "Duracell - D Batteries (4-Pack)");
		json.put("type", "HardGood");
        json.put("price", 70);
		json.put("shipping", 0);
		json.put("upc", "041333430010");
		json.put("description", "Compatible with select electronic devices; D size; DURALOCK Power Preserve technology; 4-pack");
		json.put("manufacturer", "Duracell");
		json.put("model", "MN1300R4Z");
		json.put("url",
				"http://www.bestbuy.com/site/duracell-d-batteries-4-pack/185267.p?id=1051384046551&skuId=185267&cmp=RMXCC");
		json.put("image", " http://img.bbystatic.com/BestBuy_US/images/products/1852/185267_sa.jpg");
		request.body(json.toJSONString());
		Response response = request.patch("http://localhost:3030/products/185230");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);

	}
}
