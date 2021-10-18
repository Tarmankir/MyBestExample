package api;

import api.specifications.RequestSpec;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class AddAvatarTest {

    String email = "superhero@aa.ru";

    JSONObject requestBody = new JSONObject();

    @BeforeMethod
    public void addAvatarBefore() {
        requestBody.put("email", email);
    }

    @Test
    @Step("Add avatar for user")
    public void addAvatar() {
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