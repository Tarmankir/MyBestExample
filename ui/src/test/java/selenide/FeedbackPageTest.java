package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.pages.FeedbackPage;
import settings.SelenoidSetup;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class FeedbackPageTest extends SelenoidSetup {

    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = getSelenoidDefaultCapabilities();
        open(getUiSetting("feedbackURL"));
        feedbackPage = Selenide.page(FeedbackPage.class);
    }

    @AfterMethod
    void afterMethod() {
        closeWindow();
    }

    @Test
    public void feedbackPageTest() {
        feedbackPage.selectTheme("Нарушение правил сайта");
        feedbackPage.checkThemesList();
        feedbackPage.emailFieldTake();
        feedbackPage.messageFieldTake();
        feedbackPage.checkSubmitButton("Отправить");
    }
}