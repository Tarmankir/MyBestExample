package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.pages.MainPage;
import selenide.pages.PostPage;
import ui.settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static ui.settings.UiConfig.getUiSetting;

public class ArticlesTest extends SelenideDriverSetup {

    private MainPage mainPage;
    private PostPage postPage;

    private String votesCountOnMainPage;

    @BeforeMethod
    public void articlesBefore() {
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        postPage = Selenide.page(PostPage.class);

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
        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}