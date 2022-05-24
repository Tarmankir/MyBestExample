package cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static settings.UiConfig.getUiSetting;

public class SearchPageSteps {

    private SearchPage searchPage;

    @Given("I am open main page and click search")
    public void IAmOpenMainPageAndClickSearch() {
        open(getUiSetting("searchURL"));
        searchPage = page(SearchPage.class);
    }

    @When("I am click on search button")
    public void IAmClickOnSearchButton() {
        searchPage.clickOnSearchButton();
    }

    @And("^I am enter test text and go to search ([^\"]*)$")
    public void IAmEnterTestSearch(String Text) {
        searchPage.enterTextInSearchField(Text);
    }

    @Then("^I am check search text equals test text ([^\"]*)$")
    public void IAmCheckSearchTextEqualsTestText(String Text) {
        searchPage.checkSearch(Text);
    }
}