package api;

import api.bodies.QuickSearchBody;
import api.schemes.QuickSearchScheme;
import api.specifications.RequestSpec;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class QuickSearchTest {

    @Test
    @Step("Check company search")
    public void quickSearchCompany() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new QuickSearchBody().quickSearchBody())
        .when()
                .post("/tasks/rest/magicsearch")
        .then()
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .assertThat().body(matchesJsonSchema(new QuickSearchScheme().CheckQuickSearchBody()));
    }
}