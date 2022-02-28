package settings;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelenoidSetup {

    public DesiredCapabilities getSelenoidDefaultCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        return capabilities;
    }

    public Configuration getSelenoidDefaultConfigurations() {
        Configuration configuration = new Configuration();
        configuration.remote = "http://localhost:4444/wd/hub";
        configuration.browser = "chrome";
        configuration.browserSize = "1280x768";
        configuration.browserCapabilities = new SelenoidSetup().getSelenoidDefaultCapabilities();
        return configuration;
    }
}