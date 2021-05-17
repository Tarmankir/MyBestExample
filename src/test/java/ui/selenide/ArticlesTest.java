package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

public class ArticlesTest {

    private Articles articles;

    @BeforeMethod
    public void articlesBefore() {
        open(getSetting("mainURL"));
        articles = page(Articles.class);
    }

    @Test
    public void feedbackPageTest() {
        articles.clickOnArticle("Уловка для обновления содержимого инициализации ОЗУ в битовых потоках ПЛИС Intel");
        articles.clickOnShare();
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }
}
