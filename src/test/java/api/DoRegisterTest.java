package api;

import api.specifications.RequestSpec;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DataFaker;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    DataFaker dataFaker = new DataFaker();
    String email = dataFaker.generateEmail();
    String nameUser = dataFaker.generateName();

    JSONObject requestBody = new JSONObject();

    @BeforeMethod
    public void doRegisterBefore() {
        requestBody.put("email", email);
        requestBody.put("name", nameUser);
        requestBody.put("password", "School5");
    }

    @Test
    @Step("Check user registration")
    public void doRegisterUser() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new Gson().toJson(requestBody))
        .when()
                .post("/tasks/rest/doregister/posts")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response();
    }
}