package api.etalons;

import api.bodies.EtalonUserBody;
import io.qameta.allure.Step;

public class EtalonUserResponseData {

    @Step("Reference response for check user body")
    public EtalonUserBody defaultResponse() {

        return EtalonUserBody.builder()
                .type("error")
                .message("компании не найдены")
                .build();
    }
}