package settings;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class SelenideDriverWebSetup {

    private AppiumDriver driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        driver = PlatformSelenide.getInstance().getDriverWeb();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}