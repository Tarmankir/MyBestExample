package api.responseData;

import api.requestData.ResponseCompanyBody;
import io.qameta.allure.Step;

public class CompanyResponseData {

    @Step("Reference response for check company body")
    public static ResponseCompanyBody defaultResponse() {

        return ResponseCompanyBody.builder()
                .type("success")
                .id_company(33)
                .build();
    }
}