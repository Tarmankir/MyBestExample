package settings;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static settings.CapabilitiesSelenium.getAndroidDesiredCapabilities;
import static settings.CapabilitiesSelenium.getAndroidUrl;

public class SeleniumDriverSetup {

    public AppiumDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilities());
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}