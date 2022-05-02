package settings;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesSelenide {

    public static DesiredCapabilities getAndroidDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "fe8pcqxs5d49mr45");
        capabilities.setCapability("version", "11");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "ru.rambler.mail");
        capabilities.setCapability("app", "/home/kir/Загрузки/Telegram Desktop/rambler-test/src/main/resources/ramblermail.apk");
        capabilities.setCapability("newCommandTimeout", 10);
        return capabilities;
    }

    public static DesiredCapabilities getAndroidDesiredCapabilitiesWeb() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "fe8pcqxs5d49mr45");
        capabilities.setCapability("version", "11");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("chromedriverExecutable","/home/kir/Node/lib/node_modules/appium/node_modules/appium-chromedriver/chromedriver/linux/chromedriver");
        capabilities.setCapability("newCommandTimeout", 10);
        return capabilities;
    }

    public static URL getAndroidUrl() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static AppiumDriver getDriver() throws MalformedURLException {
        return new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilities());
    }

    public static AppiumDriver getDriverWeb() throws MalformedURLException {
        return new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilitiesWeb());
    }
}