package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class FeedbackPageTest {

    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void feedbackPageBefore() {
        open(getSetting("feedbackURL"));
        feedbackPage = page(FeedbackPage.class);
    }

    @Test
    public void feedbackPageTest() {
        feedbackPage.listOptionTake();
        feedbackPage.emailFieldTake();
        feedbackPage.massageFieldTake();
        feedbackPage.checkSubmitButton("Отправить");
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }
}