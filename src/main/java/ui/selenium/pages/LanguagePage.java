package ui.selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LanguagePage {

    @FindBy(css = "body > div.layout > div.layout__row.layout__row_footer > div > div > div.footer-grid__item.footer-grid__item_link.footer-grid__item_lang > a")
    private WebElement langSettings;

    @FindBy(css = "#lang-settings-form > fieldset:nth-child(1) > div:nth-child(3) > span > label")
    private WebElement engInterface;

    @FindBy(css = "#lang-settings-form > div > button")
    private WebElement buttonSaveLang;

    @FindBy(css = "#login")
    private WebElement buttonLogin;

    private WebDriver driver;

    public LanguagePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site and click language settings")
    public void clickLanguageSettings() {
        langSettings.click();
    }

    @Step("Click english interface")
    public void clickEngInterface() {
        engInterface.click();
    }

    @Step("Click button save language settings")
    public void clickButtonSaveLang() {
        buttonSaveLang.click();
    }

    @Step("Check text on button login on site")
    public void checkButtonLogin(String text) {
        assertEquals(buttonLogin.getText(), text);
    }
}