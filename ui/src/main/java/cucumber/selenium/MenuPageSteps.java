package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.enums.pages.FooterMenuPage;
import selenium.enums.pages.MainMenuPage;
import ui.settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.UiConfig.getUiSetting;

public class MenuPageSteps extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    private MainMenuPage mainMenuPage;

    @Given("I am open main page for menu testing")
    public void IAmOpenMainPageForMenuTesting() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        mainMenuPage = initElements(driver, MainMenuPage.class);
        driver.get(getUiSetting("mainURL"));
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
        driver.close();
    }
}