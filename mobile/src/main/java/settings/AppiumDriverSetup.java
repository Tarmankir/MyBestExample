package settings;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDriverSetup {

    public AppiumDriver appiumDriverSetup(DesiredCapabilities capabilitiesAndroid) throws Exception {
        return new AndroidDriver(capabilitiesAndroid);
    }
}