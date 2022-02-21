package settings;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SelenoidSetup {

    public DesiredCapabilities getSeleniumDesiredCapabilitiesUi () {
        DesiredCapabilities seleniumDesiredCapabilitiesUi = new DesiredCapabilities();
        seleniumDesiredCapabilitiesUi.setCapability("enableVC", true);
        seleniumDesiredCapabilitiesUi.setCapability("enableVideo", true);
        return seleniumDesiredCapabilitiesUi;
    }
}