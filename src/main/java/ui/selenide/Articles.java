package ui.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Articles {

    @FindBy(css = ".shortcuts_items > li")
    private ElementsCollection articlesList;

    @FindBy(css = ".post-stats__comments-text")
    private SelenideElement shareList;

    public void clickOnArticle(String name) {
        articlesList.filter(Condition.text(name)).get(0).find(By.cssSelector(".post-stats__comments-count")).click();
    }

    public void clickOnShare() {
        shareList.click();
    }
}