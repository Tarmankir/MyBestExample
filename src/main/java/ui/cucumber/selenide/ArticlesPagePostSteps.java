package ui.cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.Articles;
import ui.selenide.pages.PagePost;
import ui.settings.FirefoxSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ui.settings.Config.getSetting;

public class ArticlesPagePostSteps extends FirefoxSetup {

    private Articles articles;
    private PagePost pagePost;

    @Given("I am open articles page")
    public void IAmOpenArticlesPage() {
        open(getSetting("mainURL"));
        articles = page(Articles.class);
        pagePost = page(PagePost.class);
    }

    @When("I am open random article")
    public void IAmOpenRandomArticle() {
        articles.openRandomArticle();
    }

    @And("I am valid comments counter")
    public void IAmValidCommentsCounter() {
        articles.checkCommentsCounter(pagePost.getCommentsCountForArticle());
    }

    @Then("^I am check share button contains ([^\"]*)$")
    public void IAmCheckShareButton(String text) {
        pagePost.checkShareButton(text);
    }
}