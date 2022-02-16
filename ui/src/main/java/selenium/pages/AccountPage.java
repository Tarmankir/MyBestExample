package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AccountPage {

    @FindBy(css = ".welcome__title")
    private WebElement userInfo;

    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Check user login message")
    public void checkLogin(String text) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertEquals(userInfo.getText(), text);
    }
}