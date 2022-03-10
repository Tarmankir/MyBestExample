import bodies.DoRegisterBody;
import specifications.RequestSpec;
import specifications.ResponseSpec;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DoRegisterTest {

    @Test
    @Step("Check user registration")
    public void doRegisterUserTest() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new DoRegisterBody().doRegisterBody())
        .when()
                .post("/tasks/rest/doregister/posts")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpec().defaultResponseSpec())
                .extract().response();
    }
}