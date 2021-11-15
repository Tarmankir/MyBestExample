package api;

import api.entities.Avatar;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class AddAvatarTest {

    @DataProvider(name = "addAvatarProvider")
    public Object[][] avatarDataProvider(){
        return new Object[][] {
                {"src/test/resources/files/avatar.png", "superhero@aa.ru"},
                {"src/test/resources/files/avatar2.jpg", "superhero@aa.ru"},
        };
    }

    @Test(dataProvider = "addAvatarProvider")
    @Step("Check add avatar")
    void checkAddAvatar(String avatarFileName, String avatarEmail) {
        new Avatar().addAvatar(new File(avatarFileName), avatarEmail);
    }
}