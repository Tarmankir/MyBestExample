package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.FooterMenuPage;
import selenium.pages.MainMenuPage;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class MenuPageSteps extends CucumberRunnerSelenium {

    private FooterMenuPage footerMenuPage;
    private MainMenuPage mainMenuPage;

    @Given("I am open main page for menu testing")
    public void IAmOpenMainPageForMenuTesting() {
        driver.get(getUiSetting("mainURL"));
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        mainMenuPage = initElements(driver, MainMenuPage.class);
    }

    @When("I am click to menu Develop")
    public void IAmClickToMenuDevelop() {
        mainMenuPage.clickDevelop();
    }

    @And("I am click menu site Map")
    public void IAmClickMenuSiteMap() {
        footerMenuPage.clickSiteMap();
    }

    @Then("^I am check text on button on menu ([^\"]*)$")
    public void IAmCheckTextOnButtonOnMenu(String Text) {
        footerMenuPage.checkText(Text);
    }
}