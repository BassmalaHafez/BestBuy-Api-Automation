package products;

import models.BaseProduct;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetProducts {

    @Test
    public void getProducts(){
        String endPoint= "http://localhost:3030/products ";
        BaseProduct product = new BaseProduct();
      //  product.setTotal(product.getTotal());

        given().when().get(endPoint).then().log().body().assertThat().statusCode(200);

    }
}
