package ui.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PagePost {

    @FindBy(css = "post-stats__share")
    private SelenideElement shareText;

    public void clickCommentsText() {
        shareText.click();
    }
}