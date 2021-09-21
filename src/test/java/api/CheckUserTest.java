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

//@Listeners(ApiListener.class)
public class CheckUserTest {

    @Test
    void createUser() {

        List<String> tasks = new ArrayList<>();
        tasks.add("15");

        List<String> companies = new ArrayList<>();
        companies.add("36");
        companies.add("37");

        RequestUserBody requestUserBody = RequestUserBody.builder()
                .email("test_cu_6@mail.com")
                .name("Рест 6")
                .tasks(tasks)
                .companies(companies)
                .hobby("Стрельба из лука, Настолки")
                .adres("адрес 1")
                .name1("Тестовый, ясен пень")
                .surname1("Иванов")
                .fathername1("Петров")
                .cat("Маруся")
                .dog("Ушастый")
                .parrot("Васька")
                .cavy("Кто ты?")
                .hamster("Хомяк")
                .squirrel("Белая горячка к нам пришла")
                .phone("333 33 33")
                .inn("123456789012")
                .gender("m")
                .birthday("01.01.1900")
                .date_start("11.11.2000")
                .build();

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