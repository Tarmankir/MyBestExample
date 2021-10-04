package ui.cucumber.selenide;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.selenide.fragments.ArticlesFragment;
import ui.selenide.fragments.PostFragment;
import ui.settings.SelenideDriverSetup;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ui.settings.Config.getSetting;

public class ArticlesPagePostSteps extends SelenideDriverSetup {

    private ArticlesFragment articlesFragment;
    private PostFragment postFragment;

    @Given("I am open articles page")
    public void IAmOpenArticlesPage() {
        open(getSetting("mainURL"));
        articlesFragment = page(ArticlesFragment.class);
        postFragment = page(PostFragment.class);
    }

    @When("I am open random article")
    public void IAmOpenRandomArticle() {
        Random random = new Random();
        articlesFragment.openArticle(random.nextInt(articlesFragment.getArticleCount()));
    }

    @And("I am valid comments counter")
    public void IAmValidCommentsCounter() {
        articlesFragment.checkCommentsCounter(postFragment.getCommentsCountForArticle());
    }

    @Then("^I am check post views title contains ([^\"]*)$")
    public void IAmCheckShareButton(String text) {
        postFragment.checkPostViewsTitle(text);
    }
}