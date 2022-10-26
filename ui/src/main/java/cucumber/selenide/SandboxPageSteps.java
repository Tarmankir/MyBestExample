package cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenide.pages.SandboxPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static selenide.enums.TextInfo.SANDBOX_TEXT;
import static settings.UiConfig.getUiSetting;

public class SandboxPageSteps {

    private SandboxPage sandboxPage;

    @Given("I am open sandbox page")
    public void IAmOpenSandboxPage () {
        open(getUiSetting("sandboxURL"));
        sandboxPage = page(SandboxPage.class);
    }

    @When("I am check frame sandbox is displayed")
    public void IAmCheckFrameSandboxIsDisplayed() {
        sandboxPage.frameSandboxIsDisplayed();
    }

    @And("I am check frame sandbox body")
    public void IAmCheckFrameSandboxBody() {
        sandboxPage.checkFrameSandboxBody(SANDBOX_TEXT);
    }

    @Then("^I am check frame sandbox header ([^\"]*)$")
    public void IAmCheckFrameSandboxHeader (String text) {
        sandboxPage.checkFrameSandboxHeader(text);
    }
}