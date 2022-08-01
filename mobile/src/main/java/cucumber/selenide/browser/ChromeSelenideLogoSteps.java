package cucumber.selenide.browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.browser.ChromeSelenidePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSelenideLogoSteps {

    private ChromeSelenidePage chromeSelenidePage;

    @Given("I am open main page in chrome")
    public void IAmOpenMainPageInChrome() {
        open(getMobileSetting("mainURL"));
        chromeSelenidePage = page(ChromeSelenidePage.class);
    }

    @When("I am check logo is displayed")
    public void IAmCheckLogoIsDisplayed() {
        chromeSelenidePage.checkLogoIsDisplayed();
    }

    @Then("I am check logo size")
    public void IAmCheckLogoSize() {
        chromeSelenidePage.checkLogoSize(16,16);
    }
}