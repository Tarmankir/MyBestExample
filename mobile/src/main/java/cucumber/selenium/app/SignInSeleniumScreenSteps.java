package cucumber.selenium.app;

import actions.ActionsWithDeviceSelenium;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.app.AppMenuSeleniumScreen;
import selenium.app.MainSeleniumScreen;
import selenium.app.SignInSeleniumScreen;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.Credentials.TEST_USER_1;

public class SignInSeleniumScreenSteps extends CucumberRunnerSelenium {

    private SignInSeleniumScreen signInSeleniumScreen;
    private MainSeleniumScreen mainSeleniumScreen;
    private AppMenuSeleniumScreen appMenuSeleniumScreen;
    private ActionsWithDeviceSelenium actionsWithDeviceSelenium;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() {
        signInSeleniumScreen = initElements(driver, SignInSeleniumScreen.class);
        actionsWithDeviceSelenium = initElements(driver, ActionsWithDeviceSelenium.class);
    }

    @When("I am login in app")
    public void IAmLoginInApp() {
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
    }

    @And("I am open app menu")
    public void IAmOpenAppMenu() {
        mainSeleniumScreen = initElements(driver, MainSeleniumScreen.class);
        mainSeleniumScreen.openAppMenu();
    }

    @And("I am check user login name")
    public void IAmCheckUserLoginName() {
        appMenuSeleniumScreen = initElements(driver, AppMenuSeleniumScreen.class);
        appMenuSeleniumScreen.checkUserLoginName("ivakidov@ro.ru");
    }

    @Then("I am click on device button back")
    public void IAmClickOnDeviceButtonBack() {
        actionsWithDeviceSelenium = initElements(driver, ActionsWithDeviceSelenium.class);
        actionsWithDeviceSelenium.clickOnDeviceButtonBack();
    }
}