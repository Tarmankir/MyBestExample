package selenide.browser;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertEquals;

public class ChromeSelenidePage {

    @AndroidFindBy(xpath = "//*[@href='/ru/search/']")
    private SelenideElement searchButton;

    @AndroidFindBy(xpath = "//*[@class='tm-svg-img tm-header__icon']")
    private SelenideElement logo;

    @Step("Click on search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }

    @Step("Check logo is displayed")
    public void checkLogoIsDisplayed() {
        logo.shouldBe(visible);
    }

    @Step("Check logo size")
    public void checkLogoSize(Integer height, Integer width) {
        assertEquals(logo.getAttribute("height"), height.toString());
        assertEquals(logo.getAttribute("width"), width.toString());
    }
}