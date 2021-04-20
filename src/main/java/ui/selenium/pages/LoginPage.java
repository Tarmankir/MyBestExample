package ui.selenium.pages;

import ui.selenium.enums.Credentials;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LoginPage {

    @FindBy(css = "#email_field")
    private WebElement loginField;

    @FindBy(css = "#password_field")
    private WebElement passwordField;

    @FindBy(css = ".button")
    private WebElement buttonSignUp;

    @FindBy(css = ".dropdown__user-info")
    private WebElement urlIn;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Login in site")
    public void loginInSite(Credentials cred) {
        typeLogin(cred.login);
        typePass(cred.pass);
    }

    public void typeLogin(String login) {
        loginField.sendKeys(login);
    }

    public void typePass(String pass) {
        passwordField.sendKeys(pass);
    }

    @Step("Click on the Login site")
    public void clickLogin(){
        buttonSignUp.click();
    }

    public void checkLogin(String text) {
        assertEquals(urlIn.getAttribute("href"), text);
    }
}