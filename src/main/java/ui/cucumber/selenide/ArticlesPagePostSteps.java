package ui.cucumber.selenide;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.pages.Articles;
import ui.selenide.pages.PagePost;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ui.settings.Config.getSetting;

public class ArticlesPagePostSteps {

    private Articles articles;
    private PagePost pagePost;

    @Given("I am open articles page")
    public void IAmOpenArticlesPage() {
        open(getSetting("mainURL"));
        articles = page(Articles.class);
    }

    @When("I am open random article")
    public void IAmOpenRandomArticle() {
        articles.openRandomArticle();
    }

    @Then("^I am check share button contains ([^\"]*)$")
    public void IAmCheckShareButton(String text) {
        pagePost.checkShareButton(text);
    }
}