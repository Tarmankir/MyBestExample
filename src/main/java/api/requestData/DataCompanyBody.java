package api.requestData;

import io.qameta.allure.Step;
import ui.settings.DataFaker;

import java.util.ArrayList;
import java.util.List;

public class DataCompanyBody {

    DataFaker dataFaker = new DataFaker();
    String companyName = dataFaker.generateTitle();

    @Step("Create company with full body request")
    public RequestCompanyBody fullCompanyBody() {

        List<String> users = new ArrayList<>();
        users.add("superhero@aa.ru");
        users.add("superhero@aa.ru");

        return RequestCompanyBody.builder()
                .company_name(companyName)
                .company_type("ООО")
                .company_users(users)
                .email_owner("aa+1@mail.com")
                .build();
    }
}