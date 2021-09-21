package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.selenium.pages.FooterMenuPage;
import ui.settings.SeleniumDriverSetup;
import ui.settings.SeleniumListener;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

//@Listeners(SeleniumListener.class)
public class FooterMenuPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        driver.get(getSetting("mainURL"));
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