package ui.cucumber.selenide;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.FeedbackPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class FeedbackPageSteps {

    private FeedbackPage feedbackPage;

    @Given("I am open feedback page")
    public void IAmOpenFeedbackPage() {
        open("https://habr.com/ru/feedback/");
        feedbackPage = page(FeedbackPage.class);
    }

    @When("I am insert test data in list options")
    public void IAmInsertTestDataInListOptions() {
        feedbackPage.listOptionTake();
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

/*    @And("I am check list of themes")
    public void IAmCheckListOfThemes() {
        feedbackPage.checkThemesList();
    }*/

    @And("^I am click on the ([^\"]*)$")
    public void IAmClickOnTheTheme(String theme) {
        feedbackPage.selectTheme(theme);
    }

    @Then("^I am check submit button contains ([^\"]*)$")
    public void IAmCheckSubmitButtonContains(String button) {
        feedbackPage.checkSubmitButton(button);
    }
}