package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import selenide.pages.FeedbackPage;
import settings.SelenideSelenoidSetup;

import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class FeedbackPageTest extends SelenideSelenoidSetup {

    @Test
    public void feedbackPageTest() {
        open(getUiSetting("feedbackURL"));
        FeedbackPage feedbackPage = Selenide.page(FeedbackPage.class);
        feedbackPage.selectTheme("Нарушение правил сайта");
        feedbackPage.checkThemesList();
        feedbackPage.emailFieldTake();
        feedbackPage.messageFieldTake();
        feedbackPage.checkSubmitButton("Отправить");
    }
}