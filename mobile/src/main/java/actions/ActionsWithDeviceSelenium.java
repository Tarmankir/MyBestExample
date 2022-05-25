package actions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

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

    @Step("Take a screenshot")
    public void takeScreenshot() throws IOException {
        File scrFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/kir/Загрузки/screenshot.jpg"));
    }
}