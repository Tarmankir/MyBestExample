package selenium.browser;

import org.testng.annotations.Test;
import settings.SeleniumDriverWebSetup;

import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumLogoTest extends SeleniumDriverWebSetup {

    @Test
    public void chromeSeleniumLogoTest() {
        driver.get(getMobileSetting("mainURL"));
        ChromeSeleniumPage chromeSeleniumPage = new ChromeSeleniumPage(driver);
        chromeSeleniumPage.clickOnSearchButton();
        chromeSeleniumPage.checkLogoIsDisplayed();
        chromeSeleniumPage.checkLogoSize(16,16);
    }
}