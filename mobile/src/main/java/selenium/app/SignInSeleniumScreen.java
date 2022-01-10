package selenium.app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import settings.Credentials;

public class SignInSeleniumScreen {

    @AndroidFindBy(xpath = "//*[@resource-id='login']")
    private MobileElement loginField;

    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    private MobileElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Войти')]")
    private MobileElement signInButton;

    private AppiumDriver<MobileElement> driver;

    public SignInSeleniumScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(loginField));
    }

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