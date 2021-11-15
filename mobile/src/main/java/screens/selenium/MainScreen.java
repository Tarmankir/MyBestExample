package screens.selenium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

import java.util.concurrent.TimeUnit;

public class MainScreen {

    @AndroidFindBy(id = "com.icecoldapps.screenshoteasy:id/button_big")
    private AndroidElement createScreenButton;

    private AppiumDriver driver;

    public MainScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    @Step("Click on the Login site")
    public void clickLogin(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        createScreenButton.click();
    }
}