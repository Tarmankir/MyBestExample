package settings;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static settings.CapabilitiesSelenium.getAndroidDesiredCapabilitiesWeb;
import static settings.CapabilitiesSelenium.getAndroidUrl;

public class SeleniumDriverWebSetup {

    public AppiumDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilitiesWeb());
    }

    @AfterMethod
    public void afterMethod() {
        driver.closeApp();
    }
}