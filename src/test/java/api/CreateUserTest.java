package api;

import api.entities.User;
import api.bodies.DataUserBody;
import api.bodies.RequestUserBody;
import api.verifications.ErrorUserResponseData;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static api.assertions.UserWithIncorrectDataAssertions.checkSuccessfulResponseBodyUserWithIncorrectData;
import static api.assertions.UserWithTasksAssertions.checkSuccessfulResponseBodyUserWithTasks;

public class CreateUserTest {

    @Test
    @Step("Check creation user with tasks")
    void createUserWithTasks() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithTasks();
        checkSuccessfulResponseBodyUserWithTasks(requestUserBody, new User().createUser(requestUserBody));
    }

    @Test
    @Step("Check creation full user with tasks")
    void createFullUserWithTasks() {
        RequestUserBody requestUserBody = new DataUserBody().userFullBodyWithTasks();
        checkSuccessfulResponseBodyUserWithTasks(requestUserBody, new User().createUser(requestUserBody));
    }

    @Test
    @Step("Check creation user with incorrect data")
    void createUserWithIncorrectData() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithIncorrectData();
        checkSuccessfulResponseBodyUserWithIncorrectData(new ErrorUserResponseData().response(), new User().createUser(requestUserBody));
    }
}