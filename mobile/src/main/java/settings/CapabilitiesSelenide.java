package settings;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesSelenide {

//    private static final String PLATFORM_ANDROID = "android";

//    private static final CapabilitiesSelenide instance = new CapabilitiesSelenide();
//    private final String name;

//    public static CapabilitiesSelenide getInstance() {
//        return instance;
//    }
/*
    private PlatformSelenide() {
        name = System.getenv("PLATFORM");
    }*/

    public AppiumDriver getDriver() throws MalformedURLException {
//        URL URL = new URL(getMobileSetting("urlAndroid"));
        return new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilities());

    }

    public AppiumDriver getDriverWeb() throws MalformedURLException {
//        URL URL = new URL(getMobileSetting("urlAndroid"));
        return new AppiumDriver(getAndroidUrl(), getAndroidDesiredCapabilitiesWeb());

    }
/*
    public boolean isAndroid() {
        return PLATFORM_ANDROID.equals(name);
    }*/

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
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("chromedriverExecutable","/home/kir/Node/lib/node_modules/appium/node_modules/appium-chromedriver/chromedriver/linux/chromedriver");
        capabilities.setCapability("newCommandTimeout", 10);
        return capabilities;
    }

    private URL getAndroidUrl() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }
}