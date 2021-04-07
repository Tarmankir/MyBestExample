package ui.pagesSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class FeedbackPage {

    @FindBy(css = "#feedback_form > div.item.type > div.select_wrap > select")
    private SelenideElement raskSpisok;

    @FindBy(css = "#feedback_form > div.item.type > div.select_wrap > select > option:nth-child(8)")
    private SelenideElement spisokOption;

    @FindBy(css = "#feedback_form > div.item.email > input[type=email]")
    private SelenideElement emailField;

    @FindBy(css = "#message_textarea")
    private SelenideElement massageField;

    @FindBy(css = "#feedback_form > div.item.feedback_confidantial > label > input")
    private SelenideElement checkboxInput;

    @FindBy(css = "#feedback_form > div.buttons > button")
    private SelenideElement submitButton;

    public void raskSpisokTake() {
        $(raskSpisok).click();
    }

    public void spisokOptionTake() {
        $(spisokOption).click();
    }

    public void emailFieldTake() {
        $(emailField).setValue("bigkir@yandex.ru");
    }

    public void massageFieldTake() {
        $(massageField).setValue("Текстовые тестовые данные");
    }

    public void checkSubmitButton(String text) {
        assertEquals(submitButton.getText(), text);
    }
}