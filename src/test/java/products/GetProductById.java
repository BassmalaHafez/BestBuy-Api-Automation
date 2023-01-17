package products;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.BaseProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class GetProductById {

    Logger logger = LoggerFactory.getLogger(GetProductById.class);

    @Test
    public void getProductById(){
        String endPoint = "http://localhost:3030/products?$limit=25";


        Response response = given().when().get(endPoint);
        JsonPath jsonPath = response.jsonPath();
        List<BaseProduct> productList = jsonPath.getList("data", BaseProduct.class);

        Random random = new Random();
        int index = random.nextInt(25);


        logger.info("-----> Index: {}" , String.valueOf(index));

        BaseProduct product = productList.get(index);



        validateBaseProduct(product);
    }

    private void validateBaseProduct(BaseProduct product) {

        Assert.assertNotNull(product.getId());
        Assert.assertNotNull(product.getName());
        Assert.assertNotNull(product.getType());
        Assert.assertNotNull(product.getPrice());
        Assert.assertNotNull(product.getShipping());
        Assert.assertNotNull(product.getDescription());
        Assert.assertNotNull(product.getManufacturer());
        Assert.assertNotNull(product.getModel());
        Assert.assertNotNull(product.getUrl());
        Assert.assertNotNull(product.getImage());

        logger.info("--->> product.id{}:  ---> product.name{}: ", String.valueOf(product.getId()), String.valueOf(product.getName()) );





    }



}
