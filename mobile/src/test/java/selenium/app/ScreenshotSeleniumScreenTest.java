package selenium.app;

import actions.ActionsWithDeviceSelenium;
import org.testng.annotations.Test;
import settings.SeleniumDriverSetup;

import java.io.IOException;

import static settings.Credentials.TEST_USER_1;

public class ScreenshotSeleniumScreenTest extends SeleniumDriverSetup {

    @Test
    public void screenshotSeleniumScreenTest() throws IOException {
        SignInSeleniumScreen signInSeleniumScreen = new SignInSeleniumScreen(driver);
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        ActionsWithDeviceSelenium actionsWithDeviceSelenium = new ActionsWithDeviceSelenium(driver);
        actionsWithDeviceSelenium.takeScreenshot();
    }
}