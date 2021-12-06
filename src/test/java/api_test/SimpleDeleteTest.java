package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDeleteTest {
    private static final Logger LOGGER = LogManager.getLogger(SimpleDeleteTest.class);

    @Test
    public void deleteSingleUser() {
        LOGGER.info("-----------Api Test Starts: Delete the existing user.......");

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        String id = "2";
        Response response = httpRequest.request(Method.DELETE, id);
        LOGGER.debug(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 204);

        LOGGER.info("-----------Api Test End: Delete the existing user.......");

    }
}
