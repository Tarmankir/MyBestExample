package selenium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import settings.Credentials;

import static org.testng.Assert.assertEquals;

public class SignInSeleniumScreen {

    @AndroidFindBy(xpath = "//*[@resource-id='login']")
    private MobileElement loginField;

    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    private MobileElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Войти')]")
    private MobileElement signInButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Image")
    private MobileElement mainAppMenu;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
    private MobileElement userItem;

    private AppiumDriver<MobileElement> driver;

    public SignInSeleniumScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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

    @Step("Open app menu")
    public void openAppMenu() {
        mainAppMenu.click();
    }

    @Step("Check user login name")
    public void checkUserLoginName(String text) {
        assertEquals(userItem.getText(), text);
    }
}