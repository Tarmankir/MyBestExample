package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static common.Waiter.waitMS;

public class BugredUserPage {

    @FindBy(css = ".ajax_load_row")
    private ElementsCollection usersList;

    @Step("Check created user email")
    public void checkCreatedUserEmail(String email) {
        waitMS(5000);
        usersList.filter(Condition.text(email)).shouldHaveSize(1);
    }
}