package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.FooterMenuPage;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class FooterMenuPageSteps extends CucumberRunnerSelenium {

    private FooterMenuPage footerMenuPage;

    @Given("I am open main page for footer testing")
    public void IAmOpenMainPageForFooterTesting() {
        driver.get(getUiSetting("mainURL"));
        footerMenuPage = initElements(driver, FooterMenuPage.class);
    }

    @When("I am click site map")
    public void IAmClickSiteMap() {
        footerMenuPage.clickSiteMap();
    }

    @And("I am click mega projects")
    public void IAmClickMegaProjects() {
        footerMenuPage.clickMegaProjects();
    }

    @And("I am switch window back")
    public void IAmSwitchWindowBack() {
        footerMenuPage.switchWindowBack();
    }

    @Then("^I am check text on button on site ([^\"]*)$")
    public void IAmCheckTextOnButtonOnSite(String Text) {
        footerMenuPage.checkText(Text);
    }
}