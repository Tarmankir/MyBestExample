package ui.selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class PostFragment extends ElementsContainer {

    @FindBy(css = "span[title='Количество просмотров']")
    private SelenideElement postViews;

    @FindBy(css = ".tm-icon-counter__value")
    private SelenideElement postViewsCount;

    public void checkPostViewsTitle(String text) {
        assertEquals(postViews.getAttribute("title"), text);
    }

    public String getCommentsCountForArticle() {
        return postViewsCount.getText();
    }
}