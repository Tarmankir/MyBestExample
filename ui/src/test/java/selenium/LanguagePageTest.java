package selenium;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;
import selenium.pages.LanguagePage;
import settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class LanguagePageTest extends SeleniumDriverSetup {

    private final static int MAX_RETRY_COUNT = 5;

    @Test
    public void languagePageTest() {
        int retryCount = 0;
        while(true)
        {
            try
            {
                driver.get(getUiSetting("mainURL"));
                break;
            }
            catch(WebDriverException e)
            {
                if( retryCount > MAX_RETRY_COUNT )
                {
                    throw new RuntimeException("Too many retries...", e);
                }

                retryCount++;
                try
                {
                    Thread.sleep(2_000);
                }
                catch (InterruptedException interruptedException)
                {
                    interruptedException.printStackTrace();
                }
            }
        }
//        driver.get(getUiSetting("mainURL"));
        LanguagePage languagePage = initElements(driver, LanguagePage.class);
        languagePage.clickLanguageSettings();
        languagePage.clickEngInterface();
        languagePage.clickButtonSaveLang();
        languagePage.checkButtonLogin("Log in");
    }
}