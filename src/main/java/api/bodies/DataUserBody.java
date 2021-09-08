package api.bodies;

import io.qameta.allure.Step;
import utils.DataFaker;

import java.util.ArrayList;
import java.util.List;

public class DataUserBody {

    DataFaker dataFaker = new DataFaker();
    String email = dataFaker.generateEmail();
    String nameUser = dataFaker.generateName();

/*    @Step("Create user with full body request")
    public RequestUserBody fullUserBody() {

        List<String> tasks = new ArrayList<>();
        tasks.add(companyName);

        List<String> companies = new ArrayList<>();
        companies.add(companyName);
        companies.add(companyName);

        return RequestUserBody.builder()
                .email(email)
                .name(nameUser)
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
    }*/

    @Step("Create user with tasks")
    public RequestUserBody userBodyWithTasks() {

        List<TaskBody> tasks = new ArrayList<>();
        tasks.add(TaskBody.builder()
                .title("Первая задача")
                .description("Тестовое описание задачи")
                .build());

        return RequestUserBody.builder()
                .email(email)
                .name(nameUser)
                .tasks(tasks)
                .build();
    }

    @Step("Create user with incorrect data in body request")
    public RequestUserBody userBodyWithIncorrectData() {

        List<TaskBody> tasks = new ArrayList<>();
        tasks.add(TaskBody.builder()
                .title("Первая задача")
                .description("Тестовое описание задачи")
                .build());

        return RequestUserBody.builder()
                .email("aa+1@mail.com")
                .name(nameUser)
                .tasks(tasks)
                .build();
    }
}