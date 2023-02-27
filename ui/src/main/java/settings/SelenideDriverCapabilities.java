package settings;

import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class SelenideDriverCapabilities {

    public static ChromeOptions getOptions() {
/*        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("window-size=1280,768");
        addListener("allure", new SelenideListener());*/
        return null;
    }
}