package ui.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PagePost {

    @FindBy(css = "#login")
    private SelenideElement commentsText;

    public void clickCommentsText() {
        commentsText.click();
    }
}