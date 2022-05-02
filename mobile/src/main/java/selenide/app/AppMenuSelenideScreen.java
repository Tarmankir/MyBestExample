package selenide.app;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;

public class AppMenuSelenideScreen {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView")
    private SelenideElement userItem;

    @Step("Check user login name")
    public void checkUserLoginName(String text) {
        assertEquals(userItem.getText(), text);
    }
}