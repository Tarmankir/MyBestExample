package settings;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class SelenideDriverWebSetup {

    private AppiumDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = CapabilitiesSelenide.getDriverWeb();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}