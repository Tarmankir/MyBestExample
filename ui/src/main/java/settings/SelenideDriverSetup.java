package settings;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public abstract class SelenideDriverSetup {

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        addListener("allure", new SelenideListener());
        Configuration.browserCapabilities = new MutableCapabilities(options);
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void afterMethod() {
        closeWindow();
    }
}