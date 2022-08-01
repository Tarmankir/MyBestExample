package cucumber.selenide.app;

import actions.ActionsWithDeviceSelenide;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.app.SignInSelenideScreen;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static settings.Credentials.TEST_USER_1;

public class ScreenshotSelenideScreenSteps {

    private SignInSelenideScreen signInSeleniumScreen;
    private ActionsWithDeviceSelenide actionsWithDeviceSelenide;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() throws InterruptedException {
        signInSeleniumScreen = screen(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
    }

    @When("I am login in app")
    public void IAmLoginInApp() {
        signInSeleniumScreen.loginInApp(TEST_USER_1);
        signInSeleniumScreen.clickSignInButton();
    }

    @Then("I am take screenshot")
    public void IAmTakeScreenshot() {
        actionsWithDeviceSelenide = screen(ActionsWithDeviceSelenide.class);
        actionsWithDeviceSelenide.takeScreenshot();
    }
}