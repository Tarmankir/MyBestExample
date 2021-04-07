package ui.pagesSelenide;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FeedbackPageTest {

    private FeedbackPage feedbackPageTest;

    @Test
    public void feedbackPageTest() {
        open("https://habr.com/ru/feedback/");
//        feedbackPageTest.raskSpisokTake();
//        feedbackPageTest.spisokOptionTake();
//        feedbackPageTest.emailFieldTake();
        feedbackPageTest.massageFieldTake();
//        feedbackPageTest.checkSubmitButton("Отправить");
    }
}
