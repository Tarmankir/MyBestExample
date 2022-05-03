package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class FooterMenuPage {

    @FindBy(css = "a[href='/ru/docs/help/']")
    private WebElement siteMap;

    @FindBy(css = "a[href*='/ru/megaprojects/']")
    private WebElement megaProjects;

    @FindBy(xpath = "//h3[contains(text(),'Информация')]")
    private WebElement fieldText;

    private WebDriver driver;

    public FooterMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site and click site map")
    public void clickSiteMap() {
        siteMap.click();
    }

    @Step("Open site and click mega projects")
    public void clickMegaProjects() {
        megaProjects.click();
    }

    @Step("Click switch to window title")
    public void switchWindowBack(){
        driver.navigate().back();
    }

    @Step("Check text on site")
    public void checkText(String text) {
        assertEquals(fieldText.getText(), text);
    }
}