package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import selenide.enums.TextInfo;

import static org.testng.Assert.assertEquals;

public class SandboxPage {

    @FindBy(css = ".tm-block")
    private SelenideElement frameSandbox;

    @FindBy(css = ".tm-block__header")
    private SelenideElement frameSandboxHeader;

    @FindBy(css = ".tm-block__body")
    private SelenideElement frameSandboxBody;

    @Step("Check frame sandbox is displayed")
    public void frameSandboxIsDisplayed() {
        frameSandbox.isDisplayed();
    }

    @Step("Check frame sandbox header")
    public void checkFrameSandboxHeader(String text) {
        assertEquals(frameSandboxHeader.getText(), text);
    }

    @Step("Check frame sandbox body")
    public void checkFrameSandboxBody(TextInfo text) {
        assertEquals(frameSandboxBody.getText(), text.text);
    }
}