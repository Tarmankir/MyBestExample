package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.selenium.pages.LanguagePage;
import ui.settings.DriverSetup;
import ui.settings.SeleniumListener;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

@Listeners(SeleniumListener.class)
public class LanguagePageTest extends DriverSetup {

    private WebDriver driver;
    private LanguagePage languagePage;

    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        languagePage = initElements(driver, LanguagePage.class);
        driver.get(getSetting("mainURL"));
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