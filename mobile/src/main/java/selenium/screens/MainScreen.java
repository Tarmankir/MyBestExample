package selenium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import selenium.enums.Credentials;

import java.util.concurrent.TimeUnit;

public class MainScreen {

    @AndroidFindBy(xpath = "//*[@resource-id='login']")
    private MobileElement loginField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")
    private MobileElement passwordField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button")
    private MobileElement signInButton;

    private AppiumDriver<MobileElement> driver;


    public MainScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step("Enter login and password")
    public void loginInApp(Credentials cred) {
        setLogin(cred.login);
        setPassword(cred.pass);
    }

    public void setLogin(String login) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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