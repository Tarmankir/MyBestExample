package cucumber.selenide;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenide.pages.FooterSitePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static settings.UiConfig.getUiSetting;

public class FooterSitePageSteps {

    private FooterSitePage footerSitePage;

    @Given("I am open footer site page")
    public void IAmOpenFooterSitePage () {
        open(getUiSetting("mainURL"));
        footerSitePage = page(FooterSitePage.class);
    }

    @Then("^I am check copyright years contains ([^\"]*)$")
    public void IAmCheckCopyrightYearsContains(String copyright) {
        footerSitePage.checkCopyrightYears(copyright);
    }
}