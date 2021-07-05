package api;

import api.bodies.RequestCreateUserBody;
import api.bodies.ResponseCreateUserBody;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.Test;

import static api.testData.CreateUserResponseData.defaultResponse;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.AssertJUnit.assertEquals;

public class CreateUserTest {

    @Test
    void createUser() {
        RequestCreateUserBody requestCreateUserBody = new RequestCreateUserBody();

        requestCreateUserBody.setEmail("test_cu_6@mail.com");
        requestCreateUserBody.setName("Yunni");
        requestCreateUserBody.setTasks("Тестировать");
        requestCreateUserBody.setCompanies("Рогаикопыта");
        requestCreateUserBody.setHobby("swim");
        requestCreateUserBody.setAdres("SpB, Nevsky 18");
        requestCreateUserBody.setName1("Alex");
        requestCreateUserBody.setSurname1("Pushkin");
        requestCreateUserBody.setFathername1("Serg");
        requestCreateUserBody.setCat("Murka");
        requestCreateUserBody.setDog("Lara");
        requestCreateUserBody.setParrot("Kakadu");
        requestCreateUserBody.setCavy("Doss");
        requestCreateUserBody.setHamster("Moss");
        requestCreateUserBody.setSquirrel("Anss");
        requestCreateUserBody.setPhone("89992077778");
        requestCreateUserBody.setInn("12332144458");
        requestCreateUserBody.setGender("m");
        requestCreateUserBody.setBirthday("18");
        requestCreateUserBody.setDate_start("19");

        ResponseCreateUserBody responseCreateUserBody =
        given()
                .contentType(ContentType.JSON)
                .body(requestCreateUserBody)
                .spec(new RequestSpecBuilder().log(LogDetail.ALL).build())
        .when()
                .post("http://users.bugred.ru/tasks/rest/createuser")
        .then()
                .statusCode(SC_OK)
                .spec(new ResponseSpecBuilder().log(LogDetail.ALL).build())
                .extract().response().as(ResponseCreateUserBody.class, ObjectMapperType.GSON);

        assertEquals(defaultResponse().getEmail(), responseCreateUserBody.getEmail());
    }
}