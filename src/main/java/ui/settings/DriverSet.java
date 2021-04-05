package ui.settings;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

import static ui.settings.Config.getSetting;

public abstract class DriverSet {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1280x768");
        driver = new FirefoxDriver(options);
        driver.get(getSetting("baseUrl"));
        FirefoxDriverManager.firefoxdriver().setup();
    }
}