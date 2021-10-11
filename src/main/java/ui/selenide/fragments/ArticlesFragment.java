package ui.selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ArticlesFragment extends ElementsContainer {

    @FindBy(css = ".tm-article-snippet__title-link")
    private SelenideElement title;

    @FindBy(css = ".tm-article-comments-counter-link__value")
    private SelenideElement commentsCount;

    @FindBy(css = ".tm-votes-meter__value")
    private SelenideElement votesCount;

    public void clickOnArticle() {
        title.click();
    }

    public SelenideElement getCommentsCount() {
        return commentsCount;
    }

    public SelenideElement getVotesCount() {
        return votesCount;
    }
}