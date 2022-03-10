import bodies.DataCompanyBody;
import entities.Company;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class CreateCompanyTest {

    @Test
    @Step("Check creation company")
    void createCompanyTest() {
        new Company().createCompany(new DataCompanyBody().fullCompanyBody());
    }
}