package api;

import api.bodies.DoRegisterBody;
import api.specifications.RequestSpec;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    @Test
    @Step("Check user registration")
    public void doRegisterUser() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new DoRegisterBody().doRegisterBody())
        .when()
                .post("/tasks/rest/doregister/posts")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response();
    }
}