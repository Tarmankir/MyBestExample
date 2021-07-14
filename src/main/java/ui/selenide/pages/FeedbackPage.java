package ui.selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ui.selenide.enums.ThemesList;

import static com.codeborne.selenide.Condition.text;
import static ui.selenide.enums.ThemesList.getThemeByName;

public class FeedbackPage {

    @FindBy(css = "input[name*='email']")
    private SelenideElement emailField;

    @FindBy(css = "textarea[name='message']")
    private SelenideElement massageField;

    @FindBy(css = "textarea[name='message']")
    private SelenideElement massageFieldForCucumber;

    @FindBy(css = "label[for='personal_agreement']")
    private SelenideElement checkboxInput;

    @FindBy(css = "button[type='submit']")
    private SelenideElement submitButton;

    @FindBy(css = "select[name='themeId']")
    private SelenideElement themesField;

    @FindBy(css = "select[name='themeId'] > option")
    private ElementsCollection themesList;

    public void emailFieldTake() {
        emailField.setValue("bigkir@yandex.ru");
    }

    public void massageFieldTake() {
        massageField.setValue("Текстовые тестовые данные");
    }

    public void massageFieldTakeForCucumber(String text) {
        massageFieldForCucumber.setValue(text);
    }

    public void checkSubmitButton(String text) {
        submitButton.shouldHave(text(text));
    }

    public void selectTheme(String theme) {
        themesList.get(getThemeByName(theme).themeIndex).click();
    }

    public void checkThemesList() {
        themesField.click();

        for (int i = 0; i < themesList.size(); i++) {
            themesList.get(i).shouldHave(Condition.exactText(ThemesList.getThemeByIndex(i).themeName));
        }
    }
}