package ui.cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.MainPage;
import ui.selenide.pages.PostPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertEquals;
import static ui.settings.UiConfig.getUiSetting;

public class ArticlesPagePostSteps extends SelenideDriverSetup {

    private MainPage mainPage;
    private PostPage postPage;

    private String votesCountOnMainPage;

    @Given("I am open articles page")
    public void IAmOpenArticlesPage() {
        open(getUiSetting("mainURL"));
        mainPage = page(MainPage.class);
        postPage = page(PostPage.class);

        votesCountOnMainPage = mainPage.getArticleVotesCount(8);
    }

    @When("^I am open article ([^\"]*)$")
    public void IAmOpenArticle(int articleIndex) {
        mainPage.openArticle(articleIndex);
    }

    @And("I am check post title")
    public void IAmCheckPostTitle() {
        postPage.checkPostTitle();
    }

    @Then("I am assert votes count")
    public void IAmAssertVotesCount() {
        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}