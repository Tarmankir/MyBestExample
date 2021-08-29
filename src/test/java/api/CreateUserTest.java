package api;

import api.entities.User;
import api.bodies.DataUserBody;
import api.bodies.RequestUserBody;
import api.bodies.ResponseUserBody;
import api.etalons.UserResponseData;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static api.assertions.UserAssertions.checkSuccessfulResponseBody;

@Listeners(ApiListener.class)
public class CreateUserTest {

    @Test
    @Step("Check user with full body request")
    void createUserFull() {
        RequestUserBody dataUserBody = new DataUserBody().fullUserBody();
        ResponseUserBody responseUserBody = new UserResponseData().defaultResponse();
        new User().createUser(dataUserBody);
        checkSuccessfulResponseBody(responseUserBody, responseUserBody);
    }

    @Test
    @Step("Check user with simple body request")
    void createUserSimple() {
        RequestUserBody dataUserBody = new DataUserBody().simpleUserBody();
        ResponseUserBody responseUserBody = new UserResponseData().defaultResponse();
        new User().createUser(dataUserBody);
        checkSuccessfulResponseBody(responseUserBody, responseUserBody);
    }

    /*@Test
    @Step("Check user with task")
    void createUserWithTask() {
        RequestUserBody dataUserBody = new DataUserBody().userBodyWithTask();
        ResponseUserBody responseUserBody = new UserResponseData().defaultResponse();
        new User().createUser(dataUserBody);
    }*/
}