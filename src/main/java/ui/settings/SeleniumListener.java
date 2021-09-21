package ui.settings;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.ByteArrayInputStream;

public abstract class SeleniumListener implements ITestListener {

    @Attachment
    public byte[] captureScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("screenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
        captureScreenshot((WebDriver) webDriverAttribute);
    }
}