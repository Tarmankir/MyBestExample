package settings;

import com.codeborne.selenide.Configuration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWindow;
import static settings.SelenideSelenoidCapabilities.getSelenoidCapabilities;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "cucumber/selenide",
        tags = "@smoke-selenide"
)

public class CucumberRunnerSelenide extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
        Configuration.pageLoadTimeout = 300000;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = getSelenoidCapabilities();
    }

    @AfterClass(alwaysRun = true)
    public static void afterClass() {
        closeWindow();
    }
}