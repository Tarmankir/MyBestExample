package selenide.pages;

import org.openqa.selenium.support.FindBy;
import selenide.enums.fragments.ArticlesFragment;

import java.util.List;

public class MainPage {

    @FindBy(css = ".tm-articles-list__item")
    private List<ArticlesFragment> articlesList;

    public void openArticle(int articleIndex) {
        articlesList.get(articleIndex).clickOnArticle();
    }

    public String getArticleVotesCount(int articleIndex) {
        return articlesList.get(articleIndex).getVotesCount().getText();
    }
}