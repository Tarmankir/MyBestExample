package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenium.pages.FooterMenuPage;
import ui.settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.UiConfig.getUiSetting;

public class FooterMenuPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;

    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        driver.get(getUiSetting("mainURL"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void footerMenuPageTest() {
        footerMenuPage.clickSiteMap();
        footerMenuPage.clickMegaProjects();
        footerMenuPage.switchWindowBack();
        footerMenuPage.checkText("Все потоки");
    }
}