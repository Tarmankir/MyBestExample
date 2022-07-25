package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import rest.BugredUserCreate;
import selenide.pages.BugredUserPage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static settings.UiConfig.getUiSetting;

public class BugredUserPageTest extends SelenideDriverSetup {

    @Test
    public void bugredUserPageTest() {
        open(getUiSetting("bugredURL"));
        BugredUserPage bugredUserPage = Selenide.page(BugredUserPage.class);
        BugredUserCreate bugredUserCreate = Selenide.page(BugredUserCreate.class);
        bugredUserCreate.bugredUserCreate();
        String userEmail = new BugredUserCreate().bugredUserCreate();
        refresh();
        bugredUserPage.checkCreatedUserEmail(userEmail);
    }
}