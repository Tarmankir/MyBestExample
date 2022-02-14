package actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.back;

public class ActionsWithDeviceSelenide {

    @Step("Click on device button Back")
    public void clickOnDeviceButtonBack() {
        back();
    }

    @Step("Swipe left")
    public void swipeLeft() {
        swipeLeft();
    }
}