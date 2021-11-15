package entities;

import bodies.RequestCompanyBody;
import specifications.RequestSpec;
import specifications.ResponseSpec;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class Company {

    @Step("Check company with full body request")
    public void createCompany(RequestCompanyBody body) {
                given()
                        .contentType(ContentType.JSON)
                        .spec(new RequestSpec().defaultRequestSpec())
                        .body(body)
                .when()
                        .post("/tasks/rest/createcompany")
                .then()
                        .spec(new ResponseSpec().defaultResponseSpec())
                        .assertThat().body(matchesJsonSchema(new File("src/test/resources/schemes/CheckCreationCompany.json")));
    }
}