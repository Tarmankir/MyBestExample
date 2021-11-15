package verifications;

import bodies.CompanyBody;
import bodies.ResponseCompanyBody;

import io.qameta.allure.Step;

import java.util.Collections;

public class CompanyResponseData {

    @Step("Reference response for check company body")
    public static ResponseCompanyBody defaultResponse() {

        return ResponseCompanyBody.builder()
                .type("success")
                .company(CompanyBody.builder()
                        .type("ООО")
                        .users(Collections.singletonList("superhero@aa.ru"))
                        .build())
                .build();
    }
}