package api;

import api.entities.Avatar;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.io.File;

public class AddAvatarTest {

    @Test
    @Step("Check add avatar")
    void checkAddAvatar() {
        new Avatar().addAvatar(new File("src/test/resources/files/avatar.png"), "superhero@aa.ru");
    }
}