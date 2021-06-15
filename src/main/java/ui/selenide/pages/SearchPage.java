package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class SearchPage {

    @FindBy(css = "#search-form-btn")
    private SelenideElement searchButton;

    @FindBy(css = "#search-form-field")
    private SelenideElement searchField;

    @FindBy(css = ".search-field__input")
    private SelenideElement searchFieldInput;

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void enterTestSearch(String text) {
        searchField.setValue(text);
        searchField.pressEnter();
    }

    public void checkSearch(String text) {
        assertEquals(searchFieldInput.getAttribute("value"), text);
    }
}