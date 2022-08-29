package cucumber.selenium.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenium.app.SignInSeleniumScreen;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SberButtonSeleniumSteps extends CucumberRunnerSelenium {

    private SignInSeleniumScreen signInSeleniumScreen;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() {
        signInSeleniumScreen = initElements(driver, SignInSeleniumScreen.class);
    }

    @Then("I am check sber button")
    public void IAmCheckSberButton() {
        signInSeleniumScreen.checkSberButton("Войти по Сбер ID");
    }
}