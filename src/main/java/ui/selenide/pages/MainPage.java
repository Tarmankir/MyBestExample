package ui.selenide.pages;

import org.openqa.selenium.support.FindBy;

public class MainPage {

/*    @FindBy(css = ".footer")
    private FooterMenuFragment footer;

    public void clickOnFooterItem() {
        footer.clickTechnicalSupport();
    }*/

    @FindBy(css = ".articles")
    private Articles articles;

    @FindBy(css = ".pagePost")
    private PagePost pagePost;

    public void openRandomArticle() {
        articles.openRandomArticle();
    }

    public void getCommentsCountForArticle() {
        pagePost.getCommentsCountForArticle();
    }

    public void checkCommentsCounter() {
        articles.checkCommentsCounter(pagePost.getCommentsCountForArticle());
    }

    public void checkPostViewsTitle() {
        pagePost.checkPostViewsTitle("Количество просмотров");
    }
}