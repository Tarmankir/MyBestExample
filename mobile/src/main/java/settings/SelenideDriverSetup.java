package settings;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public abstract class SelenideDriverSetup {

    private AppiumDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = CapabilitiesSelenide.getDriver();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.closeApp();
    }
}