package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    private static String requestBody = "{\n" +
            "  \"email\": \"umk090099888@yandex.ru\",\n" +
            "  \"name\": \"bar\",\n" +
            "  \"password\": \"123\" \n}";

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