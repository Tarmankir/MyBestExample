package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import selenide.pages.SearchPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class SearchPageTest extends SelenideDriverSetup {

    private SearchPage searchPage;

    @BeforeGroups(groups = "UI")
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

    @Test(dataProvider = "searchTestProvider", groups = {"3"})
    public void searchPageTest(String searchData) {
        searchPage.clickOnSearchButton();
        searchPage.enterTextInSearchField(searchData);
        searchPage.checkSearch(searchData);
    }
}