package ui.selenide;

import org.openqa.selenium.support.FindBy;
import ui.selenide.fragments.PostFragment;

public class PostPage {

    @FindBy(css = ".tm-article-presenter__body")
    private PostFragment postBody;

    public String getPostCommentsCount() {
        return postBody.getCommentsCountPost().getText();
    }

    public String getPostVotesCount() {
        return postBody.getVotesCountPost().getText();
    }
}