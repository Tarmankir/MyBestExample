package selenium.app;

import actions.ActionsWithDeviceSelenium;
import org.testng.annotations.Test;
import settings.SeleniumDriverSetup;

import static settings.Credentials.TEST_USER_1;

public class SignInSeleniumScreenTest extends SeleniumDriverSetup {

    @Test
    public void signInScreenTest() {
        SignInSeleniumScreen signInSeleniumScreen = new SignInSeleniumScreen(driver);
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
        MainSeleniumScreen mainSeleniumScreen = new MainSeleniumScreen(driver);
        mainSeleniumScreen.openAppMenu();
        AppMenuSeleniumScreen appMenuSeleniumScreen = new AppMenuSeleniumScreen(driver);
        appMenuSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
        ActionsWithDeviceSelenium actionsWithDeviceSelenium = new ActionsWithDeviceSelenium(driver);
        actionsWithDeviceSelenium.clickOnDeviceButtonBack();
    }
}