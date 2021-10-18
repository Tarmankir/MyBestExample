package api.entities;

import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.MultiPartSpecBuilder;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class Avatar {

    @Test
    @Step("Add avatar for user")
    public void addAvatar(File file, String email) {
        given()
                .spec(new RequestSpecBuilder()
                        .addMultiPart(new MultiPartSpecBuilder(file)
                                .fileName(file.getName())
                                .build())
                        .addMultiPart(new MultiPartSpecBuilder(email)
                                .controlName(email)
                                .build())
                        .setContentType("multipart/form-data")
                        .build())
                .body(new Gson().toJson(requestBody))
        .when()
                .post("/tasks/rest/addavatar")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response();
    }
}