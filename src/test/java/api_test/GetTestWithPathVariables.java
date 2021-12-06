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

public class GetTestWithPathVariables {
    private static final Logger LOGGER = LogManager.getLogger(GetTestWithPathVariables.class);

    @Test
    public void getSingleUsersWithPathVariables() {
        LOGGER.info("-----------Api Test Starts: Get Single Users With path variables.......");

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        String id = "2";
        Response response = httpRequest.request(Method.GET, id);
        LOGGER.debug(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();

        String actualEmailId = jsonPath.getString("data.email");
        String expectedEmailId = "janet.weaver@reqres.in";
        Assert.assertEquals(actualEmailId, expectedEmailId);

        LOGGER.info("-----------Api Test Ends : Get single Users With path variables.......");

        }

        @Test
        public void getUsersWithInvalidId() {
            LOGGER.info("-----------Api Test Starts: Get Users With Invalid Id.......");

            RestAssured.baseURI = "https://reqres.in/api/users";

            RequestSpecification httpRequest = RestAssured.given();

            String id = "23";
            Response response = httpRequest.request(Method.GET, id);
            LOGGER.debug(response.prettyPrint());

            Assert.assertEquals(response.getStatusCode(), 404);

            JsonPath jsonPath = response.jsonPath();
            Assert.assertEquals(jsonPath.get().toString(), "{}");

            LOGGER.info("-----------Api Test End: Get Users With Invalid Id.......");

        }

    }


