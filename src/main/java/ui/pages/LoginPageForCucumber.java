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

import java.util.concurrent.TimeUnit;

public class LoginPageForCucumber {

    @FindBy(css = "#email_field")
    private WebElement loginIn;

    @FindBy(css = "#password_field")
    private WebElement passwordIn;

    @FindBy(css = ".button")
    private WebElement buttonIn;

    private WebDriver driver;

    public LoginPageForCucumber(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageForCucumber() {}

    @Given("Open site")
    public void getSite() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://account.habr.com/login/?state=841f4565e6ccbb5f23db6c30474bbe69&consumer=habr&hl=ru_RU");
    }

    @When("^Enter login ([^\"]*)$")
    public void typeLogin(String login) {
        loginIn.sendKeys(login);
    }

    @And("^Enter password ([^\"]*)$")
    public void typePass(String password) {
        passwordIn.sendKeys(password);
    }

    @Then("Authorization on site")
    public void clickLogin(){
        buttonIn.click();
    }
}
