package ui.cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.FeedbackPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class FeedbackPageSteps {

    private FeedbackPage feedbackPage;

    //todo remove hardcoded values (use config.properties)
    @Given("I am open feedback page")
    public void getSite() {
        open("https://habr.com/ru/feedback/");
        feedbackPage = page(FeedbackPage.class);
    }

    @When("I am insert test data in list options")
    public void clickList() {
        feedbackPage.listOptionTake();
    }

    @And("I am enter test email")
    public void emailIn() {
        feedbackPage.emailFieldTake();
    }

    @And("I am enter test text massage")
    public void massageIn() {
        feedbackPage.massageFieldTake();
    }

    @Then("^I am check submit button contains ([^\"]*)$")
    public void buttonCheck(String button) {
        feedbackPage.checkSubmitButton(button);
    }
}