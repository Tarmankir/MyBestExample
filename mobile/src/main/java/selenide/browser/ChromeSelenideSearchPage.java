package selenide.browser;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class ChromeSelenideSearchPage {

    @AndroidFindBy(xpath = "//input[@name='q']")
    private SelenideElement searchField;

    @AndroidFindBy(xpath = "//*[name()='use' and @*='/img/megazord-v24.4a410f80.svg#rss']")
    private SelenideElement copyLinkButton;

    @Step("Enter text in search field")
    public void enterTextInSearchField(String text) {
        searchField.setValue(text);
        searchField.pressEnter();
    }

    @Step("Click on copy link button")
    public void clickOnCopyLinkButton() {
        copyLinkButton.click();
    }
}