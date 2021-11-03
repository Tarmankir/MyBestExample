package ui.cucumber.selenium;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.selenium.pages.FooterMenuPage;
import ui.selenium.pages.MainMenuPage;
import ui.settings.SeleniumDriverSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.UiConfig.getUiSetting;

public class MenuPageSteps extends SeleniumDriverSetup {

    private WebDriver driver;
    private FooterMenuPage footerMenuPage;
    private MainMenuPage mainMenuPage;

    @Given("I am open main page for menu testing")
    public void IAmOpenMainPageForMenuTesting() {
        driver = new ChromeDriver(getOptions());
        footerMenuPage = initElements(driver, FooterMenuPage.class);
        mainMenuPage = initElements(driver, MainMenuPage.class);
        driver.get(getUiSetting("mainURL"));
    }
}