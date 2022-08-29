package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.enums.Credentials;

public class LoginPage {

    @FindBy(css = "#email_field")
    private WebElement loginField;

    @FindBy(css = "#password_field")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement buttonSignUp;

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
//        Assert.assertTrue(isElementPresent(buttonSignUp, 5000, 50));
        buttonSignUp.click();
    }
}