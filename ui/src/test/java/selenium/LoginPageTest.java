package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.SeleniumDriverSetup;

import java.net.MalformedURLException;

import static org.openqa.selenium.support.PageFactory.initElements;
import static selenium.enums.Credentials.TEST_USER_1;
import static settings.UiConfig.getUiSetting;

public class LoginPageTest extends SeleniumDriverSetup {

    private WebDriver driver;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver = new RemoteWebDriver(getSelenoidUrl(), getOptionsSelenoid());
        loginPage = initElements(driver, LoginPage.class);
        accountPage = initElements(driver, AccountPage.class);
        driver.get(getUiSetting("loginUrl"));
//        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void loginPageTest() {
        loginPage.loginInSite(TEST_USER_1);
        loginPage.clickLogin();
        accountPage.checkLogin("Приветствуем вас, @Tarman332");
    }
}