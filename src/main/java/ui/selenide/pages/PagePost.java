package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class PagePost {

    @FindBy(css = "span[title='Количество просмотров']")
    private SelenideElement postViews;

    @FindBy(css = ".tm-icon-wrapper__value")
    private SelenideElement postViewsCount;

    public void checkPostViewsTitle(String text) {
        assertEquals(postViews.getAttribute("title"), text);
    }

    public String getCommentsCountForArticle() {
        return postViewsCount.getText();
    }
}