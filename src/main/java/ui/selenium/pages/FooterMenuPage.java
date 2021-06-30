package ui.selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class FooterMenuPage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div/div[3]/div/ul/li[1]/a")
    private WebElement linkContent;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div/div[4]/div/ul/li[5]/a")
    private WebElement linkContent2;

    @FindBy(css = "a[href*='/kek/v1/auth/habrahabr/?back=/ru/docs/help/rules/&hl=ru']")
    private WebElement buttonLogin;

    private WebDriver driver;

    public FooterMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site and click link content")
    public void clickLinkContent() {
        linkContent.click();
    }

    public void clickLinkContent2() {
        Actions action = new Actions(driver);
        action.moveToElement(linkContent2).build().perform();
    }

    @Step("Click switch to window title")
    public void switchWindowBack(){
        String home = driver.getCurrentUrl();
        driver.get(home);
    }

    @Step("Check text on button login on site")
    public void checkButtonLogin(String text) {
        assertEquals(buttonLogin.getText(), text);
    }
}