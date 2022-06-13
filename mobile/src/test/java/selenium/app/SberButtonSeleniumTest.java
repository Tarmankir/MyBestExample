package selenium.app;

import org.testng.annotations.Test;
import settings.SeleniumDriverSetup;

public class SberButtonSeleniumTest extends SeleniumDriverSetup {

    @Test
    public void sberButtonSeleniumTest() {
        SignInSeleniumScreen signInSeleniumScreen = new SignInSeleniumScreen(driver);
        signInSeleniumScreen.checkSberButton("Войти по Сбер ID");
    }
}