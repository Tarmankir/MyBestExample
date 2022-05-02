package settings;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SelenideSelenoidCapabilities {

    public static DesiredCapabilities getSelenoidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        return capabilities;
    }
}