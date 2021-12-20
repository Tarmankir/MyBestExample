package settings;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumDriverSetup {

    public AppiumDriver seleniumDriverSetup(DesiredCapabilities capabilitiesAndroid) throws Exception {
        return new AndroidDriver(capabilitiesAndroid);
    }
}