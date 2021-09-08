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

import static api.assertions.UserAssertions.checkSuccessfulResponseBody;

@Listeners(ApiListener.class)
public class CreateUserTest {

    @Test
    @Step("Check creation user with tasks")
    void createUserWithTasks() {
        RequestUserBody dataUserBody = new DataUserBody().userBodyWithTasks();
        ResponseUserBody responseUserBody = new User().createUser(dataUserBody);
        new User().createUser(dataUserBody);
//        checkSuccessfulResponseBody(responseUserBody, responseUserBody);
    }

    @Test
    @Step("Check creation user with incorrect data")
    void createUserWithIncorrectData() {
        RequestUserBody dataUserBody = new DataUserBody().userBodyWithIncorrectData();
        ResponseUserBody responseUserBody = new User().createUser(dataUserBody);
        VerificationUserBody verificationUserBody = new VerificationUserResponseData().response();
        checkSuccessfulResponseBody(verificationUserBody, responseUserBody);
    }
}