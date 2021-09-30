package ui.settings;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public abstract class SelenideDriverSetup {

    private ChromeOptions options;

    @BeforeSuite
    public void getOptions() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        addListener("allure", new SelenideListener());
        Configuration.browserCapabilities = new MutableCapabilities(options);
        WebDriverManager.chromedriver().setup();
    }
}