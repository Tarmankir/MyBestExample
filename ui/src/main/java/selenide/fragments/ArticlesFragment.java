package selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ArticlesFragment extends ElementsContainer {

    @FindBy(css = ".tm-article-snippet__title-link")
    private SelenideElement title;

    @FindBy(css = ".tm-votes-meter__value")
    private SelenideElement votesCount;

    public void clickOnArticle() {
        title.click();
    }

    public SelenideElement getVotesCount() {
        return votesCount;
    }
}