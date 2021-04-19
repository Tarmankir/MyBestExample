package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class LoginPageApi {

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
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assertions.assertEquals(201, response.statusCode());
    }
}