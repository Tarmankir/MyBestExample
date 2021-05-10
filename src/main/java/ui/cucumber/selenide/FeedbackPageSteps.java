package ui.cucumber.selenide;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.openqa.selenium.support.FindBy;
import ui.selenide.FeedbackPage;

import java.util.ArrayList;
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

    @FindBy(css = "#message_textarea")
    private SelenideElement massageField;

    @And("I am enter test text massage")
//    public void massageIn() {
//        feedbackPage.massageFieldTake();
//   }
    public void IAmEnterTestTextMassage(DataTable table) {

        List<List<String>> data = table.raw();
        massageField.sendKeys(data.get(0).get(0));
    }

    @Then("^I am check submit button contains ([^\"]*)$")
    public void IAmCheckSubmitButtonContains(String button) {
        feedbackPage.checkSubmitButton(button);
    }
}