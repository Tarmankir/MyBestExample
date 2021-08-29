package api.assertions;

import api.bodies.ResponseUserBody;
import io.qameta.allure.Step;

import static org.testng.AssertJUnit.assertEquals;

public class UserAssertions {

    @Step("Check user response body")
    public static void checkSuccessfulResponseBody(ResponseUserBody expected, ResponseUserBody actual) {
        assertEquals(expected.getType(), actual.getType());
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}