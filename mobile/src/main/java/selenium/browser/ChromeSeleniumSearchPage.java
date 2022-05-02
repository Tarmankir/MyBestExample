package selenium.browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromeSeleniumSearchPage {

    @FindBy(xpath = "//input[@name='q']")
    private MobileElement searchField;

    @FindBy(xpath = "//button[@class='tm-rss-button tm-rss-button_default']")
    private MobileElement copyLinkButton;

    @FindBy(xpath = "//div[contains(text(),'Ссылка скопирована в буфер обмена')]")
    private MobileElement copyLinkPopUp;

    private AppiumDriver<MobileElement> driver;

    public ChromeSeleniumSearchPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//        WebDriverWait wait;
//        wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(searchField));
    }

    @Step("Enter text in search field")
    public void enterTextInSearchField(String text) {
        searchField.click();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);
    }

    @Step("Click on copy link button")
    public void clickOnCopyLinkButton() {
        copyLinkButton.click();
    }

    @Step("Check copy link pop up")
    public void checkCopyLinkPopUp() {
        copyLinkPopUp.isEnabled();
    }
}