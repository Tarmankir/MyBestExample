package entities;

import bodies.RequestUserBody;
import bodies.ResponseUserBody;
import specifications.RequestSpec;
import specifications.ResponseSpec;
import io.qameta.allure.Step;
import io.restassured.mapper.ObjectMapperType;
import lombok.Getter;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class User {

    @Getter
    private ResponseUserBody responseUserBody;

    @Step("Create user")
    public ResponseUserBody createUser(RequestUserBody body) {
        return responseUserBody =
                given()
                    .spec(new RequestSpec().defaultRequestSpec())
                    .body(body.toJsonWithoutNull())
                .when()
                    .post("/tasks/rest/createuserwithtasks")
                .then()
                    .spec(new ResponseSpec().defaultResponseSpec())
                    .statusCode(SC_OK)
                    .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);
    }
}