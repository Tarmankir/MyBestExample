package api;

import api.specifications.RequestSpec;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class QuickSearchTest {

    Map<String, Object> requestBody = new HashMap<>();

    @BeforeMethod
    public void quickSearchBefore() {
        requestBody.put("query", "Ромашка");
    }

    @Test
    @Step("Check company search")
    public void quickSearchCompany() {
        given()
                .spec(new RequestSpec().defaultRequestSpec())
                .body(new Gson().toJson(requestBody))
        .when()
                .post("/tasks/rest/magicsearch")
        .then()
                .statusCode(230)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response();
    }
}