package api.verifications;

import api.bodies.VerificationUserBody;
import io.qameta.allure.Step;

public class VerificationUserResponseData {

    @Step("Reference response for check user body with incorrect data")
    public VerificationUserBody response() {

        return VerificationUserBody.builder()
                .type("error")
                .message("Пользователь с таким email уже существует ")
                .build();
    }
}