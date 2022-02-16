package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import selenide.enums.ThemesList;

import static com.codeborne.selenide.Condition.text;
import static selenide.enums.ThemesList.getThemeByName;

public class FeedbackPage {

    @FindBy(css = "input[name*='email']")
    private SelenideElement emailField;

    @FindBy(css = "textarea[name='message']")
    private SelenideElement messageField;

    @FindBy(css = "textarea[name='message']")
    private SelenideElement messageFieldForCucumber;

    @FindBy(css = "label[for='personal_agreement']")
    private SelenideElement checkboxInput;

    @FindBy(css = "button[type='submit']")
    private SelenideElement submitButton;

    @FindBy(css = "select[name='themeId']")
    private SelenideElement themesField;

    @FindBy(css = "select[name='themeId'] > option")
    private ElementsCollection themesList;

    @Step("Set data in email address field")
    public void emailFieldTake() {
        emailField.setValue("bigkir@yandex.ru");
    }

    @Step("Set data message field")
    public void messageFieldTake() {
        messageField.setValue("Текстовые тестовые данные");
    }

    @Step("Set data in message field")
    public void messageFieldTakeForCucumber(String text) {
        messageFieldForCucumber.setValue(text);
    }

    @Step("Check submit button")
    public void checkSubmitButton(String text) {
        submitButton.shouldHave(text(text));
    }

    @Step("Select theme of message")
    public void selectTheme(String theme) {
        themesList.get(getThemeByName(theme).themeIndex).click();
    }

    @Step("Check themes list")
    public void checkThemesList() {
        themesField.click();

        for (int i = 0; i < themesList.size(); i++) {
            themesList.get(i).shouldHave(Condition.exactText(ThemesList.getThemeByIndex(i).themeName));
        }
    }
}