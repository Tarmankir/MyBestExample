package selenium.browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeMainSeleniumPage {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Яндекс\"]/android.widget.Image")
    private MobileElement yandex;

    private AppiumDriver<MobileElement> driver;

    public ChromeMainSeleniumPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(yandex));
    }
}