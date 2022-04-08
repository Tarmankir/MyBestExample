package selenium.browser;

import org.testng.annotations.Test;
import settings.SeleniumDriverWebSetup;

import static settings.MobileConfig.getMobileSetting;

public class ChromeSeleniumNumberPageTest extends SeleniumDriverWebSetup {

    private ChromeSeleniumNumberPage chromeSeleniumNumberPage;

    @Test
    public void chromeSeleniumNumberPage() {
        driver.get(getMobileSetting("page8"));
        chromeSeleniumNumberPage = new ChromeSeleniumNumberPage(driver);
        chromeSeleniumNumberPage.pageNumberComparison();
    }
}