package selenide.browser;

import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideLogoTest extends SelenideDriverWebSetup {

    @Test
    void chromeSelenideLogoTest() {
        open(getMobileSetting("mainURL"));
        ChromeSelenidePage chromeSelenidePage = screen(ChromeSelenidePage.class);
        chromeSelenidePage.checkLogoIsDisplayed();
        chromeSelenidePage.checkLogoSize(16,16);
    }
}