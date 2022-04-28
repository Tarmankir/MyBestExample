package selenium.app;

import actions.ActionsWithDeviceSelenium;
import org.testng.annotations.Test;
import settings.SeleniumDriverSetup;

import static settings.Credentials.TEST_USER_1;

public class SignInSeleniumScreenTest extends SeleniumDriverSetup {

    private SignInSeleniumScreen signInSeleniumScreen;
    private MainSeleniumScreen mainSeleniumScreen;
    private AppMenuSeleniumScreen appMenuSeleniumScreen;
    private ActionsWithDeviceSelenium actionsWithDeviceSelenium;

    @Test
    public void signInScreenTest() {
        signInSeleniumScreen = new SignInSeleniumScreen(driver);
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
        mainSeleniumScreen = new MainSeleniumScreen(driver);
        mainSeleniumScreen.openAppMenu();
        appMenuSeleniumScreen = new AppMenuSeleniumScreen(driver);
        appMenuSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
        actionsWithDeviceSelenium = new ActionsWithDeviceSelenium(driver);
        actionsWithDeviceSelenium.clickOnDeviceButtonBack();
    }
}