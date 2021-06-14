package ui.cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.selenium.pages.SearchPage;
import ui.settings.FirefoxSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

public class SearchPageSteps extends FirefoxSetup {

    private WebDriver driver;
    private SearchPage searchPage;

    @Given("I am open main page and search")
    public void IAmOpenMainPageAndSearch() {
        driver = new FirefoxDriver(getOptions());
        searchPage = initElements(driver, SearchPage.class);
        driver.get(getSetting("mainURL"));
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
        driver.close();
    }
}