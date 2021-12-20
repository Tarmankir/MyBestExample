package actions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class ActionsWithDeviceSelenium {

    private AppiumDriver<MobileElement> driver;

    public ActionsWithDeviceSelenium(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step("Click on device button Back")
    public void clickOnDeviceButtonBack() {
        driver.navigate().back();
    }
}