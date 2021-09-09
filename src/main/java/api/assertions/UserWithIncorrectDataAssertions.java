package api.assertions;

import api.bodies.VerificationUserBody;
import api.bodies.ResponseUserBody;
import io.qameta.allure.Step;

import static org.testng.AssertJUnit.assertEquals;

public class UserWithIncorrectDataAssertions {

    @Step("Check user response body with incorrect data")
    public static void checkSuccessfulResponseBodyUserWithIncorrectData(VerificationUserBody expected, ResponseUserBody actual) {
        assertEquals(expected.getType(), actual.getType());
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}