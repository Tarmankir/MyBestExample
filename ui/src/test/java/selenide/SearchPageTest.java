package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenide.pages.SearchPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class SearchPageTest extends SelenideDriverSetup {

    private SearchPage searchPage;

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        open(getUiSetting("searchURL"));
        searchPage = Selenide.page(SearchPage.class);
    }

    @AfterMethod
    void afterMethod() {
        closeWindow();
    }

    @DataProvider(name = "searchTestProvider")
    public Object[] searchDataProvider() {
        return new Object[]{"12345678", "Programming", "Тестирование"};
    }

    @Test(dataProvider = "searchTestProvider")
    public void searchPageTest(String searchData) {
        searchPage.clickOnSearchButton();
        searchPage.enterTextInSearchField(searchData);
        searchPage.checkSearch(searchData);
    }
}