package api;

import api.bodies.RequestCompanyBody;
import api.bodies.ResponseCompanyBody;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import java.util.ArrayList;
import java.util.List;

import static api.testData.CompanyResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

@Listeners(ApiListener.class)
public class CheckCompanyTest {

    @Test
    void createCompany() {

        //todo implement interfaces for faker
        Faker faker = new Faker();
        String title = faker.name().title();
        String email1 = faker.name().username() + "@mail.ru";
        String email2 = faker.name().username() + "@mail.ru";

        List<String> users = new ArrayList<>();
        users.add(email1);
        users.add(email2);

        RequestCompanyBody requestCompanyBody = new RequestCompanyBody();

        requestCompanyBody.setCompany_name(title);
        requestCompanyBody.setCompany_type("ООО");
        requestCompanyBody.setCompany_users(users);
        requestCompanyBody.setEmail_owner("aa+1@mail.com");

        ResponseCompanyBody responseCompanyBody =
                given()
                        .contentType(ContentType.JSON)
                        .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                        .body(new Gson().toJson(requestCompanyBody))
                .when()
                        .post("http://users.bugred.ru/tasks/rest/createcompany")
                .then()
                        .statusCode(SC_OK)
                        .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                        .extract().response().as(ResponseCompanyBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseCompanyBody.getType());
        assertEquals(defaultResponse().getMessage(), responseCompanyBody.getMessage());
    }
}