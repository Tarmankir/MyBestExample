package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriverSetup {

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

    public ChromeOptions getOptionsSelenoid() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("94.0");
        return options;
    }

    public URL getSelenoidUrl() throws MalformedURLException {
        return new URL("http://localhost:4444/wd/hub");
    }
}