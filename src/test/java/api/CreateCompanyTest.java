package api;

import api.bodies.DataCompanyBody;
import api.entities.Company;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.settings.ApiListener;

public class CreateCompanyTest {

    @Test
    @Step("Check creation company")
    void createCompany() {
        new Company().createCompany(new DataCompanyBody().fullCompanyBody());
    }
}