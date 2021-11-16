package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.pages.FooterMenuPage;
import selenium.pages.MainMenuPage;
import settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class MenuPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    private MainMenuPage mainMenuPage;

    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        mainMenuPage = initElements(driver, MainMenuPage.class);
        driver.get(getUiSetting("mainURL"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void menuPageFragmentTest() {
        mainMenuPage.clickDevelop();
        footerMenuPage.clickSiteMap();
        footerMenuPage.checkText("Все потоки");
    }
}