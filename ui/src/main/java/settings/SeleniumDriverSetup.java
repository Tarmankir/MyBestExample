package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static settings.SeleniumDriverCapabilities.getOptions;

public abstract class SeleniumDriverSetup {

    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver(getOptions());
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}