package ui.pagesSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class FeedbackPage {

    @FindBy(css = "option[value*='8']")
    private SelenideElement listOption;

    @FindBy(css = "input[name*='email']")
    private SelenideElement emailField;

    @FindBy(css = "#message_textarea")
    private SelenideElement massageField;

    @FindBy(css = "input[name*='feedback_confidantial']")
    private SelenideElement checkboxInput;

    @FindBy(css = "button[name*='submit']")
    private SelenideElement submitButton;

    public void listOptionTake() {
        $(listOption).click();
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