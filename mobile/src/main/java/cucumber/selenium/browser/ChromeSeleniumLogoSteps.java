package cucumber.selenium.browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.browser.ChromeSeleniumPage;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.CucumberRunnerSelenium.driver;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumLogoSteps {

    private ChromeSeleniumPage chromeSeleniumPage;

    @Given("I am open main page in chrome")
    public void IAmOpenMainPageInChrome() {
        driver.get(getMobileSetting("mainURL"));
        chromeSeleniumPage = initElements(driver, ChromeSeleniumPage.class);
    }

    @When("I am check logo is displayed")
    public void IAmCheckLogoIsDisplayed() {
        chromeSeleniumPage.checkLogoIsDisplayed();
    }

    @Then("I am check logo size")
    public void IAmCheckLogoSize() {
        chromeSeleniumPage.checkLogoSize(16,16);
    }
}