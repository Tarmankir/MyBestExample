package settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static settings.SeleniumDriverCapabilities.getOptions;

@CucumberOptions(features = "featureFiles", glue = "ui/cucumber/selenium", tags = "@TC-76844")
public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {

    private TestNGCucumberRunner testNGCucumberRunner;

    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        driver = new ChromeDriver(getOptions());
        WebDriverManager.chromedriver().setup();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}