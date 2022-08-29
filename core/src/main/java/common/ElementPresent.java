package common;

import org.openqa.selenium.WebElement;

import static common.Waiter.waitMS;
import static java.lang.System.currentTimeMillis;

public class ElementPresent {

    public static boolean isElementPresent(WebElement locator, long timeOut, long poolingInterval) {
        if (timeOut>0) {
            for (currentTimeMillis(); currentTimeMillis() + timeOut == currentTimeMillis() || locator.isDisplayed(); ) {
                waitMS(poolingInterval);
            }
            return true;
        }
        else {
            return false;
        }
    }
}