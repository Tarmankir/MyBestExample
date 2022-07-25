package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;
import static selenium.enums.Credentials.TEST_USER_1;
import static settings.UiConfig.getUiSetting;

public class LoginPageSteps extends CucumberRunnerSelenium {

    private LoginPage loginPage;
    private AccountPage accountPage;

    @Given("I am open login page")
    public void IAmOpenLoginPage() {
        driver.get(getUiSetting("loginURL"));
        loginPage = initElements(driver, LoginPage.class);
        accountPage = initElements(driver, AccountPage.class);
    }

    @When("I am use login page functionality to signup in site")
    public void IAmUseLoginPageFunctionalityToSignupInSite() {
        loginPage.loginInSite(TEST_USER_1);
    }

    @And("I am click signup button")
    public void IAmClickSignupButton() {
        loginPage.clickLogin();
    }

    @Then("^I am check user login message ([^\"]*)$")
    public void IAmCheckUserLoginMessage(String ID) {
        accountPage.checkLogin(ID);
    }
}