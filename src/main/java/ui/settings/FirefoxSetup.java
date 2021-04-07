package ui.settings;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

public abstract class FirefoxSetup {

    private FirefoxOptions options;

    @BeforeClass
    public void beforeClass() {
        options = new FirefoxOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1280x768");
        FirefoxDriverManager.firefoxdriver().setup();
    }

    public FirefoxOptions getOptions() {
        return options;
    }
}