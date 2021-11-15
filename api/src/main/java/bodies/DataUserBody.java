package bodies;

import io.qameta.allure.Step;
import utils.DataFaker;

import java.util.ArrayList;
import java.util.List;

public class DataUserBody {

    DataFaker dataFaker = new DataFaker();
    String email = dataFaker.generateEmail();
    String nameUser = dataFaker.generateName();

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

    @Step("Create full user with tasks")
    public RequestUserBody userFullBodyWithTasks() {

        List<TaskBody> tasks = new ArrayList<>();
        tasks.add(TaskBody.builder()
                .title("Первая задача")
                .description("Тестовое описание задачи")
                .build());

        return RequestUserBody.builder()
                .email(email)
                .name(nameUser)
                .tasks(tasks)
                .hobby("Стрельба из лука, Настолки")
                .adres("Улица Пушкина, дом Колотушкина")
                .name1("Иван")
                .surname1("Иванов")
                .fathername1("Иван")
                .cat("Мася")
                .dog("Шарик")
                .parrot("Петя")
                .cavy("Аша")
                .hamster("Хах")
                .squirrel("Турт")
                .phone("555 55 55")
                .gender("m")
                .birthday("11.11.1988")
                .date_start("11.11.2000")
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