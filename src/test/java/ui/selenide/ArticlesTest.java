package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.Articles;
import ui.selenide.pages.PagePost;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class ArticlesTest {

    private Articles articles;
    private PagePost pagePost;

    @BeforeMethod
    public void articlesBefore() {
        open(getSetting("mainURL"));
        articles = page(Articles.class);
        pagePost = page(PagePost.class);
    }

    @Test
    public void feedbackPageTest() {
        articles.openRandomArticle();
        pagePost.checkShareButton("Комментировать");
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }
}