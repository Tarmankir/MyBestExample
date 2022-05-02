package selenium;

import org.testng.annotations.Test;
import selenium.pages.AccountPage;
import selenium.pages.LoginPage;
import settings.SeleniumSelenoidSetup;

import static org.openqa.selenium.support.PageFactory.initElements;
import static selenium.enums.Credentials.TEST_USER_1;
import static settings.UiConfig.getUiSetting;

public class LoginPageTest extends SeleniumSelenoidSetup {

    @Test
    public void loginPageTest() {
        driver.get(getUiSetting("loginUrl"));
        LoginPage loginPage = initElements(driver, LoginPage.class);
        loginPage.loginInSite(TEST_USER_1);
        loginPage.clickLogin();
        AccountPage accountPage = initElements(driver, AccountPage.class);
        accountPage.checkLogin("Hello, @Tarman332");
    }
}