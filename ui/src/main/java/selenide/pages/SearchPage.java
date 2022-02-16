package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class SearchPage {

    @FindBy(css = "a[href*='/ru/search/']")
    private SelenideElement searchButton;

    @FindBy(css = ".tm-input-text-decorated__input")
    private SelenideElement searchField;

    @Step("Click on search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }

    @Step("Enter text in search field")
    public void enterTextInSearchField(String text) {
        searchField.setValue(text);
        searchField.pressEnter();
    }

    @Step("Check search value")
    public void checkSearch(String text) {
        assertEquals(searchField.getAttribute("value"), text);
    }
}