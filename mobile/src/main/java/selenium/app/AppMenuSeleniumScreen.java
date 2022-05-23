package selenium.app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static common.WaiterSelenium.getTimeout;
import static org.testng.Assert.assertEquals;

public class AppMenuSeleniumScreen {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView")
    private MobileElement userItem;

    private AppiumDriver<MobileElement> driver;

    public AppMenuSeleniumScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        getTimeout(5);
    }

    @Step("Check user login name")
    public void checkUserLoginName(String text) {
        assertEquals(userItem.getText(), text);
    }
}