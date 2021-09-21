package ui.selenide.pages;

import org.openqa.selenium.support.FindBy;
import ui.selenide.fragments.FooterMenuFragment;

public class MainPage {

    @FindBy(css = ".footer")
    private FooterMenuFragment footer;

    public void clickOnFooterItem() {
        footer.clickTechnicalSupport();
    }
}