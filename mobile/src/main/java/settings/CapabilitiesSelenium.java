package settings;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesSelenium {

    public DesiredCapabilities getAndroidDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("version", "11.0");
        capabilities.setCapability("deviceName", "fe8pcqxs5d49mr45");
        capabilities.setCapability("app", "/home/kir/Рабочий стол/MyBestExample/mobile/src/main/resources/applications/ramblermail.apk");
        return capabilities;
    }

    public DesiredCapabilities getAndroidDesiredCapabilitiesWeb() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("version", "11.0");
        capabilities.setCapability("deviceName", "fe8pcqxs5d49mr45");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("chromedriverExecutable","/home/kir/Node/lib/node_modules/appium/node_modules/appium-chromedriver/chromedriver/linux/chromedriver");
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("newCommandTimeout", 10);
        return capabilities;
    }
}