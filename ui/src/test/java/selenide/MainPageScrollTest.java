package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import selenide.pages.MainPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class MainPageScrollTest extends SelenideDriverSetup {

    private MainPage mainPage;

    @Test
    public void mainPageScrollTest() {
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        executeJavaScript("window.scrollBy(0,1000)", "");
    }
}