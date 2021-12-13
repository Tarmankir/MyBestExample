package settings;

import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Capabilities {

    public DesiredCapabilities androidCapabilities() {
        DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
        capabilitiesAndroid.setCapability(PLATFORM_NAME, "Android");
        capabilitiesAndroid.setCapability(PLATFORM_VERSION, "11.0");
        capabilitiesAndroid.setCapability(DEVICE_NAME, "fe8pcqxs5d49mr45");
        capabilitiesAndroid.setCapability(APP, "/home/kir/Рабочий стол/MyBestExample/mobile/src/main/resources/applications/ramblermail.apk");
        return capabilitiesAndroid;
    }

    public DesiredCapabilities chromeMobileCapabilities() {
        DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
        capabilitiesAndroid.setCapability(PLATFORM_NAME, "Android");
        capabilitiesAndroid.setCapability(PLATFORM_VERSION, "11.0");
        capabilitiesAndroid.setCapability(DEVICE_NAME, "fe8pcqxs5d49mr45");
        capabilitiesAndroid.setCapability(BROWSER_NAME, "Chrome");
        capabilitiesAndroid.setCapability("appPackage", "ru.rambler.mail");
        capabilitiesAndroid.setCapability("automationName", "Appium");
//        capabilitiesAndroid.setCapability("appActivity", ".ApiDemos");
        return capabilitiesAndroid;
    }
}