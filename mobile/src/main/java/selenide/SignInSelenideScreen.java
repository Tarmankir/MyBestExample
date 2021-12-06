package selenide;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class SignInSelenideScreen {

    @AndroidFindBy(id = "//*[@resource-id='login']")
    private SelenideElement loginField;

    @Step("Enter login")
    public void clickLogin(){
        loginField.click();
    }
}