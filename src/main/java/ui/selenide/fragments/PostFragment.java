package ui.selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PostFragment extends ElementsContainer {

    @FindBy(css = ".tm-article-comments-counter-link__value")
    private SelenideElement postCommentsCount;

    @FindBy(css = ".tm-votes-meter__value")
    private SelenideElement postVotesCount;

    public SelenideElement getCommentsCountPost() {
        return postCommentsCount;
    }

    public SelenideElement getVotesCountPost() {
        return postVotesCount;
    }
}