package selenium.browser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class ChromeSeleniumPage {
    @FindBy(xpath = "//*[@href='/ru/search/']")
    private MobileElement searchButton;

    @FindBy(xpath = "//*[@class='tm-svg-img tm-header__icon']")
    private MobileElement logo;

    private AppiumDriver<MobileElement> driver;

    public ChromeSeleniumPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
    }

    @Step("Click on search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }

    @Step("Check logo is displayed")
    public void checkLogoIsDisplayed() {
        logo.isDisplayed();
    }

    @Step("Check logo size")
    public void checkLogoSize(Integer height, Integer width) {
        assertEquals(logo.getAttribute("height"), height);
        assertEquals(logo.getAttribute("width"), width);
    }
}