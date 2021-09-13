package api.verifications;

import api.bodies.ErrorUserBody;
import io.qameta.allure.Step;

public class ErrorUserResponseData {

    @Step("Reference response for check user body with incorrect data")
    public ErrorUserBody response() {

        return ErrorUserBody.builder()
                .type("error")
                .message("Пользователь с таким email уже существует ")
                .build();
    }
}