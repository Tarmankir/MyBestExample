package cucumber.selenide.app;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenide.app.SignInSelenideScreen;

import static com.codeborne.selenide.appium.ScreenObject.screen;

public class SberButtonSelenideSteps {

    private SignInSelenideScreen signInSeleniumScreen;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() throws InterruptedException {
        signInSeleniumScreen = screen(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
    }

    @Then("I am check sber button")
    public void IAmCheckSberButton() {
        signInSeleniumScreen.checkSberButton("Войти по Сбер ID");
    }
}