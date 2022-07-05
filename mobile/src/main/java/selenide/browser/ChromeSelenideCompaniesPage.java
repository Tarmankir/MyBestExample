package selenide.browser;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertNotEquals;

public class ChromeSelenideCompaniesPage {

    @FindBy(css = "tm-company-snippet__title")
    private List<WebElement> companiesNamesList;

    @Step("Checking that the company is not in the list")
    public void isCompaniesListContains(String company) {
        Iterator<WebElement> i = companiesNamesList.iterator();
        while(i.hasNext()) {
            assertNotEquals("company", i.next().getText());
        }
    }
}