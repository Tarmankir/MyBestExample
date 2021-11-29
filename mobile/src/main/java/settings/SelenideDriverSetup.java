package settings;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static settings.MobileConfig.getMobileSetting;

public class SelenideDriverSetup {
    public WebDriver createSelenideDriver(DesiredCapabilities capabilitiesAndroid) {
        new DesiredCapabilities(new Capabilities().androidCapabilities());
        try {
            return new AndroidDriver<>(new URL(getMobileSetting("urlAndroid")), capabilitiesAndroid);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}