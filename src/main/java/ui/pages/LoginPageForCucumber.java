package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageForCucumber {

    @FindBy(css = "#email_field")
    private WebElement loginIn;

    @FindBy(css = "#password_field")
    private WebElement passwordIn;

    @FindBy(css = ".button")
    private WebElement buttonIn;

    @FindBy(css = ".dropdown__user-info")
    private WebElement urlIn;

    private WebDriver driver;

    public LoginPageForCucumber(WebDriver driver) {
        this.driver = driver;
    }

    @Given("Get site")
    public void getSite() {
        driver.get("https://account.habr.com/login/?state=841f4565e6ccbb5f23db6c30474bbe69&consumer=habr&hl=ru_RU");
    }

    @When("Enter login")
    public void typeLogin() {
        loginIn.sendKeys("ivakidov@mail.ru");
    }

    @And("Enter password")
    public void typePass() {
        passwordIn.sendKeys("School593");
    }

    @Then("Authorization on site")
    public void clickLogin(){
        buttonIn.click();
    }
}
