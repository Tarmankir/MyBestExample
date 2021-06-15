package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.SearchPage;
import ui.settings.FirefoxSetup;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class SearchPageTest extends FirefoxSetup {

    private SearchPage searchPage;

    @BeforeMethod
    public void SearchPageBefore() {
        open(getSetting("mainURL"));
        searchPage = page(SearchPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test
    public void searchPageTest() {
        searchPage.clickOnSearchButton();
        searchPage.enterTestSearch("Тестирование");
        searchPage.checkSearch("Тестирование");
    }
}