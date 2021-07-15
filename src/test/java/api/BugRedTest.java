package api;

import io.restassured.http.ContentType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

@Listeners(ApiListener.class)
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