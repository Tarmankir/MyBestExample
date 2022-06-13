package selenide.app;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.appium.ScreenObject.screen;

public class SberButtonSelenideTest extends SelenideDriverSetup {

    @Test
    public void sberButtonSelenideTest() {
        SignInSelenideScreen signInSeleniumScreen = screen(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
        signInSeleniumScreen.checkSberButton("Войти по Сбер ID");
    }
}