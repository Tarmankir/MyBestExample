package ui.pagesSelenide;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class FeedbackPageTest {

    private FeedbackPage feedbackPageTest;

    @Test
    public void feedbackPageTest() {
        open("https://habr.com/ru/feedback/");
//        page(driver, FeedbackPage.class);
//        feedbackPageTest.raskSpisokTake();
//        feedbackPageTest.spisokOptionTake();
//        feedbackPageTest.emailFieldTake();
        feedbackPageTest.massageFieldTake();
//        feedbackPageTest.checkSubmitButton("Отправить");
    }
}
