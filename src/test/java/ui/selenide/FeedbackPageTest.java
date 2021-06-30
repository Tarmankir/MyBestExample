package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.FeedbackPage;
import ui.settings.DriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class FeedbackPageTest extends DriverSetup {

    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void feedbackPageBefore() {
        open(getSetting("feedbackURL"));
        feedbackPage = page(FeedbackPage.class);
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