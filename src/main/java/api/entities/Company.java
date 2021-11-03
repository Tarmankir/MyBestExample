package api.entities;

import api.bodies.RequestCompanyBody;
import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class Company {

    @Step("Check company with full body request")
    public void createCompany(RequestCompanyBody body) {
                given()
                        .contentType(ContentType.JSON)
                        .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                        .body(body)
                .when()
                        .post("http://users.bugred.ru/tasks/rest/createcompany")
                .then()
                        .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                        .assertThat().body(matchesJsonSchema(new File("src/test/resources/schemes/CheckCreationCompany.json")));
    }
}