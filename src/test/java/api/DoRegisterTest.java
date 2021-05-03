package api;

import api.specifications.RequestSpec;
import api.specifications.ResponseSpec;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    private static String requestBody = "{\n" +
            "  \"email\": \"umk090099888@yandex.ru\",\n" +
            "  \"name\": \"bar\",\n" +
            "  \"password\": \"123\" \n}";

    @Test
    public void postRequest() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(requestBody)
        .when()
                .post("/tasks/rest/doregister/posts")
        .then()
                .spec(new ResponseSpec().defaultResponseSpec().statusCode(SC_OK))
                .extract().response();
    }
}