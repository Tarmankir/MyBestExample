package selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PostFragment extends ElementsContainer {

    @FindBy(css = ".tm-article-snippet__title")
    private SelenideElement postTitle;

    @FindBy(css = ".tm-votes-meter__value")
    private SelenideElement postVotesCount;

    public SelenideElement getPostTitle() {
        return postTitle;
    }

    public SelenideElement getVotesCountPost() {
        return postVotesCount;
    }
}