package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import selenide.pages.MainPage;
import selenide.pages.PostPage;
import settings.SelenoidSetup;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;
import static settings.UiConfig.getUiSetting;

public class ArticlesTest extends SelenoidSetup {

    private String votesCountOnMainPage;

    @Test
    public void articlesPageTest() {
        open(getUiSetting("mainURL"));
        MainPage mainPage = Selenide.page(MainPage.class);
        votesCountOnMainPage = mainPage.getArticleVotesCount(8);
        mainPage.openArticle(8);
        PostPage postPage = Selenide.page(PostPage.class);
        postPage.checkPostTitle();
        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}