package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.selenide.pages.FeedbackPage;
import ui.selenide.pages.MainPage;
import ui.settings.SelenideDriverSetup;
import ui.settings.SelenideListener;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

@Listeners(SelenideListener.class)
public class PageFragmentTest extends SelenideDriverSetup {

    private MainPage mainPage;
    private FeedbackPage feedbackPage;

    @BeforeMethod
    public void pageFragmentBefore() {
        open(getSetting("mainURL"));
        mainPage = page(MainPage.class);
        feedbackPage = page(FeedbackPage.class);
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }

    @Test
    public void pageFragmentTest() {
//        mainPage.clickOnFooterItem();
        feedbackPage.checkSubmitButton("Отправить");
    }
}