package selenium.browser;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.SeleniumDriverSetup;
import settings.CapabilitiesSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumTest extends SeleniumDriverSetup {

    private AppiumDriver driver;
    private ChromeSeleniumPage chromeSeleniumPage;
    private ChromeSeleniumSearchPage chromeSeleniumSearchPage;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new URL(getMobileSetting("urlAndroid")),new DesiredCapabilities(new CapabilitiesSelenium().getAndroidDesiredCapabilitiesWeb()));
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    public void chromeSeleniumTest() {
        driver.get("https://habr.com/ru/all/");
        chromeSeleniumPage = new ChromeSeleniumPage(driver);
        chromeSeleniumPage.clickOnSearchButton();
        chromeSeleniumSearchPage = new ChromeSeleniumSearchPage(driver);
        chromeSeleniumSearchPage.enterTextInSearchField("Linux");
        chromeSeleniumSearchPage.clickOnCopyLinkButton();
    }
}