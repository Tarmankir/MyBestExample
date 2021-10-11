package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.MainPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static ui.settings.Config.getSetting;

public class ArticlesTest extends SelenideDriverSetup {

    private MainPage mainPage;
    private PostPage postPage;

    @BeforeMethod
    public void articlesBefore() {
        open(getSetting("mainURL"));
        mainPage = page(MainPage.class);
        postPage = page(PostPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test
    public void articlesPageTest() {
        mainPage.openArticle(8);
        assertEquals(mainPage.getArticleVotesCount(8), postPage.getPostVotesCount());
        assertEquals(mainPage.getArticleCommentsCount(8), postPage.getPostCommentsCount());
    }
}