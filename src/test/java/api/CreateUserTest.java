package api;

import api.bodies.VerificationUserBody;
import api.entities.User;
import api.bodies.DataUserBody;
import api.bodies.RequestUserBody;
import api.bodies.ResponseUserBody;
import api.verifications.VerificationUserResponseData;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static api.assertions.UserWithIncorrectDataAssertions.checkSuccessfulResponseBodyUserWithIncorrectData;
import static api.assertions.UserWithTasksAssertions.checkSuccessfulResponseBodyUserWithTasks;

@Listeners(ApiListener.class)
public class CreateUserTest {

    @Test
    @Step("Check creation user with tasks")
    void createUserWithTasks() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithTasks();
        ResponseUserBody responseUserBody = new User().createUser(requestUserBody);
        checkSuccessfulResponseBodyUserWithTasks(requestUserBody, responseUserBody);
    }

    @Test
    @Step("Check creation user with incorrect data")
    void createUserWithIncorrectData() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithIncorrectData();
        ResponseUserBody responseUserBody = new User().createUser(requestUserBody);
        VerificationUserBody verificationUserBody = new VerificationUserResponseData().response();
        checkSuccessfulResponseBodyUserWithIncorrectData(verificationUserBody, responseUserBody);
    }
}