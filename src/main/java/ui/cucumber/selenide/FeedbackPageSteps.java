package ui.cucumber.selenide;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.FeedbackPage;
import ui.settings.DriverSetup;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ui.settings.Config.getSetting;

public class FeedbackPageSteps extends DriverSetup {

    private FeedbackPage feedbackPage;

    @Given("I am open feedback page")
    public void IAmOpenFeedbackPage() {
        open(getSetting("feedbackURL"));
        feedbackPage = page(FeedbackPage.class);
    }

    @When("^I am insert test data in the themes list ([^\"]*)$")
    public void IAmInsertTestDataInTheThemesList(String theme) {
        feedbackPage.selectTheme(theme);
    }

    @And("I am enter test email")
    public void IAmEnterTestEmail() {
        feedbackPage.emailFieldTake();
    }

    @And("I am enter test text massage")
    public void IAmEnterTestTextMassage(DataTable table) {
        List<String> data = table.asList();
        feedbackPage.massageFieldTakeForCucumber(data.get(0));
    }

    @And("I am check list of themes")
    public void IAmCheckListOfThemes() {
        feedbackPage.checkThemesList();
    }

    @Then("^I am check submit button contains ([^\"]*)$")
    public void IAmCheckSubmitButtonContains(String button) {
        feedbackPage.checkSubmitButton(button);
    }
}