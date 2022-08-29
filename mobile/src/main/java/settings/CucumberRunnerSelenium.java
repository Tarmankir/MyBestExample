package settings;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

import static settings.CapabilitiesSelenium.getAndroidDesiredCapabilities;
import static settings.CapabilitiesSelenium.getAndroidUrl;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "cucumber/selenium",
        tags = "@smoke-selenium-mobile"
)

public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() throws MalformedURLException {
        driver = new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilities());
    }

    @AfterClass(alwaysRun = true)
    public static void afterClass() {
        driver.quit();
    }
}