package settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static settings.SeleniumDriverCapabilities.getOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "cucumber/selenium",
        tags = "@smoke-selenium"
)

public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
//        driver = new ChromeDriver(getOptions());
    }

    @AfterClass(alwaysRun = true)
    public static void afterClass() {
        driver.quit();
    }
}