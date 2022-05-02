package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenide.pages.SearchPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class SearchPageTest extends SelenideDriverSetup {

    @DataProvider(name = "searchTestProvider")
    public Object[] searchDataProvider() {
        return new Object[]{"12345678", "Programming", "Тестирование"};
    }

    @Test(dataProvider = "searchTestProvider")
    public void searchPageTest(String searchData) {
        open(getUiSetting("searchURL"));
        SearchPage searchPage = Selenide.page(SearchPage.class);
        searchPage.clickOnSearchButton();
        searchPage.enterTextInSearchField(searchData);
        searchPage.checkSearch(searchData);
    }
}