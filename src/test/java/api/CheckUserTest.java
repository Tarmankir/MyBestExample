package api;

import api.bodies.RequestUserBody;
import api.bodies.ResponseUserBody;
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

import static api.testData.UserResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

@Listeners(ApiListener.class)
public class CheckUserTest {

    @Test
    void createUser() {
        RequestUserBody requestUserBody = new RequestUserBody();

        List<String> tasks = new ArrayList<>();
        tasks.add("12");

        List<String> companies = new ArrayList<>();
        companies.add("36");
        companies.add("37");

        requestUserBody.setEmail("test_cu_6@mail.com");
        requestUserBody.setName("Рест 6");
        requestUserBody.setTasks(tasks);
        requestUserBody.setCompanies(companies);
        requestUserBody.setHobby("Стрельба из лука, Настолки");
        requestUserBody.setAdres("адрес 1");
        requestUserBody.setName1("Тестовый, ясен пень");
        requestUserBody.setSurname1("Иванов");
        requestUserBody.setFathername1("Петров");
        requestUserBody.setCat("Маруся");
        requestUserBody.setDog("Ушастый");
        requestUserBody.setParrot("Васька");
        requestUserBody.setCavy("Кто ты?");
        requestUserBody.setHamster("Хомяк");
        requestUserBody.setSquirrel("Белая горячка к нам пришла");
        requestUserBody.setPhone("333 33 33");
        requestUserBody.setInn("123456789012");
        requestUserBody.setGender("m");
        requestUserBody.setBirthday("01.01.1900");
        requestUserBody.setDate_start("11.11.2000");

        ResponseUserBody responseUserBody =
        given()
                .contentType(ContentType.JSON)
                .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
                .body(requestUserBody)
        .when()
                .post("http://users.bugred.ru/tasks/rest/createuser")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response().as(ResponseUserBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getType(), responseUserBody.getType());
        assertEquals(defaultResponse().getMessage(), responseUserBody.getMessage());
    }
}