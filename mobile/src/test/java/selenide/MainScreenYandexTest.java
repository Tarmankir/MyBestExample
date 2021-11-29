package selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.AppiumDriverSetup;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MainScreenYandexTest extends AppiumDriverSetup {

    private MainScreenYandex mainScreenYandex;

    @BeforeMethod
    public void mainScreenYandexBefore() {
        Configuration.browser = SelenideDriverSetup.class.getName();
        open();
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