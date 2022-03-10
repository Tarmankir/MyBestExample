package selenide;

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
        open(getUiSetting("feedbackURL"));
        feedbackPage = Selenide.page(FeedbackPage.class);
//        Configuration.pageLoadTimeout = 30;
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