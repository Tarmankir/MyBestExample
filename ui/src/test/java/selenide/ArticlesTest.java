package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.pages.MainPage;
import selenide.pages.PostPage;
import settings.SelenoidSetup;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;
import static settings.UiConfig.getUiSetting;

public class ArticlesTest extends SelenoidSetup {

    private MainPage mainPage;
    private PostPage postPage;

    private String votesCountOnMainPage;

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = getSelenoidDefaultCapabilities();
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        postPage = Selenide.page(PostPage.class);
    }

    @AfterMethod
    void afterMethod() {
        closeWindow();
    }

    @Test
    public void articlesPageTest() {
        votesCountOnMainPage = mainPage.getArticleVotesCount(8);
        mainPage.openArticle(8);
        postPage.checkPostTitle();
        assertEquals(votesCountOnMainPage, postPage.getPostVotesCount());
    }
}