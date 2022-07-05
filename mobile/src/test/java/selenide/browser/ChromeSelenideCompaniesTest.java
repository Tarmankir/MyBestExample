package selenide.browser;

import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideCompaniesTest extends SelenideDriverWebSetup {

    @Test
    void chromeSelenideCompaniesTest() {
        open(getMobileSetting("pageCompanies"));
        ChromeSelenideCompaniesPage chromeSelenideCompaniesPage = screen(ChromeSelenideCompaniesPage.class);
        chromeSelenideCompaniesPage.isCompaniesListContains("Facebook");
    }
}