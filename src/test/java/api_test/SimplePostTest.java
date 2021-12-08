package api_test;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplePostTest extends BaseClassApiTest{
    @Test
    public void createNewUser() {
        LOGGER.info(testCaseName);

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        Faker faker = new Faker();
        String name = faker.name().fullName();
        LOGGER.debug("New user Full name: " + name);

        String jobTitle = faker.job().title();
        LOGGER.debug("New user Job Position is: " + jobTitle);

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", name);
        reqBody.put("job", jobTitle);

        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(reqBody.toJSONString());

        Response response = httpRequest.request(Method.POST);
        LOGGER.debug(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 201);


        JsonPath jsonPath = response.jsonPath();
        String actualName = jsonPath.getString("name");
        Assert.assertEquals(actualName, name);

        String actualJobTitle = jsonPath.getString("job");
        Assert.assertEquals(actualJobTitle, jobTitle);

        LOGGER.info(endTestCase);

    }
}
