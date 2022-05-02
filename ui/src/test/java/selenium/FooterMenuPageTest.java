package selenium;

import org.testng.annotations.Test;
import selenium.pages.FooterMenuPage;
import selenium.pages.MainMenuPage;
import settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class FooterMenuPageTest extends SeleniumDriverSetup {

    @Test
    public void footerMenuPageTest() {
        driver.get(getUiSetting("mainURL"));
        FooterMenuPage footerMenuPage = initElements(driver, FooterMenuPage.class);
        footerMenuPage.clickMegaProjects();
        MainMenuPage mainMenuPage = initElements(driver, MainMenuPage.class);
        mainMenuPage.clickAllStreams();
        footerMenuPage.checkURL("https://habr.com/ru/megaprojects/");
    }
}