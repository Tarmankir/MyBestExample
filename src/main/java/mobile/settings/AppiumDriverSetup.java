package mobile.settings;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriverSetup {

    public AppiumDriver appiumDriverSetup(URL urlForAndroid, DesiredCapabilities capabilitiesAndroid) throws Exception {
        return new AndroidDriver(urlForAndroid, capabilitiesAndroid);
    }
}