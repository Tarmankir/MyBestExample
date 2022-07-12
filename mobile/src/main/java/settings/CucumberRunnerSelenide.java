package settings;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "cucumber/selenide",
        tags = "@TC-1-selenide-mobile"
)

public class CucumberRunnerSelenide extends AbstractTestNGCucumberTests {

    private AppiumDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws MalformedURLException {
        driver = CapabilitiesSelenide.getDriver();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        driver.closeApp();
    }
}