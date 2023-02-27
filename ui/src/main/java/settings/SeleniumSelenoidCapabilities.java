package settings;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumSelenoidCapabilities {

    public static ChromeOptions getOptionsSelenoid() {
/*        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("94.0");*/
        return null;
    }

    public static URL getSelenoidUrl() throws MalformedURLException {
        return new URL("http://localhost:4444/wd/hub");
    }
}