package settings;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class SeleniumDriverWebSetup {

    public AppiumDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = new AppiumDriver(new CapabilitiesSelenium().getAndroidUrl(), new CapabilitiesSelenium().getAndroidDesiredCapabilitiesWeb());
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }
}