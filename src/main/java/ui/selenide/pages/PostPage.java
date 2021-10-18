package ui.selenide.pages;

import org.openqa.selenium.support.FindBy;
import ui.selenide.fragments.PostFragment;

public class PostPage {

    @FindBy(css = ".tm-misprint-area__wrapper")
    private PostFragment postBody;

    public String getPostVotesCount() {
        return postBody.getVotesCountPost().getText();
    }

    public void checkPostTitle() {
        postBody.getPostTitle().isDisplayed();
    }
}