package api;

import api.bodies.DataCompanyBody;
import api.bodies.ResponseCompanyBody;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static api.verifications.CompanyResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

@Listeners(ApiListener.class)
public class CreateCompanyTest {

    //todo add json schema validation https://github.com/rest-assured/rest-assured/wiki/Usage#json-schema-validation

    @Test
    @Step("Check company with full body request")
    void createCompany() {
        new DataCompanyBody().fullCompanyBody();
        ResponseCompanyBody responseCompanyBody =
                given()
                        .contentType(ContentType.JSON)
                        .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                        .body(new Gson().toJson(new DataCompanyBody().fullCompanyBody()))
                .when()
                        .post("http://users.bugred.ru/tasks/rest/createcompany")
                .then()
                        .statusCode(SC_OK)
                        .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                        .extract().response().as(ResponseCompanyBody.class, ObjectMapperType.GSON);
        assertEquals(defaultResponse().getType(), responseCompanyBody.getType());
    }
}