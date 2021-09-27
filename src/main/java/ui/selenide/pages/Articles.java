package ui.selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class Articles extends ElementsContainer {

    @FindBy(css = ".tm-articles-list > .tm-articles-list__item")
    private ElementsCollection articlesList;

    @FindBy(css = ".tm-icon-counter__value")
    private SelenideElement articlesViewsCount;

    public void openRandomArticle() {
        Random random = new Random();
        articlesList.get(random.nextInt(articlesList.size())).find(By.cssSelector(".tm-icon-counter__value")).click();
    }

    public void checkCommentsCounter(String count) {
        articlesViewsCount.shouldHave(Condition.text(String.valueOf(count)));

        assertEquals(articlesViewsCount.getText(), count, "Counter are not equal");
    }
}