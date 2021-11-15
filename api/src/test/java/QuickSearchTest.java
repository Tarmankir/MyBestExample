import bodies.QuickSearchBody;
import specifications.RequestSpec;
import specifications.ResponseSpec;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.io.File;

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
                .spec(new ResponseSpec().defaultResponseSpec())
                .assertThat().body(matchesJsonSchema(new File("src/test/resources/schemes/CheckQuickSearch.json")));
    }
}