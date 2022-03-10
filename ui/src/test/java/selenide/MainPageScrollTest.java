package selenide;

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
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
//        Configuration.pageLoadTimeout = 30;
    }

    @AfterMethod
    void afterMethod() {
        closeWindow();
    }

    @Test(groups = {"Smoke"})
    public void mainPageScrollTest() {
        executeJavaScript("window.scrollBy(0,1000)", "");
    }
}