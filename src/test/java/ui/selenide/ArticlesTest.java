package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.MainPage;
import ui.selenide.pages.PostPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static ui.settings.Config.getSetting;

public class ArticlesTest extends SelenideDriverSetup {

    private MainPage mainPage;
    private PostPage postPage;

    private String votesCountOnMainPage;

    @BeforeMethod
    public void articlesBefore() {
        open(getSetting("mainURL"));
        mainPage = page(MainPage.class);
        postPage = page(PostPage.class);

        votesCountOnMainPage = mainPage.getArticleVotesCount(8);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test
    public void articlesPageTest() {
        mainPage.openArticle(8);
        postPage.checkPostTitle();
//        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}