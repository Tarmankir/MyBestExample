package ui.settings;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class SelenideDriverSetup {

    private ChromeOptions options;

    @BeforeSuite
    public void getOptions() {
        options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        Configuration.browserCapabilities = new MutableCapabilities(options);
        WebDriverManager.chromedriver().setup();
    }
}