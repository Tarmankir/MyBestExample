package assertions;

import bodies.RequestUserBody;
import bodies.ResponseUserBody;
import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;

public class UserWithTasksAssertions {

    @Step("Check user response body with tasks")
    public static void checkSuccessfulResponseBodyUserWithTasks(RequestUserBody expected, ResponseUserBody actual) {
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getEmail(), actual.getEmail());
    }
}