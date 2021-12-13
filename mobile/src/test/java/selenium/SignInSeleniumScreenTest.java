package selenium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.ActionsWithDviceSelenium;
import settings.AppiumDriverSetup;
import settings.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static settings.Credentials.TEST_USER_1;
import static settings.MobileConfig.getMobileSetting;

public class SignInSeleniumScreenTest extends AppiumDriverSetup {

    private AppiumDriver driver;
    private SignInSeleniumScreen signInSeleniumScreen;
    private MainSeleniumScreen mainSeleniumScreen;
    private AppMenuSeleniumScreen appMenuSeleniumScreen;
    private ActionsWithDviceSelenium actionsWithDviceSelenium;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new URL(getMobileSetting("urlAndroid")),new DesiredCapabilities(new Capabilities().androidCapabilities()));
        signInSeleniumScreen = new SignInSeleniumScreen(driver);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    public void signInScreenTest() {
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
        mainSeleniumScreen = new MainSeleniumScreen(driver);
        mainSeleniumScreen.openAppMenu();
        appMenuSeleniumScreen = new AppMenuSeleniumScreen(driver);
        appMenuSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
        actionsWithDviceSelenium = new ActionsWithDviceSelenium(driver);
        actionsWithDviceSelenium.clickOnDeviceButtonBack();
    }
}