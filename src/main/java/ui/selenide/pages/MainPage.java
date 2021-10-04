package ui.selenide.pages;

import org.openqa.selenium.support.FindBy;
import ui.selenide.fragments.ArticlesFragment;
import ui.selenide.fragments.PostFragment;

import java.util.List;
import java.util.Random;

public class MainPage {

/*    @FindBy(css = ".footer")
    private FooterMenuFragment footer;

    public void clickOnFooterItem() {
        footer.clickTechnicalSupport();
    }*/

    @FindBy(css = ".tm-articles-list")
    private List<ArticlesFragment> articlesFragment;

    @FindBy(css = ".pagePost")
    private PostFragment postFragment;

    public void openArticle() {
        Random random = new Random();
        articlesFragment.openArticle(random.nextInt(articlesFragment.getArticleCount()));
    }

    public void checkCommentsCounter() {
        articlesFragment.checkCommentsCounter(postFragment.getCommentsCountForArticle());
    }

    public void checkPostViewsTitle() {
        postFragment.checkPostViewsTitle("Количество просмотров");
    }
}