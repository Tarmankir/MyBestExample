package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.selenium.pages.LoginPage;
import ui.settings.SeleniumDriverSetup;
import ui.settings.SeleniumListener;

import static ui.selenium.enums.Credentials.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;

@Listeners(SeleniumListener.class)
public class LoginPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        driver.get(getSetting("baseUrl"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void loginPageTest() {
        loginPage.loginInSite(TEST1);
        loginPage.clickLogin();
//        loginPage.checkLogin("Приветствуем вас, @Tarman332");
    }
}