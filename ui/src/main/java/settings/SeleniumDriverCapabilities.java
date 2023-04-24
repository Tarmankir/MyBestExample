package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDriverCapabilities {

    public static ChromeOptions getOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        options.addArguments("--disable-gpu");
        WebDriverManager.chromedriver().driverVersion("112.0.5615.165").setup();;
        return options;
    }
}