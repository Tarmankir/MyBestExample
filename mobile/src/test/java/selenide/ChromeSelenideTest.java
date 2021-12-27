package selenide;

import org.testng.annotations.Test;
import settings.SelenideDriverWebSetup;

import static com.codeborne.selenide.Selenide.open;


public class ChromeSelenideTest extends SelenideDriverWebSetup {

    @Test
    void openYandex() {
        open("https://yandex.ru/");
    }
}