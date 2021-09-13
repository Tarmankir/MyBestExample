package api.entities;

import api.bodies.RequestCompanyBody;
import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Company {

    //todo add json schema validation https://github.com/rest-assured/rest-assured/wiki/Usage#json-schema-validation

    @Step("Check company with full body request")
    public void createCompany(RequestCompanyBody body) {
                given()
                        .contentType(ContentType.JSON)
                        .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                        .body(body)
                .when()
                        .post("http://users.bugred.ru/tasks/rest/createcompany")
                .then()
                        .assertThat().body(matchesJsonSchemaInClasspath("/src/test/resources/CompanySchema.json"));
    }
}