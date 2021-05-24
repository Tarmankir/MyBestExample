package ui.selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Articles {

    @FindBy(css = ".shortcuts_items > li")
    private ElementsCollection articlesList;

    public void clickOnArticle(String name) {
        articlesList.filter(Condition.text(name)).get(0).find(By.cssSelector(".post-stats__item_comments")).click();
    }
}