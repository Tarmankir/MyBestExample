package cucumber.selenium.browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.browser.ChromeSeleniumPage;
import selenium.browser.ChromeSeleniumSearchPage;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.CucumberRunnerSelenium.driver;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumSearchSteps {

    private ChromeSeleniumPage chromeSeleniumPage;
    private ChromeSeleniumSearchPage chromeSeleniumSearchPage;

    @Given("I am open main page in chrome")
    public void IAmOpenMainPageInChrome() {
        driver.get(getMobileSetting("mainURL"));
        chromeSeleniumPage = initElements(driver, ChromeSeleniumPage.class);
        chromeSeleniumSearchPage = initElements(driver, ChromeSeleniumSearchPage.class);
    }

    @When("^I am enter text in search field ([^\"]*)$")
    public void IAmEnterTextInSearchField(String Text) {
        chromeSeleniumSearchPage.enterTextInSearchField(Text);
    }

    @And("I am click on copy link button")
    public void IAmClickOnCopyLinkButton() {
        chromeSeleniumSearchPage.clickOnCopyLinkButton();
    }

    @Then("I am check copy link popUp")
    public void IAmCheckCopyLinkPopUp() {
        chromeSeleniumSearchPage.checkCopyLinkPopUp();
    }
}