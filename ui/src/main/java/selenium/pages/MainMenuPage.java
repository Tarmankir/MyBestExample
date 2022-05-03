package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class MainMenuPage {

    @FindBy(css = "a[href*='/ru/all']")
    private WebElement allStreams;

    @FindBy(css = "a[href='/ru/flows/develop/']")
    private WebElement develop;

    @FindBy(css = "a[href='/ru/flows/admin/']")
    private WebElement admin;

    @FindBy(css = "a[href='/ru/flows/design/']")
    private WebElement design;

    @FindBy(css = "a[href='/ru/flows/management/']")
    private WebElement management;

    @FindBy(css = "a[href='/ru/flows/marketing/']")
    private WebElement marketing;

    @FindBy(css = "a[href='/ru/flows/popsci/']")
    private WebElement popsci;

    private WebDriver driver;

    public MainMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click to all streams")
    public void clickAllStreams() {
        allStreams.click();
    }

    @Step("Click to develop")
    public void clickDevelop() {
        develop.click();
    }

    @Step("Click to admin")
    public void clickAdmin() {
        admin.click();
    }

    @Step("Click to design")
    public void clickDesign() {
        design.click();
    }

    @Step("Click to management")
    public void clickManagement() {
        management.click();
    }

    @Step("Click to marketing")
    public void clickMarketing() {
        marketing.click();
    }

    @Step("Click to popsci")
    public void clickPopsci() {
        popsci.click();
    }

    @Step("Check URL site")
    public void checkURL(String text) {
        assertEquals(driver.getCurrentUrl(), text);
    }

    @Step("Check text on site")
    public void checkText(String text) {
        assertEquals(allStreams.getText(), text);
    }
}