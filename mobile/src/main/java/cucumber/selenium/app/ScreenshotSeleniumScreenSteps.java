package cucumber.selenium.app;

import actions.ActionsWithDeviceSelenium;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.app.SignInSeleniumScreen;
import settings.CucumberRunnerSelenium;

import java.io.IOException;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.Credentials.TEST_USER_1;

public class ScreenshotSeleniumScreenSteps extends CucumberRunnerSelenium {

    private SignInSeleniumScreen signInSeleniumScreen;
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

    @Then("I am take screenshot")
    public void IAmTakeScreenshot() throws IOException {
        actionsWithDeviceSelenium = initElements(driver, ActionsWithDeviceSelenium.class);
        actionsWithDeviceSelenium.takeScreenshot();
    }
}