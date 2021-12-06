package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetTestWithQueryParam {
    private static final Logger LOGGER = LogManager.getLogger(GetTestWithQueryParam.class);

    @Test
    public void getUsersWithQueryParam() {
        LOGGER.info("-----------Api Test Starts: Get Users with query Param.......");

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.queryParam("page", "2").request(Method.GET);
        LOGGER.debug(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();
        List<String> listEmails =  jsonPath.get("data.email");    //T means List of Array
        String expectedEmailId = "michael.lawson@reqres.in";
        boolean emailExists = listEmails.contains(expectedEmailId);
        Assert.assertTrue(emailExists, expectedEmailId + "does not exists");

        List<String> listNames = jsonPath.get("data.last_name");
        String expectedLastName = "Howell";
        boolean nameExists = listNames.contains(expectedLastName);
        Assert.assertTrue(nameExists,listNames + " does not exists");

        LOGGER.info("-----------Api Test End : Get Users with Query Param.......");

    }
}
