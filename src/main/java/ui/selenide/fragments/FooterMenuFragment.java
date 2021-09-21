package ui.selenide.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class FooterMenuFragment extends ElementsContainer {

    @FindBy(css = "a[href*='/ru/feedback/']")
    private SelenideElement technicalSupport;

    @Step("Click to technical support")
    public void clickTechnicalSupport() {
        technicalSupport.click();
    }
}