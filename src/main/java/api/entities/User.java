package api.entities;

import api.bodies.RequestUserBody;
import api.bodies.ResponseUserBody;
import api.specifications.RequestSpec;
import api.specifications.ResponseSpec;
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
                    .post("http://users.bugred.ru/tasks/rest/createuserwithtasks")
                .then()
                    .statusCode(SC_OK)
                    .spec(new ResponseSpec().defaultResponseSpec())
                    .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);
    }
}