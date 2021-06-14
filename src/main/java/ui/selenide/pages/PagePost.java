package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class PagePost {

    @FindBy(css = "span[title='Поделиться']")
    private SelenideElement shareText;

    @FindBy(css = ".post-stats__views-count")
    private SelenideElement postViewsCount;

    public void checkShareButton(String text) {
        shareText.shouldHave(text(text));
    }

    public String getCommentsCountForArticle() {
        return postViewsCount.getText();
    }
}