package rest;

import fakers.DataFaker;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class BugredUserCreate {

    @Step("Create request body for user registration")
    public String createBugredUserBody() {

        DataFaker dataFaker = new DataFaker();
        String email = dataFaker.generateEmail();
        String nameUser = dataFaker.generateName();

        String doRegisterBody = "{\n" +
                "  \"password\": \"foo1248345\",\n" +
                "  \"name\": " + "\"" + nameUser + "\"" + ",\n" +
                "  \"email\": " + "\"" + email + "\"" +
                "\n}";
        return doRegisterBody;
    }

    @Step("Create bugred user")
    public String bugredUserCreate() {
        return given()
                .body(createBugredUserBody())
        .when()
                .post("http://users.bugred.ru/tasks/rest/doregister/posts")
        .then()
                .statusCode(SC_OK)
                .extract().body().jsonPath().get("email");
    }
}