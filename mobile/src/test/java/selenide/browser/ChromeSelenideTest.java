package selenide.browser;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.ScreenObject.screen;


public class ChromeSelenideTest extends SelenideDriverWebSetup {

    @Test(groups = {"id123"})
    void openYandex() {
        Configuration.baseUrl = "https://habr.com/ru/all/";
        open("https://habr.com/ru/all/");
        ChromeSelenidePage chromeSelenidePage = screen(ChromeSelenidePage.class);
        chromeSelenidePage.clickOnSearchButton();
        ChromeSelenideSearchPage chromeSelenideSearchPage = screen(ChromeSelenideSearchPage.class);
        chromeSelenideSearchPage.enterTextInSearchField("Apple");
        chromeSelenideSearchPage.clickOnCopyLinkButton();
    }
}