package ui.selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class FooterMenuPage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div/div[4]/div/ul/li[3]/a")
    private WebElement linkContent;

    @FindBy(css = "a[href*='/kek/v1/auth/habrahabr/?back=/ru/all/&hl=ru']")
    private WebElement buttonLogin;

    private WebDriver driver;

    public FooterMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site and click link content")
    public void clickLinkContent() {
        linkContent.click();
    }

    @Step("Click switch to window title")
    public void switchWindowBack(){
        String mainTab = driver.getWindowHandle();
        driver.switchTo().window(mainTab);
    }

    @Step("Check text on button login on site")
    public void checkButtonLogin(String text) {
        assertEquals(buttonLogin.getText(), text);
    }
}