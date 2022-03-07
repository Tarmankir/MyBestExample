package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import selenium.pages.LanguagePage;
import settings.SeleniumDriverSetup;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class LanguagePageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LanguagePage languagePage;

    @BeforeGroups(groups = "Regress")
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        languagePage = initElements(driver, LanguagePage.class);
        driver.get(getUiSetting("mainURL"));
    }

    @AfterGroups(groups = "Regress")
    void afterMethod() {
        driver.close();
    }

    @Test(groups = {"Regress"})
    public void languagePageTest() {
        languagePage.clickLanguageSettings();
        languagePage.clickEngInterface();
        languagePage.clickButtonSaveLang();
        languagePage.checkButtonLogin("Log in");
    }
}