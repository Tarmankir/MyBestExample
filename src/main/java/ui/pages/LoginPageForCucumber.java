package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPageForCucumber {

    private WebDriver driver;

    @FindBy(css = "#email_field")
    private WebElement loginField;

    @FindBy(css = "#password_field")
    private WebElement passwordField;

    @FindBy(css = ".button")
    private WebElement buttonSignUp;

    public LoginPageForCucumber() {}

    public LoginPageForCucumber(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Given("Open site")
    public void getSite() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://account.habr.com/login/?state=841f4565e6ccbb5f23db6c30474bbe69&consumer=habr&hl=ru_RU");
    }

    @When("^Enter login ([^\"]*)$")
    public void typeLogin(String login) {
        loginField.sendKeys(login);
    }

    @And("^Enter password ([^\"]*)$")
    public void typePass(String password) {
        passwordField.sendKeys(password);
    }

    @Then("Authorization on site")
    public void clickLogin(){
        buttonSignUp.click();
    }
}