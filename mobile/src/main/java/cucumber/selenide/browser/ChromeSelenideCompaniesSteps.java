package cucumber.selenide.browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenide.browser.ChromeSelenideCompaniesPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideCompaniesSteps {

    private ChromeSelenideCompaniesPage chromeSelenideCompaniesPage;

    @Given("I am open companies page in chrome")
    public void IAmOpenCompaniesPageInChrome() {
        open(getMobileSetting("pageCompanies"));
        chromeSelenideCompaniesPage = page(ChromeSelenideCompaniesPage.class);
    }

    @Then("^I am check companies list contains([^\"]*)$")
    public void IAmCheckCompaniesListContains(String Text) {
        chromeSelenideCompaniesPage.isCompaniesListContains(Text);
    }
}