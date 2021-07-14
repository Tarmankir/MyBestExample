package ui.cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.selenium.pages.LoginPage;
import ui.settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.selenium.enums.Credentials.TEST1;
import static ui.settings.Config.getSetting;

public class LoginPageSteps extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I am open login page")
    public void IAmOpenLoginPage() {
        driver = new ChromeDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        driver.get(getSetting("baseUrl"));
    }

    @When("I am use login page functionality to signup in site")
    public void IAmUseLoginPageFunctionalityToSignupInSite() {
        loginPage.loginInSite(TEST1);
    }

    @And("I am click signup button")
    public void IAmClickSignupButton() {
        loginPage.clickLogin();
    }

    @Then("^I am check user login massage ([^\"]*)$")
    public void IAmCheckUserLoginMassage(String ID) {
        loginPage.checkLogin(ID);
        driver.close();
    }
}