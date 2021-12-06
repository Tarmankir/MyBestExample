package selenium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.AppiumDriverSetup;
import settings.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static settings.Credentials.TEST_USER_1;
import static settings.MobileConfig.getMobileSetting;

public class SignInSeleniumScreenTest extends AppiumDriverSetup {

    private AppiumDriver driver;
    private SignInSeleniumScreen signInSeleniumScreen;
    private MainSeleniumScreen mainSeleniumScreen;
    private AppMenuSeleniumScreen appMenuSeleniumScreen;

    @BeforeMethod
    public void driverSet() throws MalformedURLException {
        driver = new AppiumDriver(new URL(getMobileSetting("urlAndroid")),new DesiredCapabilities(new Capabilities().androidCapabilities()));
        signInSeleniumScreen = new SignInSeleniumScreen(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    public void signInScreenTest() {
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
//        signInSeleniumScreen.openAppMenu();
        mainSeleniumScreen.openAppMenu();
//        signInSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
        appMenuSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
    }
}