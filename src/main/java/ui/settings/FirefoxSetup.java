package ui.settings;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;

public abstract class FirefoxSetup {

    private FirefoxOptions options;

    public FirefoxOptions getOptions() {
        options = new FirefoxOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1280x768");
        FirefoxDriverManager.firefoxdriver().setup();

        Configuration.baseUrl = "";
        Configuration.browserSize = "";

        return options;
    }
}