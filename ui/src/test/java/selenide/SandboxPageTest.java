package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import selenide.pages.SandboxPage;
import settings.SelenideSelenoidSetup;

import static com.codeborne.selenide.Selenide.open;
import static selenide.enums.TextInfo.SANDBOX_TEXT;
import static settings.UiConfig.getUiSetting;

public class SandboxPageTest extends SelenideSelenoidSetup {

    @Test
    public void sandboxPageTest() {
        open(getUiSetting("sandboxURL"));
        SandboxPage sandboxPage = Selenide.page(SandboxPage.class);
        sandboxPage.frameSandboxIsDisplayed();
        sandboxPage.checkFrameSandboxHeader("О ПЕСОЧНИЦЕ");
        sandboxPage.checkFrameSandboxBody(SANDBOX_TEXT);
    }
}