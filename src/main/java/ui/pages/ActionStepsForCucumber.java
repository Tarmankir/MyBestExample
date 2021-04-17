package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pagesSelenide.FeedbackPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class ActionStepsForCucumber {

    private FeedbackPage feedbackPage;

    @Given("Open site")
    public void getSite() {
        open("https://habr.com/ru/feedback/");
        feedbackPage = page(FeedbackPage.class);
    }

    @When("Click list options")
    public void clickList() {
        new FeedbackPage().listOptionTake();
    }

    @And("Enter email")
    public void emailIn() {
        new FeedbackPage().emailFieldTake();
    }

    @Then("Enter massage")
    public void massageIn() {
        new FeedbackPage().massageFieldTake();
    }
}