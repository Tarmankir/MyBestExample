package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenium.pages.LanguagePage;
import ui.settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.UiConfig.getUiSetting;

public class LanguagePageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LanguagePage languagePage;

    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        languagePage = initElements(driver, LanguagePage.class);
        driver.get(getUiSetting("mainURL"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void languagePageTest() {
        languagePage.clickLanguageSettings();
        languagePage.clickEngInterface();
        languagePage.clickButtonSaveLang();
        languagePage.checkButtonLogin("Log in");
    }
}