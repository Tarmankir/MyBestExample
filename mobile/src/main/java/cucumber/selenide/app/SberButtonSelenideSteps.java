package cucumber.selenide.app;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenide.app.SignInSelenideScreen;

import static com.codeborne.selenide.Selenide.page;

public class SberButtonSelenideSteps {

    private SignInSelenideScreen signInSeleniumScreen;

    @Given("I am open sign in screen")
    public void IAmOpenSignInScreen() throws InterruptedException {
        signInSeleniumScreen = page(SignInSelenideScreen.class);
        Configuration.timeout = 30000;
    }

    @Then("I am check sber button")
    public void IAmCheckSberButton() {
        signInSeleniumScreen.checkSberButton("Войти по Сбер ID");
    }
}