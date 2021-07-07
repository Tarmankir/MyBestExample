package api;

import api.bodies.RequestCreateUserBody;
import api.bodies.ResponseCreateUserBody;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static api.testData.CreateUserResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

public class CreateUserTest {

    @Test
    void createUser() {
        RequestCreateUserBody requestCreateUserBody = new RequestCreateUserBody();

        List<String> tasks = new ArrayList<>();
        tasks.add("12");

        List<String> companies = new ArrayList<>();
        companies.add("36");
        companies.add("37");

        requestCreateUserBody.setEmail("test_cu_6@mail.com");
        requestCreateUserBody.setName("Рест 6");
        requestCreateUserBody.setTasks(tasks);
        requestCreateUserBody.setCompanies(companies);
        requestCreateUserBody.setHobby("Стрельба из лука, Настолки");
        requestCreateUserBody.setAdres("адрес 1");
        requestCreateUserBody.setName1("Тестовый, ясен пень");
        requestCreateUserBody.setSurname1("Иванов");
        requestCreateUserBody.setFathername1("Петров");
        requestCreateUserBody.setCat("Маруся");
        requestCreateUserBody.setDog("Ушастый");
        requestCreateUserBody.setParrot("Васька");
        requestCreateUserBody.setCavy("Кто ты?");
        requestCreateUserBody.setHamster("Хомяк");
        requestCreateUserBody.setSquirrel("Белая горячка к нам пришла");
        requestCreateUserBody.setPhone("333 33 33");
        requestCreateUserBody.setInn("123456789012");
        requestCreateUserBody.setGender("m");
        requestCreateUserBody.setBirthday("01.01.1900");
        requestCreateUserBody.setDate_start("11.11.2000");

        ResponseCreateUserBody responseCreateUserBody =
        given()
                .contentType(ContentType.JSON)
                .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                .body(requestCreateUserBody)
        .when()
                .post("http://users.bugred.ru/tasks/rest/createuser")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response().as(ResponseCreateUserBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseCreateUserBody.getType());
        assertEquals(defaultResponse().getMessage(), responseCreateUserBody.getMessage());
    }
}