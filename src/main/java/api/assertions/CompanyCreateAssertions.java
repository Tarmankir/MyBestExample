package api.assertions;

import api.bodies.RequestCompanyBody;
import api.bodies.ResponseCompanyBody;
import io.qameta.allure.Step;

import static org.testng.AssertJUnit.assertEquals;

public class CompanyCreateAssertions {

    @Step("Check company response body")
    public static void checkSuccessfulResponseBodyCompany(RequestCompanyBody expected, ResponseCompanyBody actual) {
        assertEquals(expected.getCompany_name(), actual.getCompany().getName());
        assertEquals(expected.getCompany_type(), actual.getCompany().getType());
    }
}