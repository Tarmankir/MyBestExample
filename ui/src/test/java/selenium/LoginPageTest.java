package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.SeleniumDriverSetup;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.PageFactory.initElements;
import static selenium.enums.Credentials.TEST_USER_1;
import static settings.UiConfig.getUiSetting;

public class LoginPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @BeforeGroups(groups = "Regress")
    public void driverSet() {
        driver = new ChromeDriver(getOptions());
        loginPage = initElements(driver, LoginPage.class);
        accountPage = initElements(driver, AccountPage.class);
        driver.get(getUiSetting("loginUrl"));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @AfterGroups(groups = "Regress")
    void afterMethod() {
        driver.close();
    }

    @Test(groups = {"Regress"})
    public void loginPageTest() {
        loginPage.loginInSite(TEST_USER_1);
        loginPage.clickLogin();
        accountPage.checkLogin("Приветствуем вас, @Tarman332");
    }
}