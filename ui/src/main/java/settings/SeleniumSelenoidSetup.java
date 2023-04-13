package settings;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static settings.SeleniumSelenoidCapabilities.getOptionsSelenoid;
import static settings.SeleniumSelenoidCapabilities.getSelenoidUrl;

public abstract class SeleniumSelenoidSetup {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = new RemoteWebDriver(getSelenoidUrl(), (Capabilities) getOptionsSelenoid());
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}