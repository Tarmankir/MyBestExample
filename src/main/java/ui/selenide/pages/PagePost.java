package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class PagePost {

    @FindBy(css = ".post-stats__comments-text")
    private SelenideElement shareText;

    public void clickShare() {
        shareText.click();
    }

    public void checkShareButton(String text) {
        shareText.shouldHave(text(text));
    }
}