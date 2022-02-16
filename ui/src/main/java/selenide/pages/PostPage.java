package selenide.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import selenide.fragments.PostFragment;

public class PostPage {

    @FindBy(css = ".tm-article-presenter__body")
    private PostFragment postBody;

    @Step("Get post votes count")
    public String getPostVotesCount() {
        return postBody.getVotesCountPost().getText();
    }

    @Step("Check post title")
    public void checkPostTitle() {
        postBody.getPostTitle().isDisplayed();
    }
}