package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import selenide.pages.MainPage;
import selenide.pages.PostPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static settings.UiConfig.getUiSetting;

public class ArticlesTest extends SelenideDriverSetup {

    private MainPage mainPage;
    private PostPage postPage;

    private String votesCountOnMainPage;

    @BeforeClass
    public void articlesBefore() {
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        postPage = Selenide.page(PostPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test(groups = {"Smoke"})
    public void articlesPageTest() {
        votesCountOnMainPage = mainPage.getArticleVotesCount(8);
        mainPage.openArticle(8);
        postPage.checkPostTitle();
        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}