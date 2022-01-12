package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.SeleniumDriverSetup;

import static selenium.enums.Credentials.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.UiConfig.getUiSetting;

public class LoginPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @BeforeGroups(groups = "6")
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        accountPage = initElements(driver, AccountPage.class);
        driver.get(getUiSetting("loginUrl"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test(groups = {"6"})
    public void loginPageTest() {
        loginPage.loginInSite(TEST_USER_1);
        loginPage.clickLogin();
        accountPage.checkLogin("Приветствуем вас, @Tarman332");
    }
}