package selenide.browser;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class ChromeSelenidePage {

    @AndroidFindBy(xpath = "//*[@href='/ru/search/']")
    private SelenideElement searchButton;

    @Step("Click on search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }
}