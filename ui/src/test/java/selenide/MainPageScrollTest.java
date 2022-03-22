package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.pages.MainPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class MainPageScrollTest extends SelenideDriverSetup {

    private MainPage mainPage;

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
    }

    @AfterMethod
    void afterMethod() {
        closeWindow();
    }

    @Test
    public void mainPageScrollTest() {
        executeJavaScript("window.scrollBy(0,1000)", "");
    }
}