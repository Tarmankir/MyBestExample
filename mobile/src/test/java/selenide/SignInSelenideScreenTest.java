package selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;

public class SignInSelenideScreenTest extends SelenideDriverSetup {

//    private SignInSelenideScreen mainScreenYandex;

    @BeforeMethod
    public void mainScreenYandexBefore() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = SelenideDriverSetup.class.getName();
        Configuration.timeout=20000;
        Configuration.startMaximized = false;
        open();
//        mainScreenYandex = page(SignInSelenideScreen.class);
    }

    @AfterMethod
    void afterMethod() {
        closeWebDriver();
    }

    @Test
    public void mainScreenTest() {
//        mainScreenYandex.clickLogin();
        $(By.xpath("//*[@resource-id='login']")).setValue("ivakidov@ro.ru");
    }
}