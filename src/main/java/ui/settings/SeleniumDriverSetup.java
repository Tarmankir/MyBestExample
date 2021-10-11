package ui.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class SeleniumDriverSetup {

    private ChromeOptions options;

    public ChromeOptions getOptions() {
        options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        WebDriverManager.chromedriver().setup();
        return options;
    }
}