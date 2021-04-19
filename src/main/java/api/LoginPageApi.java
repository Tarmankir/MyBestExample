package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.http.ContentType.TEXT;
import static org.apache.http.HttpStatus.SC_OK;

public class LoginPageApi {

    //GPATH

    //todo add new requests
    //todo assert response with .extract().response().jsonPath()
    //todo assert json schema with matchJsonSchema


    private static String requestBody = "{\n" +
            "  \"email\": \"umk090099888@yandex.ru\",\n" +
            "  \"name\": \"bar\",\n" +
            "  \"password\": \"123\" \n}";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://users.bugred.ru/tasks/rest/doregister";
    }

    @Test
    public void postRequest() {
        given()
                .contentType(JSON)
                .body(requestBody)
        .when()
                .post("http://users.bugred.ru/tasks/rest/doregister" + "/posts")
        .then()
                .statusCode(SC_OK)
                .contentType(JSON)
                .extract().response();
    }
}