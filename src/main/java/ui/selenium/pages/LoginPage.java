package ui.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @FindBy(css = "button[type='submit']")
    private WebElement buttonSignUp;

    @FindBy(css = ".welcome__title")
    private WebElement userInfo;

    private WebDriver driver;
    private WebDriverWait wait;

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

    @Step("Check user url equals test url")
    public void checkLogin(String text) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".welcome__title")));
        assertEquals(userInfo.getText(), text);
    }
}