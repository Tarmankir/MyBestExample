package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenide.pages.MainPage;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class MainPageScrollTest {

    private MainPage mainPage;

    @BeforeClass
    public void mainPageBefore() {
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        Configuration.pageLoadTimeout = 30;
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test(groups = {"Smoke"})
    public void mainPageScrollTest() {
        executeJavaScript("window.scrollBy(0,1000)", "");
    }
}