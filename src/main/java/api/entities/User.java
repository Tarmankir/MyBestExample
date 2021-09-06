package api.entities;

import api.bodies.DataUserBody;
import api.bodies.RequestUserBody;
import api.bodies.ResponseUserBody;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import lombok.Getter;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class User {

    @Getter
    private ResponseUserBody responseUserBody;

    @Step("Create user")
    public ResponseUserBody createUser(RequestUserBody body) {
        return responseUserBody = given()
                    .contentType(ContentType.JSON)
                    .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                    .body(body)
                .when()
                    .post("http://users.bugred.ru/tasks/rest/createuser")
                .then()
                    .statusCode(SC_OK)
                    .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                    .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);
    }
}