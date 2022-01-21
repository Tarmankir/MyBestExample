package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import selenide.pages.FeedbackPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.*;
import static settings.UiConfig.getUiSetting;

public class FeedbackPageTest extends SelenideDriverSetup {

    private FeedbackPage feedbackPage;

    @BeforeClass
    public void feedbackPageBefore() {
        open(getUiSetting("feedbackURL"));
        feedbackPage = Selenide.page(FeedbackPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test(groups = {"Smoke"})
    public void feedbackPageTest() {
        feedbackPage.selectTheme("Нарушение правил сайта");
        feedbackPage.checkThemesList();
        feedbackPage.emailFieldTake();
        feedbackPage.massageFieldTake();
        feedbackPage.checkSubmitButton("Отправить");
    }
}