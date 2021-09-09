package api.bodies;

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