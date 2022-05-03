package selenium;

import org.testng.annotations.Test;
import selenium.pages.FooterMenuPage;
import selenium.pages.MainMenuPage;
import settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class MenuPageTest extends SeleniumDriverSetup {

    @Test
    public void menuPageFragmentTest() {
        driver.get(getUiSetting("mainURL"));
        MainMenuPage mainMenuPage = initElements(driver, MainMenuPage.class);
        mainMenuPage.clickDevelop();
        FooterMenuPage footerMenuPage = initElements(driver, FooterMenuPage.class);
        footerMenuPage.clickSiteMap();
        footerMenuPage.checkText("Информация");
    }
}