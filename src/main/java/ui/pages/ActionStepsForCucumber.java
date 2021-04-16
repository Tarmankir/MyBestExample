package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.enums.Credentials;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ActionStepsForCucumber {

    private LoginPage loginPage;
    private WebDriver driver;

    @Given("Open site")
    public void getSite() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginPage = initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://account.habr.com/login/?state=841f4565e6ccbb5f23db6c30474bbe69&consumer=habr&hl=ru_RU");
    }

    @When("Get credentials")
    public void cred(Credentials creds) {
        new LoginPage(driver).loginInSite(creds);
    }

    @And("Enter login")
    public void loginIn(String userName) {
        new LoginPage(driver).typeLogin(userName);
    }

    @And("Enter pass")
    public void passIn(String userPass) {
        new LoginPage(driver).typePass(userPass);
    }

    @Then("Authorization on site")
    public void clickLog() {
        new LoginPage(driver).clickLogin();
    }
}