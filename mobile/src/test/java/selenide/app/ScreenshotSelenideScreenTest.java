package selenide.app;

import actions.ActionsWithDeviceSelenide;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.Credentials.TEST_USER_1;

public class ScreenshotSelenideScreenTest extends SelenideDriverSetup {

    @Test
    public void screenshotSelenideScreenTest() {
        SignInSelenideScreen signInSeleniumScreen = screen(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        ActionsWithDeviceSelenide actionsWithDeviceSelenide = screen(ActionsWithDeviceSelenide.class);
        actionsWithDeviceSelenide.takeScreenshot();
    }
}