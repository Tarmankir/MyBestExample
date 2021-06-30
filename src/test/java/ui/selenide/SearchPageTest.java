package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.selenide.pages.SearchPage;
import ui.settings.DriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class SearchPageTest extends DriverSetup {

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

    @DataProvider(name = "searchTestProvider")
    public Object[] dataProvider() {
        return new Object[]{"12345678", "Programming", "Тестирование"};
    }

    @Test(dataProvider = "searchTestProvider")
    public void searchPageTest(String searchData) {
        searchPage.clickOnSearchButton();
        searchPage.enterTestSearch(searchData);
        searchPage.checkSearch(searchData);
    }
}