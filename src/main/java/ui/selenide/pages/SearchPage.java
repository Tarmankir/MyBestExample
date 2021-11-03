package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class SearchPage {

    @FindBy(css = "a[href*='/ru/search/']")
    private SelenideElement searchButton;

    @FindBy(css = ".tm-input-text-decorated__input")
    private SelenideElement searchField;

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void enterTextInSearchField(String text) {
        searchField.setValue(text);
        searchField.pressEnter();
    }

    public void checkSearch(String text) {
        assertEquals(searchField.getAttribute("value"), text);
    }
}