package mobile.settings;

import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Capabilities {

    public DesiredCapabilities androidCapabilities() {
        DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
        capabilitiesAndroid.setCapability(PLATFORM_NAME, "Android");
        capabilitiesAndroid.setCapability(PLATFORM_VERSION, "11.0");
        capabilitiesAndroid.setCapability(DEVICE_NAME, "fe8pcqxs5d49mr45");
        capabilitiesAndroid.setCapability(APP, "/home/kir/Apktest/screenshot-easy_4.1.6(29).apk");
        return capabilitiesAndroid;
    }
}