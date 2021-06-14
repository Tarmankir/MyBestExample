package ui.selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class SearchPage {

    @FindBy(css = "#search-form-btn")
    private WebElement searchButton;

    @FindBy(css = "#search-form-field")
    private WebElement searchField;

    @FindBy(css = ".search-field__input")
    private WebElement searchFieldInput;

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site and click on search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }

    @Step("Enter test text and go to search")
    public void enterTestSearch(String text) {
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);
    }

    @Step("Check search text equals test text")
    public void checkSearch(String text) {
        assertEquals(searchFieldInput.getAttribute("value"), text);
    }
}