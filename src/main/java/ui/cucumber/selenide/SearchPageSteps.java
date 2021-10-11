package ui.cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.SearchPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ui.settings.Config.getSetting;

public class SearchPageSteps extends SelenideDriverSetup {

    private SearchPage searchPage;

    @Given("I am open main page and click search")
    public void IAmOpenMainPageAndClickSearch() {
        open(getSetting("searchURL"));
        searchPage = page(SearchPage.class);
    }

    @When("I am click on search button")
    public void IAmClickOnSearchButton() {
        searchPage.clickOnSearchButton();
    }

    @And("^I am enter test text and go to search ([^\"]*)$")
    public void IAmEnterTestSearch(String Text) {
        searchPage.enterTestSearch(Text);
    }

    @Then("^I am check search text equals test text ([^\"]*)$")
    public void IAmCheckSearchTextEqualsTestText(String Text) {
        searchPage.checkSearch(Text);
    }
}