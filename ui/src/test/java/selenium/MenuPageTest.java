package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import selenium.pages.FooterMenuPage;
import selenium.pages.MainMenuPage;
import settings.SeleniumDriverSetup;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class MenuPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    private MainMenuPage mainMenuPage;

    @BeforeGroups(groups = "Regress")
    public void driverSet() throws MalformedURLException {
        URL url = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(url, new SeleniumDriverSetup().getSelenoidCapabilities(new SeleniumDriverSetup().getOptions()));
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        mainMenuPage = initElements(driver, MainMenuPage.class);
        driver.get(getUiSetting("mainURL"));
    }

    @AfterGroups(groups = "Regress")
    void afterMethod() {
        driver.close();
    }

    @Test(groups = {"Regress"})
    public void menuPageFragmentTest() {
        mainMenuPage.clickDevelop();
        footerMenuPage.clickSiteMap();
        footerMenuPage.checkText("Все потоки");
    }
}