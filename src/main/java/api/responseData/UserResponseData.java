package api.responseData;

import api.requestData.ResponseUserBody;
import io.qameta.allure.Step;

public class UserResponseData {

    @Step("Reference response for check user body")
    public ResponseUserBody defaultResponse() {

        return ResponseUserBody.builder()
                .type("error")
                .message("Пользователь с таким email уже существует")
                .build();
    }
}