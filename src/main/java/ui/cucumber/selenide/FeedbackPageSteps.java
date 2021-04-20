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
    @Given("I open site")
    public void getSite() {
        open("https://habr.com/ru/feedback/");
        feedbackPage = page(FeedbackPage.class);
    }

    @When("I click list options")
    public void clickList() {
        feedbackPage.listOptionTake();
    }

    @And("I enter email")
    public void emailIn() {
        feedbackPage.emailFieldTake();
    }

    @And("I enter massage")
    public void massageIn() {
        feedbackPage.massageFieldTake();
    }

    @Then("I check submit button")
    public void buttonCheck() {
        feedbackPage.checkSubmitButton("Отправить");
    }
}