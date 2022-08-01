package cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rest.BugredUserCreate;
import selenide.pages.BugredUserPage;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class BugredUserPageSteps {

    private BugredUserPage bugredUserPage;
    private BugredUserCreate bugredUserCreate;

    String userEmail;

    @Given("I am open bugred page")
    public void IAmOpenBugredPage() {
        open(getUiSetting("bugredURL"));
        bugredUserPage = page(BugredUserPage.class);
        bugredUserCreate = page(BugredUserCreate.class);
    }

    @When("I am use rest bugred user create")
    public void IAmUseRestBugredUserCreate() {
        bugredUserCreate.bugredUserCreate();
    }

    @And("I am set email")
    public String IAmSetEmail() {
        String userEmail = new BugredUserCreate().bugredUserCreate();
        return userEmail;
    }

    @And("I am refresh page")
    public void IAmRefreshPage() {
        refresh();
    }

    @Then("I am check created user email")
    public void IAmCheckCreatedUserEmail(String) {
        bugredUserPage.checkCreatedUserEmail(userEmail);
    }
}