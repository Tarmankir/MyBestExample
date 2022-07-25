package cucumber.selenide.app;

import actions.ActionsWithDeviceSelenide;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.app.AppMenuSelenideScreen;
import selenide.app.MainSelenideScreen;
import selenide.app.SignInSelenideScreen;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.Credentials.TEST_USER_1;

public class SignInSelenideScreenSteps {

    private SignInSelenideScreen signInSeleniumScreen;
    private MainSelenideScreen mainSelenideScreen;
    private AppMenuSelenideScreen appMenuSelenideScreen;
    private ActionsWithDeviceSelenide actionsWithDeviceSelenide;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() throws InterruptedException {
        Thread.sleep(10000);
        signInSeleniumScreen = screen(SignInSelenideScreen.class);
//        Configuration.timeout = 30000;
    }

    @When("I am login in app")
    public void IAmLoginInApp() {
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
    }

    @And("I am open app menu")
    public void IAmOpenAppMenu() {
        mainSelenideScreen = screen(MainSelenideScreen.class);
        mainSelenideScreen.openAppMenu();
    }

    @And("I am check user login name")
    public void IAmCheckUserLoginName() {
        appMenuSelenideScreen = screen(AppMenuSelenideScreen.class);
        appMenuSelenideScreen.checkUserLoginName("ivakidov@ro.ru");
    }

    @Then("I am click on device button back")
    public void IAmClickOnDeviceButtonBack() {
        actionsWithDeviceSelenide = screen(ActionsWithDeviceSelenide.class);
        actionsWithDeviceSelenide.clickOnDeviceButtonBack();
    }
}