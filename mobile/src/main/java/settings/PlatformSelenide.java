package settings;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static settings.MobileConfig.getMobileSetting;

public class PlatformSelenide {

    private static final String PLATFORM_ANDROID = "android";

    private static final PlatformSelenide instance = new PlatformSelenide();
    private final String name;

    public static PlatformSelenide getInstance() {
        return instance;
    }

    private PlatformSelenide() {
        name = System.getenv("PLATFORM");
    }

    <T extends MobileElement> AppiumDriver<T> getDriver() throws MalformedURLException {
        URL URL = new URL(getMobileSetting("urlAndroid"));
        return new AndroidDriver<>(URL, getAndroidDesiredCapabilities());

    }

    <T extends MobileElement> AppiumDriver<T> getDriverWeb() throws MalformedURLException {
        URL URL = new URL(getMobileSetting("urlAndroid"));
        return new AndroidDriver<>(URL, getAndroidDesiredCapabilitiesWeb());

    }

    public boolean isAndroid() {
        return PLATFORM_ANDROID.equals(name);
    }

    private DesiredCapabilities getAndroidDesiredCapabilities() {
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

    private DesiredCapabilities getAndroidDesiredCapabilitiesWeb() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "fe8pcqxs5d49mr45");
        capabilities.setCapability("version", "11");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("browserName", "Firefox");
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("chromedriverExecutable","/home/kir/Node/lib/node_modules/appium/node_modules/appium-chromedriver/chromedriver/linux/chromedriver");
        capabilities.setCapability("newCommandTimeout", 10);
        return capabilities;
    }
}