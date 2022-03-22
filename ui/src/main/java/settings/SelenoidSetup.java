package settings;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SelenoidSetup {

    public DesiredCapabilities getSelenoidDefaultCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        return capabilities;
    }
}