package selenide.pages;

import org.openqa.selenium.support.FindBy;
import selenide.fragments.PostFragment;

public class PostPage {

    @FindBy(css = ".tm-article-presenter__body")
    private PostFragment postBody;

    public String getPostVotesCount() {
        return postBody.getVotesCountPost().getText();
    }

    public void checkPostTitle() {
        postBody.getPostTitle().isDisplayed();
    }
}