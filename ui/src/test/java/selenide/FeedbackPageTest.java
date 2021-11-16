package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.pages.FeedbackPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class FeedbackPageTest extends SelenideDriverSetup {

    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void feedbackPageBefore() {
        open(getUiSetting("feedbackURL"));
        feedbackPage = Selenide.page(FeedbackPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test
    public void feedbackPageTest() {
        feedbackPage.selectTheme("Нарушение правил сайта");
        feedbackPage.checkThemesList();
        feedbackPage.emailFieldTake();
        feedbackPage.massageFieldTake();
        feedbackPage.checkSubmitButton("Отправить");
    }
}