package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import selenide.pages.SearchPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.UiConfig.getUiSetting;

public class SearchPageTest extends SelenideDriverSetup {

    private SearchPage searchPage;

    @BeforeMethod
    public void SearchPageBefore() {
        open(getUiSetting("searchURL"));
        searchPage = Selenide.page(SearchPage.class);
    }

    @AfterClass
    void afterClass() {
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