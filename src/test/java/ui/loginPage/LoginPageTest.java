package ui.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.pages.LoginPage;
import ui.settings.FirefoxSetup;
import ui.settings.SeleniumListener;

import static ui.enums.Credentials.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static ui.settings.Config.getSetting;


//todo refactor project structure

/** main/java
 *              api
 *                      requests
 *                      bodies
 *              common
 *                      enums
 *                      options
 *              ui
 *                  selenium
 *                          enums
 *                          pages
 *                  selenide
 *                          enums
 *                          pages
 *                  cucumber
 *                          selenium
 *                                  FeedbackPageSteps.java
 *                          selenide
 *                                  LoginPageSteps.java
 *                  settings
 *
 * main/test
 *          api
 *          ui
 *              selenium
 *                      feedbackPageTests
 *              selenide
 *                      loginPageTests
 *
 *
 *
 */

@Listeners(SeleniumListener.class)
public class LoginPageTest extends FirefoxSetup {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void driverSet() {
        driver = new FirefoxDriver(getOptions());
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
        loginPage.checkLogin("https://habr.com/ru/users/tarman332/");
    }
}