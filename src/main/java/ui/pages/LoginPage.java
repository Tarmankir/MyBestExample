package ui.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.enums.Credentials;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LoginPage {

    @FindBy(css = "#email_field")
    private WebElement loginen;

    @FindBy(css = "#password_field")
    private WebElement passen;

    @FindBy(css = ".button")
    private WebElement button;

    @FindBy(css = ".dropdown__user-info")
    private WebElement urlIn;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Login in site")
    @Given("Entry data for authorization")
    public void loginIn(Credentials creds) {
        typeLogin(creds.login);
        typePass(creds.pass);
    }

    public void typeLogin(String login) {
        loginen.sendKeys(login);
    }

    public void typePass(String pass) {
        passen.sendKeys(pass);
    }

    @Step("Click on the Login site")
    @When("Authorization on site")
    public void clickLogin(){
        button.click();
    }

    @Then("Check authorization on site")
    public void checkLogin(String text) {
        assertEquals(urlIn.getAttribute("href"), text);
    }
}