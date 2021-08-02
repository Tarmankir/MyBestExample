package api;

import api.bodies.DataUserBody;
import api.bodies.ResponseUserBody;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static api.testData.UserResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

@Listeners(ApiListener.class)
public class CheckUserTest {

    @Test
    void createUserFull() {

        new DataUserBody().fullUserBody();

        ResponseUserBody responseUserBody =
        given()
                .contentType(ContentType.JSON)
                .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                .body(new DataUserBody().fullUserBody())
        .when()
                .post("http://users.bugred.ru/tasks/rest/createuser")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseUserBody.getType());
        assertEquals(defaultResponse().getMessage(), responseUserBody.getMessage());
    }

    @Test
    void createUserSimple() {

        new DataUserBody().simpleUserBody();

        ResponseUserBody responseUserBody =
        given()
                .contentType(ContentType.JSON)
                .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                .body(new DataUserBody().simpleUserBody())
        .when()
                .post("http://users.bugred.ru/tasks/rest/createuser")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseUserBody.getType());
        assertEquals(defaultResponse().getMessage(), responseUserBody.getMessage());
    }
}