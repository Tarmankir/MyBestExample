package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class BugRedTest {

    @Test
    public void getRequestWithQueryParam() {
        given()
                .contentType(ContentType.HTML)
        .when()
                .get("http://users.bugred.ru/")
        .then()
                .statusCode(SC_OK)
                .extract().response();
    }
}