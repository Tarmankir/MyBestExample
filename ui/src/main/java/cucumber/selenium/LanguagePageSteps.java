package cucumber.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.LanguagePage;
import settings.CucumberRunnerSelenium;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class LanguagePageSteps extends CucumberRunnerSelenium {

    private LanguagePage languagePage;

    @Given("I am open main page")
    public void IAmOpenMainPage() {
        driver.get(getUiSetting("mainURL"));
        languagePage = initElements(driver, LanguagePage.class);
    }

    @When("I am click language settings")
    public void IAmClickLanguageSettings() {
        languagePage.clickLanguageSettings();
    }

    @And("I am click english interface")
    public void IAmClickEnglishInterface() {
        languagePage.clickEngInterface();
    }

    @And("I am click button save language settings")
    public void IAmClickButtonSaveLanguageSettings() {
        languagePage.clickButtonSaveLang();
    }

    @Then("^I am check text on button login on site ([^\"]*)$")
    public void IAmCheckTextOnButtonLoginOnSite(String Text) {
        languagePage.checkButtonLogin(Text);
    }
}