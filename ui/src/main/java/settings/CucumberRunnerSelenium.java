package settings;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static settings.SeleniumDriverCapabilities.getOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "cucumber/selenium",
        tags = "@TC-4"
)

public abstract class CucumberRunnerSelenium {

    public static WebDriver driver;

    @Before
    public static void beforeClass() {
        driver = new ChromeDriver(getOptions());
    }

    @After
    public static void afterClass() {
        driver.quit();
    }
}