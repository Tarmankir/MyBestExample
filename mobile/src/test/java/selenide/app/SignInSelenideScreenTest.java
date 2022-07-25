package selenide.app;

import actions.ActionsWithDeviceSelenide;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.Credentials.TEST_USER_1;

public class SignInSelenideScreenTest extends SelenideDriverSetup {

    @Test
    public void mainScreenTest() throws InterruptedException {
        Thread.sleep(10000);
        SignInSelenideScreen signInSeleniumScreen = screen(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
        MainSelenideScreen mainSelenideScreen = screen(MainSelenideScreen.class);
        mainSelenideScreen.openAppMenu();
        AppMenuSelenideScreen appMenuSelenideScreen = screen(AppMenuSelenideScreen.class);
        appMenuSelenideScreen.checkUserLoginName("ivakidov@ro.ru");
        ActionsWithDeviceSelenide actionsWithDeviceSelenide = screen(ActionsWithDeviceSelenide.class);
        actionsWithDeviceSelenide.clickOnDeviceButtonBack();
    }
}