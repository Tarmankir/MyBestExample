package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class LoginPageApi {

    @Test
    public void getRequest() {
        given()
                .baseUri("https://yandex.ru/")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
    }
}