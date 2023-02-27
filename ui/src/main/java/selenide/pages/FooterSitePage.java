package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class FooterSitePage {

    @FindBy(css = ".tm-copyright__years")
    private SelenideElement copyrightYearsField;

    @Step("Check copyright years")
    public void checkCopyrightYears(String text) {
        copyrightYearsField.shouldHave(text(text));
    }
}