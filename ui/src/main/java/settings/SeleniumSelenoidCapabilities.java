package settings;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumSelenoidCapabilities {

    public static DesiredCapabilities getOptionsSelenoid() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("94.0");
        return capabilities;
    }

    public static URL getSelenoidUrl() throws MalformedURLException {
        return new URL("http://localhost:4444/wd/hub");
    }
}