package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static selenium.enums.Credentials.TEST_USER_1;
import static settings.UiConfig.getUiSetting;

public class LoginPageSteps extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Given("I am open login page")
    public void IAmOpenLoginPage() {
        driver = new ChromeDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        accountPage = initElements(driver, AccountPage.class);
        driver.get(getUiSetting("loginUrl"));
    }

    @When("I am use login page functionality to signup in site")
    public void IAmUseLoginPageFunctionalityToSignupInSite() {
        loginPage.loginInSite(TEST_USER_1);
    }

    @And("I am click signup button")
    public void IAmClickSignupButton() {
        loginPage.clickLogin();
    }

    @Then("^I am check user login massage ([^\"]*)$")
    public void IAmCheckUserLoginMassage(String ID) {
        accountPage.checkLogin(ID);
        driver.close();
    }
}