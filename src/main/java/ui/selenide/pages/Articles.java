package ui.selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class Articles {

    @FindBy(css = ".shortcuts_items > li")
    private ElementsCollection articlesList;

    public void openRandomArticle() {
        Random random = new Random();
        articlesList.get(random.nextInt(articlesList.size())).find(By.cssSelector(".post-stats__item_comments")).click();
    }
}