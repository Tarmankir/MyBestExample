package common;

import com.google.common.base.Predicate;
import org.openqa.selenium.WebElement;

import static common.Waiter.waitMS;
import static java.lang.System.currentTimeMillis;

public class ElementPresent {
/*
    public static boolean isElementPresent(Predicate<T> condition, long timeOut, long poolingInterval) {
        long timeStart;

        for (timeStart = currentTimeMillis(); currentTimeMillis() - timeStart < timeOut && driver.findElement(By.locator);) {
            waitMS(poolingInterval);
            System.out.println("работа цикла");
        }
        System.out.println("перед ретурном");
        return currentTimeMillis() - timeStart < timeOut;
    }

    public <T> void wait(T subject, Predicate<T> condition, long timeout, long pollingInterval) {
        long timeStart;

        for (long start = currentTimeMillis(); currentTimeMillis() - timeStart < timeout && !condition.apply(subject); ) {
            waitMS(poolingInterval);
        }
    }*/
}