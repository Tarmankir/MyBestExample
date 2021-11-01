package mobile;

import io.appium.java_client.AppiumDriver;
import mobile.screens.MainScreen;
import mobile.settings.AppiumDriverSetup;
import mobile.settings.Capabilities;
import mobile.settings.Config;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainScreenTest extends AppiumDriverSetup {

    private AppiumDriver driver;
    private MainScreen mainScreen;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new DesiredCapabilities(new Capabilities().androidCapabilities()));
        mainScreen = initElements(driver, MainScreen.class);
        driver.get(Config.getSetting("urlAndroid"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void mainScreenTest() {
        mainScreen.clickLogin();
    }
}