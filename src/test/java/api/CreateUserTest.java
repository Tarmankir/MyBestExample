package api;

import api.requestData.DataUserBody;
import api.requestData.ResponseUserBody;
import api.responseData.UserResponseData;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

import static api.assertData.UserAssertions.checkSuccessfulResponseBody;

@Listeners(ApiListener.class)
public class CreateUserTest {

    @Test
    @Step("Check user with full body request")
    void createUserFull() {
        new DataUserBody().fullUserBody();
        ResponseUserBody responseUserBody = new UserResponseData().defaultResponse();
        checkSuccessfulResponseBody(responseUserBody, responseUserBody);
    }

    @Test
    @Step("Check user with simple body request")
    void createUserSimple() {
        new DataUserBody().simpleUserBody();
        ResponseUserBody responseUserBody = new UserResponseData().defaultResponse();
        checkSuccessfulResponseBody(responseUserBody, responseUserBody);
    }
}