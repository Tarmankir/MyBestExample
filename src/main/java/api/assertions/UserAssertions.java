package api.assertions;

import api.bodies.DataUserBody;
import api.bodies.EtalonUserBody;
import api.bodies.ResponseUserBody;
import io.qameta.allure.Step;

import static org.testng.AssertJUnit.assertEquals;

public class UserAssertions {

    @Step("Check user response body")
    public static void checkSuccessfulResponseBody(ResponseUserBody expected, EtalonUserBody actual) {
        assertEquals(expected.getType(), actual.getType());
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}