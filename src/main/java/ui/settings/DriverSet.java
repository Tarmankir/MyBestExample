package ui.settings;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

public abstract class DriverSet {

    @BeforeClass
    public void beforeClass() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1280x768");
        FirefoxDriverManager.firefoxdriver().setup();
    }
}