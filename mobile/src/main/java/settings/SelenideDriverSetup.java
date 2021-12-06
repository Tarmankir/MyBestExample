package settings;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import static settings.MobileConfig.getMobileSetting;

public class SelenideDriverSetup implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        new DesiredCapabilities(new Capabilities().androidCapabilities());
        try {
            return new AndroidDriver<>(new URL(getMobileSetting("urlAndroid")), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}