package selenium.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import settings.SeleniumDriverWebSetup;

import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumTest extends SeleniumDriverWebSetup {

    private ChromeSeleniumPage chromeSeleniumPage;
    private ChromeSeleniumSearchPage chromeSeleniumSearchPage;

    @Test
    public void chromeSeleniumTest() {
        driver.get(getMobileSetting("mainURL"));
        chromeSeleniumPage = new ChromeSeleniumPage(driver);
        chromeSeleniumPage.clickOnSearchButton();
        chromeSeleniumPage.checkLogoIsDisplayed();
        chromeSeleniumPage.checkLogoSize(16,16);
        chromeSeleniumSearchPage = new ChromeSeleniumSearchPage(driver);
        chromeSeleniumSearchPage.enterTextInSearchField("Linux");
        chromeSeleniumSearchPage.clickOnCopyLinkButton();
        chromeSeleniumSearchPage.checkCopyLinkPopUp();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
    }
}