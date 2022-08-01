package cucumber.selenide.browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.browser.ChromeSelenidePage;
import selenide.browser.ChromeSelenideSearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideSearchSteps {

    private ChromeSelenidePage chromeSelenidePage;
    private ChromeSelenideSearchPage chromeSelenideSearchPage;

    @Given("I am open main page in chrome")
    public void IAmOpenMainPageInChrome() {
        open(getMobileSetting("mainURL"));
        chromeSelenidePage = page(ChromeSelenidePage.class);
        chromeSelenideSearchPage = page(ChromeSelenideSearchPage.class);
    }

    @When("^I am enter text in search field ([^\"]*)$")
    public void IAmEnterTextInSearchField(String Text) {
        chromeSelenideSearchPage.enterTextInSearchField(Text);
    }

    @And("I am click on copy link button")
    public void IAmClickOnCopyLinkButton() {
        chromeSelenideSearchPage.clickOnCopyLinkButton();
    }

    @Then("I am check copy link popUp")
    public void IAmCheckCopyLinkPopUp() {
        chromeSelenideSearchPage.checkCopyLinkPopUp();
    }
}