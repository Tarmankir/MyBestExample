package selenium;

import io.appium.java_client.AppiumDriver;
import selenium.screens.MainScreen;
import settings.AppiumDriverSetup;
import settings.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static selenium.enums.Credentials.*;
import static settings.MobileConfig.getMobileSetting;

public class MainScreenTest extends AppiumDriverSetup {

    private AppiumDriver driver;
    private MainScreen mainScreen;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new URL(getMobileSetting("urlAndroid")),new DesiredCapabilities(new Capabilities().androidCapabilities()));
        mainScreen = new MainScreen(driver);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    public void mainScreenTest() {
        mainScreen.loginInApp(TEST);
        mainScreen.clickSignInButton();
    }
}