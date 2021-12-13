package selenium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.AppiumDriverSetup;
import settings.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static settings.MobileConfig.getMobileSetting;

public class ChromeMainSeleniumScreenTest extends AppiumDriverSetup {

    private AppiumDriver driver;
//    private ChromeMainSeleniumScreen chromeMainSeleniumScreen;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new URL(getMobileSetting("urlAndroid")),new DesiredCapabilities(new Capabilities().chromeMobileCapabilities()));
//        chromeMainSeleniumScreen = new ChromeMainSeleniumScreen(driver);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    public void openYandexTest() {
        driver.get("https://yandex.ru/");
    }
}