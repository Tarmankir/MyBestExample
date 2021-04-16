package ui.pagesSelenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FeedbackPageTest {

    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void feedbackPageBefore() {
        open("https://habr.com/ru/feedback/");
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