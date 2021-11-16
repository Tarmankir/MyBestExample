package screens.selenium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainScreen {

    @AndroidFindBy(id = "com.icecoldapps.screenshoteasy:id/button_big")
    private MobileElement createScreenButton;

    private AppiumDriver<MobileElement> driver;


    public MainScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step("Click on the Login site")
    public void clickLogin(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        createScreenButton.click();
    }
}