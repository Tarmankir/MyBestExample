package settings;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static settings.SelenideSelenoidCapabilities.getSelenoidCapabilities;

public abstract class SelenideSelenoidSetup {

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x768";
        Configuration.browserCapabilities = getSelenoidCapabilities();
    }

    @AfterMethod
    public void afterMethod() {
        closeWindow();
    }
}