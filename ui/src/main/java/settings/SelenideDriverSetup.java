package settings;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static settings.SelenideDriverCapabilities.getOptions;

public abstract class SelenideDriverSetup {

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 300000;
//        Configuration.browserCapabilities = new MutableCapabilities(getOptions());
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void afterMethod() {
        closeWindow();
    }
}