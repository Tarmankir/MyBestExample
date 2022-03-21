package settings;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class SeleniumDriverWebSetup {

    public AppiumDriver driver;

    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {
        driver = new AppiumDriver(new CapabilitiesSelenium().getAndroidUrl(), new CapabilitiesSelenium().getAndroidDesiredCapabilitiesWeb());
    }

    @AfterSuite
    void afterSuite() {
        driver.quit();
    }
}