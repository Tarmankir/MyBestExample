package selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;

public class SignInSelenideScreenTest extends SelenideDriverSetup {

    private SignInSelenideScreen mainScreenYandex;

    @BeforeMethod
    public void mainScreenYandexBefore() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = SelenideDriverSetup.class.getName();
        open();
        mainScreenYandex = page(SignInSelenideScreen.class);
        Configuration.timeout=20000;
    }

    @AfterMethod
    void afterMethod() {
        closeWebDriver();
    }

    @Test
    public void mainScreenTest() {
        mainScreenYandex.clickLogin();
    }
}