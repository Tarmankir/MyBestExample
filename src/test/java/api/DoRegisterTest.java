package api;

import api.specifications.RequestSpec;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    private static String requestBody = "{\n" +
            "  \"email\": \"um1k099888@yandex.ru\",\n" +
            "  \"name\": \"br\",\n" +
            "  \"password\": \"123\" \n}";

    @BeforeMethod
    public void doRegisterBefore() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "um1k099888@yandex.ru");
        requestParams.put("name", "Test");
        requestParams.put("password", 12000);

/*        Map<String, String> requestParams2 = new HashMap<>();
        requestParams2.put("email", "um1k099888@yandex.ru");
        requestParams2.put("name", "Test");
        requestParams2.put("password", 12000);*/
    }

    @Test
    @Step("Check user registration")
    public void doRegisterUser() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(requestBody)
        .when()
                .post("/tasks/rest/doregister/posts")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response();
    }
}