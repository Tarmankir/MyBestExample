package mobile.screens.selenium;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen {

    @FindBy(css = "#email_field")
    private WebElement loginField;

    private AppiumDriver driver;

    public MainScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    @Step("Click on the Login site")
    public void clickLogin(){
        loginField.click();
    }
}