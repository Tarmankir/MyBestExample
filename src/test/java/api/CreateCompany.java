package api;

import api.bodies.RequestCompanyBody;
import api.bodies.ResponseCompanyBody;
import com.google.gson.Gson;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static api.testData.CompanyResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

public class CreateCompany {

    @Test
    void createCompany() {

        RequestCompanyBody requestCompanyBody = new RequestCompanyBody();

        List<String> users = new ArrayList<>();
        users.add("test_anna@gmail.com");
        users.add("mrak20@list.ru");

        requestCompanyBody.setCompany_name("Тестовая компания");
        requestCompanyBody.setCompany_type("ООО");
        requestCompanyBody.setCompany_users(users);
        requestCompanyBody.setEmail_owner("test21233@mail.ru");

        ResponseCompanyBody responseCompanyBody =
                given()
                        .contentType(ContentType.JSON)
                        .body(new Gson().toJson(requestCompanyBody))
                        .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                .when()
                        .post("http://users.bugred.ru/tasks/rest/createcompany")
                .then()
                        .statusCode(SC_OK)
                        .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                        .extract().response().as(ResponseCompanyBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseCompanyBody.getType());
//        assertEquals(defaultResponse().getId_company(), responseCompanyBody.getId_company());
    }
}