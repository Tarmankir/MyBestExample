package selenide;

import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.ScreenObject.screen;


public class ChromeSelenideTest extends SelenideDriverWebSetup {

    @Test
    void openYandex() {
        open("https://habr.com/ru/all/");
        ChromeSelenidePage chromeSelenidePage = screen(ChromeSelenidePage.class);
        chromeSelenidePage.clickOnSearchButton();
    }
}