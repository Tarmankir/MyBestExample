import entities.User;
import bodies.DataUserBody;
import bodies.RequestUserBody;
import verifications.ErrorUserResponseData;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static assertions.UserWithIncorrectDataAssertions.checkSuccessfulResponseBodyUserWithIncorrectData;
import static assertions.UserWithTasksAssertions.checkSuccessfulResponseBodyUserWithTasks;

public class CreateUserTest {

    @Test
    @Step("Check creation user with tasks")
    void createUserWithTasksTest() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithTasks();
        checkSuccessfulResponseBodyUserWithTasks(requestUserBody, new User().createUser(requestUserBody));
    }

    @Test
    @Step("Check creation full user with tasks")
    void createFullUserWithTasksTest() {
        RequestUserBody requestUserBody = new DataUserBody().userFullBodyWithTasks();
        checkSuccessfulResponseBodyUserWithTasks(requestUserBody, new User().createUser(requestUserBody));
    }

    @Test
    @Step("Check creation user with incorrect data")
    void createUserWithIncorrectDataTest() {
        RequestUserBody requestUserBody = new DataUserBody().userBodyWithIncorrectData();
        checkSuccessfulResponseBodyUserWithIncorrectData(new ErrorUserResponseData().response(), new User().createUser(requestUserBody));
    }
}