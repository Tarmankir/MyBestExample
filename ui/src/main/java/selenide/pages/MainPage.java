package selenide.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import selenide.fragments.ArticlesFragment;

import java.util.List;

public class MainPage {

    @FindBy(css = ".tm-articles-list__item")
    private List<ArticlesFragment> articlesList;

    @Step("Open article")
    public void openArticle(int articleIndex) {
        articlesList.get(articleIndex).clickOnArticle();
    }

    @Step("Get article votes count")
    public String getArticleVotesCount(int articleIndex) {
        return articlesList.get(articleIndex).getVotesCount().getText();
    }
}