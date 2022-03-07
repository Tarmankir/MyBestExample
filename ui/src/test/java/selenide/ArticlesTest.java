package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

//    private Configuration configuration;

    @BeforeClass
    void beforeClass() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = new SelenoidSetup().getSelenoidDefaultCapabilities();
//        configuration = new SelenoidSetup().getSelenoidDefaultConfigurations();
    }

    @BeforeMethod
    public void articlesBefore() {
        open(getUiSetting("mainURL"));
        mainPage = Selenide.page(MainPage.class);
        postPage = Selenide.page(PostPage.class);
        Configuration.pageLoadTimeout = 30;
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