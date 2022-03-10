package settings;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class SelenideDriverSetup {

    private AppiumDriver driver;

    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {
        driver = PlatformSelenide.getInstance().getDriver();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}