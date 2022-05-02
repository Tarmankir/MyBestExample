package selenium.browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeSeleniumSearchPage {

    @AndroidFindBy(xpath = "//div[@name='q']")
    private MobileElement searchField;

    @AndroidFindBy(xpath = "//button[@class='tm-rss-button tm-rss-button_default']")
    private MobileElement copyLinkButton;

    @AndroidFindBy(xpath = "//div[contains(text(),'Ссылка скопирована в буфер обмена')]")
    private MobileElement copyLinkPopUp;

    private AppiumDriver<MobileElement> driver;

    public ChromeSeleniumSearchPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }

    @Step("Enter text in search field")
    public void enterTextInSearchField(String text) {
        searchField.click();
        searchField.setValue(text);
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