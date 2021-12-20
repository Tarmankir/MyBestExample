package selenide;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import settings.Credentials;

public class SignInSelenideScreen {

    @AndroidFindBy(xpath = "//*[@resource-id='login']")
    private SelenideElement loginField;

    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    private SelenideElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Войти')]")
    private SelenideElement signInButton;

    @Step("Enter login and password")
    public void loginInApp(Credentials cred) {
        setLogin(cred.login);
        setPassword(cred.pass);
    }

    public void setLogin(String login) {
        loginField.setValue(login);
    }

    public void setPassword(String pass) {
        passwordField.sendKeys(pass);
    }

    @Step("Click on sign in button")
    public void clickSignInButton(){
        signInButton.click();
    }
}