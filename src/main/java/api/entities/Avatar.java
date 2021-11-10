package api.entities;

import api.specifications.RequestSpec;
import api.specifications.ResponseSpec;
import io.qameta.allure.Step;
import io.restassured.builder.MultiPartSpecBuilder;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class Avatar {

    @Test
    @Step("Add avatar for user")
    public void addAvatar(File file, String email) {
        given()
                .spec(new RequestSpec().defaultRequestSpec()
                        .multiPart(new MultiPartSpecBuilder(file)
                                .controlName("avatar")
                                .fileName(file.getName())
                                .build())
                        .multiPart(new MultiPartSpecBuilder(email)
                                .controlName("email")
                                .build())
                        .contentType("multipart/form-data"))
        .when()
                .post("/tasks/rest/addavatar")
        .then()
                .spec(new ResponseSpec().defaultResponseSpec())
                .statusCode(SC_OK)
                .extract().response();
    }
}