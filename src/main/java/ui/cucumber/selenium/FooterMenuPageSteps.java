package ui.cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.selenium.pages.FooterMenuPage;
import ui.settings.DriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

public class FooterMenuPageSteps extends DriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;

    @Given("I am open main page")
    public void IAmOpenMainPage() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        driver.get(getSetting("mainURL"));
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
        driver.close();
    }
}