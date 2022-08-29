package cucumber.selenium.browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenium.browser.ChromeSeleniumNumberPage;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.CucumberRunnerSelenium.driver;
import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumNumberPageSteps {

    private ChromeSeleniumNumberPage chromeSeleniumNumberPage;

    @Given("I am open main page number 8 in chrome")
    public void IAmOpenMainPageNumber8InChrome() {
        driver.get(getMobileSetting("page8"));
        chromeSeleniumNumberPage = initElements(driver, ChromeSeleniumNumberPage.class);
    }

    @Then("I am check page number comparison")
    public void IAmCheckPageNumberComparison() {
        chromeSeleniumNumberPage.pageNumberComparison();
    }
}