package selenium.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import settings.SeleniumDriverWebSetup;

import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumSearchTest extends SeleniumDriverWebSetup {

    @Test
    public void chromeSeleniumSearchTest() {
        driver.get(getMobileSetting("mainURL"));
        ChromeSeleniumPage chromeSeleniumPage = new ChromeSeleniumPage(driver);
        chromeSeleniumPage.clickOnSearchButton();
        ChromeSeleniumSearchPage chromeSeleniumSearchPage = new ChromeSeleniumSearchPage(driver);
        chromeSeleniumSearchPage.enterTextInSearchField("Linux");
        chromeSeleniumSearchPage.clickOnCopyLinkButton();
        chromeSeleniumSearchPage.checkCopyLinkPopUp();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
    }
}