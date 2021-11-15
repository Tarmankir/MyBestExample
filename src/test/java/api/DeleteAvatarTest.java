package api;

import api.bodies.DeleteAvatarIncorrectDataBody;
import api.specifications.RequestSpec;
import api.specifications.ResponseSpec;
import io.qameta.allure.Step;
import org.hamcrest.core.Is;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DeleteAvatarTest {

    @Test
    @Step("Delete user avatar")
    public void deleteAvatar() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new DeleteAvatarIncorrectDataBody().deleteAvatarIncorrectDataBody())
        .when()
                .post("/tasks/rest/deleteavatar")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpec().defaultResponseSpec())
                .assertThat().body("type", Is.is("error"))
                .extract().response();

    }
}