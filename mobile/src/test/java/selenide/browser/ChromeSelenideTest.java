package selenide.browser;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideTest extends SelenideDriverWebSetup {

    @Test
    void chromeSelenideTest() {
        Configuration.baseUrl = getMobileSetting("mainURL");
        open(getMobileSetting("mainURL"));
        ChromeSelenidePage chromeSelenidePage = screen(ChromeSelenidePage.class);
        chromeSelenidePage.checkLogoIsDisplayed();
        chromeSelenidePage.checkLogoSize(16,16);
        chromeSelenidePage.clickOnSearchButton();
        ChromeSelenideSearchPage chromeSelenideSearchPage = screen(ChromeSelenideSearchPage.class);
        chromeSelenideSearchPage.enterTextInSearchField("Apple");
        chromeSelenideSearchPage.clickOnCopyLinkButton();
        chromeSelenideSearchPage.checkCopyLinkPopUp();
        executeJavaScript("window.scrollBy(0,1000)", "");
    }
}