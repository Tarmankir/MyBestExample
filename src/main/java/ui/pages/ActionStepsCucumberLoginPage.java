package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.settings.FirefoxSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.enums.Credentials.TEST1;
import static ui.settings.Config.getSetting;

public class ActionStepsCucumberLoginPage extends FirefoxSetup {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("Open login page")
    public void getSite() {
        driver = new FirefoxDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        driver.get(getSetting("baseUrl"));
    }

    @When("Login in site")
    public void loginIn() {
        loginPage.loginInSite(TEST1);
    }

    @And("Click signup button")
    public void signUp() {
        loginPage.clickLogin();
    }

    @Then("Check user")
    public void checkUser() {
        loginPage.checkLogin("https://habr.com/ru/users/tarman332/");
    }
}