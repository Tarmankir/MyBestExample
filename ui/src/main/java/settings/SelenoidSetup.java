package settings;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class SelenoidSetup {

    public DesiredCapabilities getSelenoidDefaultCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        return capabilities;
    }

    @BeforeSuite
    void beforeSuite() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = getSelenoidDefaultCapabilities();
    }
}